package com.example.aula07_appcadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void buttonEntrarOnClick (View v){

        EditText o_nome, o_end, o_num, o_cep, o_compl, o_email;

        o_nome = findViewById(R.id.editName);
        o_end = findViewById(R.id.editAddress);
        o_num = findViewById(R.id.editNumber);
        o_cep = findViewById(R.id.editZipCode);
        o_compl = findViewById(R.id.editComplement);
        o_email = findViewById(R.id.editEmailRegister);

        String nome = o_nome.getText().toString();
        String end = o_end.getText().toString();
        String num = o_num.getText().toString();
        String cep = o_cep.getText().toString();
        String compl = o_compl.getText().toString();
        String email = o_email.getText().toString();

        if(nome.isEmpty() || end.isEmpty() || num.isEmpty() || cep.isEmpty() || compl.isEmpty() || email.isEmpty()){

            Intent erro = new Intent(this, RegisterError.class);
            erro.putExtra("nome",nome);
            erro.putExtra("endereço",end);
            erro.putExtra("numero",num);
            erro.putExtra("cep",cep);
            erro.putExtra("complemento",compl);
            erro.putExtra("email",email);

            startActivity(erro);

        } else{
            Intent sucess = new Intent(this, RegisterSucess.class);
            sucess.putExtra("nome", nome);
            startActivity(sucess);
        }
    }
}
