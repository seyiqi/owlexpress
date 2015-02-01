
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class MergeExposures
/**
 * <p>The base class algorithms that can merge exposure sequence to a single image.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#mergeexposures">org.opencv.photo.MergeExposures : public Algorithm</a>
 */
public class MergeExposures extends Algorithm {

    protected MergeExposures(long addr) { super(addr); }


    //
    // C++:  void process(vector_Mat src, Mat& dst, Mat times, Mat response)
    //

/**
 * <p>Merges images.</p>
 *
 * @param src vector of input images
 * @param dst result image
 * @param times vector of exposure time values for each image
 * @param response 256x1 matrix with inverse camera response function for each
 * pixel value, it should have the same number of channels as images.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#mergeexposures-process">org.opencv.photo.MergeExposures.process</a>
 */
    public  void process(List<Mat> src, Mat dst, Mat times, Mat response)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        process_0(nativeObj, src_mat.nativeObj, dst.nativeObj, times.nativeObj, response.nativeObj);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void process(vector_Mat src, Mat& dst, Mat times, Mat response)
    private static native void process_0(long nativeObj, long src_mat_nativeObj, long dst_nativeObj, long times_nativeObj, long response_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
