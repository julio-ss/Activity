package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView txtRec;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtRec = findViewById(R.id.txtRec);

        //recuperando os dados
        Bundle dados = getIntent().getExtras();
        StringBuilder recActivity = new StringBuilder();

        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        recActivity.append("nome: " + usuario.getNome());
        recActivity.append("\nsobrenome: " + usuario.getSobrenome());
        recActivity.append("\nidade: " + usuario.getIdade());
        recActivity.append("\ne-mail: " + usuario.getEmail());

        txtRec.setText(recActivity);
    }
}