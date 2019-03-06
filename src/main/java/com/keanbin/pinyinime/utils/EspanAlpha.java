package com.keanbin.pinyinime.utils;

import java.util.HashMap;

/**
 * Created by bian on 2018/4/21.
 */

public class EspanAlpha {
    public static HashMap<Character, String[]> mapsLower = new HashMap<>();
    public static HashMap<Character, String[]> mapsUpper = new HashMap<>();

    static {
        mapsLower.put('1', new String[]{"1"});
        mapsLower.put('2', new String[]{"a", "b", "c", "ch", "2"});
        mapsLower.put('3', new String[]{"d", "e", "f", "3"});
        mapsLower.put('4', new String[]{"g", "h", "i", "4"});
        mapsLower.put('5', new String[]{"j", "k", "l", "ll", "5"});
        mapsLower.put('6', new String[]{"m", "n", "ñ", "o", "6"});
        mapsLower.put('7', new String[]{"p", "q", "r", "s", "7"});
        mapsLower.put('8', new String[]{"t", "u", "v", "8"});
        mapsLower.put('9', new String[]{"w", "x", "y", "z", "9"});

        mapsUpper.put('1', new String[]{"1"});
        mapsUpper.put('2', new String[]{"A", "B", "C", "Ch", "2"});
        mapsUpper.put('3', new String[]{"D", "E", "F", "3"});
        mapsUpper.put('4', new String[]{"G", "H", "I", "4"});
        mapsUpper.put('5', new String[]{"J", "K", "L", "LL", "5"});
        mapsUpper.put('6', new String[]{"M", "N", "Ñ", "O", "6"});
        mapsUpper.put('7', new String[]{"P", "Q", "R", "S", "7"});
        mapsUpper.put('8', new String[]{"T", "U", "V", "8"});
        mapsUpper.put('9', new String[]{"W", "X", "Y", "Z", "9"});
    }

    public static String[] getLower(char c) {
        return mapsLower.get(c);
    }

    public static String[] getUpper(char c) {
        return mapsUpper.get(c);
    }
}
