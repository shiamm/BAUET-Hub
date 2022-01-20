package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3222Activity extends AppCompatActivity {
    private MaterialButton btn_ice3222_lab1,btn_ice3222_lab2,btn_ice3222_lab3,btn_ice3222_lab4,btn_ice3222_lab5,btn_ice3222_lab6,btn_ice3222_lab7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3222);

        btn_ice3222_lab1 = findViewById(R.id.btn_ice3222_lab1);
        btn_ice3222_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3222%2FAmplitude-modulation.docx?alt=media&token=24c2a2e6-2ade-4fec-96f2-9ab50c9723bc"));
                startActivity(intent);
            }
        });
        btn_ice3222_lab2 = findViewById(R.id.btn_ice3222_lab2);
        btn_ice3222_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3222%2FASK.docx?alt=media&token=ab76c445-4b18-401a-b57b-9289b0e314e7"));
                startActivity(intent);
            }
        });
        btn_ice3222_lab3 = findViewById(R.id.btn_ice3222_lab3);
        btn_ice3222_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igetintopc.com/matlab-2017-free-download/"));
                startActivity(intent);
            }
        });

        btn_ice3222_lab4 = findViewById(R.id.btn_ice3222_lab4);
        btn_ice3222_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3222%2FFrequency%20Modulated%20Signal.m?alt=media&token=27ef59ab-379f-4ea4-8b57-fc35c0ae203f"));
                startActivity(intent);
            }
        });

        btn_ice3222_lab5 = findViewById(R.id.btn_ice3222_lab5);
        btn_ice3222_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3222%2FFrequency%20Shifed%20Layered%20Signal.m?alt=media&token=529c1052-9ea3-497c-9c43-56b5429c243d"));
                startActivity(intent);
            }
        });

        btn_ice3222_lab6 = findViewById(R.id.btn_ice3222_lab6);
        btn_ice3222_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3222%2FPhase%20Modulated%20Signal.m?alt=media&token=ae718fb7-131e-4deb-a644-485d7bd21834"));
                startActivity(intent);
            }
        });

        btn_ice3222_lab7 = findViewById(R.id.btn_ice3222_lab7);
        btn_ice3222_lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3222%2FPhase%20Shifed%20Layered%20Signal.m?alt=media&token=4974b714-11e9-4f20-8c4e-6f893c729adc"));
                startActivity(intent);
            }
        });
    }
}