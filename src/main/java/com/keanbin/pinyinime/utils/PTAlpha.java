package com.keanbin.pinyinime.utils;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bian on 2018/4/21.
 */

public class PTAlpha {
    public static HashMap<Character, char[]> mapsLower = new HashMap<>();
    public static HashMap<Character, char[]> mapsUpper = new HashMap<>();

    static {
        mapsLower.put('1', new char[]{'1'});
        mapsLower.put('2', new char[]{'a', 'b', 'c', 'ã', 'á', 'â', 'à', 'c', 'ç', '2'});
        mapsLower.put('3', new char[]{'d', 'e', 'f', 'é', 'ê', '3'});
        mapsLower.put('4', new char[]{'g', 'h', 'i', 'í', '4'});
        mapsLower.put('5', new char[]{'j', 'k', 'l', '5'});
        mapsLower.put('6', new char[]{'m', 'n', 'o', 'õ', 'ó', 'ô', '6'});
        mapsLower.put('7', new char[]{'p', 'q', 'r', 's', '7'});
        mapsLower.put('8', new char[]{'t', 'u', 'v', 'ú', 'ü', '8'});
        mapsLower.put('9', new char[]{'w', 'x', 'y', 'z', '9'});

        mapsUpper.put('1', new char[]{'1'});
        mapsUpper.put('2', new char[]{'A', 'B', 'C', 'Ã', 'Á', 'Â', 'À', 'C', 'Ç', '2'});
        mapsUpper.put('3', new char[]{'D', 'E', 'F', 'É', 'Ê', '3'});
        mapsUpper.put('4', new char[]{'G', 'H', 'I', 'Í', '4'});
        mapsUpper.put('5', new char[]{'J', 'K', 'L', '5'});
        mapsUpper.put('6', new char[]{'M', 'N', 'O', 'Õ', 'Ó', 'Ô', '6'});
        mapsUpper.put('7', new char[]{'P', 'Q', 'R', 'S', '7'});
        mapsUpper.put('8', new char[]{'T', 'U', 'V', 'Ú', 'Ü', '8'});
        mapsUpper.put('9', new char[]{'W', 'X', 'Y', 'Z', '9'});
    }

    public static char[] getLower(char c) {
        return mapsLower.get(c);
    }

    public static char[] getUpper(char c) {
        return mapsUpper.get(c);
    }
}
