package com.ievolutioned.iac.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.ievolutioned.iac.entity.UserRole;

import java.util.Set;

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

    private static final String KEY_PROFESSIONAL_GROUP = "KEY_PROFESSIONAL_GROUP";

    private static final String KEY_DINING_ATTENDEES = "KEY_DINING_ATTENDEES";

    private static final String KEY_DINING_PLANT = "KEY_DINING_PLANT";

    private static final String KEY_DINING_BARCODE_TEMPORAL = "KEY_DINING_BARCODE_TEMPORAL";

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

    /**
     * Sets the IAC ID
     *
     * @param c     - the context
     * @param value - the IAC ID
     */
    public static void setIacId(Context c, String value) {
        getEditor(c).putString(KEY_IAC_ID, value).commit();
    }

    /**
     * Gets the IAC ID
     *
     * @param c - the context
     * @return the IAC ID, null if it not exist
     */
    public static String getIacId(Context c) {
        return getPrefs(c).getString(KEY_IAC_ID, null);
    }

    /**
     * Sets the role of user
     *
     * @param c     - the context
     * @param value - user role
     * @see UserRole
     */
    public static void setRole(Context c, String value) {
        getEditor(c).putString(KEY_ROLE, value).commit();
    }

    /**
     * Gets the role, UserRole.USER by default
     *
     * @param c - the context
     * @return the user role, UserRole.USER by default
     */
    public static String getRole(Context c) {
        return getPrefs(c).getString(KEY_ROLE, UserRole.USER);
    }

    /**
     * Sets the professional group preference
     *
     * @param c     - the context
     * @param value - the value
     */
    public static void setProfessionalGroup(Context c, String value) {
        getEditor(c).putString(KEY_PROFESSIONAL_GROUP, value).commit();
    }

    /**
     * Gets the professional group
     *
     * @param c - the context
     * @return the saved value or null
     */
    public static String getProfessionalGroup(Context c) {
        return getPrefs(c).getString(KEY_PROFESSIONAL_GROUP, null);
    }

    /**
     * Sets the dinning attendees employees
     *
     * @param c         - the context
     * @param attendees - a set of attendees
     */
    public static void setDiningAttendees(Context c, Set<String> attendees) {
        getEditor(c).putStringSet(KEY_DINING_ATTENDEES, attendees).commit();
    }

    public static Set<String> getDinningAttendees(Context c) {
        return getPrefs(c).getStringSet(KEY_DINING_ATTENDEES, null);
    }

    public static void setDiningPlant(Context c, String value) {
        getEditor(c).putString(KEY_DINING_PLANT, value).commit();
    }

    public static String getDiningPlant(Context c) {
        return getPrefs(c).getString(KEY_DINING_PLANT, null);
    }

    public static void setDiningBarcodeTemporal(Context c, int value) {
        getEditor(c).putInt(KEY_DINING_BARCODE_TEMPORAL, value).commit();
    }

    public static int getDiningBarcodeTemporal(Context c) {
        return getPrefs(c).getInt(KEY_DINING_BARCODE_TEMPORAL, 0);
    }
}
