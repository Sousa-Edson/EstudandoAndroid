package com.edson.switchcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private Button botao;
    private Switch seletor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto= findViewById(R.id.textView);
        botao= findViewById(R.id.button);
        seletor= findViewById(R.id.switch1);

        seletor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                texto.setText(converterParaTexto(b));
            }
        });
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,converterParaTexto(seletor.isChecked()),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String converterParaTexto(boolean b) {
        String textoExibir;
        if(b){
            textoExibir="Ligado";
        }else{
            textoExibir="Desligado";
        }
        return textoExibir;
    }
}