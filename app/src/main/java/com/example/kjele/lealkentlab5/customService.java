package com.example.kjele.lealkentlab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class customService extends IntentService {
    public customService() {
        super("customService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("customService", "Custom Service");
    }
}