package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycle;
    private ArrayList<Model> Models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = findViewById(R.id.rv);
        recycle.setHasFixedSize(true);
        Models.addAll(Data.getlistData());
        showRecycleList();
    }

    private void showRecycleList(){
        recycle.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(this);
        adapter.setModels(Models);
        recycle.setAdapter(adapter);
    }

}