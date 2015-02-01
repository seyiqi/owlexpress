package matching;

import java.util.List;

import model.Results;

/**
 * Interface that represents a module that matches a string to a person DTO
 * */
public interface Matcher {
	
	/**
	 * Method that generates match given an identifier
	 * */
	List<Results> generateMatch(String identifier, String college);

}
