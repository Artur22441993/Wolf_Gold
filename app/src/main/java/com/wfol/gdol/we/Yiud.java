package com.wfol.gdol.we;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import com.wfol.gdol.Slo;
import com.wfol.gdol.act.WG;

public class Yiud extends WebChromeClient {

    @SuppressLint("StaticFieldLeak")
    public  static WG wg;

    public static void setWg(WG wg) {
        Yiud.wg = wg;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> filePath,
                                     FileChooserParams fileChooserParams) {

        if (WG.lfhd != null) {
            WG.lfhd.onReceiveValue(null);
        }
        WG.lfhd = filePath;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, Slo.dddee("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        wg.startActivityForResult(chooserIntent, 1);
        return true;
    }


}
