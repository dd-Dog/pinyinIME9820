package com.keanbin.pinyinime.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by bian on 2018/6/5.
 */

public class StrokeDAO {

    private static final String TAG = "StrokeDAO";
    private final Context mContext;
    private final DBHelper mDbHelper;

    public StrokeDAO(Context context) {
        mContext = context;
        mDbHelper = new DBHelper(mContext);
    }

    /**
     * @param keyWord 查询笔画
     * @param count   返回结果个数
     * @return
     */
    public ArrayList<String> query(String keyWord, int count) {
        if (TextUtils.isEmpty(keyWord)) {
            return null;
        }
        keyWord = formatStr(keyWord);
        if (count <= 0) {
            count = 50;
        } else if (count > 100) {
            count = 100;
        }
        int length = keyWord.length();
        ArrayList<String> strings = new ArrayList<>();
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        if (db != null) {
            //查询指定前count条数，模糊查询，按照id排序
            Cursor cursor = db.rawQuery("select hz from stroke" + " where array like '"
                    + keyWord + "%'" + " order by _id asc limit " + count, null);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    String s = cursor.getString(0);
                    strings.add(s);
                }
            }
        }
        Log.d(TAG, "query,result=" + strings);
        return strings;
    }

    private String formatStr(String keyWord) {
        String result = "";
        for (int i = 0; i < keyWord.length(); i++) {
            char c = keyWord.charAt(i);
            if (c == '6' || c == '7' || c == '9') {
                result += "5";
            } else if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5') {
                result += c;
            }
        }
        Log.d(TAG, "formatStr=" + result);
        return result;
    }
}
