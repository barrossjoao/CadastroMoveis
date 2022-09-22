package com.example.aula07_appcadastro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void buttonSite (View v){
        Intent page = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br"));

        if(page.resolveActivity(getPackageManager()) != null) startActivity(page);
    }

    public void buttonHomePageOnClick (View v){
        Intent telaInicial = new Intent(this, MainActivity.class);
        startActivity(telaInicial);
    }
}
