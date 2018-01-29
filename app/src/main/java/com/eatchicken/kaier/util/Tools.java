package com.eatchicken.kaier.util;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

public class Tools {
    public static void hideKeyBord(Activity context) {
        try {
            ((InputMethodManager) context
                    .getSystemService(Context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(context.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
