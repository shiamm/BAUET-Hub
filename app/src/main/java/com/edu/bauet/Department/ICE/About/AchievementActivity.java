package com.edu.bauet.Department.ICE.About;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;
import com.google.android.material.imageview.ShapeableImageView;

public class AchievementActivity extends AppCompatActivity {
    ImageView ach_1, ach_2, ach_3, ach_4, ach_5, ach_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);

        ach_1 = findViewById(R.id.ach_1);
        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2021/12/Best-Speaker-Mursheda-Nusrat-Della-Dept.-of-ICE.jpg").into(ach_1);
        ach_2 = findViewById(R.id.ach_2);
        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2021/12/Achievement-of-ICE.jpeg").into(ach_2);
        ach_3 = findViewById(R.id.ach_3);
        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2020/12/Achivement-4.png").into(ach_3);
        ach_4 = findViewById(R.id.ach_4);
        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2020/12/Achivement-1-1.png").into(ach_4);
        ach_5 = findViewById(R.id.ach_5);
        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2020/12/Achivement-3.png").into(ach_5);
        ach_6 = findViewById(R.id.ach_6);
        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2020/12/Achivement-2.png").into(ach_6);
    }
}