package com.keanbin.pinyinime.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.keanbin.pinyinime.R;

/**
 * Created by MrBian on 2018/1/19.
 */

public class MyToast {
    public static void show(Context context, String str) {

        Toast toast = new Toast(context);
        TextView view = (TextView) LayoutInflater.from(context).inflate(R.layout.toast, null);
        view.setText(str);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }
}
