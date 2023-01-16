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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Android", "This is an onCreate event!");
    }
}