package com.edu.bauet.Department.ICE.Download.LabMaterials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class BatchActivity extends AppCompatActivity {
    MaterialCardView card_4th, card_5th, card_6th, card_7th, card_8th, card_9th, card_10th, card_11th;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch);

        card_4th = findViewById(R.id.card_4th);
        card_4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatchActivity.this, LabLoginActivity.class);
                startActivity(intent);
            }
        });

        card_5th = findViewById(R.id.card_5th);
        card_5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatchActivity.this, LabLoginActivity.class);
                startActivity(intent);
            }
        });
        card_6th = findViewById(R.id.card_6th);
        card_6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatchActivity.this, LabLoginActivity.class);
                startActivity(intent);
            }
        });
        card_7th = findViewById(R.id.card_7th);
        card_7th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatchActivity.this, LabLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}