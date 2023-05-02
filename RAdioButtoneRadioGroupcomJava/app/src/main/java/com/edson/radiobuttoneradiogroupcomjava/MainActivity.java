package com.edson.radiobuttoneradiogroupcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private Button botao;
    private RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto =  findViewById(R.id.textView);
        botao =  findViewById(R.id.button);
        grupo =  findViewById(R.id.radioGroup);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton opcao = findViewById(checkedId);
                texto.setText(opcao.getText());
            }
        });
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton opcao = findViewById(grupo.getCheckedRadioButtonId());
                if(opcao != null){
                Toast.makeText(MainActivity.this,opcao.getText(),Toast.LENGTH_SHORT).show();
            }}
        });
    }
}