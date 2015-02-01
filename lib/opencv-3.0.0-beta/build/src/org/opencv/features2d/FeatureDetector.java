
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.utils.Converters;

// C++: class javaFeatureDetector
/**
 * <p>Abstract base class for 2D image feature detectors.</p>
 *
 * <p>class CV_EXPORTS FeatureDetector <code></p>
 *
 * <p>// C++ code:</p>
 *
 *
 * <p>public:</p>
 *
 * <p>virtual ~FeatureDetector();</p>
 *
 * <p>void detect(InputArray image, vector<KeyPoint>& keypoints,</p>
 *
 * <p>InputArray mask=noArray()) const;</p>
 *
 * <p>void detect(InputArrayOfArrays images,</p>
 *
 * <p>vector<vector<KeyPoint> >& keypoints,</p>
 *
 * <p>InputArrayOfArrays masks=noArray()) const;</p>
 *
 * <p>virtual void read(const FileNode&);</p>
 *
 * <p>virtual void write(FileStorage&) const;</p>
 *
 * <p>static Ptr<FeatureDetector> create(const String& detectorType);</p>
 *
 * <p>protected:...</p>
 *
 * <p>};</p>
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector">org.opencv.features2d.FeatureDetector : public Algorithm</a>
 */
public class FeatureDetector {

    protected final long nativeObj;
    protected FeatureDetector(long addr) { nativeObj = addr; }


    private static final int
            GRIDDETECTOR = 1000,
            PYRAMIDDETECTOR = 2000,
            DYNAMICDETECTOR = 3000;


    public static final int
            FAST = 1,
            STAR = 2,
            SIFT = 3,
            SURF = 4,
            ORB = 5,
            MSER = 6,
            GFTT = 7,
            HARRIS = 8,
            SIMPLEBLOB = 9,
            DENSE = 10,
            BRISK = 11,
            AKAZE = 12,
            GRID_FAST = GRIDDETECTOR + FAST,
            GRID_STAR = GRIDDETECTOR + STAR,
            GRID_SIFT = GRIDDETECTOR + SIFT,
            GRID_SURF = GRIDDETECTOR + SURF,
            GRID_ORB = GRIDDETECTOR + ORB,
            GRID_MSER = GRIDDETECTOR + MSER,
            GRID_GFTT = GRIDDETECTOR + GFTT,
            GRID_HARRIS = GRIDDETECTOR + HARRIS,
            GRID_SIMPLEBLOB = GRIDDETECTOR + SIMPLEBLOB,
            GRID_DENSE = GRIDDETECTOR + DENSE,
            GRID_BRISK = GRIDDETECTOR + BRISK,
            GRID_AKAZE = GRIDDETECTOR + AKAZE,
            PYRAMID_FAST = PYRAMIDDETECTOR + FAST,
            PYRAMID_STAR = PYRAMIDDETECTOR + STAR,
            PYRAMID_SIFT = PYRAMIDDETECTOR + SIFT,
            PYRAMID_SURF = PYRAMIDDETECTOR + SURF,
            PYRAMID_ORB = PYRAMIDDETECTOR + ORB,
            PYRAMID_MSER = PYRAMIDDETECTOR + MSER,
            PYRAMID_GFTT = PYRAMIDDETECTOR + GFTT,
            PYRAMID_HARRIS = PYRAMIDDETECTOR + HARRIS,
            PYRAMID_SIMPLEBLOB = PYRAMIDDETECTOR + SIMPLEBLOB,
            PYRAMID_DENSE = PYRAMIDDETECTOR + DENSE,
            PYRAMID_BRISK = PYRAMIDDETECTOR + BRISK,
            PYRAMID_AKAZE = PYRAMIDDETECTOR + AKAZE,
            DYNAMIC_FAST = DYNAMICDETECTOR + FAST,
            DYNAMIC_STAR = DYNAMICDETECTOR + STAR,
            DYNAMIC_SIFT = DYNAMICDETECTOR + SIFT,
            DYNAMIC_SURF = DYNAMICDETECTOR + SURF,
            DYNAMIC_ORB = DYNAMICDETECTOR + ORB,
            DYNAMIC_MSER = DYNAMICDETECTOR + MSER,
            DYNAMIC_GFTT = DYNAMICDETECTOR + GFTT,
            DYNAMIC_HARRIS = DYNAMICDETECTOR + HARRIS,
            DYNAMIC_SIMPLEBLOB = DYNAMICDETECTOR + SIMPLEBLOB,
            DYNAMIC_DENSE = DYNAMICDETECTOR + DENSE,
            DYNAMIC_BRISK = DYNAMICDETECTOR + BRISK,
            DYNAMIC_AKAZE = DYNAMICDETECTOR + AKAZE;


    //
    // C++:  void detect(Mat image, vector_KeyPoint& keypoints, Mat mask = Mat())
    //

/**
 * <p>Detects keypoints in an image (first variant) or image set (second variant).</p>
 *
 * @param image Image.
 * @param keypoints The detected keypoints. In the second variant of the method
 * <code>keypoints[i]</code> is a set of keypoints detected in <code>images[i]</code>.
 * @param mask Mask specifying where to look for keypoints (optional). It must
 * be a 8-bit integer matrix with non-zero values in the region of interest.
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(Mat image, MatOfKeyPoint keypoints, Mat mask)
    {
        Mat keypoints_mat = keypoints;
        detect_0(nativeObj, image.nativeObj, keypoints_mat.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Detects keypoints in an image (first variant) or image set (second variant).</p>
 *
 * @param image Image.
 * @param keypoints The detected keypoints. In the second variant of the method
 * <code>keypoints[i]</code> is a set of keypoints detected in <code>images[i]</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(Mat image, MatOfKeyPoint keypoints)
    {
        Mat keypoints_mat = keypoints;
        detect_1(nativeObj, image.nativeObj, keypoints_mat.nativeObj);

        return;
    }


    //
    // C++:  void detect(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat masks = std::vector<Mat>())
    //

/**
 * <p>Detects keypoints in an image (first variant) or image set (second variant).</p>
 *
 * @param images Image set.
 * @param keypoints The detected keypoints. In the second variant of the method
 * <code>keypoints[i]</code> is a set of keypoints detected in <code>images[i]</code>.
 * @param masks Masks for each input image specifying where to look for
 * keypoints (optional). <code>masks[i]</code> is a mask for <code>images[i]</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(List<Mat> images, List<MatOfKeyPoint> keypoints, List<Mat> masks)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat keypoints_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        detect_2(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj, masks_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        return;
    }

/**
 * <p>Detects keypoints in an image (first variant) or image set (second variant).</p>
 *
 * @param images Image set.
 * @param keypoints The detected keypoints. In the second variant of the method
 * <code>keypoints[i]</code> is a set of keypoints detected in <code>images[i]</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#featuredetector-detect">org.opencv.features2d.FeatureDetector.detect</a>
 */
    public  void detect(List<Mat> images, List<MatOfKeyPoint> keypoints)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat keypoints_mat = new Mat();
        detect_3(nativeObj, images_mat.nativeObj, keypoints_mat.nativeObj);
        Converters.Mat_to_vector_vector_KeyPoint(keypoints_mat, keypoints);
        return;
    }


    //
    // C++:  bool empty()
    //

    public  boolean empty()
    {

        boolean retVal = empty_0(nativeObj);

        return retVal;
    }


    //
    // C++: static javaFeatureDetector* create(int detectorType)
    //

    public static FeatureDetector create(int detectorType)
    {

        FeatureDetector retVal = new FeatureDetector(create_0(detectorType));

        return retVal;
    }


    //
    // C++:  void write(String fileName)
    //

    public  void write(String fileName)
    {

        write_0(nativeObj, fileName);

        return;
    }


    //
    // C++:  void read(String fileName)
    //

    public  void read(String fileName)
    {

        read_0(nativeObj, fileName);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void detect(Mat image, vector_KeyPoint& keypoints, Mat mask = Mat())
    private static native void detect_0(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj, long mask_nativeObj);
    private static native void detect_1(long nativeObj, long image_nativeObj, long keypoints_mat_nativeObj);

    // C++:  void detect(vector_Mat images, vector_vector_KeyPoint& keypoints, vector_Mat masks = std::vector<Mat>())
    private static native void detect_2(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj, long masks_mat_nativeObj);
    private static native void detect_3(long nativeObj, long images_mat_nativeObj, long keypoints_mat_nativeObj);

    // C++:  bool empty()
    private static native boolean empty_0(long nativeObj);

    // C++: static javaFeatureDetector* create(int detectorType)
    private static native long create_0(int detectorType);

    // C++:  void write(String fileName)
    private static native void write_0(long nativeObj, String fileName);

    // C++:  void read(String fileName)
    private static native void read_0(long nativeObj, String fileName);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
