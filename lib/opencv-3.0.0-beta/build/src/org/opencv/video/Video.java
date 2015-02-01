
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.utils.Converters;

public class Video {

    private static final int
            CV_LKFLOW_INITIAL_GUESSES = 4,
            CV_LKFLOW_GET_MIN_EIGENVALS = 8;


    public static final int
            OPTFLOW_USE_INITIAL_FLOW = 4,
            OPTFLOW_LK_GET_MIN_EIGENVALS = 8,
            OPTFLOW_FARNEBACK_GAUSSIAN = 256,
            MOTION_TRANSLATION = 0,
            MOTION_EUCLIDEAN = 1,
            MOTION_AFFINE = 2,
            MOTION_HOMOGRAPHY = 3;


    //
    // C++:  void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, vector_Point2f prevPts, vector_Point2f& nextPts, vector_uchar& status, vector_float& err, Size winSize = Size(21,21), int maxLevel = 3, TermCriteria criteria = TermCriteria(TermCriteria::COUNT+TermCriteria::EPS, 30, 0.01), int flags = 0, double minEigThreshold = 1e-4)
    //

/**
 * <p>Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.</p>
 *
 * <p>The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00]. The function is parallelized with
 * the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> An example using the Lucas-Kanade optical flow algorithm can be found
 * at opencv_source_code/samples/cpp/lkdemo.cpp
 *   <li> (Python) An example using the Lucas-Kanade optical flow algorithm can
 * be found at opencv_source_code/samples/python2/lk_track.py
 *   <li> (Python) An example using the Lucas-Kanade tracker for homography
 * matching can be found at opencv_source_code/samples/python2/lk_homography.py
 * </ul>
 *
 * @param prevImg first 8-bit input image or pyramid constructed by
 * "buildOpticalFlowPyramid".
 * @param nextImg second input image or pyramid of the same size and the same
 * type as <code>prevImg</code>.
 * @param prevPts vector of 2D points for which the flow needs to be found;
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image; when <code>OPTFLOW_USE_INITIAL_FLOW</code> flag
 * is passed, the vector must have the same size as in the input.
 * @param status output status vector (of unsigned chars); each element of the
 * vector is set to 1 if the flow for the corresponding features has been found,
 * otherwise, it is set to 0.
 * @param err output vector of errors; each element of the vector is set to an
 * error for the corresponding feature, type of the error measure can be set in
 * <code>flags</code> parameter; if the flow wasn't found then the error is not
 * defined (use the <code>status</code> parameter to find such cases).
 * @param winSize size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number; if set to 0, pyramids
 * are not used (single level), if set to 1, two levels are used, and so on; if
 * pyramids are passed to input then algorithm will use as many levels as
 * pyramids have but no more than <code>maxLevel</code>.
 * @param criteria parameter, specifying the termination criteria of the
 * iterative search algorithm (after the specified maximum number of iterations
 * <code>criteria.maxCount</code> or when the search window moves by less than
 * <code>criteria.epsilon</code>.
 * @param flags operation flags:
 * <ul>
 *   <li> OPTFLOW_USE_INITIAL_FLOW uses initial estimations, stored in
 * <code>nextPts</code>; if the flag is not set, then <code>prevPts</code> is
 * copied to <code>nextPts</code> and is considered the initial estimate.
 *   <li> OPTFLOW_LK_GET_MIN_EIGENVALS use minimum eigen values as an error
 * measure (see <code>minEigThreshold</code> description); if the flag is not
 * set, then L1 distance between patches around the original and a moved point,
 * divided by number of pixels in a window, is used as a error measure.
 * </ul>
 * @param minEigThreshold the algorithm calculates the minimum eigen value of a
 * 2x2 normal matrix of optical flow equations (this matrix is called a spatial
 * gradient matrix in [Bouguet00]), divided by number of pixels in a window; if
 * this value is less than <code>minEigThreshold</code>, then a corresponding
 * feature is filtered out and its flow is not processed, so it allows to remove
 * bad points and get a performance boost.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize, int maxLevel, TermCriteria criteria, int flags, double minEigThreshold)
    {
        Mat prevPts_mat = prevPts;
        Mat nextPts_mat = nextPts;
        Mat status_mat = status;
        Mat err_mat = err;
        calcOpticalFlowPyrLK_0(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel, criteria.type, criteria.maxCount, criteria.epsilon, flags, minEigThreshold);

        return;
    }

/**
 * <p>Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.</p>
 *
 * <p>The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00]. The function is parallelized with
 * the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> An example using the Lucas-Kanade optical flow algorithm can be found
 * at opencv_source_code/samples/cpp/lkdemo.cpp
 *   <li> (Python) An example using the Lucas-Kanade optical flow algorithm can
 * be found at opencv_source_code/samples/python2/lk_track.py
 *   <li> (Python) An example using the Lucas-Kanade tracker for homography
 * matching can be found at opencv_source_code/samples/python2/lk_homography.py
 * </ul>
 *
 * @param prevImg first 8-bit input image or pyramid constructed by
 * "buildOpticalFlowPyramid".
 * @param nextImg second input image or pyramid of the same size and the same
 * type as <code>prevImg</code>.
 * @param prevPts vector of 2D points for which the flow needs to be found;
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image; when <code>OPTFLOW_USE_INITIAL_FLOW</code> flag
 * is passed, the vector must have the same size as in the input.
 * @param status output status vector (of unsigned chars); each element of the
 * vector is set to 1 if the flow for the corresponding features has been found,
 * otherwise, it is set to 0.
 * @param err output vector of errors; each element of the vector is set to an
 * error for the corresponding feature, type of the error measure can be set in
 * <code>flags</code> parameter; if the flow wasn't found then the error is not
 * defined (use the <code>status</code> parameter to find such cases).
 * @param winSize size of the search window at each pyramid level.
 * @param maxLevel 0-based maximal pyramid level number; if set to 0, pyramids
 * are not used (single level), if set to 1, two levels are used, and so on; if
 * pyramids are passed to input then algorithm will use as many levels as
 * pyramids have but no more than <code>maxLevel</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err, Size winSize, int maxLevel)
    {
        Mat prevPts_mat = prevPts;
        Mat nextPts_mat = nextPts;
        Mat status_mat = status;
        Mat err_mat = err;
        calcOpticalFlowPyrLK_1(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj, winSize.width, winSize.height, maxLevel);

        return;
    }

/**
 * <p>Calculates an optical flow for a sparse feature set using the iterative
 * Lucas-Kanade method with pyramids.</p>
 *
 * <p>The function implements a sparse iterative version of the Lucas-Kanade
 * optical flow in pyramids. See [Bouguet00]. The function is parallelized with
 * the TBB library.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> An example using the Lucas-Kanade optical flow algorithm can be found
 * at opencv_source_code/samples/cpp/lkdemo.cpp
 *   <li> (Python) An example using the Lucas-Kanade optical flow algorithm can
 * be found at opencv_source_code/samples/python2/lk_track.py
 *   <li> (Python) An example using the Lucas-Kanade tracker for homography
 * matching can be found at opencv_source_code/samples/python2/lk_homography.py
 * </ul>
 *
 * @param prevImg first 8-bit input image or pyramid constructed by
 * "buildOpticalFlowPyramid".
 * @param nextImg second input image or pyramid of the same size and the same
 * type as <code>prevImg</code>.
 * @param prevPts vector of 2D points for which the flow needs to be found;
 * point coordinates must be single-precision floating-point numbers.
 * @param nextPts output vector of 2D points (with single-precision
 * floating-point coordinates) containing the calculated new positions of input
 * features in the second image; when <code>OPTFLOW_USE_INITIAL_FLOW</code> flag
 * is passed, the vector must have the same size as in the input.
 * @param status output status vector (of unsigned chars); each element of the
 * vector is set to 1 if the flow for the corresponding features has been found,
 * otherwise, it is set to 0.
 * @param err output vector of errors; each element of the vector is set to an
 * error for the corresponding feature, type of the error measure can be set in
 * <code>flags</code> parameter; if the flow wasn't found then the error is not
 * defined (use the <code>status</code> parameter to find such cases).
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowpyrlk">org.opencv.video.Video.calcOpticalFlowPyrLK</a>
 */
    public static void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, MatOfPoint2f prevPts, MatOfPoint2f nextPts, MatOfByte status, MatOfFloat err)
    {
        Mat prevPts_mat = prevPts;
        Mat nextPts_mat = nextPts;
        Mat status_mat = status;
        Mat err_mat = err;
        calcOpticalFlowPyrLK_2(prevImg.nativeObj, nextImg.nativeObj, prevPts_mat.nativeObj, nextPts_mat.nativeObj, status_mat.nativeObj, err_mat.nativeObj);

        return;
    }


    //
    // C++:  int buildOpticalFlowPyramid(Mat img, vector_Mat& pyramid, Size winSize, int maxLevel, bool withDerivatives = true, int pyrBorder = BORDER_REFLECT_101, int derivBorder = BORDER_CONSTANT, bool tryReuseInputImage = true)
    //

/**
 * <p>Constructs the image pyramid which can be passed to "calcOpticalFlowPyrLK".</p>
 *
 * @param img 8-bit input image.
 * @param pyramid output pyramid.
 * @param winSize window size of optical flow algorithm. Must be not less than
 * <code>winSize</code> argument of "calcOpticalFlowPyrLK". It is needed to
 * calculate required padding for pyramid levels.
 * @param maxLevel 0-based maximal pyramid level number.
 * @param withDerivatives set to precompute gradients for the every pyramid
 * level. If pyramid is constructed without the gradients then "calcOpticalFlowPyrLK"
 * will calculate them internally.
 * @param pyrBorder the border mode for pyramid layers.
 * @param derivBorder the border mode for gradients.
 * @param tryReuseInputImage put ROI of input image into the pyramid if
 * possible. You can pass <code>false</code> to force data copying.
 *
 * <p>:return: number of levels in constructed pyramid. Can be less than
 * <code>maxLevel</code>.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#buildopticalflowpyramid">org.opencv.video.Video.buildOpticalFlowPyramid</a>
 */
    public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel, boolean withDerivatives, int pyrBorder, int derivBorder, boolean tryReuseInputImage)
    {
        Mat pyramid_mat = new Mat();
        int retVal = buildOpticalFlowPyramid_0(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel, withDerivatives, pyrBorder, derivBorder, tryReuseInputImage);
        Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
        return retVal;
    }

/**
 * <p>Constructs the image pyramid which can be passed to "calcOpticalFlowPyrLK".</p>
 *
 * @param img 8-bit input image.
 * @param pyramid output pyramid.
 * @param winSize window size of optical flow algorithm. Must be not less than
 * <code>winSize</code> argument of "calcOpticalFlowPyrLK". It is needed to
 * calculate required padding for pyramid levels.
 * @param maxLevel 0-based maximal pyramid level number.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#buildopticalflowpyramid">org.opencv.video.Video.buildOpticalFlowPyramid</a>
 */
    public static int buildOpticalFlowPyramid(Mat img, List<Mat> pyramid, Size winSize, int maxLevel)
    {
        Mat pyramid_mat = new Mat();
        int retVal = buildOpticalFlowPyramid_1(img.nativeObj, pyramid_mat.nativeObj, winSize.width, winSize.height, maxLevel);
        Converters.Mat_to_vector_Mat(pyramid_mat, pyramid);
        return retVal;
    }


    //
    // C++:  void calcOpticalFlowFarneback(Mat prev, Mat next, Mat& flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags)
    //

/**
 * <p>Computes a dense optical flow using the Gunnar Farneback's algorithm.</p>
 *
 * <p>The function finds an optical flow for each <code>prev</code> pixel using the
 * [Farneback2003] algorithm so that</p>
 *
 * <p><em>prev(y,x) ~ next(y + flow(y,x)[1], x + flow(y,x)[0])</em></p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> An example using the optical flow algorithm described by Gunnar
 * Farneback can be found at opencv_source_code/samples/cpp/fback.cpp
 *   <li> (Python) An example using the optical flow algorithm described by
 * Gunnar Farneback can be found at opencv_source_code/samples/python2/opt_flow.py
 * </ul>
 *
 * @param prev first 8-bit single-channel input image.
 * @param next second input image of the same size and the same type as
 * <code>prev</code>.
 * @param flow computed flow image that has the same size as <code>prev</code>
 * and type <code>CV_32FC2</code>.
 * @param pyr_scale parameter, specifying the image scale (<1) to build pyramids
 * for each image; <code>pyr_scale=0.5</code> means a classical pyramid, where
 * each next layer is twice smaller than the previous one.
 * @param levels number of pyramid layers including the initial image;
 * <code>levels=1</code> means that no extra layers are created and only the
 * original images are used.
 * @param winsize averaging window size; larger values increase the algorithm
 * robustness to image noise and give more chances for fast motion detection,
 * but yield more blurred motion field.
 * @param iterations number of iterations the algorithm does at each pyramid
 * level.
 * @param poly_n size of the pixel neighborhood used to find polynomial
 * expansion in each pixel; larger values mean that the image will be
 * approximated with smoother surfaces, yielding more robust algorithm and more
 * blurred motion field, typically <code>poly_n</code> =5 or 7.
 * @param poly_sigma standard deviation of the Gaussian that is used to smooth
 * derivatives used as a basis for the polynomial expansion; for
 * <code>poly_n=5</code>, you can set <code>poly_sigma=1.1</code>, for
 * <code>poly_n=7</code>, a good value would be <code>poly_sigma=1.5</code>.
 * @param flags operation flags that can be a combination of the following:
 * <ul>
 *   <li> OPTFLOW_USE_INITIAL_FLOW uses the input <code>flow</code> as an
 * initial flow approximation.
 *   <li> OPTFLOW_FARNEBACK_GAUSSIAN uses the Gaussian <em>winsizexwinsize</em>
 * filter instead of a box filter of the same size for optical flow estimation;
 * usually, this option gives z more accurate flow than with a box filter, at
 * the cost of lower speed; normally, <code>winsize</code> for a Gaussian window
 * should be set to a larger value to achieve the same level of robustness.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#calcopticalflowfarneback">org.opencv.video.Video.calcOpticalFlowFarneback</a>
 */
    public static void calcOpticalFlowFarneback(Mat prev, Mat next, Mat flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags)
    {

        calcOpticalFlowFarneback_0(prev.nativeObj, next.nativeObj, flow.nativeObj, pyr_scale, levels, winsize, iterations, poly_n, poly_sigma, flags);

        return;
    }


    //
    // C++:  Mat estimateRigidTransform(Mat src, Mat dst, bool fullAffine)
    //

/**
 * <p>Computes an optimal affine transformation between two 2D point sets.</p>
 *
 * <p>The function finds an optimal affine transform *[A|b]* (a <code>2 x 3</code>
 * floating-point matrix) that approximates best the affine transformation
 * between:</p>
 * <ul>
 *   <li> Two point sets
 *   <li> Two raster images. In this case, the function first finds some
 * features in the <code>src</code> image and finds the corresponding features
 * in <code>dst</code> image. After that, the problem is reduced to the first
 * case.
 * </ul>
 *
 * <p>In case of point sets, the problem is formulated as follows: you need to find
 * a 2x2 matrix *A* and 2x1 vector *b* so that:</p>
 *
 * <p><em>[A^*|b^*] = arg min _([A|b]) sum _i|dst[i] - A (src[i])^T - b| ^2</em></p>
 *
 * <p>where <code>src[i]</code> and <code>dst[i]</code> are the i-th points in
 * <code>src</code> and <code>dst</code>, respectively</p>
 *
 * <p><em>[A|b]</em> can be either arbitrary (when <code>fullAffine=true</code>) or
 * have a form of</p>
 *
 * <p><em>a_11 a_12 b_1
 * -a_12 a_11 b_2 </em></p>
 *
 * <p>when <code>fullAffine=false</code>.</p>
 *
 * @param src First input 2D point set stored in <code>std.vector</code> or
 * <code>Mat</code>, or an image stored in <code>Mat</code>.
 * @param dst Second input 2D point set of the same size and the same type as
 * <code>A</code>, or another image.
 * @param fullAffine If true, the function finds an optimal affine
 * transformation with no additional restrictions (6 degrees of freedom).
 * Otherwise, the class of transformations to choose from is limited to
 * combinations of translation, rotation, and uniform scaling (5 degrees of
 * freedom).
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#estimaterigidtransform">org.opencv.video.Video.estimateRigidTransform</a>
 * @see org.opencv.calib3d.Calib3d#findHomography
 * @see org.opencv.imgproc.Imgproc#getAffineTransform
 * @see org.opencv.imgproc.Imgproc#getPerspectiveTransform
 */
    public static Mat estimateRigidTransform(Mat src, Mat dst, boolean fullAffine)
    {

        Mat retVal = new Mat(estimateRigidTransform_0(src.nativeObj, dst.nativeObj, fullAffine));

        return retVal;
    }


    //
    // C++:  double findTransformECC(Mat templateImage, Mat inputImage, Mat& warpMatrix, int motionType = MOTION_AFFINE, TermCriteria criteria = TermCriteria(TermCriteria::COUNT+TermCriteria::EPS, 50, 0.001))
    //

/**
 * <p>Finds the geometric transform (warp) between two images in terms of the ECC
 * criterion [EP08].</p>
 *
 * <p>The function estimates the optimum transformation (<code>warpMatrix</code>)
 * with respect to ECC criterion ([EP08]), that is</p>
 *
 * <p><em>warpMatrix = warpMatrix = argmax_(W) ECC(templateImage(x,y),inputImage(x',y'))</em></p>
 *
 * <p>where</p>
 *
 * <p><em>x'
 * y' = W * x
 * 1 </em></p>
 *
 * <p>(the equation holds with homogeneous coordinates for homography). It returns
 * the final enhanced correlation coefficient, that is the correlation
 * coefficient between the template image and the final warped input image. When
 * a <em>3x 3</em> matrix is given with <code>motionType</code> =0, 1 or 2, the
 * third row is ignored.</p>
 *
 * <p>Unlike "findHomography" and "estimateRigidTransform", the function
 * "findTransformECC" implements an area-based alignment that builds on
 * intensity similarities. In essence, the function updates the initial
 * transformation that roughly aligns the images. If this information is
 * missing, the identity warp (unity matrix) should be given as input. Note that
 * if images undergo strong displacements/rotations, an initial transformation
 * that roughly aligns the images is necessary (e.g., a simple euclidean/similarity
 * transform that allows for the images showing the same image content
 * approximately). Use inverse warping in the second image to take an image
 * close to the first one, i.e. use the flag <code>WARP_INVERSE_MAP</code> with
 * "warpAffine" or "warpPerspective". See also the OpenCV sample
 * <code>image_alignment.cpp</code> that demonstrates the use of the function.
 * Note that the function throws an exception if algorithm does not converges.</p>
 *
 * @param templateImage single-channel template image; <code>CV_8U</code> or
 * <code>CV_32F</code> array.
 * @param inputImage single-channel input image which should be warped with the
 * final <code>warpMatrix</code> in order to provide an image similar to
 * <code>templateImage</code>, same type as <code>temlateImage</code>.
 * @param warpMatrix floating-point <em>2x 3</em> or <em>3x 3</em> mapping
 * matrix (warp).
 * @param motionType parameter, specifying the type of motion:
 * <ul>
 *   <li> MOTION_TRANSLATION sets a translational motion model;
 * <code>warpMatrix</code> is <em>2x 3</em> with the first <em>2x 2</em> part
 * being the unity matrix and the rest two parameters being estimated.
 *   <li> MOTION_EUCLIDEAN sets a Euclidean (rigid) transformation as motion
 * model; three parameters are estimated; <code>warpMatrix</code> is <em>2x
 * 3</em>.
 *   <li> MOTION_AFFINE sets an affine motion model (DEFAULT); six parameters
 * are estimated; <code>warpMatrix</code> is <em>2x 3</em>.
 *   <li> MOTION_HOMOGRAPHY sets a homography as a motion model; eight
 * parameters are estimated;<code>warpMatrix</code> is <em>3x 3</em>.
 * </ul>
 * @param criteria parameter, specifying the termination criteria of the ECC
 * algorithm; <code>criteria.epsilon</code> defines the threshold of the
 * increment in the correlation coefficient between two iterations (a negative
 * <code>criteria.epsilon</code> makes <code>criteria.maxcount</code> the only
 * termination criterion). Default values are shown in the declaration above.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#findtransformecc">org.opencv.video.Video.findTransformECC</a>
 * @see org.opencv.calib3d.Calib3d#findHomography
 * @see org.opencv.video.Video#estimateRigidTransform
 */
    public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix, int motionType, TermCriteria criteria)
    {

        double retVal = findTransformECC_0(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj, motionType, criteria.type, criteria.maxCount, criteria.epsilon);

        return retVal;
    }

/**
 * <p>Finds the geometric transform (warp) between two images in terms of the ECC
 * criterion [EP08].</p>
 *
 * <p>The function estimates the optimum transformation (<code>warpMatrix</code>)
 * with respect to ECC criterion ([EP08]), that is</p>
 *
 * <p><em>warpMatrix = warpMatrix = argmax_(W) ECC(templateImage(x,y),inputImage(x',y'))</em></p>
 *
 * <p>where</p>
 *
 * <p><em>x'
 * y' = W * x
 * 1 </em></p>
 *
 * <p>(the equation holds with homogeneous coordinates for homography). It returns
 * the final enhanced correlation coefficient, that is the correlation
 * coefficient between the template image and the final warped input image. When
 * a <em>3x 3</em> matrix is given with <code>motionType</code> =0, 1 or 2, the
 * third row is ignored.</p>
 *
 * <p>Unlike "findHomography" and "estimateRigidTransform", the function
 * "findTransformECC" implements an area-based alignment that builds on
 * intensity similarities. In essence, the function updates the initial
 * transformation that roughly aligns the images. If this information is
 * missing, the identity warp (unity matrix) should be given as input. Note that
 * if images undergo strong displacements/rotations, an initial transformation
 * that roughly aligns the images is necessary (e.g., a simple euclidean/similarity
 * transform that allows for the images showing the same image content
 * approximately). Use inverse warping in the second image to take an image
 * close to the first one, i.e. use the flag <code>WARP_INVERSE_MAP</code> with
 * "warpAffine" or "warpPerspective". See also the OpenCV sample
 * <code>image_alignment.cpp</code> that demonstrates the use of the function.
 * Note that the function throws an exception if algorithm does not converges.</p>
 *
 * @param templateImage single-channel template image; <code>CV_8U</code> or
 * <code>CV_32F</code> array.
 * @param inputImage single-channel input image which should be warped with the
 * final <code>warpMatrix</code> in order to provide an image similar to
 * <code>templateImage</code>, same type as <code>temlateImage</code>.
 * @param warpMatrix floating-point <em>2x 3</em> or <em>3x 3</em> mapping
 * matrix (warp).
 * @param motionType parameter, specifying the type of motion:
 * <ul>
 *   <li> MOTION_TRANSLATION sets a translational motion model;
 * <code>warpMatrix</code> is <em>2x 3</em> with the first <em>2x 2</em> part
 * being the unity matrix and the rest two parameters being estimated.
 *   <li> MOTION_EUCLIDEAN sets a Euclidean (rigid) transformation as motion
 * model; three parameters are estimated; <code>warpMatrix</code> is <em>2x
 * 3</em>.
 *   <li> MOTION_AFFINE sets an affine motion model (DEFAULT); six parameters
 * are estimated; <code>warpMatrix</code> is <em>2x 3</em>.
 *   <li> MOTION_HOMOGRAPHY sets a homography as a motion model; eight
 * parameters are estimated;<code>warpMatrix</code> is <em>3x 3</em>.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#findtransformecc">org.opencv.video.Video.findTransformECC</a>
 * @see org.opencv.calib3d.Calib3d#findHomography
 * @see org.opencv.video.Video#estimateRigidTransform
 */
    public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix, int motionType)
    {

        double retVal = findTransformECC_1(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj, motionType);

        return retVal;
    }

/**
 * <p>Finds the geometric transform (warp) between two images in terms of the ECC
 * criterion [EP08].</p>
 *
 * <p>The function estimates the optimum transformation (<code>warpMatrix</code>)
 * with respect to ECC criterion ([EP08]), that is</p>
 *
 * <p><em>warpMatrix = warpMatrix = argmax_(W) ECC(templateImage(x,y),inputImage(x',y'))</em></p>
 *
 * <p>where</p>
 *
 * <p><em>x'
 * y' = W * x
 * 1 </em></p>
 *
 * <p>(the equation holds with homogeneous coordinates for homography). It returns
 * the final enhanced correlation coefficient, that is the correlation
 * coefficient between the template image and the final warped input image. When
 * a <em>3x 3</em> matrix is given with <code>motionType</code> =0, 1 or 2, the
 * third row is ignored.</p>
 *
 * <p>Unlike "findHomography" and "estimateRigidTransform", the function
 * "findTransformECC" implements an area-based alignment that builds on
 * intensity similarities. In essence, the function updates the initial
 * transformation that roughly aligns the images. If this information is
 * missing, the identity warp (unity matrix) should be given as input. Note that
 * if images undergo strong displacements/rotations, an initial transformation
 * that roughly aligns the images is necessary (e.g., a simple euclidean/similarity
 * transform that allows for the images showing the same image content
 * approximately). Use inverse warping in the second image to take an image
 * close to the first one, i.e. use the flag <code>WARP_INVERSE_MAP</code> with
 * "warpAffine" or "warpPerspective". See also the OpenCV sample
 * <code>image_alignment.cpp</code> that demonstrates the use of the function.
 * Note that the function throws an exception if algorithm does not converges.</p>
 *
 * @param templateImage single-channel template image; <code>CV_8U</code> or
 * <code>CV_32F</code> array.
 * @param inputImage single-channel input image which should be warped with the
 * final <code>warpMatrix</code> in order to provide an image similar to
 * <code>templateImage</code>, same type as <code>temlateImage</code>.
 * @param warpMatrix floating-point <em>2x 3</em> or <em>3x 3</em> mapping
 * matrix (warp).
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#findtransformecc">org.opencv.video.Video.findTransformECC</a>
 * @see org.opencv.calib3d.Calib3d#findHomography
 * @see org.opencv.video.Video#estimateRigidTransform
 */
    public static double findTransformECC(Mat templateImage, Mat inputImage, Mat warpMatrix)
    {

        double retVal = findTransformECC_2(templateImage.nativeObj, inputImage.nativeObj, warpMatrix.nativeObj);

        return retVal;
    }


    //
    // C++:  Ptr_DenseOpticalFlow createOptFlow_DualTVL1()
    //

/**
 * <p>"Dual TV L1" Optical Flow Algorithm.</p>
 *
 * <p>The class implements the "Dual TV L1" optical flow algorithm described in
 * [Zach2007] and [Javier2012].</p>
 *
 * <p>Here are important members of the class that control the algorithm, which you
 * can set after constructing the class instance: Time step of the numerical
 * scheme.
 * <code></p>
 *
 * <p>// C++ code:</p>
 *
 * <p>Weight parameter for the data term, attachment parameter. This is the most
 * relevant parameter, which determines the smoothness of the output. The
 * smaller this parameter is, the smoother the solutions we obtain. It depends
 * on the range of motions of the images, so its value should be adapted to each
 * image sequence.</p>
 *
 * <p>Weight parameter for (u - v)^2, tightness parameter. It serves as a link
 * between the attachment and the regularization terms. In theory, it should
 * have a small value in order to maintain both parts in correspondence. The
 * method is stable for a large range of values of this parameter.</p>
 *
 * <p>Number of scales used to create the pyramid of images.</p>
 *
 * <p>Number of warpings per scale. Represents the number of times that I1(x+u0)
 * and grad(I1(x+u0)) are computed per scale. This is a parameter that assures
 * the stability of the method. It also affects the running time, so it is a
 * compromise between speed and accuracy.</p>
 *
 * <p>Stopping criterion threshold used in the numerical scheme, which is a
 * trade-off between precision and running time. A small value will yield more
 * accurate solutions at the expense of a slower convergence.</p>
 *
 * <p>Stopping criterion iterations number used in the numerical scheme.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#createoptflow-dualtvl1">org.opencv.video.Video.createOptFlow_DualTVL1</a>
 */
    public static DenseOpticalFlow createOptFlow_DualTVL1()
    {

        DenseOpticalFlow retVal = new DenseOpticalFlow(createOptFlow_DualTVL1_0());

        return retVal;
    }


    //
    // C++:  RotatedRect CamShift(Mat probImage, Rect& window, TermCriteria criteria)
    //

/**
 * <p>Finds an object center, size, and orientation.</p>
 *
 * <p>The function implements the CAMSHIFT object tracking algorithm [Bradski98].
 * First, it finds an object center using "meanShift" and then adjusts the
 * window size and finds the optimal rotation. The function returns the rotated
 * rectangle structure that includes the object position, size, and orientation.
 * The next position of the search window can be obtained with <code>RotatedRect.boundingRect()</code>.</p>
 *
 * <p>See the OpenCV sample <code>camshiftdemo.c</code> that tracks colored
 * objects.</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> (Python) A sample explaining the camshift tracking algorithm can be
 * found at opencv_source_code/samples/python2/camshift.py
 * </ul>
 *
 * @param probImage Back projection of the object histogram. See
 * "calcBackProject".
 * @param window Initial search window.
 * @param criteria Stop criteria for the underlying "meanShift".
 *
 * <p>:returns: (in old interfaces) Number of iterations CAMSHIFT took to converge</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#camshift">org.opencv.video.Video.CamShift</a>
 */
    public static RotatedRect CamShift(Mat probImage, Rect window, TermCriteria criteria)
    {
        double[] window_out = new double[4];
        RotatedRect retVal = new RotatedRect(CamShift_0(probImage.nativeObj, window.x, window.y, window.width, window.height, window_out, criteria.type, criteria.maxCount, criteria.epsilon));
        if(window!=null){ window.x = (int)window_out[0]; window.y = (int)window_out[1]; window.width = (int)window_out[2]; window.height = (int)window_out[3]; }
        return retVal;
    }


    //
    // C++:  int meanShift(Mat probImage, Rect& window, TermCriteria criteria)
    //

/**
 * <p>Finds an object on a back projection image.</p>
 *
 * <p>The function implements the iterative object search algorithm. It takes the
 * input back projection of an object and the initial position. The mass center
 * in <code>window</code> of the back projection image is computed and the
 * search window center shifts to the mass center. The procedure is repeated
 * until the specified number of iterations <code>criteria.maxCount</code> is
 * done or until the window center shifts by less than <code>criteria.epsilon</code>.
 * The algorithm is used inside "CamShift" and, unlike "CamShift", the search
 * window size or orientation do not change during the search. You can simply
 * pass the output of "calcBackProject" to this function. But better results can
 * be obtained if you pre-filter the back projection and remove the noise. For
 * example, you can do this by retrieving connected components with
 * "findContours", throwing away contours with small area ("contourArea"), and
 * rendering the remaining contours with "drawContours".</p>
 *
 * <p>Note:</p>
 * <ul>
 *   <li> A mean-shift tracking sample can be found at opencv_source_code/samples/cpp/camshiftdemo.cpp
 * </ul>
 *
 * @param probImage Back projection of the object histogram. See
 * "calcBackProject" for details.
 * @param window Initial search window.
 * @param criteria Stop criteria for the iterative search algorithm.
 *
 * <p>:returns: Number of iterations CAMSHIFT took to converge.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#meanshift">org.opencv.video.Video.meanShift</a>
 */
    public static int meanShift(Mat probImage, Rect window, TermCriteria criteria)
    {
        double[] window_out = new double[4];
        int retVal = meanShift_0(probImage.nativeObj, window.x, window.y, window.width, window.height, window_out, criteria.type, criteria.maxCount, criteria.epsilon);
        if(window!=null){ window.x = (int)window_out[0]; window.y = (int)window_out[1]; window.width = (int)window_out[2]; window.height = (int)window_out[3]; }
        return retVal;
    }


    //
    // C++:  Ptr_BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history = 500, double varThreshold = 16, bool detectShadows = true)
    //

/**
 * <p>Creates MOG2 Background Subtractor</p>
 *
 * @param history Length of the history.
 * @param varThreshold Threshold on the squared Mahalanobis distance between the
 * pixel and the model to decide whether a pixel is well described by the
 * background model. This parameter does not affect the background update.
 * @param detectShadows If true, the algorithm will detect shadows and mark
 * them. It decreases the speed a bit, so if you do not need this feature, set
 * the parameter to false.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#createbackgroundsubtractormog2">org.opencv.video.Video.createBackgroundSubtractorMOG2</a>
 */
    public static BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history, double varThreshold, boolean detectShadows)
    {

        BackgroundSubtractorMOG2 retVal = new BackgroundSubtractorMOG2(createBackgroundSubtractorMOG2_0(history, varThreshold, detectShadows));

        return retVal;
    }

/**
 * <p>Creates MOG2 Background Subtractor</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#createbackgroundsubtractormog2">org.opencv.video.Video.createBackgroundSubtractorMOG2</a>
 */
    public static BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2()
    {

        BackgroundSubtractorMOG2 retVal = new BackgroundSubtractorMOG2(createBackgroundSubtractorMOG2_1());

        return retVal;
    }


    //
    // C++:  Ptr_BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history = 500, double dist2Threshold = 400.0, bool detectShadows = true)
    //

/**
 * <p>Creates KNN Background Subtractor</p>
 *
 * @param history Length of the history.
 * @param dist2Threshold Threshold on the squared distance between the pixel and
 * the sample to decide whether a pixel is close to that sample. This parameter
 * does not affect the background update.
 * @param detectShadows If true, the algorithm will detect shadows and mark
 * them. It decreases the speed a bit, so if you do not need this feature, set
 * the parameter to false.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#createbackgroundsubtractorknn">org.opencv.video.Video.createBackgroundSubtractorKNN</a>
 */
    public static BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history, double dist2Threshold, boolean detectShadows)
    {

        BackgroundSubtractorKNN retVal = new BackgroundSubtractorKNN(createBackgroundSubtractorKNN_0(history, dist2Threshold, detectShadows));

        return retVal;
    }

/**
 * <p>Creates KNN Background Subtractor</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#createbackgroundsubtractorknn">org.opencv.video.Video.createBackgroundSubtractorKNN</a>
 */
    public static BackgroundSubtractorKNN createBackgroundSubtractorKNN()
    {

        BackgroundSubtractorKNN retVal = new BackgroundSubtractorKNN(createBackgroundSubtractorKNN_1());

        return retVal;
    }




    // C++:  void calcOpticalFlowPyrLK(Mat prevImg, Mat nextImg, vector_Point2f prevPts, vector_Point2f& nextPts, vector_uchar& status, vector_float& err, Size winSize = Size(21,21), int maxLevel = 3, TermCriteria criteria = TermCriteria(TermCriteria::COUNT+TermCriteria::EPS, 30, 0.01), int flags = 0, double minEigThreshold = 1e-4)
    private static native void calcOpticalFlowPyrLK_0(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel, int criteria_type, int criteria_maxCount, double criteria_epsilon, int flags, double minEigThreshold);
    private static native void calcOpticalFlowPyrLK_1(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel);
    private static native void calcOpticalFlowPyrLK_2(long prevImg_nativeObj, long nextImg_nativeObj, long prevPts_mat_nativeObj, long nextPts_mat_nativeObj, long status_mat_nativeObj, long err_mat_nativeObj);

    // C++:  int buildOpticalFlowPyramid(Mat img, vector_Mat& pyramid, Size winSize, int maxLevel, bool withDerivatives = true, int pyrBorder = BORDER_REFLECT_101, int derivBorder = BORDER_CONSTANT, bool tryReuseInputImage = true)
    private static native int buildOpticalFlowPyramid_0(long img_nativeObj, long pyramid_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel, boolean withDerivatives, int pyrBorder, int derivBorder, boolean tryReuseInputImage);
    private static native int buildOpticalFlowPyramid_1(long img_nativeObj, long pyramid_mat_nativeObj, double winSize_width, double winSize_height, int maxLevel);

    // C++:  void calcOpticalFlowFarneback(Mat prev, Mat next, Mat& flow, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags)
    private static native void calcOpticalFlowFarneback_0(long prev_nativeObj, long next_nativeObj, long flow_nativeObj, double pyr_scale, int levels, int winsize, int iterations, int poly_n, double poly_sigma, int flags);

    // C++:  Mat estimateRigidTransform(Mat src, Mat dst, bool fullAffine)
    private static native long estimateRigidTransform_0(long src_nativeObj, long dst_nativeObj, boolean fullAffine);

    // C++:  double findTransformECC(Mat templateImage, Mat inputImage, Mat& warpMatrix, int motionType = MOTION_AFFINE, TermCriteria criteria = TermCriteria(TermCriteria::COUNT+TermCriteria::EPS, 50, 0.001))
    private static native double findTransformECC_0(long templateImage_nativeObj, long inputImage_nativeObj, long warpMatrix_nativeObj, int motionType, int criteria_type, int criteria_maxCount, double criteria_epsilon);
    private static native double findTransformECC_1(long templateImage_nativeObj, long inputImage_nativeObj, long warpMatrix_nativeObj, int motionType);
    private static native double findTransformECC_2(long templateImage_nativeObj, long inputImage_nativeObj, long warpMatrix_nativeObj);

    // C++:  Ptr_DenseOpticalFlow createOptFlow_DualTVL1()
    private static native long createOptFlow_DualTVL1_0();

    // C++:  RotatedRect CamShift(Mat probImage, Rect& window, TermCriteria criteria)
    private static native double[] CamShift_0(long probImage_nativeObj, int window_x, int window_y, int window_width, int window_height, double[] window_out, int criteria_type, int criteria_maxCount, double criteria_epsilon);

    // C++:  int meanShift(Mat probImage, Rect& window, TermCriteria criteria)
    private static native int meanShift_0(long probImage_nativeObj, int window_x, int window_y, int window_width, int window_height, double[] window_out, int criteria_type, int criteria_maxCount, double criteria_epsilon);

    // C++:  Ptr_BackgroundSubtractorMOG2 createBackgroundSubtractorMOG2(int history = 500, double varThreshold = 16, bool detectShadows = true)
    private static native long createBackgroundSubtractorMOG2_0(int history, double varThreshold, boolean detectShadows);
    private static native long createBackgroundSubtractorMOG2_1();

    // C++:  Ptr_BackgroundSubtractorKNN createBackgroundSubtractorKNN(int history = 500, double dist2Threshold = 400.0, bool detectShadows = true)
    private static native long createBackgroundSubtractorKNN_0(int history, double dist2Threshold, boolean detectShadows);
    private static native long createBackgroundSubtractorKNN_1();

}
