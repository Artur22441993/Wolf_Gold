package com.wfol.gdol.we;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.wfol.gdol.Slo;
import com.wfol.gdol.act.WG;

public class kid extends WebViewClient {

   @SuppressLint("StaticFieldLeak")
   private static WG wg;

    public static void setWg(WG wg) {
        kid.wg = wg;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        wg.getSharedPreferences(wg.getPackageName(), wg.MODE_PRIVATE).edit().putString(Slo.dddee("c2F2ZWRVcmw="),url).apply();
    }

    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        if (errorResponse.getStatusCode() == 404){
          WG.ste(wg);
        }
    }
}
