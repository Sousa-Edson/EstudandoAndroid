package com.edson.ratingbarcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView texto;
private Button botao;
private RatingBar estrelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.textView);
        botao = findViewById(R.id.button);
        estrelas = findViewById(R.id.ratingBar);

        estrelas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                texto.setText(""+v);
            }
        });
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String estrelasSelecionadas = ""+estrelas.getRating();
                Toast.makeText(MainActivity.this,estrelasSelecionadas,Toast.LENGTH_LONG).show();
            }
        });

    }
}