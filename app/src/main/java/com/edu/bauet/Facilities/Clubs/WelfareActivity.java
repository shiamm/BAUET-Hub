package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class WelfareActivity extends AppCompatActivity {
    ImageView wel_img1,wel_img2,wel_img3,wel_img4,wel_img5,wel_img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welfare);

        wel_img1 = findViewById(R.id.wel_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/committee19.jpg").into(wel_img1);

        wel_img2 = findViewById(R.id.wel_img2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/orphan16.jpg").into(wel_img2);

        wel_img3 = findViewById(R.id.wel_img3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/clean.jpg").into(wel_img3);

        wel_img4 = findViewById(R.id.wel_img4);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/Lunched.jpg").into(wel_img4);

        wel_img5 = findViewById(R.id.wel_img5);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/winter.jpg").into(wel_img5);

        wel_img6 = findViewById(R.id.wel_img6);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/win.jpg").into(wel_img6);
    }
}