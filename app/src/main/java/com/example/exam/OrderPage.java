package com.example.exam;

import android.annotation.SuppressLint;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        ListView order = findViewById(R.id.order_list);

        List<String> orderTitle = new ArrayList<>();

        for(Model m : MainActivity.fullList){
            if(Order.items.contains(m.getId()))
            orderTitle.add(m.getTitle());
        }


        order.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, orderTitle));

    }

}