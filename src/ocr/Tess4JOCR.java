package ocr;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * Tess4J OCR impl
 * */
public class Tess4JOCR implements OCR {

	@Override
	public String readImage(String imageFilePath) {
		 File imageFile = new File(imageFilePath);
	     Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
	     // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping
	     String result = "";
	     try {
	            result = instance.doOCR(imageFile);
	     } catch (TesseractException e) {
	            System.err.println(e.getMessage());
	     }
	     return result;
	}

}
