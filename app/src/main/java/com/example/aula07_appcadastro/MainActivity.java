package com.example.aula07_appcadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonLoginOnClick (View v){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    public void buttonRegisterOnClick (View v){
        Intent register = new Intent(this, Register.class);
        startActivity(register);
    }

    public void buttonAboutOnClick (View v){
        Intent telaAbout = new Intent(this, About.class);
        startActivity(telaAbout);
    }
}