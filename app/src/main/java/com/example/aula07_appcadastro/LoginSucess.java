package com.example.aula07_appcadastro;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginSucess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess);

        TextView textSucess = (TextView) findViewById(R.id.textSucess);

        textSucess.setText("Login Efetuado com Sucesso!");
        textSucess.setTextColor(Color.parseColor("#0009FF"));
    }

    public void buttonAboutOnClick (View v){
        Intent telaAbout = new Intent(this, About.class);
        startActivity(telaAbout);
    }
}
