package com.edson.togglebuttoncomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Button botao;
    private ToggleButton interruptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.textView);
        botao = findViewById(R.id.button);
        interruptor = findViewById(R.id.toggleButton);
        interruptor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                texto.setText(converterTexto(b));
            }
        });
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,converterTexto(interruptor.isChecked()),Toast.LENGTH_SHORT).show();;
            }
        });
    }
    private String converterTexto(boolean isChecked){
        return (isChecked)? "Ligado":"Desligado";
    }
}