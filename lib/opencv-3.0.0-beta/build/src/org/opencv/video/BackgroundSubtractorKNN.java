
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;



// C++: class BackgroundSubtractorKNN
/**
 * <p>K-nearest neigbours - based Background/Foreground Segmentation Algorithm.</p>
 *
 * <p>The class implements the K-nearest neigbours background subtraction described
 * in [Zivkovic2006]. Very efficient if number of foreground pixels is low.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn">org.opencv.video.BackgroundSubtractorKNN : public BackgroundSubtractor</a>
 */
public class BackgroundSubtractorKNN extends BackgroundSubtractor {

    protected BackgroundSubtractorKNN(long addr) { super(addr); }


    //
    // C++:  int getHistory()
    //

/**
 * <p>Returns the number of last frames that affect the background model</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-gethistory">org.opencv.video.BackgroundSubtractorKNN.getHistory</a>
 */
    public  int getHistory()
    {

        int retVal = getHistory_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setHistory(int history)
    //

/**
 * <p>Sets the number of last frames that affect the background model</p>
 *
 * @param history a history
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-sethistory">org.opencv.video.BackgroundSubtractorKNN.setHistory</a>
 */
    public  void setHistory(int history)
    {

        setHistory_0(nativeObj, history);

        return;
    }


    //
    // C++:  int getNSamples()
    //

/**
 * <p>Returns the number of data samples in the background model</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-getnsamples">org.opencv.video.BackgroundSubtractorKNN.getNSamples</a>
 */
    public  int getNSamples()
    {

        int retVal = getNSamples_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setNSamples(int _nN)
    //

/**
 * <p>Sets the number of data samples in the background model. The model needs to
 * be reinitalized to reserve memory.</p>
 *
 * @param _nN a _nN
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-setnsamples">org.opencv.video.BackgroundSubtractorKNN.setNSamples</a>
 */
    public  void setNSamples(int _nN)
    {

        setNSamples_0(nativeObj, _nN);

        return;
    }


    //
    // C++:  double getDist2Threshold()
    //

/**
 * <p>Returns the threshold on the squared distance between the pixel and the
 * sample</p>
 *
 * <p>The threshold on the squared distance between the pixel and the sample to
 * decide whether a pixel is close to a data sample.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-getdist2threshold">org.opencv.video.BackgroundSubtractorKNN.getDist2Threshold</a>
 */
    public  double getDist2Threshold()
    {

        double retVal = getDist2Threshold_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setDist2Threshold(double _dist2Threshold)
    //

/**
 * <p>Sets the threshold on the squared distance</p>
 *
 * @param _dist2Threshold a _dist2Threshold
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-setdist2threshold">org.opencv.video.BackgroundSubtractorKNN.setDist2Threshold</a>
 */
    public  void setDist2Threshold(double _dist2Threshold)
    {

        setDist2Threshold_0(nativeObj, _dist2Threshold);

        return;
    }


    //
    // C++:  void setkNNSamples(int _nkNN)
    //

/**
 * <p>Sets the k in the kNN. How many nearest neigbours need to match.</p>
 *
 * @param _nkNN a _nkNN
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-setknnsamples">org.opencv.video.BackgroundSubtractorKNN.setkNNSamples</a>
 */
    public  void setkNNSamples(int _nkNN)
    {

        setkNNSamples_0(nativeObj, _nkNN);

        return;
    }


    //
    // C++:  int getkNNSamples()
    //

/**
 * <p>Returns the number of neighbours, the k in the kNN. K is the number of
 * samples that need to be within dist2Threshold in order to decide that that
 * pixel is matching the kNN background model.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-getknnsamples">org.opencv.video.BackgroundSubtractorKNN.getkNNSamples</a>
 */
    public  int getkNNSamples()
    {

        int retVal = getkNNSamples_0(nativeObj);

        return retVal;
    }


    //
    // C++:  bool getDetectShadows()
    //

/**
 * <p>Returns the shadow detection flag</p>
 *
 * <p>If true, the algorithm detects shadows and marks them. See createBackgroundSubtractorKNN
 * for details.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-getdetectshadows">org.opencv.video.BackgroundSubtractorKNN.getDetectShadows</a>
 */
    public  boolean getDetectShadows()
    {

        boolean retVal = getDetectShadows_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setDetectShadows(bool detectShadows)
    //

/**
 * <p>Enables or disables shadow detection</p>
 *
 * @param detectShadows a detectShadows
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-setdetectshadows">org.opencv.video.BackgroundSubtractorKNN.setDetectShadows</a>
 */
    public  void setDetectShadows(boolean detectShadows)
    {

        setDetectShadows_0(nativeObj, detectShadows);

        return;
    }


    //
    // C++:  int getShadowValue()
    //

/**
 * <p>Returns the shadow value</p>
 *
 * <p>Shadow value is the value used to mark shadows in the foreground mask.
 * Default value is 127. Value 0 in the mask always means background, 255 means
 * foreground.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-getshadowvalue">org.opencv.video.BackgroundSubtractorKNN.getShadowValue</a>
 */
    public  int getShadowValue()
    {

        int retVal = getShadowValue_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setShadowValue(int value)
    //

/**
 * <p>Sets the shadow value</p>
 *
 * @param value a value
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-setshadowvalue">org.opencv.video.BackgroundSubtractorKNN.setShadowValue</a>
 */
    public  void setShadowValue(int value)
    {

        setShadowValue_0(nativeObj, value);

        return;
    }


    //
    // C++:  double getShadowThreshold()
    //

/**
 * <p>Returns the shadow threshold</p>
 *
 * <p>A shadow is detected if pixel is a darker version of the background. The
 * shadow threshold (<code>Tau</code> in the paper) is a threshold defining how
 * much darker the shadow can be. <code>Tau= 0.5</code> means that if a pixel is
 * more than twice darker then it is not shadow. See Prati, Mikic, Trivedi and
 * Cucchiarra, *Detecting Moving Shadows...*, IEEE PAMI,2003.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-getshadowthreshold">org.opencv.video.BackgroundSubtractorKNN.getShadowThreshold</a>
 */
    public  double getShadowThreshold()
    {

        double retVal = getShadowThreshold_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setShadowThreshold(double threshold)
    //

/**
 * <p>Sets the shadow threshold</p>
 *
 * @param threshold a threshold
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractorknn-setshadowthreshold">org.opencv.video.BackgroundSubtractorKNN.setShadowThreshold</a>
 */
    public  void setShadowThreshold(double threshold)
    {

        setShadowThreshold_0(nativeObj, threshold);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  int getHistory()
    private static native int getHistory_0(long nativeObj);

    // C++:  void setHistory(int history)
    private static native void setHistory_0(long nativeObj, int history);

    // C++:  int getNSamples()
    private static native int getNSamples_0(long nativeObj);

    // C++:  void setNSamples(int _nN)
    private static native void setNSamples_0(long nativeObj, int _nN);

    // C++:  double getDist2Threshold()
    private static native double getDist2Threshold_0(long nativeObj);

    // C++:  void setDist2Threshold(double _dist2Threshold)
    private static native void setDist2Threshold_0(long nativeObj, double _dist2Threshold);

    // C++:  void setkNNSamples(int _nkNN)
    private static native void setkNNSamples_0(long nativeObj, int _nkNN);

    // C++:  int getkNNSamples()
    private static native int getkNNSamples_0(long nativeObj);

    // C++:  bool getDetectShadows()
    private static native boolean getDetectShadows_0(long nativeObj);

    // C++:  void setDetectShadows(bool detectShadows)
    private static native void setDetectShadows_0(long nativeObj, boolean detectShadows);

    // C++:  int getShadowValue()
    private static native int getShadowValue_0(long nativeObj);

    // C++:  void setShadowValue(int value)
    private static native void setShadowValue_0(long nativeObj, int value);

    // C++:  double getShadowThreshold()
    private static native double getShadowThreshold_0(long nativeObj);

    // C++:  void setShadowThreshold(double threshold)
    private static native void setShadowThreshold_0(long nativeObj, double threshold);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
