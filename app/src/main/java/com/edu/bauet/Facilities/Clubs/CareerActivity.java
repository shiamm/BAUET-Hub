package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class CareerActivity extends AppCompatActivity {
    ImageView car_img1,car_img2,car_img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);

        car_img2 = findViewById(R.id.car_img2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/CareerClub-1024x682.jpg").into(car_img2);
        car_img3 = findViewById(R.id.car_img3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/CCAct-1024x768.jpg").into(car_img3);

        car_img1 = findViewById(R.id.car_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/CC-1024x682.jpg").into(car_img1);
    }
}