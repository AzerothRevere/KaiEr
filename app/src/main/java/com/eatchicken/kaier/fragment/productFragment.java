package com.eatchicken.kaier.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.eatchicken.kaier.R;
import com.eatchicken.kaier.adapter.PriceListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductFragment extends Fragment {
    private TextView title;
    private Spinner selectProduct;
    private TextView setAmount;
    private ListView priceListView;
    private TextView emptyText;
    private PriceListAdapter priceListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_product, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
    }

    private void init(View view) {
        title = view.findViewById(R.id.title);
        selectProduct = view.findViewById(R.id.select_product_spinner);
        setAmount = view.findViewById(R.id.set_amount_text);
        priceListView = view.findViewById(R.id.price_list_view);
        emptyText = view.findViewById(R.id.empty_text_view);
        title.setText(R.string.product);
        List<String> priceList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            priceList.add("钻代："  + "60/包" + "180/箱");
        }
        priceListAdapter = new PriceListAdapter(getContext(), priceList);
        priceListView.setEmptyView(emptyText);
        priceListView.setAdapter(priceListAdapter);
    }
}