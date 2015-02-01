package preprocess;

/**
 * Interface that represents an image preprocessor
 * */
public interface Preprocessor {
	
	/**
	 * Method that preprocess the image and stores it on the disk
	 * */
	void preprocess(String inputImageFile, String outputImageFile);

}
