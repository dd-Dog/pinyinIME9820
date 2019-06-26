package com.keanbin.pinyinime.utils;

import java.util.HashMap;

/**
 * Created by bian on 2019/3/8.
 */

public class ArabicAlpha {
    public static HashMap<Character, String[]> mapsLower = new HashMap<>();
//    public static HashMap<Character, String[]> mapsUpper = new HashMap<>();

    static {
        mapsLower.put('1', new String[]{"و", "ج","1"});
        mapsLower.put('2', new String[]{"ش", "ز", "ﻻ",  "2"});
        mapsLower.put('3', new String[]{"ث", "ي", "ب", "3"});
        mapsLower.put('4', new String[]{"ه", "ل", "ا", "4"});
        mapsLower.put('5', new String[]{"ت", "ن", "م", "5"});
        mapsLower.put('6', new String[]{"خ", "ﻯ", "ﺓ", "6"});
        mapsLower.put('7', new String[]{"ض", "ق", "ح", "س", "7"});
        mapsLower.put('8', new String[]{"ف", "ع", "ر", "8"});
        mapsLower.put('9', new String[]{"ص", "غ", "ي", "ء", "9"});

/*        mapsUpper.put('1', new String[]{"1"});
        mapsUpper.put('2', new String[]{"A", "B", "C", "Ch", "2"});
        mapsUpper.put('3', new String[]{"D", "E", "F", "3"});
        mapsUpper.put('4', new String[]{"G", "H", "I", "4"});
        mapsUpper.put('5', new String[]{"J", "K", "L", "LL", "5"});
        mapsUpper.put('6', new String[]{"M", "N", "Ñ", "O", "6"});
        mapsUpper.put('7', new String[]{"P", "Q", "R", "S", "7"});
        mapsUpper.put('8', new String[]{"T", "U", "V", "8"});
        mapsUpper.put('9', new String[]{"W", "X", "Y", "Z", "9"});*/

    }

    public static String[] getLower(char c) {
        return mapsLower.get(c);
    }

  /*  public static String[] getUpper(char c) {
        return mapsUpper.get(c);
    }*/

}
