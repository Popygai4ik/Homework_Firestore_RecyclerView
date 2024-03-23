package com.example.homework_firestore_recyclerview.domain;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;
import java.util.List;

import com.example.homework_firestore_recyclerview.databinding.ItemUserBinding;
import com.example.homework_firestore_recyclerview.model.Plants;

public class PlantsAdapter extends Adapter<PlantsViewHolder> {

    private List<Plants> plants = new ArrayList<>();



    @NonNull
    @Override
    public PlantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemUserBinding binding = ItemUserBinding.inflate(inflater, parent, false);
        return new PlantsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantsViewHolder holder, int position) {
        Plants plant = plants.get(position);
        holder.bind(plant);
    }

    @Override
    public int getItemCount() {
        return plants.size();
    }

    public void setItems(List<Plants> plants) {
        int itemCount = getItemCount();
        this.plants = new ArrayList<>(plants);
        notifyItemRangeChanged(0, Math.max(itemCount, getItemCount()));
    }


}
