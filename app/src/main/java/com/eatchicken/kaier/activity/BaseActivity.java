package com.eatchicken.kaier.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import com.eatchicken.kaier.R;
import com.eatchicken.kaier.util.Tools;


public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void addContent(Fragment fragment) {
        Tools.hideKeyBord(this);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, fragment);
        fragmentTransaction.commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }

    public void replaceContent(Fragment fragment) {
        Tools.hideKeyBord(this);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
    }
}
