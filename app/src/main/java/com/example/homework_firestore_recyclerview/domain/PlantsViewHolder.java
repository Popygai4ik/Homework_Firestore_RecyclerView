package com.example.homework_firestore_recyclerview.domain;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.example.homework_firestore_recyclerview.R;
import com.example.homework_firestore_recyclerview.databinding.ItemUserBinding;
import com.bumptech.glide.Glide;
import com.example.homework_firestore_recyclerview.model.Plants;


public class PlantsViewHolder extends ViewHolder {

    private ItemUserBinding binding;

    public PlantsViewHolder(ItemUserBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Plants item) {
        // Set text data
        binding.name.setText(item.getOpisanie());
        binding.opisanie.setText(item.getName());
        // Load image
        Glide.with(itemView)
                .load(item.getResinok())
                .placeholder(R.mipmap.ic_launcher)
                .into(binding.resinok);
//        // Set Listener
//        binding.getRoot().setOnClickListener(v -> userItemClickListener.onItemClick(item));
    }
}
