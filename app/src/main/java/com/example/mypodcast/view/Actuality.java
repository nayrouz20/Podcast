package com.example.mypodcast.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mypodcast.R;

public class Actuality extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actuality);

        // Récupérer le nom du domaine depuis l'intent
        String domaineName = getIntent().getStringExtra("DOMAIN_NAME");

        // Utiliser le nom du domaine pour afficher les noms des podcasts
        setTitle("Domaine : " + domaineName);

        // Afficher les noms des podcasts en fonction du domaine
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tvDomainTitle3 = findViewById(R.id.tvA);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tvPodcast3 = findViewById(R.id.tvP3);

        Button backButton = (Button) findViewById(R.id.btnBackToHome);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Création d'une nouvelle intention (Intent) pour démarrer l'activité Home
                Intent intent = new Intent(Actuality.this, Home.class);

                // Démarrage de l'activité Home
                startActivity(intent);

                // Fermeture de l'activité actuelle
                finish();
            }
        });
    }
}