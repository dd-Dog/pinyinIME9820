package com.keanbin.pinyinime;

import android.app.Application;
import android.content.Intent;

import com.keanbin.pinyinime.service.LoadService;

/**
 * Created by bian on 2018/11/27.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Intent loadIntent = new Intent(this, LoadService.class);
//        startService(loadIntent);
    }
}
