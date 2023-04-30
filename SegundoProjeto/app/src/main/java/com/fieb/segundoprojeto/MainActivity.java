package com.fieb.segundoprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editNome;
    Button btnApresentar, btnFechar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ligando variavel local com elementos
        editNome = findViewById(R.id.editNome);
        btnApresentar = findViewById(R.id.btnApresentar);
        btnFechar = findViewById(R.id.btnFechar);
        tvResult = findViewById(R.id.tvResult);

        // evento fechar no botão fechar
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // evento apresentar no botão apresentar
        btnApresentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome;
                nome = editNome.getText().toString();
                tvResult.setText(nome);
            }
        });
    }
}
