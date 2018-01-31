package com.eatchicken.kaier.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.eatchicken.kaier.R;
import com.eatchicken.kaier.adapter.ProductListAdapter;

import java.util.ArrayList;
import java.util.List;

public class WareHouseFragment extends Fragment {
    private TextView title;
    private ListView productListView;
    private TextView emptyView;
    private TextView amountOfMoney;
    private ProductListAdapter productListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_warehouse, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        amountOfMoney = view.findViewById(R.id.amount_of_money);
        productListView = view.findViewById(R.id.product_list);
        title = view.findViewById(R.id.title);
        emptyView = view.findViewById(R.id.empty_view);

        title.setText(getString(R.string.ware_house));

        //TODO for UI，I created test Data. we should use sqlLite's data in the future.
        amountOfMoney.setText(getString(R.string.amount_of_money, 98776));
        List<String> product = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            product.add("丝柔系列：拉拉裤" + i);
        }
        productListAdapter = new ProductListAdapter(getActivity(), product);
        productListView.setEmptyView(emptyView);
        productListView.setAdapter(productListAdapter);
    }
}
