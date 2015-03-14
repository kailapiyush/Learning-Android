package com.example.piyush.baby;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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

    public void login(View view){
        System.out.println("Login touched...");
        EditText email = (EditText) findViewById(R.id.emailId);
        EditText password = (EditText) findViewById(R.id.password);
        Context context = getApplicationContext();
        CharSequence message = "Login details incorrect...";
        int duration = Toast.LENGTH_SHORT;
        if (email.getText().toString().equals("pgkaila@gmail.com") && password.getText().toString().equals("123")){
            message = "Login details correct...";
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        Toast.makeText(context, message, duration).show();
    }
}
