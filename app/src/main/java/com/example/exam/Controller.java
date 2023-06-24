package com.example.exam;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Controller extends RecyclerView.Adapter<Controller.ToursView> {

    Context context;
    List<Model> dessert;

    public Controller(Context context, List<Model> dessert) {
        this.context = context;
        this.dessert = dessert;
    }

    @NonNull
    @Override
    public ToursView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View tourItems = LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false);
        return new Controller.ToursView(tourItems);
    }

    @Override
    public void onBindViewHolder(@NonNull ToursView holder, int position) {
        int imageId = context.getResources().getIdentifier(dessert.get(position).getImage(), "drawable", context.getPackageName());

        holder.tourImage.setImageResource(imageId);
        holder.tourTitle.setText(dessert.get(position).getTitle());
        holder.tourPrice.setText(dessert.get(position).getPrice());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Page.class);

                intent.putExtra("tourImage", imageId);
                intent.putExtra("tourTitle", dessert.get(holder.getAdapterPosition()).getTitle());
                intent.putExtra("tourPrice", dessert.get(holder.getAdapterPosition()).getPrice());
                intent.putExtra("tourDescription", dessert.get(holder.getAdapterPosition()).getTourDescription());
                intent.putExtra("id", dessert.get(holder.getAdapterPosition()).getId());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return dessert.size();
    }

    public static final class ToursView extends RecyclerView.ViewHolder{

        ImageView tourImage;
        TextView tourTitle;
        TextView tourPrice;


        public ToursView(@NonNull View itemView) {
            super(itemView);

            tourImage = itemView.findViewById(R.id.ImageView);
            tourTitle = itemView.findViewById(R.id.TourTitle);
            tourPrice = itemView.findViewById(R.id.tourPrice);

        }
    }
}