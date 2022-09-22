package com.example.aula07_appcadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterSucess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_sucess);

        Intent sucess = getIntent();
        String nome = sucess.getStringExtra("Nome");

        TextView textViewSucess = findViewById(R.id.textViewSucess);

        String msgSucess = "Seja Bem Vindo " + nome + ". Cadastro realizado com suecsso.";

        textViewSucess.setText(msgSucess);
    }

    public void buttonAboutOnClick (View v){
        Intent telaAbout = new Intent(this, About.class);
        startActivity(telaAbout);
    }
}
