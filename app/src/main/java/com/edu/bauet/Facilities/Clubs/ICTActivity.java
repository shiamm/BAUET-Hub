package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class ICTActivity extends AppCompatActivity {
    ImageView ict_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ictactivity);

        ict_img1 = findViewById(R.id.ict_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/ICT1.jpg").into(ict_img1);
    }
}