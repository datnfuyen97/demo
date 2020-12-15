package com.example.testmvp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {
   public static String BASE_URL = "<a class=\"vglnk\" href=\"http://your-Apilink/\" rel=\"nofollow\"><span>http</span><span>://</span><span>your</span><span>-</span><span>Apilink</span><span>/</span></a>";

    public static final boolean isOnline(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        @SuppressLint("MissingPermission") NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null &&
        netInfo.isConnectedOrConnecting();
    }
}
