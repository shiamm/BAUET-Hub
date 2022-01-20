package com.edu.bauet.Department.CE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.Department.CE.Professionals.MahmudurMainActivity;
import com.edu.bauet.Department.CE.Professionals.MohshinMainActivity;
import com.edu.bauet.Department.CE.Professionals.RashidulMainActivity;
import com.edu.bauet.Department.CE.Professionals.RimaMainActivity;
import com.edu.bauet.Department.CE.Professionals.RokonMainActivity;
import com.edu.bauet.Department.CE.Professionals.SaddamMainActivity;
import com.edu.bauet.Department.CE.Professionals.ShajahanMainActivity;
import com.edu.bauet.Department.CE.Professionals.ShamimaMainActivity;
import com.edu.bauet.Department.CE.Professionals.SuraiyaMainActivity;
import com.edu.bauet.Department.CE.Professionals.TanverMainActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CEProfessionalMainActivity extends AppCompatActivity {
    MaterialCardView card_Rashidul, card_Mahmudur, card_Shajahan, card_Shamima, card_Mohshin, card_Suraiya, card_Saddam, card_Rima, card_Rokonuzzaman, card_Tanver;
    CircleImageView img_Rashidul, img_Mahmudur, img_Shajahan, img_Shamima, img_Mohshin, img_Suraiya, img_Saddam, img_Rima, img_Rokonuzzaman, img_Tanver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ce_professional_main_activity);

        img_Rashidul = findViewById(R.id.img_Rashidul);
        img_Mahmudur = findViewById(R.id.img_Mahmudur);
        img_Shajahan = findViewById(R.id.img_Shajahan);
        img_Shamima = findViewById(R.id.img_Shamima);
        img_Mohshin = findViewById(R.id.img_Mohshin);
        img_Suraiya = findViewById(R.id.img_Suraiya);
        img_Saddam = findViewById(R.id.img_Saddam);
        img_Rima = findViewById(R.id.img_Rima);
        img_Rokonuzzaman = findViewById(R.id.img_Rokonuzzaman);
        img_Tanver = findViewById(R.id.img_Tanver);

        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Dr.-Engr.-Md.-RashidulHasan-317x300.jpg").into(img_Rashidul);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Photograph-of-Dr.-Md.-Mahmudur-Rahman.jpg").into(img_Mahmudur);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/received_675672976450248-240x300.jpeg").into(img_Shajahan);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Mst.-Shamima-Shirin-257x300.jpg").into(img_Shamima);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Md.-Mohshin-Ali-260x300.jpg").into(img_Mohshin);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Mst.-Suraiya-Hashi.jpg").into(img_Suraiya);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/131339402_2807685309506828_2025305513259420085_n-223x300.jpg").into(img_Saddam);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Rima-Parvin-200x300.jpg").into(img_Rima);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Rokonuzzaman-Rokon.jpg").into(img_Rokonuzzaman);
        Glide.with(this).load("https://bauet.ac.bd/ce/wp-content/uploads/sites/7/2020/12/Md.-Tanvir-Hasan-240x300.jpg").into(img_Tanver);

        card_Rashidul = findViewById(R.id.card_Rashidul);
        card_Rashidul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, RashidulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Mahmudur = findViewById(R.id.card_Mahmudur);
        card_Mahmudur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, MahmudurMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Shajahan = findViewById(R.id.card_Shajahan);
        card_Shajahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, ShajahanMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Shamima = findViewById(R.id.card_Shamima);
        card_Shamima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, ShamimaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Mohshin = findViewById(R.id.card_Mohshin);
        card_Mohshin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, MohshinMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Suraiya = findViewById(R.id.card_Suraiya);
        card_Suraiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, SuraiyaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Saddam = findViewById(R.id.card_Saddam);
        card_Saddam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, SaddamMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Rima = findViewById(R.id.card_Rima);
        card_Rima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, RimaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Rokonuzzaman = findViewById(R.id.card_Rokonuzzaman);
        card_Rokonuzzaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, RokonMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Tanver = findViewById(R.id.card_Tanver);
        card_Tanver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CEProfessionalMainActivity.this, TanverMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

    }
}