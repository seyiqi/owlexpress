
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.utils.Converters;

// C++: class AlignMTB
/**
 * <p>This algorithm converts images to median threshold bitmaps (1 for pixels
 * brighter than median luminance and 0 otherwise) and than aligns the resulting
 * bitmaps using bit operations.</p>
 *
 * <p>It is invariant to exposure, so exposure values and camera response are not
 * necessary.</p>
 *
 * <p>In this implementation new image regions are filled with zeros.</p>
 *
 * <p>For more information see [GW03].</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#alignmtb">org.opencv.photo.AlignMTB : public AlignExposures</a>
 */
public class AlignMTB extends AlignExposures {

    protected AlignMTB(long addr) { super(addr); }


    //
    // C++:  void process(vector_Mat src, vector_Mat dst, Mat times, Mat response)
    //

/**
 * <p>Short version of process, that doesn't take extra arguments.</p>
 *
 * @param src vector of input images
 * @param dst vector of aligned images
 * @param times a times
 * @param response a response
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#alignmtb-process">org.opencv.photo.AlignMTB.process</a>
 */
    public  void process(List<Mat> src, List<Mat> dst, Mat times, Mat response)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
        process_0(nativeObj, src_mat.nativeObj, dst_mat.nativeObj, times.nativeObj, response.nativeObj);

        return;
    }


    //
    // C++:  void process(vector_Mat src, vector_Mat dst)
    //

/**
 * <p>Short version of process, that doesn't take extra arguments.</p>
 *
 * @param src vector of input images
 * @param dst vector of aligned images
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#alignmtb-process">org.opencv.photo.AlignMTB.process</a>
 */
    public  void process(List<Mat> src, List<Mat> dst)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
        process_1(nativeObj, src_mat.nativeObj, dst_mat.nativeObj);

        return;
    }


    //
    // C++:  Point calculateShift(Mat img0, Mat img1)
    //

/**
 * <p>Calculates shift between two images, i. e. how to shift the second image to
 * correspond it with the first.</p>
 *
 * @param img0 first image
 * @param img1 second image
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#alignmtb-calculateshift">org.opencv.photo.AlignMTB.calculateShift</a>
 */
    public  Point calculateShift(Mat img0, Mat img1)
    {

        Point retVal = new Point(calculateShift_0(nativeObj, img0.nativeObj, img1.nativeObj));

        return retVal;
    }


    //
    // C++:  void shiftMat(Mat src, Mat& dst, Point shift)
    //

/**
 * <p>Helper function, that shift Mat filling new regions with zeros.</p>
 *
 * @param src input image
 * @param dst result image
 * @param shift shift value
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#alignmtb-shiftmat">org.opencv.photo.AlignMTB.shiftMat</a>
 */
    public  void shiftMat(Mat src, Mat dst, Point shift)
    {

        shiftMat_0(nativeObj, src.nativeObj, dst.nativeObj, shift.x, shift.y);

        return;
    }


    //
    // C++:  void computeBitmaps(Mat img, Mat& tb, Mat& eb)
    //

/**
 * <p>Computes median threshold and exclude bitmaps of given image.</p>
 *
 * @param img input image
 * @param tb median threshold bitmap
 * @param eb exclude bitmap
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#alignmtb-computebitmaps">org.opencv.photo.AlignMTB.computeBitmaps</a>
 */
    public  void computeBitmaps(Mat img, Mat tb, Mat eb)
    {

        computeBitmaps_0(nativeObj, img.nativeObj, tb.nativeObj, eb.nativeObj);

        return;
    }


    //
    // C++:  int getMaxBits()
    //

    public  int getMaxBits()
    {

        int retVal = getMaxBits_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setMaxBits(int max_bits)
    //

    public  void setMaxBits(int max_bits)
    {

        setMaxBits_0(nativeObj, max_bits);

        return;
    }


    //
    // C++:  int getExcludeRange()
    //

    public  int getExcludeRange()
    {

        int retVal = getExcludeRange_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setExcludeRange(int exclude_range)
    //

    public  void setExcludeRange(int exclude_range)
    {

        setExcludeRange_0(nativeObj, exclude_range);

        return;
    }


    //
    // C++:  bool getCut()
    //

    public  boolean getCut()
    {

        boolean retVal = getCut_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setCut(bool value)
    //

    public  void setCut(boolean value)
    {

        setCut_0(nativeObj, value);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void process(vector_Mat src, vector_Mat dst, Mat times, Mat response)
    private static native void process_0(long nativeObj, long src_mat_nativeObj, long dst_mat_nativeObj, long times_nativeObj, long response_nativeObj);

    // C++:  void process(vector_Mat src, vector_Mat dst)
    private static native void process_1(long nativeObj, long src_mat_nativeObj, long dst_mat_nativeObj);

    // C++:  Point calculateShift(Mat img0, Mat img1)
    private static native double[] calculateShift_0(long nativeObj, long img0_nativeObj, long img1_nativeObj);

    // C++:  void shiftMat(Mat src, Mat& dst, Point shift)
    private static native void shiftMat_0(long nativeObj, long src_nativeObj, long dst_nativeObj, double shift_x, double shift_y);

    // C++:  void computeBitmaps(Mat img, Mat& tb, Mat& eb)
    private static native void computeBitmaps_0(long nativeObj, long img_nativeObj, long tb_nativeObj, long eb_nativeObj);

    // C++:  int getMaxBits()
    private static native int getMaxBits_0(long nativeObj);

    // C++:  void setMaxBits(int max_bits)
    private static native void setMaxBits_0(long nativeObj, int max_bits);

    // C++:  int getExcludeRange()
    private static native int getExcludeRange_0(long nativeObj);

    // C++:  void setExcludeRange(int exclude_range)
    private static native void setExcludeRange_0(long nativeObj, int exclude_range);

    // C++:  bool getCut()
    private static native boolean getCut_0(long nativeObj);

    // C++:  void setCut(bool value)
    private static native void setCut_0(long nativeObj, boolean value);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
