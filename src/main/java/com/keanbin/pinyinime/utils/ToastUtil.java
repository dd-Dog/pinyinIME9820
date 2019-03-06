package com.keanbin.pinyinime.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by bian on 2019/2/18.
 */

public class ToastUtil {
    private ToastUtil( ){

    }

    public static void showToast(Context context, String toastInfo ){
        if( null == context || TextUtils.isEmpty( toastInfo ) ){
            return;
        }

        if( null == mToast ){
            mToast = Toast.makeText( context, toastInfo, Toast.LENGTH_LONG );
        }else{
            mToast.setText( toastInfo );
        }

        mToast.show( );
    }

    public static void hideToast( ){
        mToast.cancel( );
    }

    private static Toast mToast = null;
}