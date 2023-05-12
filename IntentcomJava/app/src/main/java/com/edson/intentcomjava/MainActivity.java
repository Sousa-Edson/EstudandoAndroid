package com.edson.intentcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText texto;
    private Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.orange)));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=findViewById(R.id.editText);
        botao=findViewById(R.id.btnBotao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Tela2Activity.class);
                String textoDigitado = texto.getText().toString();
                intent.putExtra("texto",textoDigitado);
                startActivity(intent);
            }
        });
    }
}