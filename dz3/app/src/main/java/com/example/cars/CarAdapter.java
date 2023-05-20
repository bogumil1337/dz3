package com.example.cars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Car> cars;

    public CarAdapter(Context context, List<Car> cars) {
        this.inflater = LayoutInflater.from(context);
        this.cars = cars;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarAdapter.ViewHolder holder, int position) {
    Car car = cars.get(position);
    holder.carView.setImageResource(car.getCarResource());
    holder.nameView.setText(car.getName());
    holder.carDescriptionView.setText(car.getCarDescription());
    holder.dateView.setText(car.getDate());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView carView;
        final TextView nameView, carDescriptionView, dateView;

    ViewHolder(View view) {
            super(view);
            carView = view.findViewById(R.id.carResource);
            nameView = view.findViewById(R.id.name);
            carDescriptionView = view.findViewById(R.id.carDescription);
            dateView = view.findViewById(R.id.date);
        }
    }
}
