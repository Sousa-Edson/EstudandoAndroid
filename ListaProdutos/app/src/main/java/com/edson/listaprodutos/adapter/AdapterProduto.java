package com.edson.listaprodutos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.edson.listaprodutos.MainActivity;
import com.edson.listaprodutos.R;
import com.edson.listaprodutos.model.Produto;

import java.util.List;

public class AdapterProduto extends RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder> {
    private List<Produto> produtos;

    public AdapterProduto(MainActivity mainActivity, List<Produto> produtos) {
        this.produtos = produtos;
    }
    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.hardware_item,parent,false);
        return new ProdutoViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position) {
        holder.foto.setImageResource(produtos.get(position).getFoto());
        holder.nome.setText(produtos.get(position).getNome());
        holder.descricao.setText(produtos.get(position).getDescricao());
        holder.preco.setText(produtos.get(position).getPreco());

    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public static class ProdutoViewHolder extends RecyclerView.ViewHolder {
        ImageView foto = itemView.findViewById(R.id.fotoProduto);
        TextView nome = itemView.findViewById(R.id.nomeProduto);
        TextView descricao = itemView.findViewById(R.id.descricaoProduto);
        TextView preco = itemView.findViewById(R.id.precoProduto);
        public ProdutoViewHolder(View itemView) {
            super(itemView);

        }
    }

}
