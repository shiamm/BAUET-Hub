package com.edu.bauet.Facilities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class FacilitiesMainActivity extends AppCompatActivity {

    MaterialCardView card_cafeteria, card_clubs, card_gym, card_hall, card_health, card_library, card_transport, card_bank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities_main);


        card_cafeteria = findViewById(R.id.card_cafeteria);
        card_cafeteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, CafeteriaMainActivity.class);
                startActivity(intent);
            }
        });

        card_clubs = findViewById(R.id.card_clubs);
        card_clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, ClubsMainActivity.class);
                startActivity(intent);
            }
        });

        card_hall = findViewById(R.id.card_hall);
        card_hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, HallMainActivity.class);
                startActivity(intent);
            }
        });

        card_gym = findViewById(R.id.card_gym);
        card_gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, GymMainActivity.class);
                startActivity(intent);
            }
        });

        card_health = findViewById(R.id.card_health);
        card_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, HealthMainActivity.class);
                startActivity(intent);
            }
        });

        card_library = findViewById(R.id.card_library);
        card_library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, LibraryMainActivity.class);
                startActivity(intent);
            }
        });

        card_transport = findViewById(R.id.card_transport);
        card_transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, TransportMainActivity.class);
                startActivity(intent);
            }
        });

        card_bank = findViewById(R.id.card_bank);
        card_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacilitiesMainActivity.this, BankMainActivity.class);
                startActivity(intent);
            }
        });
    }
}