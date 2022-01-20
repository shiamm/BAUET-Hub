package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4111Activity extends AppCompatActivity {
    private MaterialButton btn_ice4111_1,btn_ice4111_2,btn_ice4111_3,btn_ice4111_4,btn_ice4111_5,btn_ice4111_6,btn_ice4111_7,btn_ice4111_8,btn_ice4111_9,btn_ice4111_10,btn_ice4111_11,btn_ice4111_12,btn_ice4111_13,btn_ice4111_14,btn_ice4111_15,btn_ice4111_16,btn_ice4111_17,btn_ice4111_18,btn_ice4111_19,btn_ice4111_20,btn_ice4111_21,btn_ice4111_22,btn_ice4111_23,btn_ice4111_24,btn_ice4111_25,btn_ice4111_26,btn_ice4111_27,btn_ice4111_28,btn_ice4111_29,btn_ice4111_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4111);

        btn_ice4111_1=findViewById(R.id.btn_ice4111_1);
        btn_ice4111_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2F0.pptx?alt=media&token=de073a93-04e4-4248-894a-bd35da3ac3c3"));
                startActivity(intent);
            }
        });

        btn_ice4111_2=findViewById(R.id.btn_ice4111_2);
        btn_ice4111_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2F1.pptx?alt=media&token=1711ecc0-6269-4da2-ace8-d1918ec22990"));
                startActivity(intent);
            }
        });

        btn_ice4111_3=findViewById(R.id.btn_ice4111_3);
        btn_ice4111_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2Fsearch_01_breadth-first.pptx?alt=media&token=12c6329b-f4aa-4c2c-b7a1-787e558843ff"));
                startActivity(intent);
            }
        });

        btn_ice4111_4=findViewById(R.id.btn_ice4111_4);
        btn_ice4111_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2Fsearch_02_uniform%20cost.pptx?alt=media&token=65a76569-40f9-4b0a-8d5f-c58ecb43b688"));
                startActivity(intent);
            }
        });

        btn_ice4111_5=findViewById(R.id.btn_ice4111_5);
        btn_ice4111_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2Fsearch_03.pptx?alt=media&token=4e02b57d-d1c4-4479-aa39-cc15f05b80ae"));
                startActivity(intent);
            }
        });

        btn_ice4111_6=findViewById(R.id.btn_ice4111_6);
        btn_ice4111_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2FGAMES.pptx?alt=media&token=a6058f54-04fc-4d1a-b115-77838abd2bb0"));
                startActivity(intent);
            }
        });

        btn_ice4111_7=findViewById(R.id.btn_ice4111_7);
        btn_ice4111_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2FNLP.pptx?alt=media&token=91fe5aa4-74c2-4d7a-8c6a-7712342f428d"));
                startActivity(intent);
            }
        });

        btn_ice4111_8=findViewById(R.id.btn_ice4111_8);
        btn_ice4111_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2F6_neural%20network.docx?alt=media&token=5de97e76-d9b4-490b-a80b-ac6671b2512e"));
                startActivity(intent);
            }
        });

        btn_ice4111_9=findViewById(R.id.btn_ice4111_9);
        btn_ice4111_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2F7_learning%20process.docx?alt=media&token=f256dc94-00f2-4667-895c-9d1d8d2de65c"));
                startActivity(intent);
            }
        });

        btn_ice4111_10=findViewById(R.id.btn_ice4111_10);
        btn_ice4111_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204111%2FCNN.pptx?alt=media&token=2c10253c-c08d-4fcc-a61f-158ec83f4eb3"));
                startActivity(intent);
            }
        });


    }
}