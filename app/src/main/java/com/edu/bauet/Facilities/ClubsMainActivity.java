package com.edu.bauet.Facilities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.Facilities.Clubs.BNCCActivity;
import com.edu.bauet.Facilities.Clubs.BusinessActivity;
import com.edu.bauet.Facilities.Clubs.CareerActivity;
import com.edu.bauet.Facilities.Clubs.ComputerActivity;
import com.edu.bauet.Facilities.Clubs.CulturalActivity;
import com.edu.bauet.Facilities.Clubs.DebatingActivity;
import com.edu.bauet.Facilities.Clubs.ICTActivity;
import com.edu.bauet.Facilities.Clubs.LanguageActivity;
import com.edu.bauet.Facilities.Clubs.NatureClubActivity;
import com.edu.bauet.Facilities.Clubs.PhotographyActivity;
import com.edu.bauet.Facilities.Clubs.RoboticActivity;
import com.edu.bauet.Facilities.Clubs.SportsActivity;
import com.edu.bauet.Facilities.Clubs.WelfareActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class ClubsMainActivity extends AppCompatActivity {
    MaterialCardView card_cultural, card_career, card_welfare, card_debating, card_nature, card_computer, card_robotics, card_ict,card_business,card_language,card_sports,card_media,card_bncc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_main);

        card_cultural = findViewById(R.id.card_cultural);
        card_cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, CulturalActivity.class);
                startActivity(intent);
            }
        });

        card_career = findViewById(R.id.card_career);
        card_career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, CareerActivity.class);
                startActivity(intent);
            }
        });

        card_welfare = findViewById(R.id.card_welfare);
        card_welfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, WelfareActivity.class);
                startActivity(intent);
            }
        });

        card_debating = findViewById(R.id.card_debating);
        card_debating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, DebatingActivity.class);
                startActivity(intent);
            }
        });

        card_nature = findViewById(R.id.card_nature);
        card_nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, NatureClubActivity.class);
                startActivity(intent);
            }
        });

        card_computer = findViewById(R.id.card_computer);
        card_computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, ComputerActivity.class);
                startActivity(intent);
            }
        });


        card_robotics = findViewById(R.id.card_robotics);
        card_robotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, RoboticActivity.class);
                startActivity(intent);
            }
        });

        card_ict = findViewById(R.id.card_ict);
        card_ict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, ICTActivity.class);
                startActivity(intent);
            }
        });

        card_business = findViewById(R.id.card_business);
        card_business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, BusinessActivity.class);
                startActivity(intent);
            }
        });
        card_language = findViewById(R.id.card_language);
        card_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, LanguageActivity.class);
                startActivity(intent);
            }
        });

        card_sports = findViewById(R.id.card_sports);
        card_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, SportsActivity.class);
                startActivity(intent);
            }
        });

        card_media = findViewById(R.id.card_media);
        card_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, PhotographyActivity.class);
                startActivity(intent);
            }
        });

        card_bncc = findViewById(R.id.card_bncc);
        card_bncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClubsMainActivity.this, BNCCActivity.class);
                startActivity(intent);
            }
        });

    }
}