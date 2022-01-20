package com.edu.bauet.Department.ICE.About;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class WelcomeMessageActivity extends AppCompatActivity {
    ImageView wel_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_message);

        wel_img1 = findViewById(R.id.wel_img1);

        Glide.with(this).load("https://bauet.ac.bd/ice/wp-content/uploads/sites/9/2020/12/Dr.-Rubaiyat-Yasmin.jpg").into(wel_img1);
    }
}