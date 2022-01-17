package com.wfol.gdol.act;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.wfol.gdol.R;
import com.wfol.gdol.Slo;

public class Preeeer  extends Activity {

    WebView webView;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.preeeer);
        webView = findViewById(R.id.webPer);
        webView.loadUrl(Slo.dddee("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49M0JDZ2FJbkJNU1d6WERYTldZeVdGY1dFT3ZralRXN2I="));
    }
}
