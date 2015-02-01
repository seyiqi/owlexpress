
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class DenseOpticalFlow
public class DenseOpticalFlow extends Algorithm {

    protected DenseOpticalFlow(long addr) { super(addr); }


    //
    // C++:  void calc(Mat I0, Mat I1, Mat& flow)
    //

/**
 * <p>Calculates an optical flow.</p>
 *
 * @param I0 a I0
 * @param I1 a I1
 * @param flow computed flow image that has the same size as <code>prev</code>
 * and type <code>CV_32FC2</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#denseopticalflow-calc">org.opencv.video.DenseOpticalFlow.calc</a>
 */
    public  void calc(Mat I0, Mat I1, Mat flow)
    {

        calc_0(nativeObj, I0.nativeObj, I1.nativeObj, flow.nativeObj);

        return;
    }


    //
    // C++:  void collectGarbage()
    //

/**
 * <p>Releases all inner buffers.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#denseopticalflow-collectgarbage">org.opencv.video.DenseOpticalFlow.collectGarbage</a>
 */
    public  void collectGarbage()
    {

        collectGarbage_0(nativeObj);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void calc(Mat I0, Mat I1, Mat& flow)
    private static native void calc_0(long nativeObj, long I0_nativeObj, long I1_nativeObj, long flow_nativeObj);

    // C++:  void collectGarbage()
    private static native void collectGarbage_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
