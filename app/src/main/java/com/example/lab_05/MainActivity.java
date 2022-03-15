package com.example.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productList = new ArrayList<Product>();


        Product product01 = new Product(1,"Tasty Donut", "Spicy tasty donut family", 10.00 ,R.drawable.donut_yellow);
        Product product02 = new Product(2,"Pink Donut", "Spicy tasty donut family", 20.00 ,R.drawable.tasty_donut);
        Product product03 = new Product(3,"Floating Donut", "Spicy tasty donut family", 40.00 ,R.drawable.green_donut);
        Product product04 = new Product(4,"Tasty Donut", "Spicy tasty donut family", 50.00 ,R.drawable.donut_red);


        productList.add(product01);
        productList.add(product02);
        productList.add(product03);
        productList.add(product04);

        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(new ProductAdapter(this , R.layout.custom_listview_activity, productList));

    }
}