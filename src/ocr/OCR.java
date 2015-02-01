package ocr;

/**
 * Interface that represents an OCR utility wrapper
 * */
public interface OCR {
	
	/**
	 * Method that takes a file path of a image and returns the letters on it
	 * */
	String readImage(String imageFilePath);

}
