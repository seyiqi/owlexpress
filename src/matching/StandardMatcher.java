package matching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Results;

/**
 * Standard matcher that uses the intersection policy to generate best match
 * */
public class StandardMatcher implements Matcher {
	
	/* Number of suggestions shown */
	private final static int NUM_SUGGESTION = 3;
	
	/* The maximum tolerance of edit distance for a word to be a match for a person */
	private final static double ERROR_THRESHOLD = 0.3;

	@Override
	public List<Results> generateMatch(String identifier, String college) {
		List<Results> allStudent = queryByCollege(college);
		List<String> words = Arrays.asList(identifier.split(" "));
		Map<Results, Integer> counter = new HashMap<Results, Integer>();
		// count score
		for (String word : words) {
			for (Results person : allStudent) {
				int minLength = person.getFirstName().length();
				minLength = (minLength < person.getLastName().length())? minLength : person.getLastName().length();
				if (matchError(word, person) <= Math.round(minLength * ERROR_THRESHOLD)) {					
					if (!counter.keySet().contains(person)) {
						counter.put(person, 1);
					}else{
						counter.put(person, counter.get(person)+1);
					}
				}
				
			}
		}
		// choose the best one
		int bestScore = 0;
		List<Results> bestPerson = new ArrayList<Results>();
		for (Results person : counter.keySet()) {
			if (counter.get(person) > bestScore) {
				bestScore = counter.get(person);
				bestPerson.clear();
				bestPerson.add(person);
			}
			else if (counter.get(person) == bestScore) {
				bestPerson.add(person);
			}
		}
		return bestPerson;
	}
	
	/**
	 * Get a list of all students in a college
	 * */
	private List<Results> queryByCollege(String college){
		// TODO: check with Glenn's
		List<Results> output = new ArrayList<Results>();
		output.add(new Results("Test College", "Email", "Mengchen", "Tang", "1"));
		output.add(new Results("Test College", "Email", "Yiqiu", "Shen", "2"));
		output.add(new Results("Test College", "Email", "Siyuan", "Chen", "3"));
		output.add(new Results("Test College", "Email", "Glenn", "Zhu", "4"));
		return output;
	}
	
	/**
	 * Calculate the error of matching a person to a words
	 * */
	private int matchError(String word, Results person){
		int firstDis = editDistance(word, person.getFirstName().toLowerCase());
		int lastDis = editDistance(word, person.getLastName().toLowerCase());
		return (firstDis > lastDis)? lastDis : firstDis;
	}
	

	/**
	 * Edit Distance
	 * */
	private int editDistance(String s, String t){
	    // degenerate cases
	    if (s == t) return 0;
	    if (s.length() == 0) return t.length();
	    if (t.length() == 0) return s.length();
	 
	    // create two work vectors of integer distances
	    int[] v0 = new int[t.length() + 1];
	    int[] v1 = new int[t.length() + 1];
	 
	    // initialize v0 (the previous row of distances)
	    // this row is A[0][i]: edit distance for an empty s
	    // the distance is just the number of characters to delete from t
	    for (int i = 0; i < v0.length; i++)
	        v0[i] = i;
	 
	    for (int i = 0; i < s.length(); i++)
	    {
	        // calculate v1 (current row distances) from the previous row v0
	 
	        // first element of v1 is A[i+1][0]
	        //   edit distance is delete (i+1) chars from s to match empty t
	        v1[0] = i + 1;
	 
	        // use formula to fill in the rest of the row
	        for (int j = 0; j < t.length(); j++)
	        {
	            int cost = (s.charAt(i) == t.charAt(j)) ? 0 : 1;
	            if (v1[j] + 1 < v0[j + 1] + 1) {
	            	v1[j + 1] = v1[j] + 1;
	            }	else{
	            	v1[j + 1] = v0[j + 1] + 1;
	            }
	            v1[j + 1] = (v1[j + 1] > v0[j] + cost)? v0[j] + cost: v1[j + 1];
	        }
	 
	        // copy v1 (current row) to v0 (previous row) for next iteration
	        for (int j = 0; j < v0.length; j++)
	            v0[j] = v1[j];
	    }
	 
	    return v1[t.length()];
	}

}
