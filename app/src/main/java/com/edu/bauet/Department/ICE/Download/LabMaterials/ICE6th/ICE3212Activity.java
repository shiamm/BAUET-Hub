package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3212Activity extends AppCompatActivity {
    private MaterialButton btn_ice3212_lab1, btn_ice3212_lab2, btn_ice3212_lab3, btn_ice3212_lab4, btn_ice3212_lab5, btn_ice3212_lab6, btn_ice3212_lab7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3212);
        btn_ice3212_lab1 = findViewById(R.id.btn_ice3212_lab1);
        btn_ice3212_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2F(Ex%20-%201).docx?alt=media&token=0a63a978-8180-407e-b2df-67618e7cfa6a"));
                startActivity(intent);
            }
        });
        btn_ice3212_lab2 = findViewById(R.id.btn_ice3212_lab2);
        btn_ice3212_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2F(Ex%20-2).docx?alt=media&token=ab995a51-1a81-434a-9a04-8a8f9c936eb6"));
                startActivity(intent);
            }
        });
        btn_ice3212_lab3 = findViewById(R.id.btn_ice3212_lab3);
        btn_ice3212_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2F(Ex%20-%203).docx?alt=media&token=644e3953-0d24-4373-a56e-d6df2689822e"));
                startActivity(intent);
            }
        });
        btn_ice3212_lab4 = findViewById(R.id.btn_ice3212_lab4);
        btn_ice3212_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2F(Ex%20-4).docx?alt=media&token=dca38c93-a75d-4efd-b5bd-14b71a776f3d"));
                startActivity(intent);
            }
        });
        btn_ice3212_lab5 = findViewById(R.id.btn_ice3212_lab5);
        btn_ice3212_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2F(Ex%20-5).docx?alt=media&token=5d67a3b9-aed5-4269-b935-219c7ce5a378"));
                startActivity(intent);
            }
        });
        btn_ice3212_lab6 = findViewById(R.id.btn_ice3212_lab6);
        btn_ice3212_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2FEx%20-%206).docx?alt=media&token=aeab7662-ac04-4aa1-b47d-2a4586008b59"));
                startActivity(intent);
            }
        });
        btn_ice3212_lab7 = findViewById(R.id.btn_ice3212_lab7);
        btn_ice3212_lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3212%2FEx%20-%207.docx?alt=media&token=65ffa855-ed11-4fbe-9fd0-99f195757274"));
                startActivity(intent);
            }
        });
    }
}