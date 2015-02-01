package model;

import java.util.List;

import matching.Matcher;
import matching.StandardMatcher;
import denoise.Denoiser;
import denoise.StandardDenoiser;
import ocr.Tess4JOCR;
import preprocess.OpenCVPreproessor;

/**
 * Main Class
 * */
public class Main {
	
	/**
	 * Execution method
	 * */
	public static void main(String args[]){
		
		String projectPath = "/Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/";
		String dataPath = projectPath + "data/";
		
		// preprocessing
		OpenCVPreproessor pre = new OpenCVPreproessor();
		pre.preprocess(dataPath+"l2.1.JPG", dataPath+"output.JPG");
		
		// read text
		Tess4JOCR ocr = new Tess4JOCR();
		String fromImage = ocr.readImage(dataPath+"output.JPG");
		System.out.println("fromImage = \n" + fromImage);
		
		// denoise
		Denoiser denoiser = new StandardDenoiser();
		String denoised = denoiser.denoise(fromImage);
		System.out.println("denoised = \n" + denoised);
		
		// match person
		Matcher matcher = new StandardMatcher();
		List<Results> res = matcher.generateMatch(denoised, "college");
		
		System.out.println("res = " + res);
	}

}
//

// SH‘? MENGCHEN TANG
// T01 6310 MAIN ST
// HOUSTON TEXAS 77005-1843