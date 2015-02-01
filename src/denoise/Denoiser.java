package denoise;

/**
 * Interface that represents a module that filters out noise in a string parsed from image
 * */
public interface Denoiser {
	
	/**
	 * Method that clean up a misspelled string
	 * */
	String denoise(String noisedString);

}
