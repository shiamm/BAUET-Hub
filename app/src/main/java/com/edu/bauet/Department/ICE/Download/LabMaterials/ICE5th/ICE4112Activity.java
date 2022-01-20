package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4112Activity extends AppCompatActivity {
    private MaterialButton btn_ice4112_lab1,btn_ice4112_lab2,btn_ice4112_lab3,btn_ice4222_lab6,btn_ice4222_lab7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4112);

            btn_ice4112_lab1=findViewById(R.id.btn_ice4112_lab1);
            btn_ice4112_lab1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://codeload.github.com/PacktPublishing/Neural-Network-Projects-with-Python/zip/refs/heads/master"));
                    startActivity(intent);
                }
            });

            btn_ice4112_lab2=findViewById(R.id.btn_ice4112_lab2);
            btn_ice4112_lab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4112%2FNeural-Network-Projects-with-Python.pdf?alt=media&token=fc25baca-ca6c-4e3c-ace2-bd2f48c79437"));
                    startActivity(intent);
                }
            });

            btn_ice4112_lab3=findViewById(R.id.btn_ice4112_lab3);
            btn_ice4112_lab3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE5th%2F4112%2FNeural%20Networks%20-%20A%20Comprehensive%20Foundation%20-%20Simon%20Haykin.pdf?alt=media&token=bee79cc6-7b22-4c3b-955e-b59ed954c726"));
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