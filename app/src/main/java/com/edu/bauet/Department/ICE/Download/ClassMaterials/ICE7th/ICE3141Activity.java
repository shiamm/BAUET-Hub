package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3141Activity extends AppCompatActivity {
    private MaterialButton btn_ice3141_1,btn_ice3141_2,btn_ice3141_3,btn_ice3141_4,btn_ice3141_5,btn_ice3141_6,btn_ice3141_7,btn_ice3141_8,btn_ice3141_9,btn_ice3141_10,btn_ice3141_11,btn_ice3141_12,btn_ice3141_13,btn_ice3141_14,btn_ice3141_15,btn_ice3141_16,btn_ice3141_17,btn_ice3141_18,btn_ice3141_19,btn_ice3141_20,btn_ice3141_21,btn_ice3141_22,btn_ice3141_23,btn_ice3141_24,btn_ice3141_25,btn_ice3141_26,btn_ice3141_27,btn_ice3141_28,btn_ice3141_29,btn_ice3141_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3141);

        btn_ice3141_1=findViewById(R.id.btn_ice3141_1);
        btn_ice3141_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%201%20Introduction.docx?alt=media&token=62658e99-0feb-4302-99e4-334fb5a46b69"));
                startActivity(intent);
            }
        });

        btn_ice3141_2=findViewById(R.id.btn_ice3141_2);
        btn_ice3141_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%202%20Antenna%20Parameters.docx?alt=media&token=9fab8384-e860-463e-81cf-3c82bc05bf56"));
                startActivity(intent);
            }
        });

        btn_ice3141_3=findViewById(R.id.btn_ice3141_3);
        btn_ice3141_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%204%20Wire%20Antenna.docx?alt=media&token=d3171711-ecd1-48e5-95fc-1f7166b5eb88"));
                startActivity(intent);
            }
        });

        btn_ice3141_4=findViewById(R.id.btn_ice3141_4);
        btn_ice3141_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%205%20Loop%20Antenna.docx?alt=media&token=38ffebb4-d9ce-47c2-8043-5b94bdea88d3"));
                startActivity(intent);
            }
        });

        btn_ice3141_5=findViewById(R.id.btn_ice3141_5);
        btn_ice3141_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%206%20Antenna%20Array.docx?alt=media&token=4f87f91d-b0da-4a17-b9ec-6ee83268b1e2"));
                startActivity(intent);
            }
        });

        btn_ice3141_6=findViewById(R.id.btn_ice3141_6);
        btn_ice3141_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%2014%20Microstrip%20Patch%20Antennas.docx?alt=media&token=57a483e6-4e55-466d-9f3f-b2c5fda05f94"));
                startActivity(intent);
            }
        });

        btn_ice3141_7=findViewById(R.id.btn_ice3141_7);
        btn_ice3141_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE7th%2FICE%203141%2FChapter%2016%20Antenna%20Measurement.docx?alt=media&token=81b2c123-a274-48c6-868d-9b3370b558e8"));
                startActivity(intent);
            }
        });

    }
}