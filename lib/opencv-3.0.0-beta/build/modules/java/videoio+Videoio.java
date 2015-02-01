
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.videoio;



public class Videoio {

    public static final int
            CV_CAP_MSMF = 1400,
            CV_CAP_ANDROID = 1000,
            CV_CAP_ANDROID_BACK = CV_CAP_ANDROID+99,
            CV_CAP_ANDROID_FRONT = CV_CAP_ANDROID+98,
            CV_CAP_XIAPI = 1100,
            CV_CAP_AVFOUNDATION = 1200,
            CV_CAP_GIGANETIX = 1300,
            CV_CAP_PROP_FRAME_WIDTH = 3,
            CV_CAP_PROP_FRAME_HEIGHT = 4,
            CV_CAP_PROP_ZOOM = 27,
            CV_CAP_PROP_FOCUS = 28,
            CV_CAP_PROP_GUID = 29,
            CV_CAP_PROP_ISO_SPEED = 30,
            CV_CAP_PROP_BACKLIGHT = 32,
            CV_CAP_PROP_PAN = 33,
            CV_CAP_PROP_TILT = 34,
            CV_CAP_PROP_ROLL = 35,
            CV_CAP_PROP_IRIS = 36,
            CV_CAP_PROP_SETTINGS = 37,
            CV_CAP_PROP_AUTOGRAB = 1024,
            CV_CAP_PROP_PREVIEW_FORMAT = 1026,
            CV_CAP_PROP_OPENNI2_SYNC = 110,
            CV_CAP_PROP_OPENNI2_MIRROR = 111,
            CV_CAP_PROP_PVAPI_FRAMESTARTTRIGGERMODE = 301,
            CV_CAP_PROP_PVAPI_DECIMATIONHORIZONTAL = 302,
            CV_CAP_PROP_PVAPI_DECIMATIONVERTICAL = 303,
            CV_CAP_PROP_PVAPI_BINNINGX = 304,
            CV_CAP_PROP_PVAPI_BINNINGY = 305,
            CV_CAP_PROP_XI_DOWNSAMPLING = 400,
            CV_CAP_PROP_XI_DATA_FORMAT = 401,
            CV_CAP_PROP_XI_OFFSET_X = 402,
            CV_CAP_PROP_XI_OFFSET_Y = 403,
            CV_CAP_PROP_XI_TRG_SOURCE = 404,
            CV_CAP_PROP_XI_TRG_SOFTWARE = 405,
            CV_CAP_PROP_XI_GPI_SELECTOR = 406,
            CV_CAP_PROP_XI_GPI_MODE = 407,
            CV_CAP_PROP_XI_GPI_LEVEL = 408,
            CV_CAP_PROP_XI_GPO_SELECTOR = 409,
            CV_CAP_PROP_XI_GPO_MODE = 410,
            CV_CAP_PROP_XI_LED_SELECTOR = 411,
            CV_CAP_PROP_XI_LED_MODE = 412,
            CV_CAP_PROP_XI_MANUAL_WB = 413,
            CV_CAP_PROP_XI_AUTO_WB = 414,
            CV_CAP_PROP_XI_AEAG = 415,
            CV_CAP_PROP_XI_EXP_PRIORITY = 416,
            CV_CAP_PROP_XI_AE_MAX_LIMIT = 417,
            CV_CAP_PROP_XI_AG_MAX_LIMIT = 418,
            CV_CAP_PROP_XI_AEAG_LEVEL = 419,
            CV_CAP_PROP_XI_TIMEOUT = 420,
            CV_CAP_PROP_ANDROID_FLASH_MODE = 8001,
            CV_CAP_PROP_ANDROID_FOCUS_MODE = 8002,
            CV_CAP_PROP_ANDROID_WHITE_BALANCE = 8003,
            CV_CAP_PROP_ANDROID_ANTIBANDING = 8004,
            CV_CAP_PROP_ANDROID_FOCAL_LENGTH = 8005,
            CV_CAP_PROP_ANDROID_FOCUS_DISTANCE_NEAR = 8006,
            CV_CAP_PROP_ANDROID_FOCUS_DISTANCE_OPTIMAL = 8007,
            CV_CAP_PROP_ANDROID_FOCUS_DISTANCE_FAR = 8008,
            CV_CAP_PROP_ANDROID_EXPOSE_LOCK = 8009,
            CV_CAP_PROP_ANDROID_WHITEBALANCE_LOCK = 8010,
            CV_CAP_PROP_IOS_DEVICE_FOCUS = 9001,
            CV_CAP_PROP_IOS_DEVICE_EXPOSURE = 9002,
            CV_CAP_PROP_IOS_DEVICE_FLASH = 9003,
            CV_CAP_PROP_IOS_DEVICE_WHITEBALANCE = 9004,
            CV_CAP_PROP_IOS_DEVICE_TORCH = 9005,
            CV_CAP_PROP_GIGA_FRAME_OFFSET_X = 10001,
            CV_CAP_PROP_GIGA_FRAME_OFFSET_Y = 10002,
            CV_CAP_PROP_GIGA_FRAME_WIDTH_MAX = 10003,
            CV_CAP_PROP_GIGA_FRAME_HEIGH_MAX = 10004,
            CV_CAP_PROP_GIGA_FRAME_SENS_WIDTH = 10005,
            CV_CAP_PROP_GIGA_FRAME_SENS_HEIGH = 10006,
            CV_CAP_PROP_INTELPERC_PROFILE_COUNT = 11001,
            CV_CAP_PROP_INTELPERC_PROFILE_IDX = 11002,
            CV_CAP_PROP_INTELPERC_DEPTH_LOW_CONFIDENCE_VALUE = 11003,
            CV_CAP_PROP_INTELPERC_DEPTH_SATURATION_VALUE = 11004,
            CV_CAP_PROP_INTELPERC_DEPTH_CONFIDENCE_THRESHOLD = 11005,
            CV_CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_HORZ = 11006,
            CV_CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_VERT = 11007,
            CV_CAP_ANDROID_COLOR_FRAME_BGR = 0,
            CV_CAP_ANDROID_COLOR_FRAME = CV_CAP_ANDROID_COLOR_FRAME_BGR,
            CV_CAP_ANDROID_GREY_FRAME = 1,
            CV_CAP_ANDROID_COLOR_FRAME_RGB = 2,
            CV_CAP_ANDROID_COLOR_FRAME_BGRA = 3,
            CV_CAP_ANDROID_COLOR_FRAME_RGBA = 4,
            CV_CAP_ANDROID_FLASH_MODE_AUTO = 0,
            CV_CAP_ANDROID_FLASH_MODE_OFF = 0+1,
            CV_CAP_ANDROID_FLASH_MODE_ON = 0+2,
            CV_CAP_ANDROID_FLASH_MODE_RED_EYE = 0+3,
            CV_CAP_ANDROID_FLASH_MODE_TORCH = 0+4,
            CV_CAP_ANDROID_FOCUS_MODE_AUTO = 0,
            CV_CAP_ANDROID_FOCUS_MODE_CONTINUOUS_PICTURE = 0+1,
            CV_CAP_ANDROID_FOCUS_MODE_CONTINUOUS_VIDEO = 0+2,
            CV_CAP_ANDROID_FOCUS_MODE_EDOF = 0+3,
            CV_CAP_ANDROID_FOCUS_MODE_FIXED = 0+4,
            CV_CAP_ANDROID_FOCUS_MODE_INFINITY = 0+5,
            CV_CAP_ANDROID_FOCUS_MODE_MACRO = 0+6,
            CV_CAP_ANDROID_WHITE_BALANCE_AUTO = 0,
            CV_CAP_ANDROID_WHITE_BALANCE_CLOUDY_DAYLIGHT = 0+1,
            CV_CAP_ANDROID_WHITE_BALANCE_DAYLIGHT = 0+2,
            CV_CAP_ANDROID_WHITE_BALANCE_FLUORESCENT = 0+3,
            CV_CAP_ANDROID_WHITE_BALANCE_INCANDESCENT = 0+4,
            CV_CAP_ANDROID_WHITE_BALANCE_SHADE = 0+5,
            CV_CAP_ANDROID_WHITE_BALANCE_TWILIGHT = 0+6,
            CV_CAP_ANDROID_WHITE_BALANCE_WARM_FLUORESCENT = 0+7,
            CV_CAP_ANDROID_ANTIBANDING_50HZ = 0,
            CV_CAP_ANDROID_ANTIBANDING_60HZ = 0+1,
            CV_CAP_ANDROID_ANTIBANDING_AUTO = 0+2,
            CV_CAP_ANDROID_ANTIBANDING_OFF = 0+3,
            CAP_ANY = 0,
            CAP_VFW = 200,
            CAP_V4L = 200,
            CAP_V4L2 = CAP_V4L,
            CAP_FIREWARE = 300,
            CAP_FIREWIRE = CAP_FIREWARE,
            CAP_IEEE1394 = CAP_FIREWARE,
            CAP_DC1394 = CAP_FIREWARE,
            CAP_CMU1394 = CAP_FIREWARE,
            CAP_QT = 500,
            CAP_UNICAP = 600,
            CAP_DSHOW = 700,
            CAP_PVAPI = 800,
            CAP_OPENNI = 900,
            CAP_OPENNI_ASUS = 910,
            CAP_ANDROID = 1000,
            CAP_XIAPI = 1100,
            CAP_AVFOUNDATION = 1200,
            CAP_GIGANETIX = 1300,
            CAP_MSMF = 1400,
            CAP_INTELPERC = 1500,
            CAP_OPENNI2 = 1600,
            CAP_PROP_POS_MSEC = 0,
            CAP_PROP_POS_FRAMES = 1,
            CAP_PROP_POS_AVI_RATIO = 2,
            CAP_PROP_FRAME_WIDTH = 3,
            CAP_PROP_FRAME_HEIGHT = 4,
            CAP_PROP_FPS = 5,
            CAP_PROP_FOURCC = 6,
            CAP_PROP_FRAME_COUNT = 7,
            CAP_PROP_FORMAT = 8,
            CAP_PROP_MODE = 9,
            CAP_PROP_BRIGHTNESS = 10,
            CAP_PROP_CONTRAST = 11,
            CAP_PROP_SATURATION = 12,
            CAP_PROP_HUE = 13,
            CAP_PROP_GAIN = 14,
            CAP_PROP_EXPOSURE = 15,
            CAP_PROP_CONVERT_RGB = 16,
            CAP_PROP_WHITE_BALANCE_BLUE_U = 17,
            CAP_PROP_RECTIFICATION = 18,
            CAP_PROP_MONOCROME = 19,
            CAP_PROP_SHARPNESS = 20,
            CAP_PROP_AUTO_EXPOSURE = 21,
            CAP_PROP_GAMMA = 22,
            CAP_PROP_TEMPERATURE = 23,
            CAP_PROP_TRIGGER = 24,
            CAP_PROP_TRIGGER_DELAY = 25,
            CAP_PROP_WHITE_BALANCE_RED_V = 26,
            CAP_PROP_ZOOM = 27,
            CAP_PROP_FOCUS = 28,
            CAP_PROP_GUID = 29,
            CAP_PROP_ISO_SPEED = 30,
            CAP_PROP_BACKLIGHT = 32,
            CAP_PROP_PAN = 33,
            CAP_PROP_TILT = 34,
            CAP_PROP_ROLL = 35,
            CAP_PROP_IRIS = 36,
            CAP_PROP_SETTINGS = 37,
            CAP_PROP_DC1394_OFF = -4,
            CAP_PROP_DC1394_MODE_MANUAL = -3,
            CAP_PROP_DC1394_MODE_AUTO = -2,
            CAP_PROP_DC1394_MODE_ONE_PUSH_AUTO = -1,
            CAP_PROP_DC1394_MAX = 31,
            CAP_OPENNI_DEPTH_GENERATOR = 1 << 31,
            CAP_OPENNI_IMAGE_GENERATOR = 1 << 30,
            CAP_OPENNI_GENERATORS_MASK = CAP_OPENNI_DEPTH_GENERATOR + CAP_OPENNI_IMAGE_GENERATOR,
            CAP_PROP_OPENNI_OUTPUT_MODE = 100,
            CAP_PROP_OPENNI_FRAME_MAX_DEPTH = 101,
            CAP_PROP_OPENNI_BASELINE = 102,
            CAP_PROP_OPENNI_FOCAL_LENGTH = 103,
            CAP_PROP_OPENNI_REGISTRATION = 104,
            CAP_PROP_OPENNI_REGISTRATION_ON = CAP_PROP_OPENNI_REGISTRATION,
            CAP_PROP_OPENNI_APPROX_FRAME_SYNC = 105,
            CAP_PROP_OPENNI_MAX_BUFFER_SIZE = 106,
            CAP_PROP_OPENNI_CIRCLE_BUFFER = 107,
            CAP_PROP_OPENNI_MAX_TIME_DURATION = 108,
            CAP_PROP_OPENNI_GENERATOR_PRESENT = 109,
            CAP_PROP_OPENNI2_SYNC = 110,
            CAP_PROP_OPENNI2_MIRROR = 111,
            CAP_OPENNI_IMAGE_GENERATOR_PRESENT = CAP_OPENNI_IMAGE_GENERATOR + CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CAP_OPENNI_IMAGE_GENERATOR_OUTPUT_MODE = CAP_OPENNI_IMAGE_GENERATOR + CAP_PROP_OPENNI_OUTPUT_MODE,
            CAP_OPENNI_DEPTH_GENERATOR_BASELINE = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_BASELINE,
            CAP_OPENNI_DEPTH_GENERATOR_FOCAL_LENGTH = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_FOCAL_LENGTH,
            CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_REGISTRATION,
            CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION_ON = CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION,
            CAP_OPENNI_DEPTH_MAP = 0,
            CAP_OPENNI_POINT_CLOUD_MAP = 1,
            CAP_OPENNI_DISPARITY_MAP = 2,
            CAP_OPENNI_DISPARITY_MAP_32F = 3,
            CAP_OPENNI_VALID_DEPTH_MASK = 4,
            CAP_OPENNI_BGR_IMAGE = 5,
            CAP_OPENNI_GRAY_IMAGE = 6,
            CAP_OPENNI_VGA_30HZ = 0,
            CAP_OPENNI_SXGA_15HZ = 1,
            CAP_OPENNI_SXGA_30HZ = 2,
            CAP_OPENNI_QVGA_30HZ = 3,
            CAP_OPENNI_QVGA_60HZ = 4,
            CAP_PROP_GSTREAMER_QUEUE_LENGTH = 200,
            CAP_PROP_PVAPI_MULTICASTIP = 300,
            CAP_PROP_PVAPI_FRAMESTARTTRIGGERMODE = 301,
            CAP_PROP_PVAPI_DECIMATIONHORIZONTAL = 302,
            CAP_PROP_PVAPI_DECIMATIONVERTICAL = 303,
            CAP_PROP_PVAPI_BINNINGX = 304,
            CAP_PROP_PVAPI_BINNINGY = 305,
            CAP_PVAPI_FSTRIGMODE_FREERUN = 0,
            CAP_PVAPI_FSTRIGMODE_SYNCIN1 = 1,
            CAP_PVAPI_FSTRIGMODE_SYNCIN2 = 2,
            CAP_PVAPI_FSTRIGMODE_FIXEDRATE = 3,
            CAP_PVAPI_FSTRIGMODE_SOFTWARE = 4,
            CAP_PVAPI_DECIMATION_OFF = 1,
            CAP_PVAPI_DECIMATION_2OUTOF4 = 2,
            CAP_PVAPI_DECIMATION_2OUTOF8 = 4,
            CAP_PVAPI_DECIMATION_2OUTOF16 = 8,
            CAP_PROP_XI_DOWNSAMPLING = 400,
            CAP_PROP_XI_DATA_FORMAT = 401,
            CAP_PROP_XI_OFFSET_X = 402,
            CAP_PROP_XI_OFFSET_Y = 403,
            CAP_PROP_XI_TRG_SOURCE = 404,
            CAP_PROP_XI_TRG_SOFTWARE = 405,
            CAP_PROP_XI_GPI_SELECTOR = 406,
            CAP_PROP_XI_GPI_MODE = 407,
            CAP_PROP_XI_GPI_LEVEL = 408,
            CAP_PROP_XI_GPO_SELECTOR = 409,
            CAP_PROP_XI_GPO_MODE = 410,
            CAP_PROP_XI_LED_SELECTOR = 411,
            CAP_PROP_XI_LED_MODE = 412,
            CAP_PROP_XI_MANUAL_WB = 413,
            CAP_PROP_XI_AUTO_WB = 414,
            CAP_PROP_XI_AEAG = 415,
            CAP_PROP_XI_EXP_PRIORITY = 416,
            CAP_PROP_XI_AE_MAX_LIMIT = 417,
            CAP_PROP_XI_AG_MAX_LIMIT = 418,
            CAP_PROP_XI_AEAG_LEVEL = 419,
            CAP_PROP_XI_TIMEOUT = 420,
            CAP_PROP_ANDROID_AUTOGRAB = 1024,
            CAP_PROP_ANDROID_PREVIEW_SIZES_STRING = 1025,
            CAP_PROP_ANDROID_PREVIEW_FORMAT = 1026,
            CAP_PROP_ANDROID_FLASH_MODE = 8001,
            CAP_PROP_ANDROID_FOCUS_MODE = 8002,
            CAP_PROP_ANDROID_WHITE_BALANCE = 8003,
            CAP_PROP_ANDROID_ANTIBANDING = 8004,
            CAP_PROP_ANDROID_FOCAL_LENGTH = 8005,
            CAP_PROP_ANDROID_FOCUS_DISTANCE_NEAR = 8006,
            CAP_PROP_ANDROID_FOCUS_DISTANCE_OPTIMAL = 8007,
            CAP_PROP_ANDROID_FOCUS_DISTANCE_FAR = 8008,
            CAP_ANDROID_COLOR_FRAME_BGR = 0,
            CAP_ANDROID_COLOR_FRAME = CAP_ANDROID_COLOR_FRAME_BGR,
            CAP_ANDROID_GREY_FRAME = 1,
            CAP_ANDROID_COLOR_FRAME_RGB = 2,
            CAP_ANDROID_COLOR_FRAME_BGRA = 3,
            CAP_ANDROID_COLOR_FRAME_RGBA = 4,
            CAP_ANDROID_FLASH_MODE_AUTO = 0,
            CAP_ANDROID_FLASH_MODE_OFF = 1,
            CAP_ANDROID_FLASH_MODE_ON = 2,
            CAP_ANDROID_FLASH_MODE_RED_EYE = 3,
            CAP_ANDROID_FLASH_MODE_TORCH = 4,
            CAP_ANDROID_FOCUS_MODE_AUTO = 0,
            CAP_ANDROID_FOCUS_MODE_CONTINUOUS_VIDEO = 1,
            CAP_ANDROID_FOCUS_MODE_EDOF = 2,
            CAP_ANDROID_FOCUS_MODE_FIXED = 3,
            CAP_ANDROID_FOCUS_MODE_INFINITY = 4,
            CAP_ANDROID_FOCUS_MODE_MACRO = 5,
            CAP_ANDROID_WHITE_BALANCE_AUTO = 0,
            CAP_ANDROID_WHITE_BALANCE_CLOUDY_DAYLIGHT = 1,
            CAP_ANDROID_WHITE_BALANCE_DAYLIGHT = 2,
            CAP_ANDROID_WHITE_BALANCE_FLUORESCENT = 3,
            CAP_ANDROID_WHITE_BALANCE_INCANDESCENT = 4,
            CAP_ANDROID_WHITE_BALANCE_SHADE = 5,
            CAP_ANDROID_WHITE_BALANCE_TWILIGHT = 6,
            CAP_ANDROID_WHITE_BALANCE_WARM_FLUORESCENT = 7,
            CAP_ANDROID_ANTIBANDING_50HZ = 0,
            CAP_ANDROID_ANTIBANDING_60HZ = 1,
            CAP_ANDROID_ANTIBANDING_AUTO = 2,
            CAP_ANDROID_ANTIBANDING_OFF = 3,
            CAP_PROP_IOS_DEVICE_FOCUS = 9001,
            CAP_PROP_IOS_DEVICE_EXPOSURE = 9002,
            CAP_PROP_IOS_DEVICE_FLASH = 9003,
            CAP_PROP_IOS_DEVICE_WHITEBALANCE = 9004,
            CAP_PROP_IOS_DEVICE_TORCH = 9005,
            CAP_PROP_GIGA_FRAME_OFFSET_X = 10001,
            CAP_PROP_GIGA_FRAME_OFFSET_Y = 10002,
            CAP_PROP_GIGA_FRAME_WIDTH_MAX = 10003,
            CAP_PROP_GIGA_FRAME_HEIGH_MAX = 10004,
            CAP_PROP_GIGA_FRAME_SENS_WIDTH = 10005,
            CAP_PROP_GIGA_FRAME_SENS_HEIGH = 10006,
            CAP_PROP_INTELPERC_PROFILE_COUNT = 11001,
            CAP_PROP_INTELPERC_PROFILE_IDX = 11002,
            CAP_PROP_INTELPERC_DEPTH_LOW_CONFIDENCE_VALUE = 11003,
            CAP_PROP_INTELPERC_DEPTH_SATURATION_VALUE = 11004,
            CAP_PROP_INTELPERC_DEPTH_CONFIDENCE_THRESHOLD = 11005,
            CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_HORZ = 11006,
            CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_VERT = 11007,
            CAP_INTELPERC_DEPTH_GENERATOR = 1 << 29,
            CAP_INTELPERC_IMAGE_GENERATOR = 1 << 28,
            CAP_INTELPERC_GENERATORS_MASK = CAP_INTELPERC_DEPTH_GENERATOR + CAP_INTELPERC_IMAGE_GENERATOR,
            CAP_INTELPERC_DEPTH_MAP = 0,
            CAP_INTELPERC_UVDEPTH_MAP = 1,
            CAP_INTELPERC_IR_MAP = 2,
            CAP_INTELPERC_IMAGE = 3;




}
