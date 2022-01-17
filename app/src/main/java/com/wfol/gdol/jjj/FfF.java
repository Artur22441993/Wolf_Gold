package com.wfol.gdol.jjj;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.wfol.gdol.Apepepep;
import com.wfol.gdol.act.WG;

public class FfF {

    @SuppressLint("StaticFieldLeak")
    private static WebView webViewdds;
    public static String dipLin = null;
    public static String dipLinLink;

    public FfF(WebView webView) {
        this.webViewdds = webView;
    }

    public void fFf(WG wg){

        FacebookSdk.setApplicationId(Conon.fbId);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(wg.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);


        AppEventsLogger.activateApp(wg.getApplication());
        AppLinkData.fetchDeferredAppLinkData(wg.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(wg);
                }
                if (appLinkData != null) {
                    Uri url = appLinkData.getTargetUri();
                    dipLin = url.getQuery();
                    dipLinLink = Psd.paaa(dipLin,wg.getPackageName(), Apepepep.uyret,Apepepep.kfidf);
                }else {

                }
            }
        });




        if (WG.savedLink.equals("null")){

            new Handler().postDelayed(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    Djdjs.djsjs(webViewdds);
                }
            },5000);

        }else {
            webViewdds.setVisibility(View.VISIBLE);
            webViewdds.loadUrl(WG.savedLink);
        }
    }
}
