package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class DebatingActivity extends AppCompatActivity {
    ImageView deb_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debating);



        deb_img1 = findViewById(R.id.deb_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/Debating_Club.png").into(deb_img1);
    }
}