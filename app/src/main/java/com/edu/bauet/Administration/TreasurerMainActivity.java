package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class TreasurerMainActivity extends AppCompatActivity {
    CircleImageView img_Hamidul,img_Kamrujjaman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasurer_main);

        img_Hamidul = findViewById(R.id.img_Hamidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Col-Mohammad-Hamidul-Haque.jpg").into(img_Hamidul);

        img_Kamrujjaman = findViewById(R.id.img_Kamrujjaman);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Kamrujjaman.jpg").into(img_Kamrujjaman);

    }
}