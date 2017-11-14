package com.keanbin.pinyinime.utils;

import android.util.Log;

public class LogUtil {

	private static boolean DEBUG = true;

	public static void log(String tag, String msg) {
		log(tag, msg, null);
	}

	public static void log(String tag, String msg, Throwable e) {
		if (DEBUG) {
			if (e != null) {
				Log.e(tag, msg, e);
			} else {
				Log.i(tag, msg);
			}
		}
	}
}
