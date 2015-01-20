package br.com.halyson.materialdesign.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferencesEditor {
    private static SharedPreferences mSingletonPreferences;

    private static SharedPreferences getSharedPreferences(Context context) {
        if (mSingletonPreferences == null) {
            synchronized (PreferencesEditor.class) {
                if (mSingletonPreferences == null) {
                    mSingletonPreferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
                }
            }
        }
        return mSingletonPreferences;
    }

    public static void shutdown() {
        mSingletonPreferences = null;
    }

    public static void clearPreferences(Context context) {
        Editor editor = getSharedPreferences(context).edit();
        editor.clear();
        editor.apply();
        shutdown();
    }

    public static boolean getBooleanPreference(Context context, int resId, boolean defaultValue) {
        return getSharedPreferences(context).getBoolean(context.getString(resId), defaultValue);
    }

    public static boolean getBooleanPreference(Context context, String prefKey, boolean defaultValue) {
        return getSharedPreferences(context).getBoolean(prefKey, defaultValue);
    }

    public static int getIntPreference(Context context, int resId, int defaultValue) {
        return getSharedPreferences(context).getInt(context.getString(resId), defaultValue);
    }

    public static int getIntPreference(Context context, String prefKey, int defaultValue) {
        return getSharedPreferences(context).getInt(prefKey, defaultValue);
    }

    public static String getStringPreference(Context context, int resId, String defaultValue) {
        return getSharedPreferences(context).getString(context.getString(resId), defaultValue);
    }

    public static String getStringPreference(Context context, String prefKey, String defaultValue) {
        return getSharedPreferences(context).getString(prefKey, defaultValue);
    }

    public static void savePreference(Context context, int resId, int newValue) {
        Editor editor = getSharedPreferences(context).edit();
        editor.putInt(context.getString(resId), newValue);
        editor.apply();
    }

    public static void savePreference(Context context, String prefKey, int newValue) {
        Editor editor = getSharedPreferences(context).edit();
        editor.putInt(prefKey, newValue);
        editor.apply();
    }

    public static void savePreference(Context context, int resId, String newValue) {
        Editor editor = getSharedPreferences(context).edit();
        editor.putString(context.getString(resId), newValue);
        editor.apply();
    }

    public static void savePreference(Context context, String prefKey, String newValue) {
        Editor editor = getSharedPreferences(context).edit();
        editor.putString(prefKey, newValue);
        editor.apply();
    }

    public static void savePreference(Context context, int resId, Boolean newValue) {
        Editor editor = getSharedPreferences(context).edit();
        editor.putBoolean(context.getString(resId), newValue);
        editor.apply();
    }

    public static void savePreference(Context context, String prefKey, Boolean newValue) {
        Editor editor = getSharedPreferences(context).edit();
        editor.putBoolean(prefKey, newValue);
        editor.apply();
    }

    public static void removePreference(Context context, int resId) {
        Editor editor = getSharedPreferences(context).edit();
        editor.remove(context.getString(resId));
        editor.apply();
    }

    public static void removePreference(Context context, String prefKey) {
        Editor editor = getSharedPreferences(context).edit();
        editor.remove(prefKey);
        editor.apply();
    }
}
