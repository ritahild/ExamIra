package com.example.exam;

import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Intent.getIntent;

public class Page extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_page);


        ImageView pageImage = findViewById(R.id.imageView2);
        TextView tourTitle = findViewById(R.id.TourPageTitle);
        TextView tourPrice = findViewById(R.id.tourPagePrice);
        TextView tourDescription = findViewById(R.id.tourDescription);


        pageImage.setImageResource(getIntent().getIntExtra("tourImage", 0));
        tourTitle.setText(getIntent().getStringExtra("tourTitle"));
        tourPrice.setText(getIntent().getStringExtra("tourPrice"));
        tourDescription.setText(getIntent().getStringExtra("tourDescription"));


    }

    public void addToCart(View view){
        int id = getIntent().getIntExtra("id", 0);
        Order.items.add(id);
        Toast.makeText(this, "Успешно добавлено в корзину", Toast.LENGTH_LONG).show();
    }
}
