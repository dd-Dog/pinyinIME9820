package com.keanbin.pinyinime.constant;

import android.content.Context;

/**
 * Created by bian on 2018/7/27.
 */

public class Constants {
    public static final String INPUT_MODE = "input_mode";
    public static final String SP = "ime_sp";
    public static final String MODE_HKB = "1005";
    public static final String INPUT_MODE_BEFORE_SCREEN_OFF = "input_mode_before_screen_off";
    public static final String INPUT_MODE_BROADCAST = "com.keanbin.pinyinime.INPUT_MODE";

    /**
     * 定义输入法支持的语言
     */
    public static final int EN = 0X00000001;   //英语
    public static final int CN = 0X00000002;   //中文
    public static final int RU = 0X00000004;   //俄语
    public static final int PT = 0X00000008;   //葡萄牙语
    public static final int ES = 0X00000010;   //西班牙语
    public static int EN_RU = EN | RU;
    public static final int EN_PT_ES = EN | PT | ES;
    public static int LANGUAGE_SUPPORT = EN_PT_ES;
}
