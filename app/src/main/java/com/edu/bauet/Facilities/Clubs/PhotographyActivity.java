package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class PhotographyActivity extends AppCompatActivity {
    ImageView pho_img1,pho_img2,pho_img3,pho_img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography);

        pho_img1 = findViewById(R.id.pho_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/1stp.jpg").into(pho_img1);

        pho_img2 = findViewById(R.id.pho_img2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/2ndp.jpg").into(pho_img2);

        pho_img3 = findViewById(R.id.pho_img3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/3rdp.jpg").into(pho_img3);

        pho_img4 = findViewById(R.id.pho_img4);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/4thp.jpg").into(pho_img4);
    }
}