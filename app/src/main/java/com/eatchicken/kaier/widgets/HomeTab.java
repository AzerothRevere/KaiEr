package com.eatchicken.kaier.widgets;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eatchicken.kaier.R;
import com.eatchicken.kaier.activity.BaseActivity;
import com.eatchicken.kaier.fragment.CalculationFragment;
import com.eatchicken.kaier.fragment.UserFragment;
import com.eatchicken.kaier.fragment.WareHouseFragment;
import com.eatchicken.kaier.fragment.ProductFragment;

public class HomeTab extends LinearLayout {
    private TextView calculation;
    private TextView wareHouse;
    private TextView product;
    private TextView user;
    private BaseActivity activity;

    public HomeTab(Context context) {
        this(context, null);
    }

    public HomeTab(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.view_home_tab, this);
        this.activity = (BaseActivity) context;
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
                initTabColor();
                calculation.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.calculation_on), null, null);
                calculation.setTextColor(ContextCompat.getColor(activity, R.color.dark1));
                activity.replaceContent(new CalculationFragment());
            }
        });
        wareHouse.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                initTabColor();
                wareHouse.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.ware_house_on), null, null);
                wareHouse.setTextColor(ContextCompat.getColor(activity, R.color.dark1));
                activity.replaceContent(new WareHouseFragment());
            }
        });
        product.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                initTabColor();
                product.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.product_on), null, null);
                product.setTextColor(ContextCompat.getColor(activity, R.color.dark1));
                activity.replaceContent(new ProductFragment());
            }
        });
        user.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                initTabColor();
                user.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.user_on), null, null);
                user.setTextColor(ContextCompat.getColor(activity, R.color.dark1));
                activity.replaceContent(new UserFragment());
            }
        });
    }

    private void initTabColor() {
        calculation.setTextColor(ContextCompat.getColor(activity, R.color.purple1));
        product.setTextColor(ContextCompat.getColor(activity, R.color.purple1));
        wareHouse.setTextColor(ContextCompat.getColor(activity, R.color.purple1));
        user.setTextColor(ContextCompat.getColor(activity, R.color.purple1));

        calculation.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.calculation_off), null, null);
        product.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.product_off), null, null);
        wareHouse.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.ware_house_off), null, null);
        user.setCompoundDrawablesWithIntrinsicBounds(null, ContextCompat.getDrawable(activity, R.mipmap.user_off), null, null);
    }
}
