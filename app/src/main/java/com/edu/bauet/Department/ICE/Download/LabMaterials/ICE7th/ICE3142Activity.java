package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3142Activity extends AppCompatActivity {
    private MaterialButton btn_ice3142_lab1, btn_ice3142_lab2, btn_ice3142_lab3, btn_ice3142_lab4, btn_ice3142_lab5, btn_ice3142_lab6, btn_ice3142_lab7, btn_ice3142_lab8, btn_ice3142_lab9, btn_ice3142_lab10, btn_ice3142_lab11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3142);
        btn_ice3142_lab1 = findViewById(R.id.btn_ice3142_lab1);
        btn_ice3142_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2001%20MNH%20ICE%203142%20Antenna%20sessional%2006%20%20October%202020.docx?alt=media&token=f6ef9982-f4f0-44e3-aa22-e09dec4ccc0b"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab2 = findViewById(R.id.btn_ice3142_lab2);
        btn_ice3142_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2002%20MNH%20ICE%203142%20Antenna%20sessional%2020%20October%202020.docx?alt=media&token=98fdd685-74c7-45d0-8844-c83e794a3acc"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab3 = findViewById(R.id.btn_ice3142_lab3);
        btn_ice3142_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2003%20MNH%20ICE%203142%20Antenna%20sessional%209%20june%202020.docx?alt=media&token=adfe101b-c942-4e47-a2a5-3bcb914a32a0"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab4 = findViewById(R.id.btn_ice3142_lab4);
        btn_ice3142_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2004%20MNH%20ICE%203142%20Antenna%20sessional%2016%20june%202020.docx?alt=media&token=c4855014-2132-416a-88e4-0b7c5e1b0844"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab5 = findViewById(R.id.btn_ice3142_lab5);
        btn_ice3142_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2005%20MNH%20ICE%203142%20Antenna%20sessional%2023%20june%202020.docx?alt=media&token=7c0fec04-789a-4acb-9a79-a26813229272"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab6 = findViewById(R.id.btn_ice3142_lab6);
        btn_ice3142_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2006%20MNH%20ICE%203142%20Antenna%20sessional%2030%20june%202020.docx?alt=media&token=ba9c3f38-0e08-45da-b13f-8d5fb8cad79c"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab7 = findViewById(R.id.btn_ice3142_lab7);
        btn_ice3142_lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2007%20MNH%20ICE%203142%20Antenna%20sessional%2007%20july%202020.docx?alt=media&token=287dabd5-7b8f-4923-96cc-e2b6f2ac28f8"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab8 = findViewById(R.id.btn_ice3142_lab8);
        btn_ice3142_lab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2008%20MNH%20ICE%203142%20Antenna%20sessional%2014%20july%202020.docx?alt=media&token=9d9687e6-13a0-4e86-b766-26cfdd1b86ab"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab9 = findViewById(R.id.btn_ice3142_lab9);
        btn_ice3142_lab9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3142%2FLec%2009%20MNH%20ICE%203142%20Antenna%20sessional%2021%20july%202020.docx?alt=media&token=3e0eb6af-e8fd-4015-b26c-1fff0101f27d"));
                startActivity(intent);
            }
        });
        btn_ice3142_lab10 = findViewById(R.id.btn_ice3142_lab10);
        btn_ice3142_lab10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igetintopc.com/cst-studio-suite-2019-free-download/"));
                startActivity(intent);
            }
        });


    }
}