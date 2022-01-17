package com.wfol.gdol;

import android.app.Application;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.wfol.gdol.jjj.FinCon;
import com.wfol.gdol.jjj.One;
import com.wfol.gdol.jjj.Psd;

import java.util.Map;

public class Apepepep extends Application {

    public static String kfidf;
    public static String kidsha = "";
    public static String uyret;
    public static String iuey;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        One.ooonr(this);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    uyret = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){
                }
            }
        }).start();

        kfidf = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        iuj();
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void iuj(){

        AppsFlyerLib.getInstance().init(Slo.dddee(FinCon.appapap), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                kidsha = map.get(Slo.dddee("YWZfc3RhdHVz")).toString();
                if (kidsha.equals(Slo.dddee("Tm9uLW9yZ2FuaWM="))){
                    String lofd =map.get(Slo.dddee("Y2FtcGFpZ24=")).toString();
                    iuey = Psd.paaa(lofd,getPackageName(), uyret, kfidf);
                }
            }

            @Override
            public void onConversionDataFail(String s) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
            }

            @Override
            public void onAttributionFailure(String s) {
            }
        },this);
        AppsFlyerLib.getInstance().start(this);
    }


}
