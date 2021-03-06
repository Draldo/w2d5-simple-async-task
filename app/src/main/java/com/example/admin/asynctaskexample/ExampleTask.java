package com.example.admin.asynctaskexample;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by admin on 7/29/2016.
 */
public class ExampleTask extends AsyncTask<Void, Void, Void> {

    private static final String TAG = "ExampleTaskTAG_";

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d(TAG, "onPreExecute: " + Thread.currentThread());
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d(TAG, "doInBackground: " + Thread.currentThread());
        publishProgress();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
                Log.d(TAG, "onCreate: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        Log.d(TAG, "onCancelled: " + Thread.currentThread());
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
        Log.d(TAG, "onProgressUpdate: " + Thread.currentThread());
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d(TAG, "onPostExecute: " + Thread.currentThread());
    }
}
