
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class LineSegmentDetector
/**
 * <p>Line segment detector class, following the algorithm described at [Rafael12].</p>
 *
 * @see <a href="http://docs.opencv.org/modules/imgproc/doc/feature_detection.html#linesegmentdetector">org.opencv.imgproc.LineSegmentDetector : public Algorithm</a>
 */
public class LineSegmentDetector extends Algorithm {

    protected LineSegmentDetector(long addr) { super(addr); }


    //
    // C++:  void detect(Mat _image, Mat& _lines, Mat& width = Mat(), Mat& prec = Mat(), Mat& nfa = Mat())
    //

    public  void detect(Mat _image, Mat _lines, Mat width, Mat prec, Mat nfa)
    {

        detect_0(nativeObj, _image.nativeObj, _lines.nativeObj, width.nativeObj, prec.nativeObj, nfa.nativeObj);

        return;
    }

    public  void detect(Mat _image, Mat _lines)
    {

        detect_1(nativeObj, _image.nativeObj, _lines.nativeObj);

        return;
    }


    //
    // C++:  void drawSegments(Mat& _image, Mat lines)
    //

/**
 * <p>Draws the line segments on a given image.</p>
 *
 * @param _image a _image
 * @param lines A vector of the lines that needed to be drawn.
 *
 * @see <a href="http://docs.opencv.org/modules/imgproc/doc/feature_detection.html#linesegmentdetector-drawsegments">org.opencv.imgproc.LineSegmentDetector.drawSegments</a>
 */
    public  void drawSegments(Mat _image, Mat lines)
    {

        drawSegments_0(nativeObj, _image.nativeObj, lines.nativeObj);

        return;
    }


    //
    // C++:  int compareSegments(Size size, Mat lines1, Mat lines2, Mat& _image = Mat())
    //

/**
 * <p>Draws two groups of lines in blue and red, counting the non overlapping
 * (mismatching) pixels.</p>
 *
 * @param size The size of the image, where lines1 and lines2 were found.
 * @param lines1 The first group of lines that needs to be drawn. It is
 * visualized in blue color.
 * @param lines2 The second group of lines. They visualized in red color.
 * @param _image a _image
 *
 * @see <a href="http://docs.opencv.org/modules/imgproc/doc/feature_detection.html#linesegmentdetector-comparesegments">org.opencv.imgproc.LineSegmentDetector.compareSegments</a>
 */
    public  int compareSegments(Size size, Mat lines1, Mat lines2, Mat _image)
    {

        int retVal = compareSegments_0(nativeObj, size.width, size.height, lines1.nativeObj, lines2.nativeObj, _image.nativeObj);

        return retVal;
    }

/**
 * <p>Draws two groups of lines in blue and red, counting the non overlapping
 * (mismatching) pixels.</p>
 *
 * @param size The size of the image, where lines1 and lines2 were found.
 * @param lines1 The first group of lines that needs to be drawn. It is
 * visualized in blue color.
 * @param lines2 The second group of lines. They visualized in red color.
 *
 * @see <a href="http://docs.opencv.org/modules/imgproc/doc/feature_detection.html#linesegmentdetector-comparesegments">org.opencv.imgproc.LineSegmentDetector.compareSegments</a>
 */
    public  int compareSegments(Size size, Mat lines1, Mat lines2)
    {

        int retVal = compareSegments_1(nativeObj, size.width, size.height, lines1.nativeObj, lines2.nativeObj);

        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void detect(Mat _image, Mat& _lines, Mat& width = Mat(), Mat& prec = Mat(), Mat& nfa = Mat())
    private static native void detect_0(long nativeObj, long _image_nativeObj, long _lines_nativeObj, long width_nativeObj, long prec_nativeObj, long nfa_nativeObj);
    private static native void detect_1(long nativeObj, long _image_nativeObj, long _lines_nativeObj);

    // C++:  void drawSegments(Mat& _image, Mat lines)
    private static native void drawSegments_0(long nativeObj, long _image_nativeObj, long lines_nativeObj);

    // C++:  int compareSegments(Size size, Mat lines1, Mat lines2, Mat& _image = Mat())
    private static native int compareSegments_0(long nativeObj, double size_width, double size_height, long lines1_nativeObj, long lines2_nativeObj, long _image_nativeObj);
    private static native int compareSegments_1(long nativeObj, double size_width, double size_height, long lines1_nativeObj, long lines2_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
