package com.keanbin.pinyinime.service;

import android.app.IntentService;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.KeyEvent;

import com.keanbin.pinyinime.db.DBHelper;

import java.io.IOException;
import java.io.InputStream;

import jxl.Sheet;
import jxl.Workbook;

/**
 * Created by bian on 2018/6/4.
 */

public class LoadService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */

    private static final String TAG = "LoadService";
    public LoadService() {
        super("pinyinime");
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(TAG, "onHandleIntent");
        if (isInitDone()) return;

        DBHelper dbHelper = new DBHelper(getApplicationContext());
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        AssetManager assets = getApplication().getAssets();
        try {
            InputStream is = assets.open("笔画数据库.xls");
            Workbook workBook = Workbook.getWorkbook(is);
            Sheet sheet = workBook.getSheet(0);
            int rows = sheet.getRows();
            for (int i = 1; i < rows; i++) {
                String id = sheet.getCell(0, i).getContents();
                String hz = sheet.getCell(1, i).getContents();
                String count = sheet.getCell(2, i).getContents();
                String array = sheet.getCell(3, i).getContents();
                String unicode = sheet.getCell(4, i).getContents();
                String gb = sheet.getCell(5, i).getContents();
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", id);
                contentValues.put("hz", hz);
                contentValues.put("count", count);
                contentValues.put("array", array);
                contentValues.put("unicode", unicode);
                contentValues.put("gb", gb);
                db.insert("stroke", null, contentValues);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isInitDone() {
        SharedPreferences sp = getSharedPreferences("pinyinime", Context.MODE_PRIVATE);
        boolean initDone = sp.getBoolean("init_done", false);
        Log.d(TAG, "isInitDone,initDone=" + initDone);
        if(initDone){
            return true;
        }
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean("init_done", true);
        editor.commit();
        return false;
    }

}
