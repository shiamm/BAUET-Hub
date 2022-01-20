package com.edu.bauet.Academic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class AcademicMainActivity extends AppCompatActivity {
    MaterialCardView card_regulation, card_calendar, card_transcript;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_main);

        card_regulation = findViewById(R.id.card_regulations);
        card_regulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicMainActivity.this, AcademicRegulationsActivity.class);
                startActivity(intent);
            }
        });
        card_calendar = findViewById(R.id.card_calendar);
        card_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicMainActivity.this, AcademicCalenderActivity.class);
                startActivity(intent);
            }
        });

        card_transcript = findViewById(R.id.card_Transcript);
        card_transcript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicMainActivity.this, TranscriptDegreeCFDtilActivity.class);
                startActivity(intent);
            }
        });
    }
}