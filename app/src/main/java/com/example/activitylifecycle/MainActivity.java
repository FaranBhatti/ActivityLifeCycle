/*
File name:                   ActivityLifeCycle
Description:                 A program to explore the implementation of callback methods (events)
Created:                     Faran Bhatti
Edited:                      2023-01-16 by Faran Bhatti (FB)
Last Edited:                 2023-01-16 by Faran Bhatti (FB)
 */

// Declaring where the source code of project is
package com.example.activitylifecycle;

// Importing respective libraries
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    // onCreate event
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Do what you need to do here
        setContentView(R.layout.activity_main);

        // Debugger output
        Log.d("Android", "This is an onCreate event!");
    }
    // onStart event
    @Override
    protected void onStart() {
        super.onStart();
        // Do what you need to do here

        // Debugger output
        Log.d("Android", "This is an onStart event!");
    }
    // onResume event
    @Override
    protected void onResume() {
        super.onResume();
        // Do what you need to do here

        // Debugger output
        Log.d("Android", "This is an onResume event!");
    }
    // onPause event
    @Override
    protected void onPause() {
        super.onPause();
        // Do what you need to do here

        // Debugger output
        Log.d("Android", "This is an onPause event!");
    }

    // onStop event
    @Override
    protected void onStop() {
        super.onStop();
        // Do what you need to do here

        // Debugger output
        Log.d("Android", "This is an onStop event!");
    }
    // onRestart event
    @Override
    protected void onRestart() {
        super.onRestart();
        // Do what you need to do here

        // Debugger output
        Log.d("Android", "This is an onRestart event!");
    }
    // onDestroy event
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Do what you need to do here

        // Debugger output
        Log.d("Android", "This is an onDestroy event!");
    }
}