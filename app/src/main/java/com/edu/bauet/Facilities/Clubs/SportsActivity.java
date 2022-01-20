package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class SportsActivity extends AppCompatActivity {
    ImageView spo_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        spo_img1 = findViewById(R.id.spo_img1);

        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/sports_club.png").into(spo_img1);
    }
}