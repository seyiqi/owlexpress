package denoise;

/**
 * Denoiser using Google Spell Check API
 * */
public class StandardDenoiser implements Denoiser {

	@Override
	public String denoise(String noisedString) {
		// filter out non-letter and non space char char
		StringBuilder sb = new StringBuilder();
		for (char c : noisedString.toCharArray()) {
			if (c == '\n') {
				sb.append(' ');
			}
			else if (Character.isAlphabetic(c) || Character.isSpaceChar(c)) {
				sb.append(c);
			}
		}
		
		// trim spaces
		String output = sb.toString();
		output = output.trim();
		output = output.replaceAll("\\s+", " ");
		
		// to lower case
		output = output.toLowerCase();
		return output;
	}

}
