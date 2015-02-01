
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.video;



// C++: class BackgroundSubtractorMOG2
/**
 * <p>Gaussian Mixture-based Background/Foreground Segmentation Algorithm.</p>
 *
 * <p>The class implements the Gaussian mixture model background subtraction
 * described in [Zivkovic2004] and [Zivkovic2006].</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2">org.opencv.video.BackgroundSubtractorMOG2 : public BackgroundSubtractor</a>
 */
public class BackgroundSubtractorMOG2 extends BackgroundSubtractor {

    protected BackgroundSubtractorMOG2(long addr) { super(addr); }


    //
    // C++:  int getHistory()
    //

/**
 * <p>Returns the number of last frames that affect the background model</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-gethistory">org.opencv.video.BackgroundSubtractorMOG2.getHistory</a>
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
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-sethistory">org.opencv.video.BackgroundSubtractorMOG2.setHistory</a>
 */
    public  void setHistory(int history)
    {

        setHistory_0(nativeObj, history);

        return;
    }


    //
    // C++:  int getNMixtures()
    //

/**
 * <p>Returns the number of gaussian components in the background model</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getnmixtures">org.opencv.video.BackgroundSubtractorMOG2.getNMixtures</a>
 */
    public  int getNMixtures()
    {

        int retVal = getNMixtures_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setNMixtures(int nmixtures)
    //

/**
 * <p>Sets the number of gaussian components in the background model. The model
 * needs to be reinitalized to reserve memory.</p>
 *
 * @param nmixtures a nmixtures
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setnmixtures">org.opencv.video.BackgroundSubtractorMOG2.setNMixtures</a>
 */
    public  void setNMixtures(int nmixtures)
    {

        setNMixtures_0(nativeObj, nmixtures);

        return;
    }


    //
    // C++:  double getBackgroundRatio()
    //

/**
 * <p>Returns the "background ratio" parameter of the algorithm</p>
 *
 * <p>If a foreground pixel keeps semi-constant value for about <code>backgroundRatio*history</code>
 * frames, it's considered background and added to the model as a center of a
 * new component. It corresponds to <code>TB</code> parameter in the paper.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getbackgroundratio">org.opencv.video.BackgroundSubtractorMOG2.getBackgroundRatio</a>
 */
    public  double getBackgroundRatio()
    {

        double retVal = getBackgroundRatio_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setBackgroundRatio(double ratio)
    //

/**
 * <p>Sets the "background ratio" parameter of the algorithm</p>
 *
 * @param ratio a ratio
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setbackgroundratio">org.opencv.video.BackgroundSubtractorMOG2.setBackgroundRatio</a>
 */
    public  void setBackgroundRatio(double ratio)
    {

        setBackgroundRatio_0(nativeObj, ratio);

        return;
    }


    //
    // C++:  double getVarThreshold()
    //

/**
 * <p>Returns the variance threshold for the pixel-model match</p>
 *
 * <p>The main threshold on the squared Mahalanobis distance to decide if the
 * sample is well described by the background model or not. Related to Cthr from
 * the paper.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getvarthreshold">org.opencv.video.BackgroundSubtractorMOG2.getVarThreshold</a>
 */
    public  double getVarThreshold()
    {

        double retVal = getVarThreshold_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setVarThreshold(double varThreshold)
    //

/**
 * <p>Sets the variance threshold for the pixel-model match</p>
 *
 * @param varThreshold a varThreshold
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setvarthreshold">org.opencv.video.BackgroundSubtractorMOG2.setVarThreshold</a>
 */
    public  void setVarThreshold(double varThreshold)
    {

        setVarThreshold_0(nativeObj, varThreshold);

        return;
    }


    //
    // C++:  double getVarThresholdGen()
    //

/**
 * <p>Returns the variance threshold for the pixel-model match used for new mixture
 * component generation</p>
 *
 * <p>Threshold for the squared Mahalanobis distance that helps decide when a
 * sample is close to the existing components (corresponds to <code>Tg</code> in
 * the paper). If a pixel is not close to any component, it is considered
 * foreground or added as a new component. <code>3 sigma => Tg=3*3=9</code> is
 * default. A smaller <code>Tg</code> value generates more components. A higher
 * <code>Tg</code> value may result in a small number of components but they can
 * grow too large.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getvarthresholdgen">org.opencv.video.BackgroundSubtractorMOG2.getVarThresholdGen</a>
 */
    public  double getVarThresholdGen()
    {

        double retVal = getVarThresholdGen_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setVarThresholdGen(double varThresholdGen)
    //

/**
 * <p>Sets the variance threshold for the pixel-model match used for new mixture
 * component generation</p>
 *
 * @param varThresholdGen a varThresholdGen
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setvarthresholdgen">org.opencv.video.BackgroundSubtractorMOG2.setVarThresholdGen</a>
 */
    public  void setVarThresholdGen(double varThresholdGen)
    {

        setVarThresholdGen_0(nativeObj, varThresholdGen);

        return;
    }


    //
    // C++:  void setVarInit(double varInit)
    //

/**
 * <p>Sets the initial variance of each gaussian component</p>
 *
 * @param varInit a varInit
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setvarinit">org.opencv.video.BackgroundSubtractorMOG2.setVarInit</a>
 */
    public  void setVarInit(double varInit)
    {

        setVarInit_0(nativeObj, varInit);

        return;
    }


    //
    // C++:  double getVarInit()
    //

/**
 * <p>Returns the initial variance of each gaussian component</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getvarinit">org.opencv.video.BackgroundSubtractorMOG2.getVarInit</a>
 */
    public  double getVarInit()
    {

        double retVal = getVarInit_0(nativeObj);

        return retVal;
    }


    //
    // C++:  double getVarMin()
    //

    public  double getVarMin()
    {

        double retVal = getVarMin_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setVarMin(double varMin)
    //

    public  void setVarMin(double varMin)
    {

        setVarMin_0(nativeObj, varMin);

        return;
    }


    //
    // C++:  double getVarMax()
    //

    public  double getVarMax()
    {

        double retVal = getVarMax_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setVarMax(double varMax)
    //

    public  void setVarMax(double varMax)
    {

        setVarMax_0(nativeObj, varMax);

        return;
    }


    //
    // C++:  double getComplexityReductionThreshold()
    //

/**
 * <p>Returns the complexity reduction threshold</p>
 *
 * <p>This parameter defines the number of samples needed to accept to prove the
 * component exists. <code>CT=0.05</code> is a default value for all the
 * samples. By setting <code>CT=0</code> you get an algorithm very similar to
 * the standard Stauffer&Grimson algorithm.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getcomplexityreductionthreshold">org.opencv.video.BackgroundSubtractorMOG2.getComplexityReductionThreshold</a>
 */
    public  double getComplexityReductionThreshold()
    {

        double retVal = getComplexityReductionThreshold_0(nativeObj);

        return retVal;
    }


    //
    // C++:  void setComplexityReductionThreshold(double ct)
    //

/**
 * <p>Sets the complexity reduction threshold</p>
 *
 * @param ct a ct
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setcomplexityreductionthreshold">org.opencv.video.BackgroundSubtractorMOG2.setComplexityReductionThreshold</a>
 */
    public  void setComplexityReductionThreshold(double ct)
    {

        setComplexityReductionThreshold_0(nativeObj, ct);

        return;
    }


    //
    // C++:  bool getDetectShadows()
    //

/**
 * <p>Returns the shadow detection flag</p>
 *
 * <p>If true, the algorithm detects shadows and marks them. See createBackgroundSubtractorMOG2
 * for details.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getdetectshadows">org.opencv.video.BackgroundSubtractorMOG2.getDetectShadows</a>
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
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setdetectshadows">org.opencv.video.BackgroundSubtractorMOG2.setDetectShadows</a>
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
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getshadowvalue">org.opencv.video.BackgroundSubtractorMOG2.getShadowValue</a>
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
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setshadowvalue">org.opencv.video.BackgroundSubtractorMOG2.setShadowValue</a>
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
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-getshadowthreshold">org.opencv.video.BackgroundSubtractorMOG2.getShadowThreshold</a>
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
 * @see <a href="http://docs.opencv.org/modules/video/doc/motion_analysis_and_object_tracking.html#backgroundsubtractormog2-setshadowthreshold">org.opencv.video.BackgroundSubtractorMOG2.setShadowThreshold</a>
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

    // C++:  int getNMixtures()
    private static native int getNMixtures_0(long nativeObj);

    // C++:  void setNMixtures(int nmixtures)
    private static native void setNMixtures_0(long nativeObj, int nmixtures);

    // C++:  double getBackgroundRatio()
    private static native double getBackgroundRatio_0(long nativeObj);

    // C++:  void setBackgroundRatio(double ratio)
    private static native void setBackgroundRatio_0(long nativeObj, double ratio);

    // C++:  double getVarThreshold()
    private static native double getVarThreshold_0(long nativeObj);

    // C++:  void setVarThreshold(double varThreshold)
    private static native void setVarThreshold_0(long nativeObj, double varThreshold);

    // C++:  double getVarThresholdGen()
    private static native double getVarThresholdGen_0(long nativeObj);

    // C++:  void setVarThresholdGen(double varThresholdGen)
    private static native void setVarThresholdGen_0(long nativeObj, double varThresholdGen);

    // C++:  void setVarInit(double varInit)
    private static native void setVarInit_0(long nativeObj, double varInit);

    // C++:  double getVarInit()
    private static native double getVarInit_0(long nativeObj);

    // C++:  double getVarMin()
    private static native double getVarMin_0(long nativeObj);

    // C++:  void setVarMin(double varMin)
    private static native void setVarMin_0(long nativeObj, double varMin);

    // C++:  double getVarMax()
    private static native double getVarMax_0(long nativeObj);

    // C++:  void setVarMax(double varMax)
    private static native void setVarMax_0(long nativeObj, double varMax);

    // C++:  double getComplexityReductionThreshold()
    private static native double getComplexityReductionThreshold_0(long nativeObj);

    // C++:  void setComplexityReductionThreshold(double ct)
    private static native void setComplexityReductionThreshold_0(long nativeObj, double ct);

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
