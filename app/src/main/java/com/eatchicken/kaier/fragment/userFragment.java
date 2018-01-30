package com.eatchicken.kaier.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eatchicken.kaier.R;

public class UserFragment extends Fragment {
    private TextView title;
    private TextView totalProfit;
    private TextView todayProfit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        todayProfit = view.findViewById(R.id.today_profit);
        totalProfit = view.findViewById(R.id.total_profit);
        title = view.findViewById(R.id.title);
        title.setText(getString(R.string.user));
    }
}