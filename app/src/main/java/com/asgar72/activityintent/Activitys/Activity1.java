package com.asgar72.activityintent.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.asgar72.activityintent.R;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        System.out.println("lifeCycle1, onCreate() method executed");
        //Log.d("lifeCycle1","onCreate() method executed");  //normally ye use hota ... sys.. bhe use kr skte hai ...
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle1", "onStart() method executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycle1", "onResume() method executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifeCycle1", "onRestart() method executed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle1", "onStop() method executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycle1", "onPause() method executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifeCycle1", "onDestroy() method executed");
    }
}