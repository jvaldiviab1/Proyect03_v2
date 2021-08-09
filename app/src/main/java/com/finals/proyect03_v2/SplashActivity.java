package com.finals.proyect03_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    private  int SLEEP_TIMER = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();

    }
    private class LogoLauncher extends  Thread{
        public  void run(){
            try{
                sleep(1000 * SLEEP_TIMER);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }
    }

}
