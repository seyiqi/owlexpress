
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class Tonemap
/**
 * <p>Base class for tonemapping algorithms - tools that are used to map HDR image
 * to 8-bit range.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#tonemap">org.opencv.photo.Tonemap : public Algorithm</a>
 */
public class Tonemap extends Algorithm {

    protected Tonemap(long addr) { super(addr); }


    //
    // C++:  void process(Mat src, Mat& dst)
    //

/**
 * <p>Tonemaps image</p>
 *
 * @param src source image - 32-bit 3-channel Mat
 * @param dst destination image - 32-bit 3-channel Mat with values in [0, 1]
 * range
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#tonemap-process">org.opencv.photo.Tonemap.process</a>
 */
    public  void process(Mat src, Mat dst)
    {

        process_0(nativeObj, src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  float getGamma()
    //

    public  float getGamma()
    {

        float retVal = getGamma_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setGamma(float gamma)
    //

    public  void setGamma(float gamma)
    {

        setGamma_0(nativeObj, gamma);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void process(Mat src, Mat& dst)
    private static native void process_0(long nativeObj, long src_nativeObj, long dst_nativeObj);

    // C++:  float getGamma()
    private static native float getGamma_0(long nativeObj);

    // C++:  void setGamma(float gamma)
    private static native void setGamma_0(long nativeObj, float gamma);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
