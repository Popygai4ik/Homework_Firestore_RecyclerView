package com.example.homework_firestore_recyclerview.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework_firestore_recyclerview.model.Plants;
import com.example.homework_firestore_recyclerview.domain.PlantsAdapter;
import com.example.homework_firestore_recyclerview.databinding.ActivityMainBinding;
import com.example.homework_firestore_recyclerview.domain.plants_generate;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater(), null, false);
        setContentView(binding.getRoot());

        plants_generate generator = new plants_generate();
        generator.startListeningForPlantsUpdates(new plants_generate.OnPlantsUpdatedListener() {
            @Override
            public void onPlantsUpdated(List<Plants> plants) {
        PlantsAdapter adapter = new PlantsAdapter();
        binding.recycler.setAdapter(adapter);
        adapter.setItems(plants);
            }

            @Override
            public void onFailure(Exception e) {
                e.printStackTrace();
            }
        });




    }
}