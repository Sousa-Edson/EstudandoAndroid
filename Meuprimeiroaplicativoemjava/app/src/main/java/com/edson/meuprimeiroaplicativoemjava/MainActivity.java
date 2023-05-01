package com.edson.meuprimeiroaplicativoemjava;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nome1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome1= findViewById(R.id.name);
        Button botao1 = findViewById(R.id.botao);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = nome1.getText().toString();
                Toast.makeText(MainActivity.this,textoDigitado,Toast.LENGTH_LONG);
                System.out.println("MSG 333: "+textoDigitado);
            }
        });
    }
}