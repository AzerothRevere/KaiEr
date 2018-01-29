package com.eatchicken.kaier.activity;

import android.os.Bundle;

import com.eatchicken.kaier.R;
import com.eatchicken.kaier.fragment.CalculationFragment;
import com.eatchicken.kaier.widgets.HomeTab;

public class HomeActivity extends BaseActivity {
    private HomeTab homeTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        setDefaultFragment();
    }

    private void initView() {
        homeTab = findViewById(R.id.home_tab);
    }

    private void setDefaultFragment() {
        this.addContent(new CalculationFragment());
    }
}
