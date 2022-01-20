package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4122Activity extends AppCompatActivity {
    private MaterialButton btn_ice4122_lab1, btn_ice4122_lab2, btn_ice4122_lab3, btn_ice4122_lab4, btn_ice4122_lab5, btn_ice4122_lab6, btn_ice4122_lab7, btn_ice4122_lab8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4122);

        btn_ice4122_lab1 = findViewById(R.id.btn_ice4122_lab1);
        btn_ice4122_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2FWAN(lab%201).docx?alt=media&token=c5b22a76-90f8-48d5-a1eb-7e0d72d0cee7"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab2 = findViewById(R.id.btn_ice4122_lab2);
        btn_ice4122_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2FRIP(lab%202).docx?alt=media&token=bb948758-8db4-4496-b131-f60879de5607"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab3 = findViewById(R.id.btn_ice4122_lab3);
        btn_ice4122_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2FOSPF(lab%203).docx?alt=media&token=0c6258ac-f80a-4f88-9e7b-3a57cafbc121"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab4 = findViewById(R.id.btn_ice4122_lab4);
        btn_ice4122_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2Ftelnet(lab%204).docx?alt=media&token=8bb40b99-4c20-48b7-abc4-28833ea7b7e9"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab5 = findViewById(R.id.btn_ice4122_lab5);
        btn_ice4122_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2Fdhcp(%20lab%205).docx?alt=media&token=64384384-2d4a-4af9-bc54-c3997d53967d"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab6 = findViewById(R.id.btn_ice4122_lab6);
        btn_ice4122_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2Fssh%20lab%206).docx?alt=media&token=17c4c035-d50a-4ecf-af9b-20453b98b728"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab7 = findViewById(R.id.btn_ice4122_lab7);
        btn_ice4122_lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4122%2Fdns(%20lab%207).docx?alt=media&token=95dcaf6a-d79c-4fee-9e33-ea9b3177127e"));
                startActivity(intent);
            }
        });
        btn_ice4122_lab8 = findViewById(R.id.btn_ice4122_lab8);
        btn_ice4122_lab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.filehorse.com/download-cisco-packet-tracer-64/"));
                startActivity(intent);
            }
        });
    }
}