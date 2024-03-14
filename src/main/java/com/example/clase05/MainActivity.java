package com.example.clase05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText texto = (EditText) findViewById(R.id.editText1);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para Lanzar Segundo Activity
    public void SegundoActivity(View view)
    {
        Intent intent = new Intent (view.getContext(), SegundoActivity.class);
        startActivity(intent);
    }

    public void CapturarDatos(View view)
    {
        String textoET = texto.getText().toString();

        Toast.makeText(this,"Su nombre es: "+textoET,Toast.LENGTH_LONG).show();
    }
}