package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE4th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4221Activity extends AppCompatActivity {
    private MaterialButton btn_ice4221_1,btn_ice4221_2,btn_ice4221_3,btn_ice4221_4,btn_ice4221_5,btn_ice4221_6,btn_ice4221_7,btn_ice4221_8,btn_ice4221_9,btn_ice4221_10,btn_ice4221_11,btn_ice4221_12,btn_ice4221_13,btn_ice4221_14,btn_ice4221_15,btn_ice4221_16,btn_ice4221_17,btn_ice4221_18,btn_ice4221_19,btn_ice4221_20,btn_ice4221_21,btn_ice4221_22,btn_ice4221_23,btn_ice4221_24,btn_ice4221_25,btn_ice4221_26,btn_ice4221_27,btn_ice4221_28,btn_ice4221_29,btn_ice4221_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4221);

        btn_ice4221_1=findViewById(R.id.btn_ice4221_1);
        btn_ice4221_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE4th%2FICE%204221%2FFE1%20Variable%20Type.pptx?alt=media&token=1c067a08-a422-41c7-a9f3-be48d7e10aee"));
                startActivity(intent);
            }
        });

        btn_ice4221_2=findViewById(R.id.btn_ice4221_2);
        btn_ice4221_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE4th%2FICE%204221%2FFE2%20Variable%20Characteristics.pptx?alt=media&token=ccba560e-0350-4ead-890b-ddc15b53c2a4"));
                startActivity(intent);
            }
        });

        btn_ice4221_3=findViewById(R.id.btn_ice4221_3);
        btn_ice4221_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE4th%2FICE%204221%2FFE3%20OneHotEncoding.pdf?alt=media&token=005f799a-738a-42a7-8ce6-61c1c86eec9a"));
                startActivity(intent);
            }
        });

        btn_ice4221_4=findViewById(R.id.btn_ice4221_4);
        btn_ice4221_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE4th%2FICE%204221%2FFE4%20Missing%20Value.pptx?alt=media&token=477a3692-2bec-4a42-bde5-7a1b7880029c"));
                startActivity(intent);
            }
        });

        btn_ice4221_5=findViewById(R.id.btn_ice4221_5);
        btn_ice4221_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE4th%2FICE%204221%2FFE5%20%20Variable%20Transformation%20%26%20Discritization.pptx?alt=media&token=e8493584-9400-45b8-9b72-8e292b44e614"));
                startActivity(intent);
            }
        });

        btn_ice4221_6=findViewById(R.id.btn_ice4221_6);
        btn_ice4221_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE4th%2FICE%204221%2FFE6%20Outlier%20%26%20Feature%20Scaling.pptx?alt=media&token=74477158-15b9-46ca-a190-d0ce3002ebf3"));
                startActivity(intent);
            }
        });


    }
}