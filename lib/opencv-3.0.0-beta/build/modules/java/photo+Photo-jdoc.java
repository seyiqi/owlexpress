
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.utils.Converters;

public class Photo {

    private static final int
            CV_INPAINT_NS = 0,
            CV_INPAINT_TELEA = 1;


    public static final int
            INPAINT_NS = 0,
            INPAINT_TELEA = 1,
            NORMAL_CLONE = 1,
            MIXED_CLONE = 2,
            MONOCHROME_TRANSFER = 3,
            RECURS_FILTER = 1,
            NORMCONV_FILTER = 2,
            LDR_SIZE = 256;


    //
    // C++:  void textureFlattening(Mat src, Mat mask, Mat& dst, float low_threshold = 30, float high_threshold = 45, int kernel_size = 3)
    //

/**
 * <p>By retaining only the gradients at edge locations, before integrating with
 * the Poisson solver, one washes out the texture of the selected region, giving
 * its contents a flat aspect. Here Canny Edge Detector is used.</p>
 *
 * <p>NOTE:</p>
 *
 * <p>The algorithm assumes that the color of the source image is close to that of
 * the destination. This assumption means that when the colors don't match, the
 * source image color gets tinted toward the color of the destination image.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param low_threshold Range from 0 to 100.
 * @param high_threshold Value > 100.
 * @param kernel_size The size of the Sobel kernel to be used.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#textureflattening">org.opencv.photo.Photo.textureFlattening</a>
 */
    public static void textureFlattening(Mat src, Mat mask, Mat dst, float low_threshold, float high_threshold, int kernel_size)
    {

        textureFlattening_0(src.nativeObj, mask.nativeObj, dst.nativeObj, low_threshold, high_threshold, kernel_size);

        return;
    }

/**
 * <p>By retaining only the gradients at edge locations, before integrating with
 * the Poisson solver, one washes out the texture of the selected region, giving
 * its contents a flat aspect. Here Canny Edge Detector is used.</p>
 *
 * <p>NOTE:</p>
 *
 * <p>The algorithm assumes that the color of the source image is close to that of
 * the destination. This assumption means that when the colors don't match, the
 * source image color gets tinted toward the color of the destination image.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#textureflattening">org.opencv.photo.Photo.textureFlattening</a>
 */
    public static void textureFlattening(Mat src, Mat mask, Mat dst)
    {

        textureFlattening_1(src.nativeObj, mask.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void edgePreservingFilter(Mat src, Mat& dst, int flags = 1, float sigma_s = 60, float sigma_r = 0.4f)
    //

/**
 * <p>Filtering is the fundamental operation in image and video processing.
 * Edge-preserving smoothing filters are used in many different applications
 * [EM11].</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output 8-bit 3-channel image.
 * @param flags Edge preserving filters:
 * <ul>
 *   <li> RECURS_FILTER = 1
 *   <li> NORMCONV_FILTER = 2
 * </ul>
 * @param sigma_s Range between 0 to 200.
 * @param sigma_r Range between 0 to 1.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#edgepreservingfilter">org.opencv.photo.Photo.edgePreservingFilter</a>
 */
    public static void edgePreservingFilter(Mat src, Mat dst, int flags, float sigma_s, float sigma_r)
    {

        edgePreservingFilter_0(src.nativeObj, dst.nativeObj, flags, sigma_s, sigma_r);

        return;
    }

/**
 * <p>Filtering is the fundamental operation in image and video processing.
 * Edge-preserving smoothing filters are used in many different applications
 * [EM11].</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output 8-bit 3-channel image.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#edgepreservingfilter">org.opencv.photo.Photo.edgePreservingFilter</a>
 */
    public static void edgePreservingFilter(Mat src, Mat dst)
    {

        edgePreservingFilter_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void detailEnhance(Mat src, Mat& dst, float sigma_s = 10, float sigma_r = 0.15f)
    //

/**
 * <p>This filter enhances the details of a particular image.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param sigma_s Range between 0 to 200.
 * @param sigma_r Range between 0 to 1.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#detailenhance">org.opencv.photo.Photo.detailEnhance</a>
 */
    public static void detailEnhance(Mat src, Mat dst, float sigma_s, float sigma_r)
    {

        detailEnhance_0(src.nativeObj, dst.nativeObj, sigma_s, sigma_r);

        return;
    }

/**
 * <p>This filter enhances the details of a particular image.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#detailenhance">org.opencv.photo.Photo.detailEnhance</a>
 */
    public static void detailEnhance(Mat src, Mat dst)
    {

        detailEnhance_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void pencilSketch(Mat src, Mat& dst1, Mat& dst2, float sigma_s = 60, float sigma_r = 0.07f, float shade_factor = 0.02f)
    //

/**
 * <p>Pencil-like non-photorealistic line drawing</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst1 Output 8-bit 1-channel image.
 * @param dst2 Output image with the same size and type as <code>src</code>.
 * @param sigma_s Range between 0 to 200.
 * @param sigma_r Range between 0 to 1.
 * @param shade_factor Range between 0 to 0.1.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#pencilsketch">org.opencv.photo.Photo.pencilSketch</a>
 */
    public static void pencilSketch(Mat src, Mat dst1, Mat dst2, float sigma_s, float sigma_r, float shade_factor)
    {

        pencilSketch_0(src.nativeObj, dst1.nativeObj, dst2.nativeObj, sigma_s, sigma_r, shade_factor);

        return;
    }

/**
 * <p>Pencil-like non-photorealistic line drawing</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst1 Output 8-bit 1-channel image.
 * @param dst2 Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#pencilsketch">org.opencv.photo.Photo.pencilSketch</a>
 */
    public static void pencilSketch(Mat src, Mat dst1, Mat dst2)
    {

        pencilSketch_1(src.nativeObj, dst1.nativeObj, dst2.nativeObj);

        return;
    }


    //
    // C++:  void stylization(Mat src, Mat& dst, float sigma_s = 60, float sigma_r = 0.45f)
    //

/**
 * <p>Stylization aims to produce digital imagery with a wide variety of effects
 * not focused on photorealism. Edge-aware filters are ideal for stylization, as
 * they can abstract regions of low contrast while preserving, or enhancing,
 * high-contrast features.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param sigma_s Range between 0 to 200.
 * @param sigma_r Range between 0 to 1.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#stylization">org.opencv.photo.Photo.stylization</a>
 */
    public static void stylization(Mat src, Mat dst, float sigma_s, float sigma_r)
    {

        stylization_0(src.nativeObj, dst.nativeObj, sigma_s, sigma_r);

        return;
    }

/**
 * <p>Stylization aims to produce digital imagery with a wide variety of effects
 * not focused on photorealism. Edge-aware filters are ideal for stylization, as
 * they can abstract regions of low contrast while preserving, or enhancing,
 * high-contrast features.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/npr.html#stylization">org.opencv.photo.Photo.stylization</a>
 */
    public static void stylization(Mat src, Mat dst)
    {

        stylization_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void inpaint(Mat src, Mat inpaintMask, Mat& dst, double inpaintRadius, int flags)
    //

/**
 * <p>Restores the selected region in an image using the region neighborhood.</p>
 *
 * <p>The function reconstructs the selected image area from the pixel near the
 * area boundary. The function may be used to remove dust and scratches from a
 * scanned photo, or to remove undesirable objects from still images or video.
 * See http://en.wikipedia.org/wiki/Inpainting for more details.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> An example using the inpainting technique can be found at
 * opencv_source_code/samples/cpp/inpaint.cpp
 *   <li> (Python) An example using the inpainting technique can be found at
 * opencv_source_code/samples/python2/inpaint.py
 * </ul>
 *
 * @param src Input 8-bit 1-channel or 3-channel image.
 * @param inpaintMask Inpainting mask, 8-bit 1-channel image. Non-zero pixels
 * indicate the area that needs to be inpainted.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param inpaintRadius Radius of a circular neighborhood of each point
 * inpainted that is considered by the algorithm.
 * @param flags Inpainting method that could be one of the following:
 * <ul>
 *   <li> INPAINT_NS Navier-Stokes based method [Navier01]
 *   <li> INPAINT_TELEA Method by Alexandru Telea [Telea04].
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/inpainting.html#inpaint">org.opencv.photo.Photo.inpaint</a>
 */
    public static void inpaint(Mat src, Mat inpaintMask, Mat dst, double inpaintRadius, int flags)
    {

        inpaint_0(src.nativeObj, inpaintMask.nativeObj, dst.nativeObj, inpaintRadius, flags);

        return;
    }


    //
    // C++:  void fastNlMeansDenoising(Mat src, Mat& dst, float h = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    //

/**
 * <p>Perform image denoising using Non-local Means Denoising algorithm
 * http://www.ipol.im/pub/algo/bcm_non_local_means_denoising/ with several
 * computational optimizations. Noise expected to be a gaussian white noise</p>
 *
 * <p>This function expected to be applied to grayscale images. For colored images
 * look at <code>fastNlMeansDenoisingColored</code>.
 * Advanced usage of this functions can be manual denoising of colored image in
 * different colorspaces.
 * Such approach is used in <code>fastNlMeansDenoisingColored</code> by
 * converting image to CIELAB colorspace and then separately denoise L and AB
 * components with different h parameter.</p>
 *
 * @param src Input 8-bit 1-channel, 2-channel or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param h Parameter regulating filter strength. Big h value perfectly removes
 * noise but also removes image details, smaller h value preserves details but
 * also preserves some noise
 * @param templateWindowSize Size in pixels of the template patch that is used
 * to compute weights. Should be odd. Recommended value 7 pixels
 * @param searchWindowSize Size in pixels of the window that is used to compute
 * weighted average for given pixel. Should be odd. Affect performance linearly:
 * greater searchWindowsSize - greater denoising time. Recommended value 21
 * pixels
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoising">org.opencv.photo.Photo.fastNlMeansDenoising</a>
 */
    public static void fastNlMeansDenoising(Mat src, Mat dst, float h, int templateWindowSize, int searchWindowSize)
    {

        fastNlMeansDenoising_0(src.nativeObj, dst.nativeObj, h, templateWindowSize, searchWindowSize);

        return;
    }

/**
 * <p>Perform image denoising using Non-local Means Denoising algorithm
 * http://www.ipol.im/pub/algo/bcm_non_local_means_denoising/ with several
 * computational optimizations. Noise expected to be a gaussian white noise</p>
 *
 * <p>This function expected to be applied to grayscale images. For colored images
 * look at <code>fastNlMeansDenoisingColored</code>.
 * Advanced usage of this functions can be manual denoising of colored image in
 * different colorspaces.
 * Such approach is used in <code>fastNlMeansDenoisingColored</code> by
 * converting image to CIELAB colorspace and then separately denoise L and AB
 * components with different h parameter.</p>
 *
 * @param src Input 8-bit 1-channel, 2-channel or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoising">org.opencv.photo.Photo.fastNlMeansDenoising</a>
 */
    public static void fastNlMeansDenoising(Mat src, Mat dst)
    {

        fastNlMeansDenoising_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void fastNlMeansDenoisingColored(Mat src, Mat& dst, float h = 3, float hColor = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    //

/**
 * <p>Modification of <code>fastNlMeansDenoising</code> function for colored images</p>
 *
 * <p>The function converts image to CIELAB colorspace and then separately denoise
 * L and AB components with given h parameters using <code>fastNlMeansDenoising</code>
 * function.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param h Parameter regulating filter strength for luminance component. Bigger
 * h value perfectly removes noise but also removes image details, smaller h
 * value preserves details but also preserves some noise
 * @param hColor a hColor
 * @param templateWindowSize Size in pixels of the template patch that is used
 * to compute weights. Should be odd. Recommended value 7 pixels
 * @param searchWindowSize Size in pixels of the window that is used to compute
 * weighted average for given pixel. Should be odd. Affect performance linearly:
 * greater searchWindowsSize - greater denoising time. Recommended value 21
 * pixels
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoisingcolored">org.opencv.photo.Photo.fastNlMeansDenoisingColored</a>
 */
    public static void fastNlMeansDenoisingColored(Mat src, Mat dst, float h, float hColor, int templateWindowSize, int searchWindowSize)
    {

        fastNlMeansDenoisingColored_0(src.nativeObj, dst.nativeObj, h, hColor, templateWindowSize, searchWindowSize);

        return;
    }

/**
 * <p>Modification of <code>fastNlMeansDenoising</code> function for colored images</p>
 *
 * <p>The function converts image to CIELAB colorspace and then separately denoise
 * L and AB components with given h parameters using <code>fastNlMeansDenoising</code>
 * function.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoisingcolored">org.opencv.photo.Photo.fastNlMeansDenoisingColored</a>
 */
    public static void fastNlMeansDenoisingColored(Mat src, Mat dst)
    {

        fastNlMeansDenoisingColored_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void fastNlMeansDenoisingMulti(vector_Mat srcImgs, Mat& dst, int imgToDenoiseIndex, int temporalWindowSize, float h = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    //

/**
 * <p>Modification of <code>fastNlMeansDenoising</code> function for images
 * sequence where consequtive images have been captured in small period of time.
 * For example video. This version of the function is for grayscale images or
 * for manual manipulation with colorspaces.
 * For more details see http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.131.6394</p>
 *
 * @param srcImgs Input 8-bit 1-channel, 2-channel or 3-channel images sequence.
 * All images should have the same type and size.
 * @param dst Output image with the same size and type as <code>srcImgs</code>
 * images.
 * @param imgToDenoiseIndex Target image to denoise index in <code>srcImgs</code>
 * sequence
 * @param temporalWindowSize Number of surrounding images to use for target
 * image denoising. Should be odd. Images from <code>imgToDenoiseIndex -
 * temporalWindowSize / 2</code> to <code>imgToDenoiseIndex - temporalWindowSize
 * / 2</code> from <code>srcImgs</code> will be used to denoise
 * <code>srcImgs[imgToDenoiseIndex]</code> image.
 * @param h Parameter regulating filter strength for luminance component. Bigger
 * h value perfectly removes noise but also removes image details, smaller h
 * value preserves details but also preserves some noise
 * @param templateWindowSize Size in pixels of the template patch that is used
 * to compute weights. Should be odd. Recommended value 7 pixels
 * @param searchWindowSize Size in pixels of the window that is used to compute
 * weighted average for given pixel. Should be odd. Affect performance linearly:
 * greater searchWindowsSize - greater denoising time. Recommended value 21
 * pixels
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoisingmulti">org.opencv.photo.Photo.fastNlMeansDenoisingMulti</a>
 */
    public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, int templateWindowSize, int searchWindowSize)
    {
        Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
        fastNlMeansDenoisingMulti_0(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, templateWindowSize, searchWindowSize);

        return;
    }

/**
 * <p>Modification of <code>fastNlMeansDenoising</code> function for images
 * sequence where consequtive images have been captured in small period of time.
 * For example video. This version of the function is for grayscale images or
 * for manual manipulation with colorspaces.
 * For more details see http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.131.6394</p>
 *
 * @param srcImgs Input 8-bit 1-channel, 2-channel or 3-channel images sequence.
 * All images should have the same type and size.
 * @param dst Output image with the same size and type as <code>srcImgs</code>
 * images.
 * @param imgToDenoiseIndex Target image to denoise index in <code>srcImgs</code>
 * sequence
 * @param temporalWindowSize Number of surrounding images to use for target
 * image denoising. Should be odd. Images from <code>imgToDenoiseIndex -
 * temporalWindowSize / 2</code> to <code>imgToDenoiseIndex - temporalWindowSize
 * / 2</code> from <code>srcImgs</code> will be used to denoise
 * <code>srcImgs[imgToDenoiseIndex]</code> image.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoisingmulti">org.opencv.photo.Photo.fastNlMeansDenoisingMulti</a>
 */
    public static void fastNlMeansDenoisingMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize)
    {
        Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
        fastNlMeansDenoisingMulti_1(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize);

        return;
    }


    //
    // C++:  void fastNlMeansDenoisingColoredMulti(vector_Mat srcImgs, Mat& dst, int imgToDenoiseIndex, int temporalWindowSize, float h = 3, float hColor = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    //

/**
 * <p>Modification of <code>fastNlMeansDenoisingMulti</code> function for colored
 * images sequences</p>
 *
 * <p>The function converts images to CIELAB colorspace and then separately denoise
 * L and AB components with given h parameters using <code>fastNlMeansDenoisingMulti</code>
 * function.</p>
 *
 * @param srcImgs Input 8-bit 3-channel images sequence. All images should have
 * the same type and size.
 * @param dst Output image with the same size and type as <code>srcImgs</code>
 * images.
 * @param imgToDenoiseIndex Target image to denoise index in <code>srcImgs</code>
 * sequence
 * @param temporalWindowSize Number of surrounding images to use for target
 * image denoising. Should be odd. Images from <code>imgToDenoiseIndex -
 * temporalWindowSize / 2</code> to <code>imgToDenoiseIndex - temporalWindowSize
 * / 2</code> from <code>srcImgs</code> will be used to denoise
 * <code>srcImgs[imgToDenoiseIndex]</code> image.
 * @param h Parameter regulating filter strength for luminance component. Bigger
 * h value perfectly removes noise but also removes image details, smaller h
 * value preserves details but also preserves some noise.
 * @param hColor a hColor
 * @param templateWindowSize Size in pixels of the template patch that is used
 * to compute weights. Should be odd. Recommended value 7 pixels
 * @param searchWindowSize Size in pixels of the window that is used to compute
 * weighted average for given pixel. Should be odd. Affect performance linearly:
 * greater searchWindowsSize - greater denoising time. Recommended value 21
 * pixels
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoisingcoloredmulti">org.opencv.photo.Photo.fastNlMeansDenoisingColoredMulti</a>
 */
    public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize, float h, float hColor, int templateWindowSize, int searchWindowSize)
    {
        Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
        fastNlMeansDenoisingColoredMulti_0(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize, h, hColor, templateWindowSize, searchWindowSize);

        return;
    }

/**
 * <p>Modification of <code>fastNlMeansDenoisingMulti</code> function for colored
 * images sequences</p>
 *
 * <p>The function converts images to CIELAB colorspace and then separately denoise
 * L and AB components with given h parameters using <code>fastNlMeansDenoisingMulti</code>
 * function.</p>
 *
 * @param srcImgs Input 8-bit 3-channel images sequence. All images should have
 * the same type and size.
 * @param dst Output image with the same size and type as <code>srcImgs</code>
 * images.
 * @param imgToDenoiseIndex Target image to denoise index in <code>srcImgs</code>
 * sequence
 * @param temporalWindowSize Number of surrounding images to use for target
 * image denoising. Should be odd. Images from <code>imgToDenoiseIndex -
 * temporalWindowSize / 2</code> to <code>imgToDenoiseIndex - temporalWindowSize
 * / 2</code> from <code>srcImgs</code> will be used to denoise
 * <code>srcImgs[imgToDenoiseIndex]</code> image.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#fastnlmeansdenoisingcoloredmulti">org.opencv.photo.Photo.fastNlMeansDenoisingColoredMulti</a>
 */
    public static void fastNlMeansDenoisingColoredMulti(List<Mat> srcImgs, Mat dst, int imgToDenoiseIndex, int temporalWindowSize)
    {
        Mat srcImgs_mat = Converters.vector_Mat_to_Mat(srcImgs);
        fastNlMeansDenoisingColoredMulti_1(srcImgs_mat.nativeObj, dst.nativeObj, imgToDenoiseIndex, temporalWindowSize);

        return;
    }


    //
    // C++:  void denoise_TVL1(vector_Mat observations, Mat result, double lambda = 1.0, int niters = 30)
    //

/**
 * <p>Primal-dual algorithm is an algorithm for solving special types of
 * variational problems (that is, finding a function to minimize some
 * functional).
 * As the image denoising, in particular, may be seen as the variational
 * problem, primal-dual algorithm then can be used to perform denoising and this
 * is exactly what is implemented.</p>
 *
 * <p>It should be noted, that this implementation was taken from the July 2013
 * blog entry [Mordvintsev], which also contained (slightly more general)
 * ready-to-use source code on Python. Subsequently, that code was rewritten on
 * C++ with the usage of openCV by Vadim Pisarevsky at the end of July 2013 and
 * finally it was slightly adapted by later authors.</p>
 *
 * <p>Although the thorough discussion and justification of the algorithm involved
 * may be found in [ChambolleEtAl], it might make sense to skim over it here,
 * following [Mordvintsev]. To begin with, we consider the 1-byte gray-level
 * images as the functions from the rectangular domain of pixels (it may be seen
 * as set <em> <= ft((x,y)inmathbb(N)xmathbb(N)mid 1 <= x <= n, 1 <= y <=
 * mright)</em> for some <em>m, ninmathbb(N)</em>) into <em>(0,1,dots,255)</em>.
 * We shall denote the noised images as <em>f_i</em> and with this view, given
 * some image <em>x</em> of the same size, we may measure how bad it is by the
 * formula</p>
 *
 * <p><em> <= ft| <= ft|nabla xright|right| + lambdasum_i <= ft| <=
 * ft|x-f_iright|right|</em></p>
 *
 * <p><em>||*||</em> here denotes <em>L_2</em>-norm and as you see, the first
 * addend states that we want our image to be smooth (ideally, having zero
 * gradient, thus being constant) and the second states that we want our result
 * to be close to the observations we've got.
 * If we treat <em>x</em> as a function, this is exactly the functional what we
 * seek to minimize and here the Primal-Dual algorithm comes into play.</p>
 *
 * @param observations This array should contain one or more noised versions of
 * the image that is to be restored.
 * @param result Here the denoised image will be stored. There is no need to do
 * pre-allocation of storage space, as it will be automatically allocated, if
 * necessary.
 * @param lambda Corresponds to <em>lambda</em> in the formulas above. As it is
 * enlarged, the smooth (blurred) images are treated more favorably than
 * detailed (but maybe more noised) ones. Roughly speaking, as it becomes
 * smaller, the result will be more blur but more sever outliers will be
 * removed.
 * @param niters Number of iterations that the algorithm will run. Of course, as
 * more iterations as better, but it is hard to quantitatively refine this
 * statement, so just use the default and increase it if the results are poor.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#denoise-tvl1">org.opencv.photo.Photo.denoise_TVL1</a>
 */
    public static void denoise_TVL1(List<Mat> observations, Mat result, double lambda, int niters)
    {
        Mat observations_mat = Converters.vector_Mat_to_Mat(observations);
        denoise_TVL1_0(observations_mat.nativeObj, result.nativeObj, lambda, niters);

        return;
    }

/**
 * <p>Primal-dual algorithm is an algorithm for solving special types of
 * variational problems (that is, finding a function to minimize some
 * functional).
 * As the image denoising, in particular, may be seen as the variational
 * problem, primal-dual algorithm then can be used to perform denoising and this
 * is exactly what is implemented.</p>
 *
 * <p>It should be noted, that this implementation was taken from the July 2013
 * blog entry [Mordvintsev], which also contained (slightly more general)
 * ready-to-use source code on Python. Subsequently, that code was rewritten on
 * C++ with the usage of openCV by Vadim Pisarevsky at the end of July 2013 and
 * finally it was slightly adapted by later authors.</p>
 *
 * <p>Although the thorough discussion and justification of the algorithm involved
 * may be found in [ChambolleEtAl], it might make sense to skim over it here,
 * following [Mordvintsev]. To begin with, we consider the 1-byte gray-level
 * images as the functions from the rectangular domain of pixels (it may be seen
 * as set <em> <= ft((x,y)inmathbb(N)xmathbb(N)mid 1 <= x <= n, 1 <= y <=
 * mright)</em> for some <em>m, ninmathbb(N)</em>) into <em>(0,1,dots,255)</em>.
 * We shall denote the noised images as <em>f_i</em> and with this view, given
 * some image <em>x</em> of the same size, we may measure how bad it is by the
 * formula</p>
 *
 * <p><em> <= ft| <= ft|nabla xright|right| + lambdasum_i <= ft| <=
 * ft|x-f_iright|right|</em></p>
 *
 * <p><em>||*||</em> here denotes <em>L_2</em>-norm and as you see, the first
 * addend states that we want our image to be smooth (ideally, having zero
 * gradient, thus being constant) and the second states that we want our result
 * to be close to the observations we've got.
 * If we treat <em>x</em> as a function, this is exactly the functional what we
 * seek to minimize and here the Primal-Dual algorithm comes into play.</p>
 *
 * @param observations This array should contain one or more noised versions of
 * the image that is to be restored.
 * @param result Here the denoised image will be stored. There is no need to do
 * pre-allocation of storage space, as it will be automatically allocated, if
 * necessary.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/denoising.html#denoise-tvl1">org.opencv.photo.Photo.denoise_TVL1</a>
 */
    public static void denoise_TVL1(List<Mat> observations, Mat result)
    {
        Mat observations_mat = Converters.vector_Mat_to_Mat(observations);
        denoise_TVL1_1(observations_mat.nativeObj, result.nativeObj);

        return;
    }


    //
    // C++:  Ptr_Tonemap createTonemap(float gamma = 1.0f)
    //

/**
 * <p>Creates simple linear mapper with gamma correction</p>
 *
 * @param gamma positive value for gamma correction. Gamma value of 1.0 implies
 * no correction, gamma equal to 2.2f is suitable for most displays.
 *
 * <p>Generally gamma > 1 brightens the image and gamma < 1 darkens it.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemap">org.opencv.photo.Photo.createTonemap</a>
 */
    public static Tonemap createTonemap(float gamma)
    {

        Tonemap retVal = new Tonemap(createTonemap_0(gamma));

        return retVal;
    }

/**
 * <p>Creates simple linear mapper with gamma correction</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemap">org.opencv.photo.Photo.createTonemap</a>
 */
    public static Tonemap createTonemap()
    {

        Tonemap retVal = new Tonemap(createTonemap_1());

        return retVal;
    }


    //
    // C++:  Ptr_TonemapDrago createTonemapDrago(float gamma = 1.0f, float saturation = 1.0f, float bias = 0.85f)
    //

/**
 * <p>Creates TonemapDrago object</p>
 *
 * @param gamma gamma value for gamma correction. See "createTonemap"
 * @param saturation positive saturation enhancement value. 1.0 preserves
 * saturation, values greater than 1 increase saturation and values less than 1
 * decrease it.
 * @param bias value for bias function in [0, 1] range. Values from 0.7 to 0.9
 * usually give best results, default value is 0.85.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapdrago">org.opencv.photo.Photo.createTonemapDrago</a>
 */
    public static TonemapDrago createTonemapDrago(float gamma, float saturation, float bias)
    {

        TonemapDrago retVal = new TonemapDrago(createTonemapDrago_0(gamma, saturation, bias));

        return retVal;
    }

/**
 * <p>Creates TonemapDrago object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapdrago">org.opencv.photo.Photo.createTonemapDrago</a>
 */
    public static TonemapDrago createTonemapDrago()
    {

        TonemapDrago retVal = new TonemapDrago(createTonemapDrago_1());

        return retVal;
    }


    //
    // C++:  Ptr_TonemapDurand createTonemapDurand(float gamma = 1.0f, float contrast = 4.0f, float saturation = 1.0f, float sigma_space = 2.0f, float sigma_color = 2.0f)
    //

/**
 * <p>Creates TonemapDurand object</p>
 *
 * @param gamma gamma value for gamma correction. See "createTonemap"
 * @param contrast resulting contrast on logarithmic scale, i. e. log(max /
 * min), where max and min are maximum and minimum luminance values of the
 * resulting image.
 * @param saturation saturation enhancement value. See "createTonemapDrago"
 * @param sigma_space bilateral filter sigma in color space
 * @param sigma_color bilateral filter sigma in coordinate space
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapdurand">org.opencv.photo.Photo.createTonemapDurand</a>
 */
    public static TonemapDurand createTonemapDurand(float gamma, float contrast, float saturation, float sigma_space, float sigma_color)
    {

        TonemapDurand retVal = new TonemapDurand(createTonemapDurand_0(gamma, contrast, saturation, sigma_space, sigma_color));

        return retVal;
    }

/**
 * <p>Creates TonemapDurand object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapdurand">org.opencv.photo.Photo.createTonemapDurand</a>
 */
    public static TonemapDurand createTonemapDurand()
    {

        TonemapDurand retVal = new TonemapDurand(createTonemapDurand_1());

        return retVal;
    }


    //
    // C++:  Ptr_TonemapReinhard createTonemapReinhard(float gamma = 1.0f, float intensity = 0.0f, float light_adapt = 1.0f, float color_adapt = 0.0f)
    //

/**
 * <p>Creates TonemapReinhard object</p>
 *
 * @param gamma gamma value for gamma correction. See "createTonemap"
 * @param intensity result intensity in [-8, 8] range. Greater intensity
 * produces brighter results.
 * @param light_adapt light adaptation in [0, 1] range. If 1 adaptation is based
 * only on pixel value, if 0 it's global, otherwise it's a weighted mean of this
 * two cases.
 * @param color_adapt chromatic adaptation in [0, 1] range. If 1 channels are
 * treated independently, if 0 adaptation level is the same for each channel.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapreinhard">org.opencv.photo.Photo.createTonemapReinhard</a>
 */
    public static TonemapReinhard createTonemapReinhard(float gamma, float intensity, float light_adapt, float color_adapt)
    {

        TonemapReinhard retVal = new TonemapReinhard(createTonemapReinhard_0(gamma, intensity, light_adapt, color_adapt));

        return retVal;
    }

/**
 * <p>Creates TonemapReinhard object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapreinhard">org.opencv.photo.Photo.createTonemapReinhard</a>
 */
    public static TonemapReinhard createTonemapReinhard()
    {

        TonemapReinhard retVal = new TonemapReinhard(createTonemapReinhard_1());

        return retVal;
    }


    //
    // C++:  Ptr_TonemapMantiuk createTonemapMantiuk(float gamma = 1.0f, float scale = 0.7f, float saturation = 1.0f)
    //

/**
 * <p>Creates TonemapMantiuk object</p>
 *
 * @param gamma gamma value for gamma correction. See "createTonemap"
 * @param scale contrast scale factor. HVS response is multiplied by this
 * parameter, thus compressing dynamic range. Values from 0.6 to 0.9 produce
 * best results.
 * @param saturation saturation enhancement value. See "createTonemapDrago"
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapmantiuk">org.opencv.photo.Photo.createTonemapMantiuk</a>
 */
    public static TonemapMantiuk createTonemapMantiuk(float gamma, float scale, float saturation)
    {

        TonemapMantiuk retVal = new TonemapMantiuk(createTonemapMantiuk_0(gamma, scale, saturation));

        return retVal;
    }

/**
 * <p>Creates TonemapMantiuk object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createtonemapmantiuk">org.opencv.photo.Photo.createTonemapMantiuk</a>
 */
    public static TonemapMantiuk createTonemapMantiuk()
    {

        TonemapMantiuk retVal = new TonemapMantiuk(createTonemapMantiuk_1());

        return retVal;
    }


    //
    // C++:  Ptr_AlignMTB createAlignMTB(int max_bits = 6, int exclude_range = 4, bool cut = true)
    //

/**
 * <p>Creates AlignMTB object</p>
 *
 * @param max_bits logarithm to the base 2 of maximal shift in each dimension.
 * Values of 5 and 6 are usually good enough (31 and 63 pixels shift
 * respectively).
 * @param exclude_range range for exclusion bitmap that is constructed to
 * suppress noise around the median value.
 * @param cut if true cuts images, otherwise fills the new regions with zeros.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createalignmtb">org.opencv.photo.Photo.createAlignMTB</a>
 */
    public static AlignMTB createAlignMTB(int max_bits, int exclude_range, boolean cut)
    {

        AlignMTB retVal = new AlignMTB(createAlignMTB_0(max_bits, exclude_range, cut));

        return retVal;
    }

/**
 * <p>Creates AlignMTB object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createalignmtb">org.opencv.photo.Photo.createAlignMTB</a>
 */
    public static AlignMTB createAlignMTB()
    {

        AlignMTB retVal = new AlignMTB(createAlignMTB_1());

        return retVal;
    }


    //
    // C++:  Ptr_CalibrateDebevec createCalibrateDebevec(int samples = 70, float lambda = 10.0f, bool random = false)
    //

/**
 * <p>Creates CalibrateDebevec object</p>
 *
 * @param samples number of pixel locations to use
 * @param lambda smoothness term weight. Greater values produce smoother
 * results, but can alter the response.
 * @param random if true sample pixel locations are chosen at random, otherwise
 * the form a rectangular grid.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createcalibratedebevec">org.opencv.photo.Photo.createCalibrateDebevec</a>
 */
    public static CalibrateDebevec createCalibrateDebevec(int samples, float lambda, boolean random)
    {

        CalibrateDebevec retVal = new CalibrateDebevec(createCalibrateDebevec_0(samples, lambda, random));

        return retVal;
    }

/**
 * <p>Creates CalibrateDebevec object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createcalibratedebevec">org.opencv.photo.Photo.createCalibrateDebevec</a>
 */
    public static CalibrateDebevec createCalibrateDebevec()
    {

        CalibrateDebevec retVal = new CalibrateDebevec(createCalibrateDebevec_1());

        return retVal;
    }


    //
    // C++:  Ptr_CalibrateRobertson createCalibrateRobertson(int max_iter = 30, float threshold = 0.01f)
    //

/**
 * <p>Creates CalibrateRobertson object</p>
 *
 * @param max_iter maximal number of Gauss-Seidel solver iterations.
 * @param threshold target difference between results of two successive steps of
 * the minimization.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createcalibraterobertson">org.opencv.photo.Photo.createCalibrateRobertson</a>
 */
    public static CalibrateRobertson createCalibrateRobertson(int max_iter, float threshold)
    {

        CalibrateRobertson retVal = new CalibrateRobertson(createCalibrateRobertson_0(max_iter, threshold));

        return retVal;
    }

/**
 * <p>Creates CalibrateRobertson object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createcalibraterobertson">org.opencv.photo.Photo.createCalibrateRobertson</a>
 */
    public static CalibrateRobertson createCalibrateRobertson()
    {

        CalibrateRobertson retVal = new CalibrateRobertson(createCalibrateRobertson_1());

        return retVal;
    }


    //
    // C++:  Ptr_MergeDebevec createMergeDebevec()
    //

/**
 * <p>Creates MergeDebevec object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createmergedebevec">org.opencv.photo.Photo.createMergeDebevec</a>
 */
    public static MergeDebevec createMergeDebevec()
    {

        MergeDebevec retVal = new MergeDebevec(createMergeDebevec_0());

        return retVal;
    }


    //
    // C++:  Ptr_MergeMertens createMergeMertens(float contrast_weight = 1.0f, float saturation_weight = 1.0f, float exposure_weight = 0.0f)
    //

/**
 * <p>Creates MergeMertens object</p>
 *
 * @param contrast_weight contrast measure weight. See "MergeMertens".
 * @param saturation_weight saturation measure weight
 * @param exposure_weight well-exposedness measure weight
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createmergemertens">org.opencv.photo.Photo.createMergeMertens</a>
 */
    public static MergeMertens createMergeMertens(float contrast_weight, float saturation_weight, float exposure_weight)
    {

        MergeMertens retVal = new MergeMertens(createMergeMertens_0(contrast_weight, saturation_weight, exposure_weight));

        return retVal;
    }

/**
 * <p>Creates MergeMertens object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createmergemertens">org.opencv.photo.Photo.createMergeMertens</a>
 */
    public static MergeMertens createMergeMertens()
    {

        MergeMertens retVal = new MergeMertens(createMergeMertens_1());

        return retVal;
    }


    //
    // C++:  Ptr_MergeRobertson createMergeRobertson()
    //

/**
 * <p>Creates MergeRobertson object</p>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/hdr_imaging.html#createmergerobertson">org.opencv.photo.Photo.createMergeRobertson</a>
 */
    public static MergeRobertson createMergeRobertson()
    {

        MergeRobertson retVal = new MergeRobertson(createMergeRobertson_0());

        return retVal;
    }


    //
    // C++:  void decolor(Mat src, Mat& grayscale, Mat& color_boost)
    //

/**
 * <p>Transforms a color image to a grayscale image. It is a basic tool in digital
 * printing, stylized black-and-white photograph rendering, and in many single
 * channel image processing applications [CL12].</p>
 *
 * <p>This function is to be applied on color images.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param grayscale Output 8-bit 1-channel image.
 * @param color_boost Output 8-bit 3-channel image.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/decolor.html#decolor">org.opencv.photo.Photo.decolor</a>
 */
    public static void decolor(Mat src, Mat grayscale, Mat color_boost)
    {

        decolor_0(src.nativeObj, grayscale.nativeObj, color_boost.nativeObj);

        return;
    }


    //
    // C++:  void seamlessClone(Mat src, Mat dst, Mat mask, Point p, Mat& blend, int flags)
    //

/**
 * <p>Image editing tasks concern either global changes (color/intensity
 * corrections, filters, deformations) or local changes concerned to a
 * selection.
 * Here we are interested in achieving local changes, ones that are restricted
 * to a region manually selected (ROI), in a seamless and effortless manner.
 * The extent of the changes ranges from slight distortions to complete
 * replacement by novel content [PM03].</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param dst Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param p Point in dst image where object is placed.
 * @param blend a blend
 * @param flags Cloning method that could be one of the following:
 * <ul>
 *   <li> NORMAL_CLONE The power of the method is fully expressed when inserting
 * objects with complex outlines into a new background
 *   <li> MIXED_CLONE The classic method, color-based selection and alpha
 * masking might be time consuming and often leaves an undesirable halo.
 * Seamless cloning, even averaged with the original image, is not effective.
 * Mixed seamless cloning based on a loose selection proves effective.
 *   <li> FEATURE_EXCHANGE Feature exchange allows the user to easily replace
 * certain features of one object by alternative features.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#seamlessclone">org.opencv.photo.Photo.seamlessClone</a>
 */
    public static void seamlessClone(Mat src, Mat dst, Mat mask, Point p, Mat blend, int flags)
    {

        seamlessClone_0(src.nativeObj, dst.nativeObj, mask.nativeObj, p.x, p.y, blend.nativeObj, flags);

        return;
    }


    //
    // C++:  void colorChange(Mat src, Mat mask, Mat& dst, float red_mul = 1.0f, float green_mul = 1.0f, float blue_mul = 1.0f)
    //

/**
 * <p>Given an original color image, two differently colored versions of this image
 * can be mixed seamlessly.</p>
 *
 * <p>Multiplication factor is between.5 to 2.5.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param red_mul R-channel multiply factor.
 * @param green_mul G-channel multiply factor.
 * @param blue_mul B-channel multiply factor.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#colorchange">org.opencv.photo.Photo.colorChange</a>
 */
    public static void colorChange(Mat src, Mat mask, Mat dst, float red_mul, float green_mul, float blue_mul)
    {

        colorChange_0(src.nativeObj, mask.nativeObj, dst.nativeObj, red_mul, green_mul, blue_mul);

        return;
    }

/**
 * <p>Given an original color image, two differently colored versions of this image
 * can be mixed seamlessly.</p>
 *
 * <p>Multiplication factor is between.5 to 2.5.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#colorchange">org.opencv.photo.Photo.colorChange</a>
 */
    public static void colorChange(Mat src, Mat mask, Mat dst)
    {

        colorChange_1(src.nativeObj, mask.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void illuminationChange(Mat src, Mat mask, Mat& dst, float alpha = 0.2f, float beta = 0.4f)
    //

/**
 * <p>Applying an appropriate non-linear transformation to the gradient field
 * inside the selection and then integrating back with a Poisson solver,
 * modifies locally the apparent illumination of an image.</p>
 *
 * <p>This is useful to highlight under-exposed foreground objects or to reduce
 * specular reflections.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param alpha Value ranges between 0-2.
 * @param beta Value ranges between 0-2.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#illuminationchange">org.opencv.photo.Photo.illuminationChange</a>
 */
    public static void illuminationChange(Mat src, Mat mask, Mat dst, float alpha, float beta)
    {

        illuminationChange_0(src.nativeObj, mask.nativeObj, dst.nativeObj, alpha, beta);

        return;
    }

/**
 * <p>Applying an appropriate non-linear transformation to the gradient field
 * inside the selection and then integrating back with a Poisson solver,
 * modifies locally the apparent illumination of an image.</p>
 *
 * <p>This is useful to highlight under-exposed foreground objects or to reduce
 * specular reflections.</p>
 *
 * @param src Input 8-bit 3-channel image.
 * @param mask Input 8-bit 1 or 3-channel image.
 * @param dst Output image with the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/cloning.html#illuminationchange">org.opencv.photo.Photo.illuminationChange</a>
 */
    public static void illuminationChange(Mat src, Mat mask, Mat dst)
    {

        illuminationChange_1(src.nativeObj, mask.nativeObj, dst.nativeObj);

        return;
    }




    // C++:  void textureFlattening(Mat src, Mat mask, Mat& dst, float low_threshold = 30, float high_threshold = 45, int kernel_size = 3)
    private static native void textureFlattening_0(long src_nativeObj, long mask_nativeObj, long dst_nativeObj, float low_threshold, float high_threshold, int kernel_size);
    private static native void textureFlattening_1(long src_nativeObj, long mask_nativeObj, long dst_nativeObj);

    // C++:  void edgePreservingFilter(Mat src, Mat& dst, int flags = 1, float sigma_s = 60, float sigma_r = 0.4f)
    private static native void edgePreservingFilter_0(long src_nativeObj, long dst_nativeObj, int flags, float sigma_s, float sigma_r);
    private static native void edgePreservingFilter_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void detailEnhance(Mat src, Mat& dst, float sigma_s = 10, float sigma_r = 0.15f)
    private static native void detailEnhance_0(long src_nativeObj, long dst_nativeObj, float sigma_s, float sigma_r);
    private static native void detailEnhance_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void pencilSketch(Mat src, Mat& dst1, Mat& dst2, float sigma_s = 60, float sigma_r = 0.07f, float shade_factor = 0.02f)
    private static native void pencilSketch_0(long src_nativeObj, long dst1_nativeObj, long dst2_nativeObj, float sigma_s, float sigma_r, float shade_factor);
    private static native void pencilSketch_1(long src_nativeObj, long dst1_nativeObj, long dst2_nativeObj);

    // C++:  void stylization(Mat src, Mat& dst, float sigma_s = 60, float sigma_r = 0.45f)
    private static native void stylization_0(long src_nativeObj, long dst_nativeObj, float sigma_s, float sigma_r);
    private static native void stylization_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void inpaint(Mat src, Mat inpaintMask, Mat& dst, double inpaintRadius, int flags)
    private static native void inpaint_0(long src_nativeObj, long inpaintMask_nativeObj, long dst_nativeObj, double inpaintRadius, int flags);

    // C++:  void fastNlMeansDenoising(Mat src, Mat& dst, float h = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    private static native void fastNlMeansDenoising_0(long src_nativeObj, long dst_nativeObj, float h, int templateWindowSize, int searchWindowSize);
    private static native void fastNlMeansDenoising_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void fastNlMeansDenoisingColored(Mat src, Mat& dst, float h = 3, float hColor = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    private static native void fastNlMeansDenoisingColored_0(long src_nativeObj, long dst_nativeObj, float h, float hColor, int templateWindowSize, int searchWindowSize);
    private static native void fastNlMeansDenoisingColored_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void fastNlMeansDenoisingMulti(vector_Mat srcImgs, Mat& dst, int imgToDenoiseIndex, int temporalWindowSize, float h = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    private static native void fastNlMeansDenoisingMulti_0(long srcImgs_mat_nativeObj, long dst_nativeObj, int imgToDenoiseIndex, int temporalWindowSize, float h, int templateWindowSize, int searchWindowSize);
    private static native void fastNlMeansDenoisingMulti_1(long srcImgs_mat_nativeObj, long dst_nativeObj, int imgToDenoiseIndex, int temporalWindowSize);

    // C++:  void fastNlMeansDenoisingColoredMulti(vector_Mat srcImgs, Mat& dst, int imgToDenoiseIndex, int temporalWindowSize, float h = 3, float hColor = 3, int templateWindowSize = 7, int searchWindowSize = 21)
    private static native void fastNlMeansDenoisingColoredMulti_0(long srcImgs_mat_nativeObj, long dst_nativeObj, int imgToDenoiseIndex, int temporalWindowSize, float h, float hColor, int templateWindowSize, int searchWindowSize);
    private static native void fastNlMeansDenoisingColoredMulti_1(long srcImgs_mat_nativeObj, long dst_nativeObj, int imgToDenoiseIndex, int temporalWindowSize);

    // C++:  void denoise_TVL1(vector_Mat observations, Mat result, double lambda = 1.0, int niters = 30)
    private static native void denoise_TVL1_0(long observations_mat_nativeObj, long result_nativeObj, double lambda, int niters);
    private static native void denoise_TVL1_1(long observations_mat_nativeObj, long result_nativeObj);

    // C++:  Ptr_Tonemap createTonemap(float gamma = 1.0f)
    private static native long createTonemap_0(float gamma);
    private static native long createTonemap_1();

    // C++:  Ptr_TonemapDrago createTonemapDrago(float gamma = 1.0f, float saturation = 1.0f, float bias = 0.85f)
    private static native long createTonemapDrago_0(float gamma, float saturation, float bias);
    private static native long createTonemapDrago_1();

    // C++:  Ptr_TonemapDurand createTonemapDurand(float gamma = 1.0f, float contrast = 4.0f, float saturation = 1.0f, float sigma_space = 2.0f, float sigma_color = 2.0f)
    private static native long createTonemapDurand_0(float gamma, float contrast, float saturation, float sigma_space, float sigma_color);
    private static native long createTonemapDurand_1();

    // C++:  Ptr_TonemapReinhard createTonemapReinhard(float gamma = 1.0f, float intensity = 0.0f, float light_adapt = 1.0f, float color_adapt = 0.0f)
    private static native long createTonemapReinhard_0(float gamma, float intensity, float light_adapt, float color_adapt);
    private static native long createTonemapReinhard_1();

    // C++:  Ptr_TonemapMantiuk createTonemapMantiuk(float gamma = 1.0f, float scale = 0.7f, float saturation = 1.0f)
    private static native long createTonemapMantiuk_0(float gamma, float scale, float saturation);
    private static native long createTonemapMantiuk_1();

    // C++:  Ptr_AlignMTB createAlignMTB(int max_bits = 6, int exclude_range = 4, bool cut = true)
    private static native long createAlignMTB_0(int max_bits, int exclude_range, boolean cut);
    private static native long createAlignMTB_1();

    // C++:  Ptr_CalibrateDebevec createCalibrateDebevec(int samples = 70, float lambda = 10.0f, bool random = false)
    private static native long createCalibrateDebevec_0(int samples, float lambda, boolean random);
    private static native long createCalibrateDebevec_1();

    // C++:  Ptr_CalibrateRobertson createCalibrateRobertson(int max_iter = 30, float threshold = 0.01f)
    private static native long createCalibrateRobertson_0(int max_iter, float threshold);
    private static native long createCalibrateRobertson_1();

    // C++:  Ptr_MergeDebevec createMergeDebevec()
    private static native long createMergeDebevec_0();

    // C++:  Ptr_MergeMertens createMergeMertens(float contrast_weight = 1.0f, float saturation_weight = 1.0f, float exposure_weight = 0.0f)
    private static native long createMergeMertens_0(float contrast_weight, float saturation_weight, float exposure_weight);
    private static native long createMergeMertens_1();

    // C++:  Ptr_MergeRobertson createMergeRobertson()
    private static native long createMergeRobertson_0();

    // C++:  void decolor(Mat src, Mat& grayscale, Mat& color_boost)
    private static native void decolor_0(long src_nativeObj, long grayscale_nativeObj, long color_boost_nativeObj);

    // C++:  void seamlessClone(Mat src, Mat dst, Mat mask, Point p, Mat& blend, int flags)
    private static native void seamlessClone_0(long src_nativeObj, long dst_nativeObj, long mask_nativeObj, double p_x, double p_y, long blend_nativeObj, int flags);

    // C++:  void colorChange(Mat src, Mat mask, Mat& dst, float red_mul = 1.0f, float green_mul = 1.0f, float blue_mul = 1.0f)
    private static native void colorChange_0(long src_nativeObj, long mask_nativeObj, long dst_nativeObj, float red_mul, float green_mul, float blue_mul);
    private static native void colorChange_1(long src_nativeObj, long mask_nativeObj, long dst_nativeObj);

    // C++:  void illuminationChange(Mat src, Mat mask, Mat& dst, float alpha = 0.2f, float beta = 0.4f)
    private static native void illuminationChange_0(long src_nativeObj, long mask_nativeObj, long dst_nativeObj, float alpha, float beta);
    private static native void illuminationChange_1(long src_nativeObj, long mask_nativeObj, long dst_nativeObj);

}
