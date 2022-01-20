package com.edu.bauet.Department.ICE.About;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class AboutMainActivity extends AppCompatActivity {
    MaterialCardView card_welcm, card_aboutice, card_vision, card_whystudyice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_main);

        card_welcm = findViewById(R.id.card_welcm);
        card_welcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMainActivity.this, WelcomeMessageActivity.class);
                startActivity(intent);
            }
        });
        card_aboutice = findViewById(R.id.card_aboutice);
        card_aboutice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMainActivity.this, AboutIceActivity.class);
                startActivity(intent);
            }
        });
        card_vision = findViewById(R.id.card_vision);
        card_vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMainActivity.this, VisionMissionActivity.class);
                startActivity(intent);
            }
        });
        card_whystudyice = findViewById(R.id.card_whystudyice);
        card_whystudyice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMainActivity.this, WhyIceActivity.class);
                startActivity(intent);
            }
        });

    }
}