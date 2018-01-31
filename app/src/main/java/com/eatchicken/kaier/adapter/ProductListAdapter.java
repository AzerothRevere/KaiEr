package com.eatchicken.kaier.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.eatchicken.kaier.R;

import java.util.List;

public class ProductListAdapter extends BaseAdapter {
    private List<String> productList;
    private Context context;

    public ProductListAdapter(Context context, List<String> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size() > 0 ? productList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (convertView == null) {
            View view = LayoutInflater.from(context).inflate(R.layout.adapter_product_list, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
            convertView = view;
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.product.setText(productList.get(position));
        viewHolder.line.setVisibility(isBottomLine(position) ? View.GONE : View.VISIBLE);
        return convertView;
    }

    private boolean isBottomLine(int position) {
        return position == productList.size() - 1;
    }

    private static class ViewHolder {
        TextView product;
        View line;

        ViewHolder(View view) {
            product = view.findViewById(R.id.product_text);
            line = view.findViewById(R.id.line);
        }
    }
}