package com.keanbin.pinyinime.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

import com.keanbin.pinyinime.PinyinIME;
import com.keanbin.pinyinime.constant.Constants;
import com.keanbin.pinyinime.service.LoadService;

/**
 * 广播接收器，接收android.intent.idatachina.RFID.BARCODE.SCANINFO的广播，取出Intent中字段
 * "idatachina.SCAN_DATA"存储的数据，调用拼音服务PinyinIME发送给EditText
 *
 * @author keanbin
 * @ClassName MyReceiver
 */
public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver";
    PinyinIME ss = new PinyinIME();

    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "action=" + intent.getAction());
        if (TextUtils.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            Intent loadIntent = new Intent(context, LoadService.class);
//            context.startService(loadIntent);
        } else if (TextUtils.equals(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            String language = context.getResources().getConfiguration().locale.getLanguage();
            Log.d(TAG, "language=" + language);
            if (TextUtils.equals("en", language)){
                Constants.LANGUAGE_SUPPORT = Constants.EN;
            }else if (TextUtils.equals("pt", language)){
                Constants.LANGUAGE_SUPPORT = Constants.PT;
            }else if (TextUtils.equals("ru", language)){
                Constants.LANGUAGE_SUPPORT = Constants.RU;
            }else if (TextUtils.equals("es", language)){
                Constants.LANGUAGE_SUPPORT = Constants.ES;
            }else {
                Constants.LANGUAGE_SUPPORT = Constants.EN;
            }
        } else {
            // MainActivity.onrecvintend(intent);
            String tinfo = intent.getStringExtra("idatachina.SCAN_DATA");
            ss.pinyinIME.SetText(tinfo);
        }

    }
}
