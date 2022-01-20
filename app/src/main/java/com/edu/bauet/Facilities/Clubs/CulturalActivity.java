package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class CulturalActivity extends AppCompatActivity {
    ImageView cul_img1,cul_img2,cul_img3,cul_img4,cul_img5,cul_img6,cul_img7,cul_img8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);

        cul_img1 = findViewById(R.id.cul_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/F20-1024x682.jpg").into(cul_img1);

        cul_img2 = findViewById(R.id.cul_img2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/ACP19-1024x682.jpg").into(cul_img2);

        cul_img3 = findViewById(R.id.cul_img3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/AP19-1024x682.jpg").into(cul_img3);

        cul_img4 = findViewById(R.id.cul_img4);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/AC18-1024x682.jpg").into(cul_img4);

        cul_img5 = findViewById(R.id.cul_img5);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/no17-1024x681.jpg").into(cul_img5);

        cul_img6 = findViewById(R.id.cul_img6);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/no16.jpg").into(cul_img6);

        cul_img7 = findViewById(R.id.cul_img7);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/n15-1024x576.jpg").into(cul_img7);

        cul_img8 = findViewById(R.id.cul_img8);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/no15.jpg").into(cul_img8);
    }
}