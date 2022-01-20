package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViceChancellorMainActivity extends AppCompatActivity {
    CircleImageView img_mustafa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vice_chancellor_main);

        img_mustafa = findViewById(R.id.img_mustafa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/BrigGenMMustafaKamal.jpg").into(img_mustafa);
    }
}