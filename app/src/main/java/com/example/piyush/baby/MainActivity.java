package com.example.piyush.baby;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Activity lifeCycle", "Activity created...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity lifeCycle", "Activity started...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity lifeCycle", "Activity restarted...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity lifeCycle", "Activity resumed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity lifeCycle", "Activity paused...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity lifeCycle", "Activity stopped...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity lifeCycle", "Activity destroyed...");
    }

    public void login(View view){
        Log.i("Login", "Login touched...");
        EditText email = (EditText) findViewById(R.id.emailId);
        EditText password = (EditText) findViewById(R.id.password);
        Context context = getApplicationContext();
        CharSequence message = "Login details incorrect...";
        int duration = Toast.LENGTH_SHORT;
        if (email.getText().toString().equals("qwe@r.ty") && password.getText().toString().equals("123")){
            Log.i("Login", "Login Success...");
            message = "Login details correct...";
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        } else {
            Log.i("Login", "Login Fail...");
            Toast.makeText(context, message, duration).show();
        }
    }
}
