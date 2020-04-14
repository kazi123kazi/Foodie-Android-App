package org.example.foodie;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.CustomViewHolder> {
    private Context context;
    private ArrayList<Restaurant> items;
    //  private ArrayList<NEWS> subjects;

    public RestaurantAdapter(Context context) {
        this.context = context;
        // this.items = items;
    }



    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.restaurant_view, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.restaurantName.setText(items.get(position).getName());
        holder.description.setText(items.get(position).getDescription());
        //holder.rating.setText((int) items.get(position).getRating());
      //  holder.eta.setText(items.get(position).getEta());
        Glide.with(context).asBitmap().load(items.get(position).getImageUrl())
                .into(holder.itemImage);
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView restaurantName;
        private TextView eta,rating,description;
        public CustomViewHolder(View view) {
            super(view);
            itemImage = view.findViewById(R.id.item_image);
            restaurantName = view.findViewById(R.id.restaurantName);
            rating=view.findViewById(R.id.rating);
            eta=view.findViewById(R.id.eta);
            description=view.findViewById(R.id.description);

        }
    }
    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.items = restaurants;
        notifyDataSetChanged();
    }
}