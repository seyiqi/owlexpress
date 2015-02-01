package preprocess;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

/**
 * Concrete class that preprocess image with OpenCV
 * */
public class OpenCVPreproessor implements Preprocessor {

	@Override
	public void preprocess(String inputImageFile, String outputImageFile) {
		// pre-config
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		// load image
		Mat inputImg = Highgui.imread(inputImageFile, Highgui.CV_LOAD_IMAGE_COLOR );
		Mat outputImg = inputImg.clone();
		
		// output as grey scale
		Imgproc.cvtColor(inputImg, outputImg, Imgproc.COLOR_RGB2GRAY);
		
		// adaptive threshold
		Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_ELLIPSE, new Size(5,5));
		Mat temp = new Mat(); 
		Imgproc.resize(outputImg, temp, new Size(outputImg.cols()/4, outputImg.rows()/4));
		Imgproc.morphologyEx(temp, temp, Imgproc.MORPH_CLOSE, kernel);
		Imgproc.resize(temp, temp, new Size(outputImg.cols(), outputImg.rows()));
		Core.divide(outputImg, temp, temp, 1, CvType.CV_32F); // temp will now have type CV_32F
		Core.normalize(temp, outputImg, 0, 255, Core.NORM_MINMAX, CvType.CV_8U);
		Imgproc.threshold(outputImg, outputImg, -1, 255, 
		    Imgproc.THRESH_BINARY_INV+Imgproc.THRESH_OTSU);
		
		// save output
		Highgui.imwrite(outputImageFile, outputImg);
	}

}
