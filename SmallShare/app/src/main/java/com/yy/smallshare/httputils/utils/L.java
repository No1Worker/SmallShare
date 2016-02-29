package com.yy.smallshare.httputils.utils;

import android.util.Log;

/**
 * Created by Jaron Yu on 2016/2/29.
 */
public class L {
    private static boolean debug = false;

    public static void e(String msg)
    {
        if (debug)
        {
            Log.e("OkHttp", msg);
        }
    }

}
