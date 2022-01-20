package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class FinanceCommitteeMainActivity extends AppCompatActivity {
    CircleImageView img_Hasan,img_Muniruzzaman,img_Mustafa,img_Zulfker,img_Hamidul,img_Rashidul,Towhidul,img_Nasir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance_committee_main);

        img_Hasan = findViewById(R.id.img_Hasan);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Major-General-AKM-Nazmul-Hasan.jpg").into(img_Hasan);

        img_Muniruzzaman = findViewById(R.id.img_Muniruzzaman);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/06/Picture-BOSS--scaled.jpg").into(img_Muniruzzaman);

        img_Mustafa = findViewById(R.id.img_Mustafa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/BrigGenMMustafaKamal.jpg").into(img_Mustafa);

        img_Zulfker = findViewById(R.id.img_Zulfker);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/03/IMG-20210322-WA0001.jpg").into(img_Zulfker);

        img_Hamidul = findViewById(R.id.img_Hamidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Col-Mohammad-Hamidul-Haque.jpg").into(img_Hamidul);

        img_Rashidul = findViewById(R.id.img_Rashidul);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/photo-Mirza.jpg").into(img_Rashidul);

        Towhidul = findViewById(R.id.Towhidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/03/1.-Touhidul-Haque.jpg").into(Towhidul);

        img_Nasir = findViewById(R.id.img_Nasir);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Nasir-Uddin.jpg").into(img_Nasir);
    }
}