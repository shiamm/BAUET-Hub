package com.edu.bauet.Department.ICE.About;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class AboutIceActivity extends AppCompatActivity {
    ImageView abt_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_ice);

        abt_img1 = findViewById(R.id.abt_img1);

        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2021/01/Computer-Lab-scaled.jpg").into(abt_img1);
    }
}