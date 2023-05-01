package com.edson.recyclerviewcomjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JogoAdapter extends RecyclerView.Adapter<JogoViewHolder> {

    private Context context;
    private ArrayList<Jogo> itens;

    public JogoAdapter(Context context, ArrayList<Jogo> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public JogoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.jogo_linha,parent,false);
        JogoViewHolder viewHolder = new JogoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull JogoViewHolder jogoViewHolder, int position) {
        Jogo jogo = itens.get(position);
        jogoViewHolder.nome.setText(jogo.getNome());
        jogoViewHolder.plataforma.setText(jogo.getPlataforma());
        jogoViewHolder.nome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"clicou em Jogo",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
