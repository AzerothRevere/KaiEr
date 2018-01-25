package com.eatchicken.kaier.activity;

import android.app.Activity;
import android.os.Bundle;

import com.eatchicken.kaier.R;
import com.eatchicken.kaier.widgets.HomeTab;

public class HomeActivity extends Activity {
    private HomeTab homeTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        setEvent();
    }

    private void setEvent() {

    }

    private void initView() {
        homeTab = findViewById(R.id.home_tab);
    }
}
