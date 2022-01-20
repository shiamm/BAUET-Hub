package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3231Activity extends AppCompatActivity {
    private MaterialButton btn_ice3231_1,btn_ice3231_2,btn_ice3231_3,btn_ice3231_4,btn_ice3231_5,btn_ice3231_6,btn_ice3231_7,btn_ice3231_8,btn_ice3231_9,btn_ice3231_10,btn_ice3231_11,btn_ice3231_12,btn_ice3231_13,btn_ice3231_14,btn_ice3231_15,btn_ice3231_16,btn_ice3231_17,btn_ice3231_18,btn_ice3231_19,btn_ice3231_20,btn_ice3231_21,btn_ice3231_22,btn_ice3231_23,btn_ice3231_24,btn_ice3231_25,btn_ice3231_26,btn_ice3231_27,btn_ice3231_28,btn_ice3231_29,btn_ice3231_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3231);

        btn_ice3231_1=findViewById(R.id.btn_ice3231_1);
        btn_ice3231_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203231%2FChapter-19%20IP%20Address.pptx?alt=media&token=6ed8d76f-de90-4f56-af2f-b6d21ce90cd5"));
                startActivity(intent);
            }
        });

        btn_ice3231_2=findViewById(R.id.btn_ice3231_2);
        btn_ice3231_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203231%2Fclient%20server%20technology.pdf?alt=media&token=56a01226-cbb8-4b4c-9dfb-219c3d075c30"));
                startActivity(intent);
            }
        });

        btn_ice3231_3=findViewById(R.id.btn_ice3231_3);
        btn_ice3231_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203231%2Fepdf.tips_an-introduction-to-client-server-computing.pdf?alt=media&token=eb06b721-5c00-416c-8fbc-25697b97cd28"));
                startActivity(intent);
            }
        });

        btn_ice3231_4=findViewById(R.id.btn_ice3231_4);
        btn_ice3231_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203231%2FICE3231_LEC01_INTRODUCTION_13_04_2020.docx?alt=media&token=2dee6bbb-cdfa-43cf-a37c-3c3891bc8463"));
                startActivity(intent);
            }
        });

        btn_ice3231_5=findViewById(R.id.btn_ice3231_5);
        btn_ice3231_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203231%2FLecture%2018(Chapter-2).pptx?alt=media&token=74560006-9c94-43c0-81ad-545793b269cb"));
                startActivity(intent);
            }
        });

        btn_ice3231_6=findViewById(R.id.btn_ice3231_6);
        btn_ice3231_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203231%2FLecture%2019(Chapter-3).pptx?alt=media&token=e6bd06c7-c15e-4da6-b62f-3c4cb4056f6c"));
                startActivity(intent);
            }
        });


    }
}