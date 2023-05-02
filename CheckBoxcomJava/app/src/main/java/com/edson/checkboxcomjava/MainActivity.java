package com.edson.checkboxcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private Button botao;
    private CheckBox caixa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.textView);
        botao = findViewById(R.id.button);
        caixa = findViewById(R.id.checkBox);

        caixa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                texto.setText(converteEmTexto(b));
            }
        });
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,converteEmTexto(caixa.isChecked()),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private String converteEmTexto(boolean isChecked){
        return (isChecked)?"Ligado":"Desligado";
    }
}