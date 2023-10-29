package com.netclan.task.helpers;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.netclan.task.BuildConfig;
import com.netclan.task.R;

public class Utils {

    public static boolean isDebug() {
        //return true;
        return BuildConfig.DEBUG;
    }

    public static void setStatusBarWhite(final Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            final Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            window.setStatusBarColor(activity.getResources().getColor(android.R.color.white));
        }
    }

    public static void setStatusBarPrimary(final Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            final Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            window.setStatusBarColor(activity.getResources().getColor(R.color.colorPrimary));
        }
    }

    public static void fullScreen(final Activity activity){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
    }

}
