package com.example.mypodcast.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mypodcast.R;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Récupérer le nom du domaine depuis l'intent
        String domaineName = getIntent().getStringExtra("DOMAIN_NAME");

        // Utiliser le nom du domaine pour afficher les noms des podcasts
        setTitle("Domaine : " + domaineName);

        // Afficher les noms des podcasts en fonction du domaine
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tvDomainTitle5 = findViewById(R.id.tvH);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tvPodcast5 = findViewById(R.id.tvP5);
    }
}