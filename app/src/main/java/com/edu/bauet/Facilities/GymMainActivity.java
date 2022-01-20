package com.edu.bauet.Facilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class GymMainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym_main);

        imageView = findViewById(R.id.img_gym);

        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/22_11fe3fa0-39ee-466b-abf2-2a071d02f1a9_530x530.jpg").into(imageView);
    }
}