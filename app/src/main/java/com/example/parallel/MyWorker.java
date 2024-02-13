package com.example.parallel;
import androidx.work.Worker;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import android.util.Log;
import android.content.Context;

public class MyWorker extends Worker {
    public final String TAG = "MY_TAG";

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.v(TAG, "Work is in progress");
        try {
            for (int i = 0; i < 3; i++) {
                Log.d(TAG,"Doing anything");
                Thread.sleep(3 * 1000);
            }
        } catch (InterruptedException e) {
            Log.e(TAG,e.getMessage());
            return Result.failure();
        }
        Log.v(TAG, "Work finished");
        return Worker.Result.success();
    }
}