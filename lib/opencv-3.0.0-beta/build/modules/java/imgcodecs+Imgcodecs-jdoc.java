
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.imgcodecs;

import java.lang.String;
import java.util.ArrayList;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfInt;

public class Imgcodecs {

    public static final int
            CV_LOAD_IMAGE_UNCHANGED = -1,
            CV_LOAD_IMAGE_GRAYSCALE = 0,
            CV_LOAD_IMAGE_COLOR = 1,
            CV_LOAD_IMAGE_ANYDEPTH = 2,
            CV_LOAD_IMAGE_ANYCOLOR = 4,
            CV_IMWRITE_JPEG_QUALITY = 1,
            CV_IMWRITE_JPEG_PROGRESSIVE = 2,
            CV_IMWRITE_JPEG_OPTIMIZE = 3,
            CV_IMWRITE_JPEG_RST_INTERVAL = 4,
            CV_IMWRITE_JPEG_LUMA_QUALITY = 5,
            CV_IMWRITE_JPEG_CHROMA_QUALITY = 6,
            CV_IMWRITE_PNG_COMPRESSION = 16,
            CV_IMWRITE_PNG_STRATEGY = 17,
            CV_IMWRITE_PNG_BILEVEL = 18,
            CV_IMWRITE_PNG_STRATEGY_DEFAULT = 0,
            CV_IMWRITE_PNG_STRATEGY_FILTERED = 1,
            CV_IMWRITE_PNG_STRATEGY_HUFFMAN_ONLY = 2,
            CV_IMWRITE_PNG_STRATEGY_RLE = 3,
            CV_IMWRITE_PNG_STRATEGY_FIXED = 4,
            CV_IMWRITE_PXM_BINARY = 32,
            CV_IMWRITE_WEBP_QUALITY = 64,
            CV_CVTIMG_FLIP = 1,
            CV_CVTIMG_SWAP_RB = 2,
            IMREAD_UNCHANGED = -1,
            IMREAD_GRAYSCALE = 0,
            IMREAD_COLOR = 1,
            IMREAD_ANYDEPTH = 2,
            IMREAD_ANYCOLOR = 4,
            IMREAD_LOAD_GDAL = 8,
            IMWRITE_JPEG_QUALITY = 1,
            IMWRITE_JPEG_PROGRESSIVE = 2,
            IMWRITE_JPEG_OPTIMIZE = 3,
            IMWRITE_JPEG_RST_INTERVAL = 4,
            IMWRITE_JPEG_LUMA_QUALITY = 5,
            IMWRITE_JPEG_CHROMA_QUALITY = 6,
            IMWRITE_PNG_COMPRESSION = 16,
            IMWRITE_PNG_STRATEGY = 17,
            IMWRITE_PNG_BILEVEL = 18,
            IMWRITE_PXM_BINARY = 32,
            IMWRITE_WEBP_QUALITY = 64,
            IMWRITE_PNG_STRATEGY_DEFAULT = 0,
            IMWRITE_PNG_STRATEGY_FILTERED = 1,
            IMWRITE_PNG_STRATEGY_HUFFMAN_ONLY = 2,
            IMWRITE_PNG_STRATEGY_RLE = 3,
            IMWRITE_PNG_STRATEGY_FIXED = 4;


    //
    // C++:  Mat imread(String filename, int flags = IMREAD_COLOR)
    //

/**
 * <p>Loads an image from a file.</p>
 *
 * <p>The function <code>imread</code> loads an image from the specified file and
 * returns it. If the image cannot be read (because of missing file, improper
 * permissions, unsupported or invalid format), the function returns an empty
 * matrix (<code>Mat.data==NULL</code>). Currently, the following file formats
 * are supported:</p>
 * <ul>
 *   <li> Windows bitmaps - <code>*.bmp, *.dib</code> (always supported)
 *   <li> JPEG files - <code>*.jpeg, *.jpg, *.jpe</code> (see the *Notes*
 * section)
 *   <li> JPEG 2000 files - <code>*.jp2</code> (see the *Notes* section)
 *   <li> Portable Network Graphics - <code>*.png</code> (see the *Notes*
 * section)
 *   <li> WebP - <code>*.webp</code> (see the *Notes* section)
 *   <li> Portable image format - <code>*.pbm, *.pgm, *.ppm</code> (always
 * supported)
 *   <li> Sun rasters - <code>*.sr, *.ras</code> (always supported)
 *   <li> TIFF files - <code>*.tiff, *.tif</code> (see the *Notes* section)
 * </ul>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> The function determines the type of an image by the content, not by
 * the file extension.
 *   <li> On Microsoft Windows* OS and MacOSX*, the codecs shipped with an
 * OpenCV image (libjpeg, libpng, libtiff, and libjasper) are used by default.
 * So, OpenCV can always read JPEGs, PNGs, and TIFFs. On MacOSX, there is also
 * an option to use native MacOSX image readers. But beware that currently these
 * native image loaders give images with different pixel values because of the
 * color management embedded into MacOSX.
 *   <li> On Linux*, BSD flavors and other Unix-like open-source operating
 * systems, OpenCV looks for codecs supplied with an OS image. Install the
 * relevant packages (do not forget the development files, for example,
 * "libjpeg-dev", in Debian* and Ubuntu*) to get the codec support or turn on
 * the <code>OPENCV_BUILD_3RDPARTY_LIBS</code> flag in CMake.
 * </ul>
 *
 * <p>Note: In the case of color images, the decoded images will have the channels
 * stored in <code>B G R</code> order.</p>
 *
 * @param filename Name of file to be loaded.
 * @param flags Flags specifying the color type of a loaded image:
 * <ul>
 *   <li> CV_LOAD_IMAGE_ANYDEPTH - If set, return 16-bit/32-bit image when the
 * input has the corresponding depth, otherwise convert it to 8-bit.
 *   <li> CV_LOAD_IMAGE_COLOR - If set, always convert image to the color one
 *   <li> CV_LOAD_IMAGE_GRAYSCALE - If set, always convert image to the
 * grayscale one
 *   <li> >0 Return a 3-channel color image.
 * </ul>
 * <p>Note: In the current implementation the alpha channel, if any, is stripped
 * from the output image. Use negative value if you need the alpha channel.</p>
 * <ul>
 *   <li> =0 Return a grayscale image.
 *   <li> <0 Return the loaded image as is (with alpha channel).
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imread">org.opencv.imgcodecs.Imgcodecs.imread</a>
 */
    public static Mat imread(String filename, int flags)
    {

        Mat retVal = new Mat(imread_0(filename, flags));

        return retVal;
    }

/**
 * <p>Loads an image from a file.</p>
 *
 * <p>The function <code>imread</code> loads an image from the specified file and
 * returns it. If the image cannot be read (because of missing file, improper
 * permissions, unsupported or invalid format), the function returns an empty
 * matrix (<code>Mat.data==NULL</code>). Currently, the following file formats
 * are supported:</p>
 * <ul>
 *   <li> Windows bitmaps - <code>*.bmp, *.dib</code> (always supported)
 *   <li> JPEG files - <code>*.jpeg, *.jpg, *.jpe</code> (see the *Notes*
 * section)
 *   <li> JPEG 2000 files - <code>*.jp2</code> (see the *Notes* section)
 *   <li> Portable Network Graphics - <code>*.png</code> (see the *Notes*
 * section)
 *   <li> WebP - <code>*.webp</code> (see the *Notes* section)
 *   <li> Portable image format - <code>*.pbm, *.pgm, *.ppm</code> (always
 * supported)
 *   <li> Sun rasters - <code>*.sr, *.ras</code> (always supported)
 *   <li> TIFF files - <code>*.tiff, *.tif</code> (see the *Notes* section)
 * </ul>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> The function determines the type of an image by the content, not by
 * the file extension.
 *   <li> On Microsoft Windows* OS and MacOSX*, the codecs shipped with an
 * OpenCV image (libjpeg, libpng, libtiff, and libjasper) are used by default.
 * So, OpenCV can always read JPEGs, PNGs, and TIFFs. On MacOSX, there is also
 * an option to use native MacOSX image readers. But beware that currently these
 * native image loaders give images with different pixel values because of the
 * color management embedded into MacOSX.
 *   <li> On Linux*, BSD flavors and other Unix-like open-source operating
 * systems, OpenCV looks for codecs supplied with an OS image. Install the
 * relevant packages (do not forget the development files, for example,
 * "libjpeg-dev", in Debian* and Ubuntu*) to get the codec support or turn on
 * the <code>OPENCV_BUILD_3RDPARTY_LIBS</code> flag in CMake.
 * </ul>
 *
 * <p>Note: In the case of color images, the decoded images will have the channels
 * stored in <code>B G R</code> order.</p>
 *
 * @param filename Name of file to be loaded.
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imread">org.opencv.imgcodecs.Imgcodecs.imread</a>
 */
    public static Mat imread(String filename)
    {

        Mat retVal = new Mat(imread_1(filename));

        return retVal;
    }


    //
    // C++:  bool imwrite(String filename, Mat img, vector_int params = std::vector<int>())
    //

/**
 * <p>Saves an image to a specified file.</p>
 *
 * <p>The function <code>imwrite</code> saves the image to the specified file. The
 * image format is chosen based on the <code>filename</code> extension (see
 * "imread" for the list of extensions). Only 8-bit (or 16-bit unsigned
 * (<code>CV_16U</code>) in case of PNG, JPEG 2000, and TIFF) single-channel or
 * 3-channel (with 'BGR' channel order) images can be saved using this function.
 * If the format, depth or channel order is different, use "Mat.convertTo", and
 * "cvtColor" to convert it before saving. Or, use the universal "FileStorage"
 * I/O functions to save the image to XML or YAML format.
 * It is possible to store PNG images with an alpha channel using this function.
 * To do this, create 8-bit (or 16-bit) 4-channel image BGRA, where the alpha
 * channel goes last. Fully transparent pixels should have alpha set to 0, fully
 * opaque pixels should have alpha set to 255/65535. The sample below shows how
 * to create such a BGRA image and store to PNG file. It also demonstrates how
 * to set custom compression parameters <code></p>
 *
 * <p>// C++ code:</p>
 *
 * <p>#include <vector></p>
 *
 * <p>#include <stdio.h></p>
 *
 * <p>#include <opencv2/opencv.hpp></p>
 *
 * <p>using namespace cv;</p>
 *
 * <p>using namespace std;</p>
 *
 * <p>void createAlphaMat(Mat &mat)</p>
 *
 *
 * <p>for (int i = 0; i < mat.rows; ++i) {</p>
 *
 * <p>for (int j = 0; j < mat.cols; ++j) {</p>
 *
 * <p>Vec4b& rgba = mat.at<Vec4b>(i, j);</p>
 *
 * <p>rgba[0] = UCHAR_MAX;</p>
 *
 * <p>rgba[1] = saturate_cast<uchar>((float (mat.cols - j)) / ((float)mat.cols) *
 * UCHAR_MAX);</p>
 *
 * <p>rgba[2] = saturate_cast<uchar>((float (mat.rows - i)) / ((float)mat.rows) *
 * UCHAR_MAX);</p>
 *
 * <p>rgba[3] = saturate_cast<uchar>(0.5 * (rgba[1] + rgba[2]));</p>
 *
 *
 *
 *
 * <p>int main(int argv, char argc)</p>
 *
 *
 * <p>// Create mat with alpha channel</p>
 *
 * <p>Mat mat(480, 640, CV_8UC4);</p>
 *
 * <p>createAlphaMat(mat);</p>
 *
 * <p>vector<int> compression_params;</p>
 *
 * <p>compression_params.push_back(CV_IMWRITE_PNG_COMPRESSION);</p>
 *
 * <p>compression_params.push_back(9);</p>
 *
 * <p>try {</p>
 *
 * <p>imwrite("alpha.png", mat, compression_params);</p>
 *
 *
 * <p>catch (runtime_error& ex) {</p>
 *
 * <p>fprintf(stderr, "Exception converting image to PNG format: %sn", ex.what());</p>
 *
 * <p>return 1;</p>
 *
 *
 * <p>fprintf(stdout, "Saved PNG file with alpha data.n");</p>
 *
 * <p>return 0;</p>
 *
 *
 * @param filename Name of the file.
 * @param img a img
 * @param params Format-specific save parameters encoded as pairs
 * <code>paramId_1, paramValue_1, paramId_2, paramValue_2,...</code>. The
 * following parameters are currently supported:
 * <ul>
 *   <li> For JPEG, it can be a quality (<code>CV_IMWRITE_JPEG_QUALITY</code>)
 * from 0 to 100 (the higher is the better). Default value is 95.
 *   <li> For WEBP, it can be a quality (CV_IMWRITE_WEBP_QUALITY) from 1 to 100
 * (the higher is the better).
 * </ul>
 * <p>By default (without any parameter) and for quality above 100 the lossless
 * compression is used.</p>
 * <ul>
 *   <li> For PNG, it can be the compression level (<code>CV_IMWRITE_PNG_COMPRESSION</code>)
 * from 0 to 9. A higher value means a smaller size and longer compression time.
 * Default value is 3.
 *   <li> For PPM, PGM, or PBM, it can be a binary format flag (<code>CV_IMWRITE_PXM_BINARY</code>),
 * 0 or 1. Default value is 1.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imwrite">org.opencv.imgcodecs.Imgcodecs.imwrite</a>
 */
    public static boolean imwrite(String filename, Mat img, MatOfInt params)
    {
        Mat params_mat = params;
        boolean retVal = imwrite_0(filename, img.nativeObj, params_mat.nativeObj);

        return retVal;
    }

/**
 * <p>Saves an image to a specified file.</p>
 *
 * <p>The function <code>imwrite</code> saves the image to the specified file. The
 * image format is chosen based on the <code>filename</code> extension (see
 * "imread" for the list of extensions). Only 8-bit (or 16-bit unsigned
 * (<code>CV_16U</code>) in case of PNG, JPEG 2000, and TIFF) single-channel or
 * 3-channel (with 'BGR' channel order) images can be saved using this function.
 * If the format, depth or channel order is different, use "Mat.convertTo", and
 * "cvtColor" to convert it before saving. Or, use the universal "FileStorage"
 * I/O functions to save the image to XML or YAML format.
 * It is possible to store PNG images with an alpha channel using this function.
 * To do this, create 8-bit (or 16-bit) 4-channel image BGRA, where the alpha
 * channel goes last. Fully transparent pixels should have alpha set to 0, fully
 * opaque pixels should have alpha set to 255/65535. The sample below shows how
 * to create such a BGRA image and store to PNG file. It also demonstrates how
 * to set custom compression parameters <code></p>
 *
 * <p>// C++ code:</p>
 *
 * <p>#include <vector></p>
 *
 * <p>#include <stdio.h></p>
 *
 * <p>#include <opencv2/opencv.hpp></p>
 *
 * <p>using namespace cv;</p>
 *
 * <p>using namespace std;</p>
 *
 * <p>void createAlphaMat(Mat &mat)</p>
 *
 *
 * <p>for (int i = 0; i < mat.rows; ++i) {</p>
 *
 * <p>for (int j = 0; j < mat.cols; ++j) {</p>
 *
 * <p>Vec4b& rgba = mat.at<Vec4b>(i, j);</p>
 *
 * <p>rgba[0] = UCHAR_MAX;</p>
 *
 * <p>rgba[1] = saturate_cast<uchar>((float (mat.cols - j)) / ((float)mat.cols) *
 * UCHAR_MAX);</p>
 *
 * <p>rgba[2] = saturate_cast<uchar>((float (mat.rows - i)) / ((float)mat.rows) *
 * UCHAR_MAX);</p>
 *
 * <p>rgba[3] = saturate_cast<uchar>(0.5 * (rgba[1] + rgba[2]));</p>
 *
 *
 *
 *
 * <p>int main(int argv, char argc)</p>
 *
 *
 * <p>// Create mat with alpha channel</p>
 *
 * <p>Mat mat(480, 640, CV_8UC4);</p>
 *
 * <p>createAlphaMat(mat);</p>
 *
 * <p>vector<int> compression_params;</p>
 *
 * <p>compression_params.push_back(CV_IMWRITE_PNG_COMPRESSION);</p>
 *
 * <p>compression_params.push_back(9);</p>
 *
 * <p>try {</p>
 *
 * <p>imwrite("alpha.png", mat, compression_params);</p>
 *
 *
 * <p>catch (runtime_error& ex) {</p>
 *
 * <p>fprintf(stderr, "Exception converting image to PNG format: %sn", ex.what());</p>
 *
 * <p>return 1;</p>
 *
 *
 * <p>fprintf(stdout, "Saved PNG file with alpha data.n");</p>
 *
 * <p>return 0;</p>
 *
 *
 * @param filename Name of the file.
 * @param img a img
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imwrite">org.opencv.imgcodecs.Imgcodecs.imwrite</a>
 */
    public static boolean imwrite(String filename, Mat img)
    {

        boolean retVal = imwrite_1(filename, img.nativeObj);

        return retVal;
    }


    //
    // C++:  Mat imdecode(Mat buf, int flags)
    //

/**
 * <p>Reads an image from a buffer in memory.</p>
 *
 * <p>The function reads an image from the specified buffer in the memory.
 * If the buffer is too short or contains invalid data, the empty matrix/image
 * is returned.</p>
 *
 * <p>See "imread" for the list of supported formats and flags description.</p>
 *
 * <p>Note: In the case of color images, the decoded images will have the channels
 * stored in <code>B G R</code> order.</p>
 *
 * @param buf Input array or vector of bytes.
 * @param flags The same flags as in "imread".
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imdecode">org.opencv.imgcodecs.Imgcodecs.imdecode</a>
 */
    public static Mat imdecode(Mat buf, int flags)
    {

        Mat retVal = new Mat(imdecode_0(buf.nativeObj, flags));

        return retVal;
    }


    //
    // C++:  bool imencode(String ext, Mat img, vector_uchar& buf, vector_int params = std::vector<int>())
    //

/**
 * <p>Encodes an image into a memory buffer.</p>
 *
 * <p>The function compresses the image and stores it in the memory buffer that is
 * resized to fit the result.
 * See "imwrite" for the list of supported formats and flags description.</p>
 *
 * <p>Note: <code>cvEncodeImage</code> returns single-row matrix of type
 * <code>CV_8UC1</code> that contains encoded image as array of bytes.</p>
 *
 * @param ext File extension that defines the output format.
 * @param img Image to be written.
 * @param buf Output buffer resized to fit the compressed image.
 * @param params Format-specific parameters. See "imwrite".
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imencode">org.opencv.imgcodecs.Imgcodecs.imencode</a>
 */
    public static boolean imencode(String ext, Mat img, MatOfByte buf, MatOfInt params)
    {
        Mat buf_mat = buf;
        Mat params_mat = params;
        boolean retVal = imencode_0(ext, img.nativeObj, buf_mat.nativeObj, params_mat.nativeObj);

        return retVal;
    }

/**
 * <p>Encodes an image into a memory buffer.</p>
 *
 * <p>The function compresses the image and stores it in the memory buffer that is
 * resized to fit the result.
 * See "imwrite" for the list of supported formats and flags description.</p>
 *
 * <p>Note: <code>cvEncodeImage</code> returns single-row matrix of type
 * <code>CV_8UC1</code> that contains encoded image as array of bytes.</p>
 *
 * @param ext File extension that defines the output format.
 * @param img Image to be written.
 * @param buf Output buffer resized to fit the compressed image.
 *
 * @see <a href="http://docs.opencv.org/modules/imgcodecs/doc/reading_and_writing_images.html#imencode">org.opencv.imgcodecs.Imgcodecs.imencode</a>
 */
    public static boolean imencode(String ext, Mat img, MatOfByte buf)
    {
        Mat buf_mat = buf;
        boolean retVal = imencode_1(ext, img.nativeObj, buf_mat.nativeObj);

        return retVal;
    }




    // C++:  Mat imread(String filename, int flags = IMREAD_COLOR)
    private static native long imread_0(String filename, int flags);
    private static native long imread_1(String filename);

    // C++:  bool imwrite(String filename, Mat img, vector_int params = std::vector<int>())
    private static native boolean imwrite_0(String filename, long img_nativeObj, long params_mat_nativeObj);
    private static native boolean imwrite_1(String filename, long img_nativeObj);

    // C++:  Mat imdecode(Mat buf, int flags)
    private static native long imdecode_0(long buf_nativeObj, int flags);

    // C++:  bool imencode(String ext, Mat img, vector_uchar& buf, vector_int params = std::vector<int>())
    private static native boolean imencode_0(String ext, long img_nativeObj, long buf_mat_nativeObj, long params_mat_nativeObj);
    private static native boolean imencode_1(String ext, long img_nativeObj, long buf_mat_nativeObj);

}
