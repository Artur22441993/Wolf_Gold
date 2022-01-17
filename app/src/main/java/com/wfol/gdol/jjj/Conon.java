package com.wfol.gdol.jjj;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.wfol.gdol.Slo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conon {

    public static String url;
    public static String keyDefault;
    public static String fbId;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void conn()throws Exception{

        HttpURLConnection kd = (HttpURLConnection) new URL(Slo.dddee(FinCon.gggiii)).openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(kd.getInputStream()));
        String idn = bufferedReader.readLine();

        String [] a = idn.split("\\\u007C");
        url = a[0];
        keyDefault = a[1];
        fbId = a[2];

    }
}
