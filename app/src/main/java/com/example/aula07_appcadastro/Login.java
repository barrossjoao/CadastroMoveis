package com.example.aula07_appcadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void buttonLoginAuthOnClick(View v){
        EditText mail, password;

        mail = findViewById(R.id.editEmail);
        password = findViewById(R.id.editPassword);

        String email = mail.getText().toString();
        String pass = password.getText().toString();

        testLogin(email,pass);
    }

    protected void testLogin(String email, String pass){
        String email_login = "peterrizzon@acad.ftec.com.br";
        String pass_login = "123456";

        if(email.equals(email_login) && pass.equals(pass_login)){
            Intent telaSucess = new Intent(this, LoginSucess.class);
            startActivity(telaSucess);
        }
        else{
            Intent telaError = new Intent(this, LoginError.class);
            startActivity(telaError);
        }
    }
}
