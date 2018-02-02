package com.eatchicken.kaier.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.eatchicken.kaier.R;

import java.util.List;


public class ProductAdapter extends BaseAdapter {
    private List<String> priceList;
    private Context context;

    public ProductAdapter(Context context, List<String> priceList) {
        this.context = context;
        this.priceList = priceList;
    }

    @Override
    public int getCount() {
        return priceList.size() > 0 ? priceList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return priceList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.adapter_product, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.agentLevelText = view.findViewById(R.id.agent_level_text);
            viewHolder.bagPriceText = view.findViewById(R.id.bag_price_text);
            viewHolder.boxPriceText = view.findViewById(R.id.box_price_text);
            view.setTag(view);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.agentLevelText.setText(priceList.get(position));
        viewHolder.bagPriceText.setText(priceList.get(position));
        viewHolder.boxPriceText.setText(priceList.get(position));
        return view;
    }

    private class ViewHolder {
        TextView agentLevelText;
        TextView bagPriceText;
        TextView boxPriceText;
    }

}
