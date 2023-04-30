package com.edson.listaprodutos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.edson.listaprodutos.adapter.AdapterProduto;
import com.edson.listaprodutos.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView_produtos = findViewById(R.id.recyclerView_produtos);
        recyclerView_produtos.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView_produtos.setHasFixedSize(true);
//configurar o adapter
        List<Produto> listaProdutos = new ArrayList<>();

        AdapterProduto adapterProduto = new AdapterProduto(this,listaProdutos);
        recyclerView_produtos.setAdapter(adapterProduto);

        Produto produto1 = new Produto(
                R.drawable.ssd,
                "SSD SanDisk Plus 480GB",
                "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias " +
                        "de armazenamento de estado sólido é a marca de confiança dos profissionais " +
                        "da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
                "R$ 450,00"
        );
        listaProdutos.add(produto1);
        Produto produto2 = new Produto(
                R.drawable.processador,
                "Intel Core i5 10400F",
                "Os novos processadores da 10ª geração oferecem atualizações de desempenho " +
                        "incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.",
                "R$ 1050,00"
        );
        listaProdutos.add(produto2);

        Produto produto3 = new Produto(
                R.drawable.memoria,
                "Memória Ram Corsair  8GB DDR4 ",
                "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
                "R$ 369,00"
        );
        listaProdutos.add(produto3);

        Produto produto4 = new Produto(
                R.drawable.placadevideo,
                "GeForce RTX 3090 24GB",
                "COs blocos de construção para a GPU mais rápida e eficiente do mundo, o" +
                        " novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",
                "R$ 18.499,00"
        );
        listaProdutos.add(produto4);


        Produto produto5 = new Produto(
                R.drawable.teclado,
                "Teclado Mecânico Gamer T-Dagger Corvette",
                "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY " +
                        "Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
                "R$ 229,00"
        );
        listaProdutos.add(produto5);

        Produto produto6= new Produto(
                R.drawable.gabinete,
                "Gabinete Gamer",
                "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro " +
                        "temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.",
                "R$ 799,00"
        );
        listaProdutos.add(produto6);

        Produto produto11 = new Produto(
                R.drawable.ssd,
                "SSD SanDisk Plus 480GB",
                "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias " +
                        "de armazenamento de estado sólido é a marca de confiança dos profissionais " +
                        "da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
                "R$ 450,00"
        );
        listaProdutos.add(produto11);
        Produto produto12 = new Produto(
                R.drawable.processador,
                "Intel Core i5 10400F",
                "Os novos processadores da 10ª geração oferecem atualizações de desempenho " +
                        "incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.",
                "R$ 1050,00"
        );
        listaProdutos.add(produto12);

        Produto produto13 = new Produto(
                R.drawable.memoria,
                "Memória Ram Corsair  8GB DDR4 ",
                "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
                "R$ 369,00"
        );
        listaProdutos.add(produto13);

        Produto produto14 = new Produto(
                R.drawable.placadevideo,
                "GeForce RTX 3090 24GB",
                "COs blocos de construção para a GPU mais rápida e eficiente do mundo, o" +
                        " novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",
                "R$ 18.499,00"
        );
        listaProdutos.add(produto14);


        Produto produto15 = new Produto(
                R.drawable.teclado,
                "Teclado Mecânico Gamer T-Dagger Corvette",
                "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY " +
                        "Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
                "R$ 229,00"
        );
        listaProdutos.add(produto15);

        Produto produto16= new Produto(
                R.drawable.gabinete,
                "Gabinete Gamer",
                "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro " +
                        "temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.",
                "R$ 799,00"
        );
        listaProdutos.add(produto16);

    }
}