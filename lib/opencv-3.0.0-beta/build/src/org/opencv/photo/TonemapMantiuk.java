
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;



// C++: class TonemapMantiuk
/**
 * <p>This algorithm transforms image to contrast using gradients on all levels of
 * gaussian pyramid, transforms contrast values to HVS response and scales the
 * response.
 * After this the image is reconstructed from new contrast values.</p>
 *
 * <p>For more information see [MM06].</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#tonemapmantiuk">org.opencv.photo.TonemapMantiuk : public Tonemap</a>
 */
public class TonemapMantiuk extends Tonemap {

    protected TonemapMantiuk(long addr) { super(addr); }


    //
    // C++:  float getScale()
    //

    public  float getScale()
    {

        float retVal = getScale_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setScale(float scale)
    //

    public  void setScale(float scale)
    {

        setScale_0(nativeObj, scale);

        return;
    }


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


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float getScale()
    private static native float getScale_0(long nativeObj);

    // C++:  void setScale(float scale)
    private static native void setScale_0(long nativeObj, float scale);

    // C++:  float getSaturation()
    private static native float getSaturation_0(long nativeObj);

    // C++:  void setSaturation(float saturation)
    private static native void setSaturation_0(long nativeObj, float saturation);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
