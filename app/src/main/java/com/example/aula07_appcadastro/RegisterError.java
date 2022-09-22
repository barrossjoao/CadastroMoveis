package com.example.aula07_appcadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_error);

        Intent erro = getIntent();
        String nome = erro.getStringExtra("nome");
        String end = erro.getStringExtra("end");
        String num = erro.getStringExtra("num");
        String cep = erro.getStringExtra("cep");
        String compl = erro.getStringExtra("compl");
        String email = erro.getStringExtra("email");

        String details = "";

        if (nome.isEmpty()) details += "/nNome";
        if (end.isEmpty()) details += "/nEndereço";
        if (num.isEmpty()) details += "/nNumero";
        if (cep.isEmpty()) details += "/nCep";
        if (compl.isEmpty()) details += "/nComplemento";
        if (email.isEmpty()) details += "/nE-mail";

        TextView textDetails = findViewById(R.id.textDetails);
        textDetails.setText(details);
    }

    public void buttonRegisterOnClick (View v){
        Intent register = new Intent(this, Register.class);
        startActivity(register);
    }

}
