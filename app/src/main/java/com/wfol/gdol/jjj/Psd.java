package com.wfol.gdol.jjj;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.onesignal.OneSignal;
import com.wfol.gdol.Slo;

public class Psd {

    private static String key;
    private static String sub6;
    private static  String sub7;
    private static String sub2;
    private static String sub3;
    private static String sub4;
    private static String sub5;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String paaa(String kd, String lijhs, String kds, String lkjus){

        String[] jfdfd = kd.split("::");
        try {
            key = jfdfd[0];
        }catch (Exception e){
            key = "";
        }
        try {
            sub6 = jfdfd[1];
        }catch (Exception e){
            sub6 = "";
        }

        try {
            sub7 = jfdfd[2];
        }catch (Exception e){
            sub7 = "";

        }

        try {
            sub2 = jfdfd[3];
        }catch (Exception e){
            sub2 = "";
        }

        try {
            sub3 = jfdfd[4];
        }catch (Exception e){
            sub3 = "";
        }


        try {
            sub4 = jfdfd[5];
        }catch (Exception e){
            sub4 = "";
        }

        try {
            sub5 = jfdfd[6];
        }catch (Exception e){
            sub5 = "";
        }

        OneSignal.sendTag(Slo.dddee("c3ViX2FwcA=="),sub6);

        String lkij = key + Slo.dddee("P2J1bmRsZT0=") + lijhs + Slo.dddee("JmFkX2lkPQ==") + kds + Slo.dddee("JmFwcHNfaWQ9") + lkjus +
                Slo.dddee("JnN1YjY9") + sub6 +
                Slo.dddee("JnN1Yjc9") + sub7 +
                Slo.dddee("JnN1YjI9") + sub2 +
                Slo.dddee("JnN1YjM9") + sub3 +
                Slo.dddee("JnN1YjQ9") + sub4 +
                Slo.dddee("JnN1YjU9") + sub5;
        return   lkij;
    }
}
