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
        mapsLower.put('2', new char[]{'a', 'b', 'c', 'ã', 'á', 'â', 'à', 'c', 'ç'});
        mapsLower.put('3', new char[]{'d', 'e', 'f', 'é', 'ê'});
        mapsLower.put('4', new char[]{'g', 'h', 'i', 'í'});
        mapsLower.put('5', new char[]{'j', 'k', 'l'});
        mapsLower.put('6', new char[]{'m', 'n', 'o', 'õ', 'ó', 'ô'});
        mapsLower.put('7', new char[]{'p', 'q', 'r', 's'});
        mapsLower.put('8', new char[]{'t', 'u', 'v', 'ú', 'ü'});
        mapsLower.put('9', new char[]{'w', 'x', 'y', 'z'});

        mapsUpper.put('2', new char[]{'A', 'B', 'C', 'Ã', 'Á', 'Â', 'À', 'C', 'Ç'});
        mapsUpper.put('3', new char[]{'D', 'E', 'F', 'É', 'Ê'});
        mapsUpper.put('4', new char[]{'G', 'H', 'I', 'Í'});
        mapsUpper.put('5', new char[]{'J', 'K', 'L'});
        mapsUpper.put('6', new char[]{'M', 'N', 'O', 'Õ', 'Ó', 'Ô'});
        mapsUpper.put('7', new char[]{'P', 'Q', 'R', 'S'});
        mapsUpper.put('8', new char[]{'T', 'U', 'V', 'Ú', 'Ü'});
        mapsUpper.put('9', new char[]{'W', 'X', 'Y', 'Z'});
    }

    public static char[] getLower(char c) {
        return mapsLower.get(c);
    }

    public static char[] getUpper(char c) {
        return mapsUpper.get(c);
    }
}
