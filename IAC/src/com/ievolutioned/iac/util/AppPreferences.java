package com.ievolutioned.iac.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Shared preferences class. Manages the shared preferences for the App.
 * <p/>
 * Created by Daniel on 21/04/2015.
 */
public class AppPreferences {

    /**
     * Shared preferences key
     */
    public static final String PREFERENCES_KEY = "com.ievolutioned.iac.PREFERENCES_KEY";

    private static final String KEY_ADMIN_TOKEN = "KEY_ADMIN_TOKEN";

    private static final String KEY_IAC_ID = "KEY_IAC_ID";

    private static final String KEY_ROLE = "KEY_ROLE";

    /**
     * Gets the SharedPreferences
     *
     * @param c - the context
     * @return the SharedPreferences
     */
    private static SharedPreferences getPrefs(Context c) {
        return c.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE);
    }

    /**
     * Gets the editor from SharedPreferences
     *
     * @param c - the context
     * @return the Editor
     */
    private static SharedPreferences.Editor getEditor(Context c) {
        return getPrefs(c).edit();
    }

    /**
     * Sets the admin token
     *
     * @param c     - the context
     * @param value - the value
     * @throws Exception
     */
    public static void setAdminToken(final Context c, final String value) throws Exception {
        getEditor(c).putString(KEY_ADMIN_TOKEN, value).commit();
    }

    /**
     * Gets the admin token
     *
     * @param c - the context
     * @return the admin token
     */
    public static String getAdminToken(Context c) {
        return getPrefs(c).getString(KEY_ADMIN_TOKEN, null);
    }

    public static void setIacId(Context c, String value) {
        getEditor(c).putString(KEY_IAC_ID, value).commit();
    }

    public static String getIacId(Context c) {
        return getPrefs(c).getString(KEY_IAC_ID, null);
    }

    public static void setRole(Context c, String value) {
        getEditor(c).putString(KEY_ROLE, value).commit();
    }

    public static String getRole(Context c) {
        return getPrefs(c).getString(KEY_ROLE, null);
    }
}
