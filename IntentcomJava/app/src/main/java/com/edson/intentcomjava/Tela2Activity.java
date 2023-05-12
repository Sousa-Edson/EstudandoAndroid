package com.edson.intentcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {
private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        texto= findViewById(R.id.textView);
        String textoDigitado = getIntent().getExtras().getString("texto");
        texto.setText(textoDigitado);
    }
}