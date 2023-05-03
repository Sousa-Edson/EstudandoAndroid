package com.edson.listviewcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Jogo> itens;
    private JogoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lista);
        itens = new ArrayList<Jogo>();
        itens.add(new Jogo("Halo","XBOX"));
        itens.add(new Jogo("God of war","PLAYSTATION"));
        itens.add(new Jogo("Pokemon","NINTENDO "));
        adapter = new JogoAdapter(MainActivity.this,itens);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,itens.get(i).getNome() ,Toast.LENGTH_SHORT).show();;
            }
        });
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"LONG  "+itens.get(i).getNome() ,Toast.LENGTH_SHORT).show();;

                return false;
            }
        });

    }
}