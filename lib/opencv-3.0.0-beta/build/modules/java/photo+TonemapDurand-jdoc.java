
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;



// C++: class TonemapDurand
/**
 * <p>This algorithm decomposes image into two layers: base layer and detail layer
 * using bilateral filter and compresses contrast of the base layer thus
 * preserving all the details.</p>
 *
 * <p>This implementation uses regular bilateral filter from opencv.</p>
 *
 * <p>Saturation enhancement is possible as in ocv:class:"TonemapDrago".</p>
 *
 * <p>For more information see [DD02].</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#tonemapdurand">org.opencv.photo.TonemapDurand : public Tonemap</a>
 */
public class TonemapDurand extends Tonemap {

    protected TonemapDurand(long addr) { super(addr); }


    //
    // C++:  float getSaturation()
    //

    public  float getSaturation()
    {

        float retVal = getSaturation_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setSaturation(float saturation)
    //

    public  void setSaturation(float saturation)
    {

        setSaturation_0(nativeObj, saturation);

        return;
    }


    //
    // C++:  float getContrast()
    //

    public  float getContrast()
    {

        float retVal = getContrast_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setContrast(float contrast)
    //

    public  void setContrast(float contrast)
    {

        setContrast_0(nativeObj, contrast);

        return;
    }


    //
    // C++:  float getSigmaSpace()
    //

    public  float getSigmaSpace()
    {

        float retVal = getSigmaSpace_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setSigmaSpace(float sigma_space)
    //

    public  void setSigmaSpace(float sigma_space)
    {

        setSigmaSpace_0(nativeObj, sigma_space);

        return;
    }


    //
    // C++:  float getSigmaColor()
    //

    public  float getSigmaColor()
    {

        float retVal = getSigmaColor_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setSigmaColor(float sigma_color)
    //

    public  void setSigmaColor(float sigma_color)
    {

        setSigmaColor_0(nativeObj, sigma_color);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float getSaturation()
    private static native float getSaturation_0(long nativeObj);

    // C++:  void setSaturation(float saturation)
    private static native void setSaturation_0(long nativeObj, float saturation);

    // C++:  float getContrast()
    private static native float getContrast_0(long nativeObj);

    // C++:  void setContrast(float contrast)
    private static native void setContrast_0(long nativeObj, float contrast);

    // C++:  float getSigmaSpace()
    private static native float getSigmaSpace_0(long nativeObj);

    // C++:  void setSigmaSpace(float sigma_space)
    private static native void setSigmaSpace_0(long nativeObj, float sigma_space);

    // C++:  float getSigmaColor()
    private static native float getSigmaColor_0(long nativeObj);

    // C++:  void setSigmaColor(float sigma_color)
    private static native void setSigmaColor_0(long nativeObj, float sigma_color);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
