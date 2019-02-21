package com.example.recyclerviewcardview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;

    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);

        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerViewAdapter adpater = new RecyclerViewAdapter(clubs);

        initilizeData();
        initilizeAdapter();
    }

    private void initilizeAdapter() {

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs);
        recyclerView.setAdapter(adapter);
    }

    private void initilizeData() {
        clubs = new ArrayList<>();
        clubs.add(new Club("Loin", R.drawable.a6));
        clubs.add(new Club("Elephant", R.drawable.a7));
        clubs.add(new Club("Rat", R.drawable.a14));
        clubs.add(new Club("Cat", R.drawable.a22));

        clubs.add(new Club("Loin", R.drawable.a6));
        clubs.add(new Club("Elephant", R.drawable.a7));
        clubs.add(new Club("Rat", R.drawable.a14));
        clubs.add(new Club("Cat", R.drawable.a22));

        clubs.add(new Club("Loin", R.drawable.a6));
        clubs.add(new Club("Elephant", R.drawable.a7));
        clubs.add(new Club("Rat", R.drawable.a14));
        clubs.add(new Club("Cat", R.drawable.a22));
    }
}
     class Club {

        String name;
        int logoid;

        Club(String name , int logoid) {

            this.name = name;
            this.logoid = logoid;

        }
}

