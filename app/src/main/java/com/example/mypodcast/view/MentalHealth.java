package com.example.mypodcast.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mypodcast.R;

public class MentalHealth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health);

        // Récupérer le nom du domaine depuis l'intent
        String domaineName = getIntent().getStringExtra("DOMAIN_NAME");

        // Utiliser le nom du domaine pour afficher les noms des podcasts
        setTitle("Domaine : " + domaineName);

        // Afficher les noms des podcasts en fonction du domaine
        TextView tvDomainTitle = findViewById(R.id.tvMH);
        TextView tvPodcast1 = findViewById(R.id.tvPodcast1);

    }
}