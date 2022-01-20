package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SyndicateofBAUETMainActivity extends AppCompatActivity {
    CircleImageView img_Mustafa,img_Mansur,img_Kazi,img_jahan,img_Zulfker,img_Rashidul,img_hasan,img_Golam,img_Shameem,img_Hamidul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syndicateof_bauetmain);

        img_Mustafa = findViewById(R.id.img_Mustafa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/BrigGenMMustafaKamal.jpg").into(img_Mustafa);

        img_Mansur = findViewById(R.id.img_Mansur);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Brig-Gen-Abul-Mansur-Md-Ashraf-Khan.jpg").into(img_Mansur);

        img_Kazi = findViewById(R.id.img_Kazi);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Brig-Gen-Kazi-A-S-M-Arif.jpg").into(img_Kazi);

        img_jahan = findViewById(R.id.img_jahan);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/03/Photo-Prof-Jahan.jpg").into(img_jahan);

        img_Zulfker = findViewById(R.id.img_Zulfker);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/03/IMG-20210322-WA0001.jpg").into(img_Zulfker);

        img_Rashidul = findViewById(R.id.img_Rashidul);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/photo-Mirza.jpg").into(img_Rashidul);

        img_hasan = findViewById(R.id.img_hasan);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Engr.-Md.-Rashidul-Hasan.jpg").into(img_hasan);

        img_Golam = findViewById(R.id.img_Golam);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Mohammed-Golam-Sarwar-Bhuyan.jpg").into(img_Golam);

        img_Shameem = findViewById(R.id.img_Shameem);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Lt.-Col-Shaikh-Shameem-Hussain.jpg").into(img_Shameem);

        img_Hamidul = findViewById(R.id.img_Hamidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Col-Mohammad-Hamidul-Haque.jpg").into(img_Hamidul);


    }
}