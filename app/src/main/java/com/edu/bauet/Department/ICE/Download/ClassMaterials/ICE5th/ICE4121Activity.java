package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4121Activity extends AppCompatActivity {
    private MaterialButton btn_ice4121_1,btn_ice4121_2,btn_ice4121_3,btn_ice4121_4,btn_ice4121_5,btn_ice4121_6,btn_ice4121_7,btn_ice4121_8,btn_ice4121_9,btn_ice4121_10,btn_ice4121_11,btn_ice4121_12,btn_ice4121_13,btn_ice4121_14,btn_ice4121_15,btn_ice4121_16,btn_ice4121_17,btn_ice4121_18,btn_ice4121_19,btn_ice4121_20,btn_ice4121_21,btn_ice4121_22,btn_ice4121_23,btn_ice4121_24,btn_ice4121_25,btn_ice4121_26,btn_ice4121_27,btn_ice4121_28,btn_ice4121_29,btn_ice4121_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4121);

        btn_ice4121_1=findViewById(R.id.btn_ice4121_1);
        btn_ice4121_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter%201%20-%20Introduction.ppt?alt=media&token=8b2f3898-2e66-4ca4-96a9-3849073fc340"));
                startActivity(intent);
            }
        });

        btn_ice4121_2=findViewById(R.id.btn_ice4121_2);
        btn_ice4121_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter%202%20-%20Application%20Layer.ppt?alt=media&token=af927e0c-cd27-4108-bf27-767aa03962da"));
                startActivity(intent);
            }
        });

        btn_ice4121_3=findViewById(R.id.btn_ice4121_3);
        btn_ice4121_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter%203%20-%20Transport%20layer.ppt?alt=media&token=7d342b8e-df42-41ed-885d-eaca02f2c21e"));
                startActivity(intent);
            }
        });

        btn_ice4121_4=findViewById(R.id.btn_ice4121_4);
        btn_ice4121_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter%204%20-%20Network%20layer.ppt?alt=media&token=62f345de-5846-4607-8b29-1c201477147c"));
                startActivity(intent);
            }
        });

        btn_ice4121_5=findViewById(R.id.btn_ice4121_5);
        btn_ice4121_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter%205%20-%20Data%20link%20layer.ppt?alt=media&token=fddcfbd4-c97e-4ebd-9e0b-51203c8b5a7e"));
                startActivity(intent);
            }
        });

        btn_ice4121_6=findViewById(R.id.btn_ice4121_6);
        btn_ice4121_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter%207b%20-%20IP%20Addressing%20and%20Subnetting.ppt?alt=media&token=a3805821-13d7-45bf-8949-1dc59e2be9ab"));
                startActivity(intent);
            }
        });

        btn_ice4121_7=findViewById(R.id.btn_ice4121_7);
        btn_ice4121_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204121%2FChapter-19%20IP%20Address%20%5BRepaired%5D.pptx?alt=media&token=b0782acf-616c-4002-b7f1-2f294c192858"));
                startActivity(intent);
            }
        });

    }
}