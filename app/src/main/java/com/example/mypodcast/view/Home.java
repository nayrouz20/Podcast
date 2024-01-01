package com.example.mypodcast.view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.mypodcast.R;

public class Home extends AppCompatActivity {

    // Déclaration d'un bouton pour démarrer l'activité principale (MainActivity)
    private Button btnDomaine1;
    private Button btnDomaine2;
    private Button btnDomaine3;
    private Button btnDomaine4;
    private Button btnDomaine5;
    private Button btnDomaine6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Initialisation du bouton en associant la vue du layout avec la variable Java
        btnDomaine1 = (Button) findViewById(R.id.btnDomaine1);
        btnDomaine2 = (Button) findViewById(R.id.btnDomaine2);
        btnDomaine3 = (Button) findViewById(R.id.btnDomaine3);
        btnDomaine4 = (Button) findViewById(R.id.btnDomaine4);
        btnDomaine5 = (Button) findViewById(R.id.btnDomaine5);
        btnDomaine6 = (Button) findViewById(R.id.btnDomaine6);
        // Configuration de l'écouteur de clic pour le bouton "Consultation"
        btnDomaine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité home
                Intent intent = new Intent(Home.this, Actuality.class);

                // Démarrage de l'activité home
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
        btnDomaine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité home
                Intent intent = new Intent(Home.this, Technology.class);

                // Démarrage de l'activité home
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
        btnDomaine3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité home
                Intent intent = new Intent(Home.this, History.class);

                // Démarrage de l'activité home
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
        btnDomaine4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité home
                Intent intent = new Intent(Home.this, Comedy.class);

                // Démarrage de l'activité home
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
        btnDomaine5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité home
                Intent intent = new Intent(Home.this, Politics.class);

                // Démarrage de l'activité home
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
        btnDomaine6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité home
                Intent intent = new Intent(Home.this, MentalHealth.class);

                // Démarrage de l'activité home
                startActivity(intent);

                // Fermeture de l'activité actuelle (HomeActivity)
                finish();
            }
        });
    }
}