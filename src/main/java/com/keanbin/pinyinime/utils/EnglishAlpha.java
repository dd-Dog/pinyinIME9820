package com.keanbin.pinyinime.utils;

import java.util.HashMap;

/**
 * Created by bian on 2018/4/21.
 */

public class EnglishAlpha {
    public static HashMap<Character, String[]> mapsLower = new HashMap<>();
    public static HashMap<Character, String[]> mapsUpper = new HashMap<>();

    static {
        mapsLower.put('2', new String[]{"a", "b", "c"});
        mapsLower.put('3', new String[]{"d", "e", "f"});
        mapsLower.put('4', new String[]{"g", "h", "i"});
        mapsLower.put('5', new String[]{"j", "k", "l"});
        mapsLower.put('6', new String[]{"m", "n", "o"});
        mapsLower.put('7', new String[]{"p", "q", "r", "s"});
        mapsLower.put('8', new String[]{"t", "u", "v"});
        mapsLower.put('9', new String[]{"w", "x", "y", "z"});

        mapsUpper.put('2', new String[]{"A", "B", "C"});
        mapsUpper.put('3', new String[]{"D", "E", "F"});
        mapsUpper.put('4', new String[]{"G", "H", "I"});
        mapsUpper.put('5', new String[]{"J", "K", "L"});
        mapsUpper.put('6', new String[]{"M", "N", "O"});
        mapsUpper.put('7', new String[]{"P", "Q", "R", "S"});
        mapsUpper.put('8', new String[]{"T", "U", "V"});
        mapsUpper.put('9', new String[]{"W", "X", "Y", "Z"});
    }

    public static String[] getLower(char c) {
        return mapsLower.get(c);
    }

    public static String[] getUpper(char c) {
        return mapsUpper.get(c);
    }
}
