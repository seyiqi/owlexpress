
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.calib3d;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class StereoMatcher
/**
 * <p>The base class for stereo correspondence algorithms.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereomatcher">org.opencv.calib3d.StereoMatcher : public Algorithm</a>
 */
public class StereoMatcher extends Algorithm {

    protected StereoMatcher(long addr) { super(addr); }


    public static final int
            DISP_SHIFT = 4,
            DISP_SCALE = (1 << DISP_SHIFT);


    //
    // C++:  void compute(Mat left, Mat right, Mat& disparity)
    //

/**
 * <p>Computes disparity map for the specified stereo pair</p>
 *
 * @param left Left 8-bit single-channel image.
 * @param right Right image of the same size and the same type as the left one.
 * @param disparity Output disparity map. It has the same size as the input
 * images. Some algorithms, like StereoBM or StereoSGBM compute 16-bit
 * fixed-point disparity map (where each disparity value has 4 fractional bits),
 * whereas other algorithms output 32-bit floating-point disparity map.
 *
 * @see <a href="http://docs.opencv.org/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html#stereomatcher-compute">org.opencv.calib3d.StereoMatcher.compute</a>
 */
    public  void compute(Mat left, Mat right, Mat disparity)
    {

        compute_0(nativeObj, left.nativeObj, right.nativeObj, disparity.nativeObj);

        return;
    }


    //
    // C++:  int getMinDisparity()
    //

    public  int getMinDisparity()
    {

        int retVal = getMinDisparity_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setMinDisparity(int minDisparity)
    //

    public  void setMinDisparity(int minDisparity)
    {

        setMinDisparity_0(nativeObj, minDisparity);

        return;
    }


    //
    // C++:  int getNumDisparities()
    //

    public  int getNumDisparities()
    {

        int retVal = getNumDisparities_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setNumDisparities(int numDisparities)
    //

    public  void setNumDisparities(int numDisparities)
    {

        setNumDisparities_0(nativeObj, numDisparities);

        return;
    }


    //
    // C++:  int getBlockSize()
    //

    public  int getBlockSize()
    {

        int retVal = getBlockSize_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setBlockSize(int blockSize)
    //

    public  void setBlockSize(int blockSize)
    {

        setBlockSize_0(nativeObj, blockSize);

        return;
    }


    //
    // C++:  int getSpeckleWindowSize()
    //

    public  int getSpeckleWindowSize()
    {

        int retVal = getSpeckleWindowSize_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setSpeckleWindowSize(int speckleWindowSize)
    //

    public  void setSpeckleWindowSize(int speckleWindowSize)
    {

        setSpeckleWindowSize_0(nativeObj, speckleWindowSize);

        return;
    }


    //
    // C++:  int getSpeckleRange()
    //

    public  int getSpeckleRange()
    {

        int retVal = getSpeckleRange_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setSpeckleRange(int speckleRange)
    //

    public  void setSpeckleRange(int speckleRange)
    {

        setSpeckleRange_0(nativeObj, speckleRange);

        return;
    }


    //
    // C++:  int getDisp12MaxDiff()
    //

    public  int getDisp12MaxDiff()
    {

        int retVal = getDisp12MaxDiff_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setDisp12MaxDiff(int disp12MaxDiff)
    //

    public  void setDisp12MaxDiff(int disp12MaxDiff)
    {

        setDisp12MaxDiff_0(nativeObj, disp12MaxDiff);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void compute(Mat left, Mat right, Mat& disparity)
    private static native void compute_0(long nativeObj, long left_nativeObj, long right_nativeObj, long disparity_nativeObj);

    // C++:  int getMinDisparity()
    private static native int getMinDisparity_0(long nativeObj);

    // C++:  void setMinDisparity(int minDisparity)
    private static native void setMinDisparity_0(long nativeObj, int minDisparity);

    // C++:  int getNumDisparities()
    private static native int getNumDisparities_0(long nativeObj);

    // C++:  void setNumDisparities(int numDisparities)
    private static native void setNumDisparities_0(long nativeObj, int numDisparities);

    // C++:  int getBlockSize()
    private static native int getBlockSize_0(long nativeObj);

    // C++:  void setBlockSize(int blockSize)
    private static native void setBlockSize_0(long nativeObj, int blockSize);

    // C++:  int getSpeckleWindowSize()
    private static native int getSpeckleWindowSize_0(long nativeObj);

    // C++:  void setSpeckleWindowSize(int speckleWindowSize)
    private static native void setSpeckleWindowSize_0(long nativeObj, int speckleWindowSize);

    // C++:  int getSpeckleRange()
    private static native int getSpeckleRange_0(long nativeObj);

    // C++:  void setSpeckleRange(int speckleRange)
    private static native void setSpeckleRange_0(long nativeObj, int speckleRange);

    // C++:  int getDisp12MaxDiff()
    private static native int getDisp12MaxDiff_0(long nativeObj);

    // C++:  void setDisp12MaxDiff(int disp12MaxDiff)
    private static native void setDisp12MaxDiff_0(long nativeObj, int disp12MaxDiff);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
