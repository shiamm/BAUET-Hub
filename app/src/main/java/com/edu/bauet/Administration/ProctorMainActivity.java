package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProctorMainActivity extends AppCompatActivity {
    CircleImageView img_Golam,img_Mithun,img_Masrufa,img_Raju,img_Tanver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proctor_main);

        img_Golam = findViewById(R.id.img_Golam);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Mohammed-Golam-Sarwar-Bhuyan.jpg").into(img_Golam);

        img_Mithun = findViewById(R.id.img_Mithun);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Mithun-Kumar.jpg").into(img_Mithun);

        img_Masrufa = findViewById(R.id.img_Masrufa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Masrufa-Alam.jpg").into(img_Masrufa);

        img_Raju = findViewById(R.id.img_Raju);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/raju.jpg").into(img_Raju);

        img_Tanver = findViewById(R.id.img_Tanver);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Tanver-Hasan.jpg").into(img_Tanver);

    }
}