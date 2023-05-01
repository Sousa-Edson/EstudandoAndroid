package com.edson.recyclerviewcomjava;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private JogoAdapter jogoAdapter;
    private ArrayList<Jogo> itens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        itens = new ArrayList<Jogo>();
        itens.add(new Jogo("Halo","Xbox"));
        itens.add(new Jogo("God of war","Play Stations"));
        itens.add(new Jogo("Pokemon","Nintendo"));
        jogoAdapter = new JogoAdapter(MainActivity.this,itens);
        System.out.println("LOG "+itens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(jogoAdapter);
    }
}