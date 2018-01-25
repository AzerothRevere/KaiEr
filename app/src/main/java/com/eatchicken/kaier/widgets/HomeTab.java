package com.eatchicken.kaier.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eatchicken.kaier.R;

public class HomeTab extends LinearLayout {
    private TextView calculation;
    private TextView wareHouse;
    private TextView product;
    private TextView user;

    public HomeTab(Context context) {
        this(context, null);
    }

    public HomeTab(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.view_home_tab, this);
        initView(view);
        setEvent();
    }

    private void initView(View view) {
        calculation = view.findViewById(R.id.calculation);
        wareHouse = view.findViewById(R.id.ware_house);
        product = view.findViewById(R.id.product);
        user = view.findViewById(R.id.user);
    }

    private void setEvent() {
        calculation.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO go to calculation
            }
        });
        wareHouse.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO go to wareHouse
            }
        });
        product.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO go to product
            }
        });
        user.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO go to user
            }
        });
    }
}
