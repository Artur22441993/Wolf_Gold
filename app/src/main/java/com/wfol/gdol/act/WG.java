package com.wfol.gdol.act;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.wfol.gdol.R;
import com.wfol.gdol.Slo;
import com.wfol.gdol.jjj.Conon;
import com.wfol.gdol.jjj.Djdjs;
import com.wfol.gdol.jjj.FfF;
import com.wfol.gdol.jjj.Vis;
import com.wfol.gdol.we.Yiud;
import com.wfol.gdol.we.kid;

public class WG extends Activity {

    public static ValueCallback<Uri> kfd;
    public static Uri ljfj = null;
    public static ValueCallback<Uri[]> lfhd;
    public static String kfdh;
    public static final int lkhq = 1;
    public static String savedLink = null;
    WebView kddf;
    private ProgressBar ldfk;
    private Button kdfh, qerer;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        dfr();
        cdcd();

        savedLink = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(Slo.dddee("c2F2ZWRVcmw="), "null");

        if (dde() == 0){

            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {
                        Conon.conn();
                        Log.d("weq",Conon.url+"");
                        Log.d("weq",Conon.keyDefault+"");
                        Log.d("weq",Conon.fbId+"");

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                FfF ffF = new FfF(kddf);
                                ffF.fFf(WG.this);

                            }
                        });

                    }catch (Exception e){
                        ste(WG.this);
                    }

                }
            }).start();


        }else {
            Vis.vis(kdfh, qerer, ldfk);
            kdfh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ste(WG.this);
                }
            });

            qerer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    df();

                }
            });
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != lkhq || lfhd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        jdhsdq(resultCode, data);
        if (kfd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        setResults(resultCode, data);
    }

    @Override
    public void onBackPressed() {
        if (kddf.isFocused() && kddf.canGoBack()) {
            kddf.goBack();
        }
    }

    private void jdhsdq(int resultCode, Intent data) {
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (kfdh != null) {
                    results = new Uri[]{Uri.parse(kfdh)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        lfhd.onReceiveValue(results);
        lfhd = null;
    }

    private void setResults(int resultCode, Intent data) {
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? ljfj : data.getData();
            }
        } catch (Exception e) { }
        kfd.onReceiveValue(result);
        kfd = null;
    }

    private void cdcd(){
        Yiud.setWg(this);
        kid.setWg(this);
        Djdjs.wg = this;
    }

    public static void ste(WG wg){
        wg.startActivity(new Intent(wg.getApplicationContext(),MainActivity.class));
        wg.finishAffinity();
    }

    public void df (){
        startActivity(new Intent(getApplicationContext(),Preeeer.class));
    }
    public void dfr(){
        setContentView(R.layout.wg);
        kddf = findViewById(R.id.web);
        ldfk = findViewById(R.id.progressBar);
        kdfh = findViewById(R.id.button2);
        qerer = findViewById(R.id.button3);

    }



    private int dde(){

        int jds = Settings.Secure.getInt(this.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return jds;
    }
}
