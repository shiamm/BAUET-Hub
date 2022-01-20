package com.edu.bauet.Department.ICE.About;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class WhyIceActivity extends AppCompatActivity {
    ImageView why_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_ice);


        why_img1 = findViewById(R.id.why_img1);

        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2021/01/IMG_20180809_121849-scaled.jpg").into(why_img1);
    }
}