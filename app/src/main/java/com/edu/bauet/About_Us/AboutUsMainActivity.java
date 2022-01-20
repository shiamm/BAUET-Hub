package com.edu.bauet.About_Us;

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

public class AboutUsMainActivity extends AppCompatActivity {
    MaterialCardView card_history, card_why, card_aboutus, card_dev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_main);

        card_aboutus = findViewById(R.id.card_aboutus);
        card_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsMainActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });

        card_history = findViewById(R.id.card_history);
        card_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsMainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        card_why = findViewById(R.id.card_whystudyhere);
        card_why.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsMainActivity.this, WhyStudyHereActivity.class);
                startActivity(intent);
            }
        });

        card_dev = findViewById(R.id.card_dev);
        card_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUsMainActivity.this, DeveloperMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
            }
        });
    }


}