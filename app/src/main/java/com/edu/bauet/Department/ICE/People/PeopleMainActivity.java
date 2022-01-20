package com.edu.bauet.Department.ICE.People;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.About_Us.AboutUsActivity;
import com.edu.bauet.About_Us.AboutUsMainActivity;
import com.edu.bauet.About_Us.HistoryActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class PeopleMainActivity extends AppCompatActivity {
    MaterialCardView card_Technical, card_facultymembers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_main);


        card_Technical = findViewById(R.id.card_Technical);
        card_Technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleMainActivity.this, TechnicalStaffsActivity.class);
                startActivity(intent);
            }
        });

        card_facultymembers = findViewById(R.id.card_facultymembers);
        card_facultymembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PeopleMainActivity.this, ICEProfessionalsMainActivity.class);
                startActivity(intent);
            }
        });
    }
}