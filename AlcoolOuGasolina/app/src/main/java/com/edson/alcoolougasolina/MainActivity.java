package com.edson.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view) {
        try {
            Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
            Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());
            Double resultado = precoAlcool / precoGasolina;
            if (resultado >= 0.7) {
                textResultado.setText("Melhor utilizar gasolina!");
            } else {
                textResultado.setText("Melhor utilizar Alcool!");
            }
        }catch (Exception e){
            textResultado.setText("Ocorreu um erro , verifique campos digitados!");
        }


    }
}