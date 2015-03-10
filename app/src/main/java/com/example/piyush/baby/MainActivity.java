package com.example.piyush.baby;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Activity created...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity started...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity restarted...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity resumed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity paused...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity stopped...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity destroyed...");
    }
}
