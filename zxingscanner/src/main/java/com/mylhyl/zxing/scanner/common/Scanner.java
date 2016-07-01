package com.mylhyl.zxing.scanner.common;

/**
 * Created by hupei on 2016/7/1.
 */
public class Scanner {
    public static final int RESTART_PREVIEW = 0;
    public static final int DECODE_SUCCEEDED = 1;
    public static final int DECODE_FAILED = 2;
    public static final int RETURN_SCAN_RESULT = 3;
    public static final int LAUNCH_PRODUCT_QUERY = 4;
    public static final int DECODE = 5;
    public static final int QUIT = 6;

    public static class color {
        public static final int VIEWFINDER_MASK = 0x60000000;
        public static final int RESULT_VIEW = 0xb0000000;
        public static final int VIEWFINDER_LASER = 0xffcc0000;
        public static final int POSSIBLE_RESULT_POINTS = 0xc0ffbd21;
        public static final int RESULT_POINTS = 0xc099cc00;
    }
}