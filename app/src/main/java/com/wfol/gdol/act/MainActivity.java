package com.wfol.gdol.act;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wfol.gdol.R;
import com.wfol.gdol.Slo;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("StaticFieldLeak")
    public  static ImageView imageView, imageView2,imageView3, imageViewSpin;
    public static int slot1, slot2, slot3, slot4, slot5;
    @SuppressLint("StaticFieldLeak")
    public static TextView textView, textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        fjf();
        kik();
        vkd();
    }

    public void fjf(){
        slot1 = R.drawable.ic_slot_1;
        slot2 = R.drawable.ic_slot_2;
        slot3 = R.drawable.ic_slot_3;
        slot4 = R.drawable.ic_slot_4;
        slot5 = R.drawable.ic_slot_5;
    }

    public void kik(){
        imageView = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView4);
        imageView3 = findViewById(R.id.imageView5);
        imageViewSpin = findViewById(R.id.spin);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);
    }

    public void vkd(){
        imageViewSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Slo.sd();
            }
        });

    }


}