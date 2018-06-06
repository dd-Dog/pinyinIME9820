package com.keanbin.pinyinime.utils;

import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by bian on 2018/6/4.
 */

public class ChineseStroke {

    private static final String TAG ="ChineseStroke";
    public static ArrayList maps = new ArrayList<>();
    public static void init(){

    }

    public static ArrayList<String> getStrokes(String chars){
        Log.d(TAG, "getStrokes,chars=" + chars);
        if (TextUtils.isEmpty(chars)){
            return null;
        }
        ArrayList<String> stroke = new ArrayList<String>();
        for (int i=0; i<chars.length(); i++){
            char c = chars.charAt(i);
            String s = char2Stroke(c);
            stroke.add(s);
        }
        return stroke;
    }

    private static String char2Stroke(char c) {
        Log.d(TAG, "char2Stroke,c=" + c);
        String s = "";
        switch (c){
            case '1':
                s = "一";
                break;
            case '2':
                s = "丨";
                break;
            case '3':
                s = "丿";
                break;
            case '4':
                s = "丶";
                break;
            case '5':
                s = "乛";
                break;
            case '6':
                s = "乀";
                break;
            case '7':
                s = "乚";
                break;
            case '9':
                s = "乙";
                break;
        }
        return s;
    }

}
