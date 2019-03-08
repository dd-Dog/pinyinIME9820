package com.keanbin.pinyinime.utils;

import java.util.HashMap;

/**
 * Created by bian on 2019/3/8.
 */

public class RussiaAlpha {
    public static HashMap<Character, String[]> mapsLower = new HashMap<>();
//    public static HashMap<Character, String[]> mapsUpper = new HashMap<>();

    static {
        mapsLower.put('1', new String[]{"ё", "Ё", "ж", "Ж", "э", "Э", "ю", "Ю", "х", "Х", "ъ", "Ъ", "б", "Б", "1"});
        mapsLower.put('2', new String[]{"ф", "Ф", "и", "И", "с", "С", "2"});
        mapsLower.put('3', new String[]{"в", "В", "у", "У", "а", "А", "3"});
        mapsLower.put('4', new String[]{"п", "П", "р", "Р", "ш", "Ш", "4"});
        mapsLower.put('5', new String[]{"о", "О", "л", "Л", "д", "Д", "5"});
        mapsLower.put('6', new String[]{"ь", "Ь", "т", "Т", "щ", "Щ", "6"});
        mapsLower.put('7', new String[]{"з", "З", "й", "Й", "к", "К", "ы", "Ы", "7"});
        mapsLower.put('8', new String[]{"е", "Е", "г", "Г", "м", "М", "8"});
        mapsLower.put('9', new String[]{"ц", "Ц", "ч", "Ч", "н", "Н", "я", "Я", "9"});

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
