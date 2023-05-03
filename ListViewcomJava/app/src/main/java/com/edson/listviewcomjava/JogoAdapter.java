package com.edson.listviewcomjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class JogoAdapter extends BaseAdapter {
    private Context context;
private ArrayList<Jogo> itens;

    public JogoAdapter(Context context, ArrayList<Jogo> itens) {
        this.context = context;
        this.itens = itens;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position ) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View inflater = LayoutInflater.from(context).inflate(R.layout.jogo_linha,viewGroup,false);
        TextView txtNome = inflater.findViewById(R.id.nome);
        TextView txtPlataforma = inflater.findViewById(R.id.plataforma);

        txtNome.setText(itens.get(position).getNome());
        txtPlataforma.setText(itens.get(position).getPlataforma());

        return inflater;
    }
}
