package model;

import java.util.List;

import matching.Matcher;
import matching.StandardMatcher;
import ocr.Tess4JOCR;
import preprocess.OpenCVPreproessor;
import denoise.Denoiser;
import denoise.StandardDenoiser;

/**
 * Class that connects everything together
 * */
public class ImageMatcher {
	
	public String parseImage(String dir){
		// preprocessing
		OpenCVPreproessor pre = new OpenCVPreproessor();
		pre.preprocess(dir, "output.JPG");
				
		// read text
		Tess4JOCR ocr = new Tess4JOCR();
		String fromImage = ocr.readImage("output.JPG");
		System.out.println("fromImage = \n" + fromImage);
				
		// denoise
		Denoiser denoiser = new StandardDenoiser();
		String denoised = denoiser.denoise(fromImage);
		System.out.println("denoised = \n" + denoised);
		
				
		// match person
		// Matcher matcher = new StandardMatcher();
		// List<Results> res = matcher.generateMatch(denoised, "college");
		
		return denoised;
	}
	
	

}
