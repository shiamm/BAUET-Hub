package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4132Activity extends AppCompatActivity {
    private MaterialButton btn_ice4132_lab1, btn_ice4132_lab2, btn_ice4132_lab3, btn_ice4132_lab4, btn_ice4132_lab5, btn_ice4132_lab6, btn_ice4132_lab7, btn_ice4132_lab8, btn_ice4132_lab9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4132);
        btn_ice4132_lab1 = findViewById(R.id.btn_ice4132_lab1);
        btn_ice4132_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%201.pdf?alt=media&token=c6f1a7c7-1c5d-4d34-bbca-2b0dfdfbdcc0"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab2 = findViewById(R.id.btn_ice4132_lab2);
        btn_ice4132_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%202.pdf?alt=media&token=26f55e21-1be2-403d-8f92-bfb02ebb17d0"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab3 = findViewById(R.id.btn_ice4132_lab3);
        btn_ice4132_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%203.pdf?alt=media&token=55f933e3-0070-41f5-b915-6a77f1ee75e9"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab4 = findViewById(R.id.btn_ice4132_lab4);
        btn_ice4132_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%204.pdf?alt=media&token=f9b3619f-b2b9-4344-af89-f8ea382db3c6"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab5 = findViewById(R.id.btn_ice4132_lab5);
        btn_ice4132_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%205.pdf?alt=media&token=b1168fb4-5cc0-47ec-92c3-2b295452f9cc"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab6 = findViewById(R.id.btn_ice4132_lab6);
        btn_ice4132_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%206.pdf?alt=media&token=68cbc356-2aef-4280-8f04-e51da5ff16e9"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab7 = findViewById(R.id.btn_ice4132_lab7);
        btn_ice4132_lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%207.pdf?alt=media&token=c2f0cb44-e719-46d4-91eb-5a9d96a1c4b1"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab8 = findViewById(R.id.btn_ice4132_lab8);
        btn_ice4132_lab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4132%2FDBMS%20Lab%20Report%2C%20Lab%20-%20%208.pdf?alt=media&token=3b1ec212-407c-4e8a-8026-0519d96087d2"));
                startActivity(intent);
            }
        });
        btn_ice4132_lab9 = findViewById(R.id.btn_ice4132_lab9);
        btn_ice4132_lab9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cdn.mysql.com//Downloads/MySQLInstaller/mysql-installer-community-8.0.26.0.msi"));
                startActivity(intent);
            }
        });
    }
}