package com.example.admin.asynctaskexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void doMagic(View view) {
        Log.d(TAG, "doMagic: Button pressed");
        Intent intent = new Intent(this,MyService.class);
        startService(intent);
    }
}
