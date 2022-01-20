package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3221Activity extends AppCompatActivity {
    private MaterialButton btn_ice3221_1,btn_ice3221_2,btn_ice3221_3,btn_ice3221_4,btn_ice3221_5,btn_ice3221_6,btn_ice3221_7,btn_ice3221_8,btn_ice3221_9,btn_ice3221_10,btn_ice3221_11,btn_ice3221_12,btn_ice3221_13,btn_ice3221_14,btn_ice3221_15,btn_ice3221_16,btn_ice3221_17,btn_ice3221_18,btn_ice3221_19,btn_ice3221_20,btn_ice3221_21,btn_ice3221_22,btn_ice3221_23,btn_ice3221_24,btn_ice3221_25,btn_ice3221_26,btn_ice3221_27,btn_ice3221_28,btn_ice3221_29,btn_ice3221_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3221);

        btn_ice3221_1=findViewById(R.id.btn_ice3221_1);
        btn_ice3221_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FChap2nd.pdf?alt=media&token=997ed536-84ad-4691-bb1a-8501402c5dc3"));
                startActivity(intent);
            }
        });

        btn_ice3221_2=findViewById(R.id.btn_ice3221_2);
        btn_ice3221_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FChap4.pdf?alt=media&token=edc56c37-0220-4020-aedf-c93b5c198fe4"));
                startActivity(intent);
            }
        });

        btn_ice3221_3=findViewById(R.id.btn_ice3221_3);
        btn_ice3221_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FChapt5.pdf?alt=media&token=fcb87109-5f8d-4729-8511-a5003c25d8e6"));
                startActivity(intent);
            }
        });

        btn_ice3221_4=findViewById(R.id.btn_ice3221_4);
        btn_ice3221_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FChapter3.pdf?alt=media&token=7fae89d2-d408-47b9-ba8f-50a8cdfa2d44"));
                startActivity(intent);
            }
        });

        btn_ice3221_5=findViewById(R.id.btn_ice3221_5);
        btn_ice3221_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FHUB_Bridge.pdf?alt=media&token=5c53dc84-954c-4167-932d-345107b9e4a5"));
                startActivity(intent);
            }
        });

        btn_ice3221_6=findViewById(R.id.btn_ice3221_6);
        btn_ice3221_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FIPV4_Datagram_Format.pdf?alt=media&token=36da88d6-077a-4048-a51b-aa5da09da542"));
                startActivity(intent);
            }
        });

        btn_ice3221_7=findViewById(R.id.btn_ice3221_7);
        btn_ice3221_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FLogical%20Address.pdf?alt=media&token=d49be65a-a8cb-4386-9274-554b60c4a736"));
                startActivity(intent);
            }
        });

        btn_ice3221_8=findViewById(R.id.btn_ice3221_8);
        btn_ice3221_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FMATH_IP_Address.pdf?alt=media&token=61840cf9-4f10-4f04-b8ff-281b1ad9e950"));
                startActivity(intent);
            }
        });

        btn_ice3221_9=findViewById(R.id.btn_ice3221_9);
        btn_ice3221_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FROUTER.pdf?alt=media&token=9faee6db-f865-4f87-b444-60be4087d63c"));
                startActivity(intent);
            }
        });

        btn_ice3221_10=findViewById(R.id.btn_ice3221_10);
        btn_ice3221_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FS%20%26%20R%20-%201st%20chapter.pdf?alt=media&token=23c11100-0626-424f-8cf8-789cf50b5a6c"));
                startActivity(intent);
            }
        });

        btn_ice3221_11=findViewById(R.id.btn_ice3221_11);
        btn_ice3221_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FSide_Tone.pdf?alt=media&token=ed71078f-d227-4d87-9cf0-cc19d0ff3da0"));
                startActivity(intent);
            }
        });

        btn_ice3221_12=findViewById(R.id.btn_ice3221_12);
        btn_ice3221_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE6th%2FICE%203221%2FVLAN.pdf?alt=media&token=e38627c1-1e17-4e93-909b-981d49e1677a"));
                startActivity(intent);
            }
        });

    }
}