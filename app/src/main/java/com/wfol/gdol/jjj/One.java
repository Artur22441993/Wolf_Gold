package com.wfol.gdol.jjj;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;
import com.wfol.gdol.Apepepep;
import com.wfol.gdol.Slo;
import com.wfol.gdol.act.WG;

public class One {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void ooonr(Apepepep apepepep){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(apepepep.getApplicationContext());
        OneSignal.setAppId(Slo.dddee(FinCon.ooonen));
    }
}
