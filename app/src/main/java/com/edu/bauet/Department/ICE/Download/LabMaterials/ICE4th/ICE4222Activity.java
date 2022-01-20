package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE4th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4222Activity extends AppCompatActivity {
    private MaterialButton btn_ice4222_lab1,btn_ice4222_lab2,btn_ice4222_lab3,btn_ice4222_lab4,btn_ice4222_lab5,btn_ice4222_lab6,btn_ice4222_lab7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4222);

        btn_ice4222_lab1=findViewById(R.id.btn_ice4222_lab1);
        btn_ice4222_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE4th%2F4222%2FNumpy%20practice.ipynb?alt=media&token=b02783dd-871d-4e33-a444-fc794f00b0c6"));
                startActivity(intent);
            }
        });

        btn_ice4222_lab2=findViewById(R.id.btn_ice4222_lab2);
        btn_ice4222_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE4th%2F4222%2FArithmatic.ipynb?alt=media&token=3134e708-60a6-40bc-9656-f2a20233dd1a"));
                startActivity(intent);
            }
        });

        btn_ice4222_lab3=findViewById(R.id.btn_ice4222_lab3);
        btn_ice4222_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE4th%2F4222%2FWelcome_To_Colaboratory.ipynb?alt=media&token=64490d7b-bec9-4d54-9202-3b2bd45fdba9"));
                startActivity(intent);
            }
        });


        btn_ice4222_lab4=findViewById(R.id.btn_ice4222_lab4);
        btn_ice4222_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE4th%2F4222%2FMarket_Basket_Optimisation.csv?alt=media&token=e10993d1-7eaa-4758-99b9-3f757ef72cf5"));
                startActivity(intent);
            }
        });

        btn_ice4222_lab5=findViewById(R.id.btn_ice4222_lab5);
        btn_ice4222_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://research.google.com/colaboratory/"));
                startActivity(intent);
            }
        });

        btn_ice4222_lab6=findViewById(R.id.btn_ice4222_lab6);
        btn_ice4222_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://repo.anaconda.com/archive/Anaconda3-2021.05-Windows-x86_64.exe"));
                startActivity(intent);
            }
        });


        btn_ice4222_lab7=findViewById(R.id.btn_ice4222_lab7);
        btn_ice4222_lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://repo.anaconda.com/archive/Anaconda3-2021.05-Windows-x86.exe"));
                startActivity(intent);
            }
        });
    }
}