package com.edson.confeitariaapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.edson.confeitariaapp.R;
import com.edson.confeitariaapp.api.Auxiliares;
import com.edson.confeitariaapp.api.ConexaoSqlSever;
import com.edson.confeitariaapp.controller.LoginController;
import com.edson.confeitariaapp.model.LoginModel;

import java.sql.Connection;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtSenha;
    Button btnLogin;
    String usuarioAtual, senha;

    Connection conn = ConexaoSqlSever.conectar(getApplication());

    LoginController loginController;
    List<LoginModel> loginModels; //Linha dos dados tipo array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();
        inicializarConexao();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validarCampos()) {
                    usuarioAtual = edtUsuario.getText().toString();
                    senha = edtSenha.getText().toString();

                    //Criar objeto para o Login
                    loginController = new LoginController();

                    //Modelo de dados para o login
                    LoginModel loginModel;

                    //Obtem os usuários
                    loginModel = loginController.validarLogin(getApplicationContext(), usuarioAtual, senha);

                    if (loginModel != null) {
                        Intent intent = new Intent(getApplicationContext(), Principal.class);
                        startActivity(intent);
                    } else {
                        Auxiliares.alert(getApplicationContext(), "Usuário ou Senha incorretos!");
                        edtUsuario.setText("");
                        edtSenha.setText("");
                        edtUsuario.requestFocus();
                    }
                }

            }
        });
    }

    private boolean validarCampos() {

        boolean retorno = true;

        if (edtUsuario.getText().toString().isEmpty()) {
            edtUsuario.setError("Obrigatório*");
            edtUsuario.requestFocus();
            retorno = false;
        } else if (edtSenha.getText().toString().isEmpty()) {
            edtSenha.setError("Obrigatório*");
            edtSenha.requestFocus();
            retorno = false;
        }
        return retorno;

    }

    private void inicializarConexao() {

        try {
            if (conn != null) {
                if (!conn.isClosed()){
                    setTitle("CONEXAO REALIZADA COM SUCESSO");
                System.out.println("MSG: CONEXAO REALIZADA COM SUCESSO");}
                else{
                    setTitle("A CONEXÃO ESTÁ FECHADA");
                System.out.println("MSG: A CONEXÃO ESTÁ FECHADA");}
            } else {
                setTitle("CONEXAO NULA, NÃO REALIZADA");
                System.out.println("MSG: CONEXAO NULA, NÃO REALIZADA");
            }
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
            setTitle("CONEXÃO FALHOU!!!\n" + ex.getMessage());
            System.out.println("MSG: CONEXÃO FALHOU!!!\n" + ex.getMessage());
        }
    }




    private void inicializarComponentes() {
        edtUsuario = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtLogin);
        btnLogin = findViewById(R.id.btnLogin);

        edtUsuario.setText("saw@gmail.com");
        edtSenha.setText("9");

        edtUsuario.requestFocus();

    }

    public void esqueciMinhaSenha(View view) {
        Auxiliares.alertCustom(getApplicationContext(), "Em Construção");
    }

    public void novoCadastro(View view) {
        edtSenha.setText("");
        edtUsuario.requestFocus();
        edtUsuario.setText("");
        Intent intent = new Intent(getApplicationContext(), CadastrarEmailSenha.class);
        startActivity(intent);
    }
}