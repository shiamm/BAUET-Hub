package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3131Activity extends AppCompatActivity {
    private MaterialButton btn_ice3131_1,btn_ice3131_2,btn_ice3131_3,btn_ice3131_4,btn_ice3131_5,btn_ice3131_6,btn_ice3131_7,btn_ice3131_8,btn_ice3131_9,btn_ice3131_10,btn_ice3131_11,btn_ice3131_12,btn_ice3131_13,btn_ice3131_14,btn_ice3131_15,btn_ice3131_16,btn_ice3131_17,btn_ice3131_18,btn_ice3131_19,btn_ice3131_20,btn_ice3131_21,btn_ice3131_22,btn_ice3131_23,btn_ice3131_24,btn_ice3131_25,btn_ice3131_26,btn_ice3131_27,btn_ice3131_28,btn_ice3131_29,btn_ice3131_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3131);

        btn_ice3131_1=findViewById(R.id.btn_ice3131_1);
        btn_ice3131_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2Faccess%20modifier.docx?alt=media&token=4c0fe490-2468-499c-821f-534b81e5bbf1"));
                startActivity(intent);
            }
        });

        btn_ice3131_2=findViewById(R.id.btn_ice3131_2);
        btn_ice3131_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FAccess-Modifiers-in-Java.pdf?alt=media&token=da6b2d21-2fad-4049-adb4-0cf0b6a4a385"));
                startActivity(intent);
            }
        });

        btn_ice3131_3=findViewById(R.id.btn_ice3131_3);
        btn_ice3131_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FException%20Handling.ppt?alt=media&token=76940284-52f3-40c6-859b-c28e16e9aaf9"));
                startActivity(intent);
            }
        });

        btn_ice3131_4=findViewById(R.id.btn_ice3131_4);
        btn_ice3131_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FIntroduction%20to%20Java.ppt?alt=media&token=1d3ba8b7-11c4-4690-a195-f2bdd0fef789"));
                startActivity(intent);
            }
        });

        btn_ice3131_5=findViewById(R.id.btn_ice3131_5);
        btn_ice3131_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2Fjava%20basic.pptx?alt=media&token=374c4df7-3a45-4883-a189-09b06bfcc09a"));
                startActivity(intent);
            }
        });

        btn_ice3131_6=findViewById(R.id.btn_ice3131_6);
        btn_ice3131_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FJDBC%2020130209.ppt?alt=media&token=dff2a915-4b76-40b0-ba54-29e58ad0957a"));
                startActivity(intent);
            }
        });

        btn_ice3131_7=findViewById(R.id.btn_ice3131_7);
        btn_ice3131_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FSocket%20Programming-20130202.ppt?alt=media&token=f52d688b-2e00-498d-8a2b-9ea182b44270"));
                startActivity(intent);
            }
        });

        btn_ice3131_8=findViewById(R.id.btn_ice3131_8);
        btn_ice3131_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FStreams%20and%20Input%20Output%20Programming-20121213.ppt?alt=media&token=9abeffb7-7fc0-4f2a-a655-deb7a4d3f79c"));
                startActivity(intent);
            }
        });

        btn_ice3131_9=findViewById(R.id.btn_ice3131_9);
        btn_ice3131_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FThreads.pdf?alt=media&token=6d0049f8-bd07-493d-b308-cd9bdd23b78c"));
                startActivity(intent);
            }
        });

        btn_ice3131_10=findViewById(R.id.btn_ice3131_10);
        btn_ice3131_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203131%2FUsing%20Standard%20Java%20Packages.ppt?alt=media&token=e1b4503f-647f-4bd3-8d37-2d1a7b98ec71"));
                startActivity(intent);
            }
        });

    }
}