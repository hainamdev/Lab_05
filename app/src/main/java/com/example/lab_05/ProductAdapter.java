package com.example.lab_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private  int idLayout;
    private List<Product>  productList = new ArrayList<Product>();

    public ProductAdapter(Context context, int idLayout, List<Product> productList) {
        this.context = context;
        this.idLayout = idLayout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        if (productList.size() != 0 && !productList.isEmpty()) {
            return productList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(idLayout,null);
        ImageView image = view.findViewById(R.id.ProductImage);
        TextView name = view.findViewById(R.id.ProductName);
        TextView desc = view.findViewById(R.id.ProductDesc);
        TextView price = view.findViewById(R.id.ProductPrice);

        image.setImageResource(productList.get(i).getImage());
        name.setText(productList.get(i).getName());
        desc.setText(productList.get(i).getDesc());
        price.setText(String.format("$%.02f",productList.get(i).getPrice()));

        return view;
    }
}
