package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        getSupportActionBar().hide();

        Thread thread = new Thread(){
          public void run(){
              try {
                  sleep(2000);
              }
              catch (Exception e){
                  e.printStackTrace();
              }
              finally {
                  Intent intent =new Intent(splashScreen.this, SignIn2.class);
                  startActivity(intent);

              }
          }
        };thread.start();


    }
}