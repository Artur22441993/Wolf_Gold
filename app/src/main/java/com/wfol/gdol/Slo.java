package com.wfol.gdol;

import android.os.Build;
import android.os.Handler;

import androidx.annotation.RequiresApi;

import com.wfol.gdol.act.MainActivity;

import java.util.Base64;
import java.util.Random;

public class Slo {

   static int a;
   static int b;
   static int c;
   static int con = 0;

   public static void sd(){
      Handler handler = new Handler();
      handler.post(new Runnable() {
         @Override
         public void run() {
            Random random = new Random();
            a = random.nextInt(5);
            b = random.nextInt(5);
            c = random.nextInt(5);
            if (Slo.a == 0){
               MainActivity.imageView.setImageResource(MainActivity.slot1);
               MainActivity.textView.setText("5");

            }
            if (Slo.a == 1){
               MainActivity.imageView.setImageResource(MainActivity.slot2);
               MainActivity.textView.setText("6");

            }
            if (Slo.a == 2){
               MainActivity.imageView.setImageResource(MainActivity.slot3);
               MainActivity.textView.setText("7");

            }
            if (Slo.a == 3){
               MainActivity.imageView.setImageResource(MainActivity.slot4);
               MainActivity.textView.setText("8");

            }
            if (Slo.a == 4){
               MainActivity.imageView.setImageResource(MainActivity.slot5);
               MainActivity.textView.setText("9");

            }


            if (Slo.b == 0){
               MainActivity.imageView2.setImageResource(MainActivity.slot1);
               MainActivity.textView1.setText("5");

            }
            if (Slo.b == 1){
               MainActivity.imageView2.setImageResource(MainActivity.slot2);
               MainActivity.textView1.setText("6");

            }
            if (Slo.b == 2){
               MainActivity.imageView2.setImageResource(MainActivity.slot3);
               MainActivity.textView1.setText("7");

            }
            if (Slo.b == 3){
               MainActivity.imageView2.setImageResource(MainActivity.slot4);
               MainActivity.textView1.setText("8");

            }
            if (Slo.b == 4){
               MainActivity.imageView2.setImageResource(MainActivity.slot5);
               MainActivity.textView1.setText("9");

            }

            if (Slo.c == 0){
               MainActivity.imageView3.setImageResource(MainActivity.slot1);
               MainActivity.textView2.setText("5");

            }
            if (Slo.c == 1){
               MainActivity.imageView3.setImageResource(MainActivity.slot2);
               MainActivity.textView2.setText("6");

            }
            if (Slo.c == 2){
               MainActivity.imageView3.setImageResource(MainActivity.slot3);
               MainActivity.textView2.setText("7");

            }
            if (Slo.c == 3){
               MainActivity.imageView3.setImageResource(MainActivity.slot4);
               MainActivity.textView2.setText("8");

            }
            if (Slo.c == 4){
               MainActivity.imageView3.setImageResource(MainActivity.slot5);
               MainActivity.textView2.setText("9");
            }

            con ++;
            if (con !=40){
            handler.postDelayed(this::run,10);
            }else {
               con = 0;
            }
         }
      });

   }

   @RequiresApi(api = Build.VERSION_CODES.O)
   public static String dddee(String qwqeq){

      Base64.Decoder dec = Base64.getDecoder();
      String kdsd = new String(dec.decode(qwqeq));
      return kdsd;
   }

}
