package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        String[] frases = {
                "Deixem que o futuro diga a verdade e avalie cada um de acordo com o seu trabalho e realizações. O presente pertence a eles, mas o futuro pelo qual eu sempre trabalhei pertence a mim. - Nikola Tesla",
                "Se você quiser descobrir os segredos do Universo, pense em termos de energia, frequência e vibração. - Nikola Tesla",
                "Nós só podemos ver um pouco do futuro, mas o suficiente para perceber que há muito a fazer. - Alan Turing",
                "O importante é não parar de questionar. - Albert Einstein",
                "Pode ser que um dia nos afastemos... Mas, se formos amigos de verdade, A amizade nos reaproximará - Albert Einstein"
                        };


        int numero = new Random().nextInt(5);
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText(frases[numero]);

    }

}
