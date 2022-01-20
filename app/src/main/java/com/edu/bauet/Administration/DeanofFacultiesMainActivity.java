package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class DeanofFacultiesMainActivity extends AppCompatActivity {
    CircleImageView img_Mustafa,img_Rashidul,img_hasan,img_Shahidul,img_Shah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deanof_faculties_main);

        img_Mustafa = findViewById(R.id.img_Mustafa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/BrigGenMMustafaKamal.jpg").into(img_Mustafa);


        img_Rashidul = findViewById(R.id.img_Rashidul);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/photo-Mirza.jpg").into(img_Rashidul);

        img_hasan = findViewById(R.id.img_hasan);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Engr.-Md.-Rashidul-Hasan.jpg").into(img_hasan);

        img_Shahidul = findViewById(R.id.img_Shahidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/MD-Shahidul-Islam.jpg").into(img_Shahidul);

        img_Shah = findViewById(R.id.img_Shah);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Md.-Shah-Alam.jpg").into(img_Shah);

    }
}