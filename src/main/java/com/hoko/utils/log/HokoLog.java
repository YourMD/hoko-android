package com.hoko.utils.log;

/**
 * A wrapper around Android's Log class.
 * It has a verbose property to determine whether to print messages and exceptions or not.
 */
public class HokoLog {
    /**
     * The Log TAG
     */
    public static final String TAG = "HOKO";

    /**
     * Verbose is false by default
     */
    private static boolean mVerbose = false;

    /**
     * Prints a debug message.
     *
     * @param message The message.
     */
    public static void d(String message) {
        if (mVerbose) {
            android.util.Log.d(TAG, message);
        }
    }

    /**
     * Prints a debug exception.
     *
     * @param exception The exception.
     */
    public static void d(Exception exception) {
        if (mVerbose) {
            android.util.Log.d(TAG, exception.getMessage(), exception);
        }
    }

    /**
     * Prints a message as an error.
     *
     * @param message The message.
     */
    public static void e(String message) {
        if (mVerbose) {
            android.util.Log.e(TAG, message);
        }
    }

    /**
     * Prints an exception as an error.
     *
     * @param exception The exception.
     */
    public static void e(Exception exception) {
        if (mVerbose) {
            android.util.Log.e(TAG, exception.getMessage(), exception);
        }
    }

    /**
     * Prints an error.
     *
     * @param error The exception.
     */
    public static void e(Error error) {
        if (mVerbose) {
            android.util.Log.e(TAG, error.getMessage(), error);
        }
    }

    public static boolean isVerbose() {
        return mVerbose;
    }

    public static void setVerbose(boolean verbose) {
        HokoLog.mVerbose = verbose;
    }

}
