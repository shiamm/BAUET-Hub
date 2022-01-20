package com.edu.bauet.Facilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class CafeteriaMainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria_main);

        imageView = findViewById(R.id.img_cafe);

        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Cafeteria.jpg").into(imageView);
    }
}