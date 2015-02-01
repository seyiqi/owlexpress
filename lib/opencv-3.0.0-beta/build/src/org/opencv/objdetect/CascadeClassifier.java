
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.objdetect;

import java.lang.String;
import java.util.ArrayList;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDouble;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfRect;
import org.opencv.core.Size;

// C++: class CascadeClassifier
/**
 * <p>Cascade classifier class for object detection.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier">org.opencv.objdetect.CascadeClassifier</a>
 */
public class CascadeClassifier {

    protected final long nativeObj;
    protected CascadeClassifier(long addr) { nativeObj = addr; }


    //
    // C++:   CascadeClassifier()
    //

/**
 * <p>Loads a classifier from a file.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-cascadeclassifier">org.opencv.objdetect.CascadeClassifier.CascadeClassifier</a>
 */
    public   CascadeClassifier()
    {

        nativeObj = CascadeClassifier_0();

        return;
    }


    //
    // C++:   CascadeClassifier(String filename)
    //

/**
 * <p>Loads a classifier from a file.</p>
 *
 * @param filename Name of the file from which the classifier is loaded.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-cascadeclassifier">org.opencv.objdetect.CascadeClassifier.CascadeClassifier</a>
 */
    public   CascadeClassifier(String filename)
    {

        nativeObj = CascadeClassifier_1(filename);

        return;
    }


    //
    // C++:  bool empty()
    //

/**
 * <p>Checks whether the classifier has been loaded.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-empty">org.opencv.objdetect.CascadeClassifier.empty</a>
 */
    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++:  bool load(String filename)
    //

/**
 * <p>Loads a classifier from a file.</p>
 *
 * @param filename Name of the file from which the classifier is loaded. The
 * file may contain an old HAAR classifier trained by the haartraining
 * application or a new cascade classifier trained by the traincascade
 * application.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-load">org.opencv.objdetect.CascadeClassifier.load</a>
 */
    public  boolean load(String filename)
    {

        boolean retVal = load_0(nativeObj, filename);

        return retVal;
    }


    //
    // C++:  bool read(FileNode node)
    //

    // Unknown type 'FileNode' (I), skipping the function


    //
    // C++:  void detectMultiScale(Mat image, vector_Rect& objects, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size())
    //

/**
 * <p>Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.</p>
 *
 * <p>The function is parallelized with the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A face detection example using cascade classifiers can be
 * found at opencv_source_code/samples/python2/facedetect.py
 * </ul>
 *
 * @param image Matrix of the type <code>CV_8U</code> containing an image where
 * objects are detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object, the rectangles may be partially outside the original image.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candidate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function <code>cvHaarDetectObjects</code>. It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 * @param maxSize Maximum possible object size. Objects larger than that are
 * ignored.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, MatOfRect objects, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize)
    {
        Mat objects_mat = objects;
        detectMultiScale_0(nativeObj, image.nativeObj, objects_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);

        return;
    }

/**
 * <p>Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.</p>
 *
 * <p>The function is parallelized with the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A face detection example using cascade classifiers can be
 * found at opencv_source_code/samples/python2/facedetect.py
 * </ul>
 *
 * @param image Matrix of the type <code>CV_8U</code> containing an image where
 * objects are detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object, the rectangles may be partially outside the original image.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale(Mat image, MatOfRect objects)
    {
        Mat objects_mat = objects;
        detectMultiScale_1(nativeObj, image.nativeObj, objects_mat.nativeObj);

        return;
    }


    //
    // C++:  void detectMultiScale(Mat image, vector_Rect& objects, vector_int& numDetections, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size())
    //

/**
 * <p>Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.</p>
 *
 * <p>The function is parallelized with the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A face detection example using cascade classifiers can be
 * found at opencv_source_code/samples/python2/facedetect.py
 * </ul>
 *
 * @param image Matrix of the type <code>CV_8U</code> containing an image where
 * objects are detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object, the rectangles may be partially outside the original image.
 * @param numDetections Vector of detection numbers for the corresponding
 * objects. An object's number of detections is the number of neighboring
 * positively classified rectangles that were joined together to form the
 * object.
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candidate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function <code>cvHaarDetectObjects</code>. It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 * @param maxSize Maximum possible object size. Objects larger than that are
 * ignored.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize)
    {
        Mat objects_mat = objects;
        Mat numDetections_mat = numDetections;
        detectMultiScale2_0(nativeObj, image.nativeObj, objects_mat.nativeObj, numDetections_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height);

        return;
    }

/**
 * <p>Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.</p>
 *
 * <p>The function is parallelized with the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A face detection example using cascade classifiers can be
 * found at opencv_source_code/samples/python2/facedetect.py
 * </ul>
 *
 * @param image Matrix of the type <code>CV_8U</code> containing an image where
 * objects are detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object, the rectangles may be partially outside the original image.
 * @param numDetections Vector of detection numbers for the corresponding
 * objects. An object's number of detections is the number of neighboring
 * positively classified rectangles that were joined together to form the
 * object.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale2(Mat image, MatOfRect objects, MatOfInt numDetections)
    {
        Mat objects_mat = objects;
        Mat numDetections_mat = numDetections;
        detectMultiScale2_1(nativeObj, image.nativeObj, objects_mat.nativeObj, numDetections_mat.nativeObj);

        return;
    }


    //
    // C++:  void detectMultiScale(Mat image, vector_Rect& objects, vector_int& rejectLevels, vector_double& levelWeights, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size(), bool outputRejectLevels = false)
    //

/**
 * <p>Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.</p>
 *
 * <p>The function is parallelized with the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A face detection example using cascade classifiers can be
 * found at opencv_source_code/samples/python2/facedetect.py
 * </ul>
 *
 * @param image Matrix of the type <code>CV_8U</code> containing an image where
 * objects are detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object, the rectangles may be partially outside the original image.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 * @param scaleFactor Parameter specifying how much the image size is reduced at
 * each image scale.
 * @param minNeighbors Parameter specifying how many neighbors each candidate
 * rectangle should have to retain it.
 * @param flags Parameter with the same meaning for an old cascade as in the
 * function <code>cvHaarDetectObjects</code>. It is not used for a new cascade.
 * @param minSize Minimum possible object size. Objects smaller than that are
 * ignored.
 * @param maxSize Maximum possible object size. Objects larger than that are
 * ignored.
 * @param outputRejectLevels Boolean. If <code>True</code>, it returns the
 * rejectLevels and levelWeights. Default value is <code>False</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights, double scaleFactor, int minNeighbors, int flags, Size minSize, Size maxSize, boolean outputRejectLevels)
    {
        Mat objects_mat = objects;
        Mat rejectLevels_mat = rejectLevels;
        Mat levelWeights_mat = levelWeights;
        detectMultiScale3_0(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj, scaleFactor, minNeighbors, flags, minSize.width, minSize.height, maxSize.width, maxSize.height, outputRejectLevels);

        return;
    }

/**
 * <p>Detects objects of different sizes in the input image. The detected objects
 * are returned as a list of rectangles.</p>
 *
 * <p>The function is parallelized with the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A face detection example using cascade classifiers can be
 * found at opencv_source_code/samples/python2/facedetect.py
 * </ul>
 *
 * @param image Matrix of the type <code>CV_8U</code> containing an image where
 * objects are detected.
 * @param objects Vector of rectangles where each rectangle contains the
 * detected object, the rectangles may be partially outside the original image.
 * @param rejectLevels a rejectLevels
 * @param levelWeights a levelWeights
 *
 * @see <a href="http://docs.opencv.org/modules/objdetect/doc/cascade_classification.html#cascadeclassifier-detectmultiscale">org.opencv.objdetect.CascadeClassifier.detectMultiScale</a>
 */
    public  void detectMultiScale3(Mat image, MatOfRect objects, MatOfInt rejectLevels, MatOfDouble levelWeights)
    {
        Mat objects_mat = objects;
        Mat rejectLevels_mat = rejectLevels;
        Mat levelWeights_mat = levelWeights;
        detectMultiScale3_1(nativeObj, image.nativeObj, objects_mat.nativeObj, rejectLevels_mat.nativeObj, levelWeights_mat.nativeObj);

        return;
    }


    //
    // C++:  bool isOldFormatCascade()
    //

    public  boolean isOldFormatCascade()
    {

        boolean retVal = isOldFormatCascade_0(nativeObj);

        return retVal;
    }


    //
    // C++:  Size getOriginalWindowSize()
    //

    public  Size getOriginalWindowSize()
    {

        Size retVal = new Size(getOriginalWindowSize_0(nativeObj));

        return retVal;
    }


    //
    // C++: static bool convert(String oldcascade, String newcascade)
    //

    public static boolean convert(String oldcascade, String newcascade)
    {

        boolean retVal = convert_0(oldcascade, newcascade);

        return retVal;
    }


    //
    // C++:  int getFeatureType()
    //

    public  int getFeatureType()
    {

        int retVal = getFeatureType_0(nativeObj);

        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   CascadeClassifier()
    private static native long CascadeClassifier_0();

    // C++:   CascadeClassifier(String filename)
    private static native long CascadeClassifier_1(String filename);

    // C++:  bool empty()
    private static native boolean empty_0(long nativeObj);

    // C++:  bool load(String filename)
    private static native boolean load_0(long nativeObj, String filename);

    // C++:  void detectMultiScale(Mat image, vector_Rect& objects, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size())
    private static native void detectMultiScale_0(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height, double maxSize_width, double maxSize_height);
    private static native void detectMultiScale_1(long nativeObj, long image_nativeObj, long objects_mat_nativeObj);

    // C++:  void detectMultiScale(Mat image, vector_Rect& objects, vector_int& numDetections, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size())
    private static native void detectMultiScale2_0(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long numDetections_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height, double maxSize_width, double maxSize_height);
    private static native void detectMultiScale2_1(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long numDetections_mat_nativeObj);

    // C++:  void detectMultiScale(Mat image, vector_Rect& objects, vector_int& rejectLevels, vector_double& levelWeights, double scaleFactor = 1.1, int minNeighbors = 3, int flags = 0, Size minSize = Size(), Size maxSize = Size(), bool outputRejectLevels = false)
    private static native void detectMultiScale3_0(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj, double scaleFactor, int minNeighbors, int flags, double minSize_width, double minSize_height, double maxSize_width, double maxSize_height, boolean outputRejectLevels);
    private static native void detectMultiScale3_1(long nativeObj, long image_nativeObj, long objects_mat_nativeObj, long rejectLevels_mat_nativeObj, long levelWeights_mat_nativeObj);

    // C++:  bool isOldFormatCascade()
    private static native boolean isOldFormatCascade_0(long nativeObj);

    // C++:  Size getOriginalWindowSize()
    private static native double[] getOriginalWindowSize_0(long nativeObj);

    // C++: static bool convert(String oldcascade, String newcascade)
    private static native boolean convert_0(String oldcascade, String newcascade);

    // C++:  int getFeatureType()
    private static native int getFeatureType_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
