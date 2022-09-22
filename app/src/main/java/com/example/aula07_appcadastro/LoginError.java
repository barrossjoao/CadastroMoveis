package com.example.aula07_appcadastro;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_error);

        TextView textError = (TextView) findViewById(R.id.textError);

        textError.setText("Erro.\n" + "Cheque o usuário e a senha.");
        textError.setTextColor(Color.parseColor("#FF0000"));
    }

    public void voltarLoginOnClick (View v){
        Intent telaLogin = new Intent(this, Login.class);
        startActivity(telaLogin);
    }
}
