package com.edson.threadscomjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button botao1;
private Button botao2;
private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao1 = findViewById(R.id.button);
        botao2 = findViewById(R.id.button2);
        texto = findViewById(R.id.textView);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(4000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                texto.setText("Clicou no botão 1");
                            }
                        });

                    }
                }).start();

            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              System.out.println("MOBO");
                executaMetodoEmBackgtound();
            }
        });
    }


    private  void executaMetodoEmBackgtound() {
         new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    System.out.println("CERTO");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("ERRO "+e);
                    throw new RuntimeException(e);
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        texto.setText("Clicou no botão 2");
                    }
                });
                return null;
            }
        }.execute();

    }
}