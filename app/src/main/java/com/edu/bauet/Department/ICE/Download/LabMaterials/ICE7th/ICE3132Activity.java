package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3132Activity extends AppCompatActivity {
    private MaterialButton btn_ice3132_lab1, btn_ice3132_lab2, btn_ice3132_lab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3132);
        btn_ice3132_lab1 = findViewById(R.id.btn_ice3132_lab1);
        btn_ice3132_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://codeload.github.com/PacktPublishing/Android-Programming-for-Beginners/zip/refs/heads/master"));
                startActivity(intent);
            }
        });
        btn_ice3132_lab2 = findViewById(R.id.btn_ice3132_lab2);
        btn_ice3132_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3132%2FJohn%20Horton%20-%20Android%20Programming%20for%20Beginners-Packt%20Publishing%20-%20ebooks%20Account%20(2015).pdf?alt=media&token=ccc9a8eb-10ab-486d-9dac-00b679fd1ed9"));
                startActivity(intent);
            }
        });
        btn_ice3132_lab3 = findViewById(R.id.btn_ice3132_lab3);
        btn_ice3132_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://r4---sn-npoeeney.gvt1.com/edgedl/android/studio/install/2020.3.1.23/android-studio-2020.3.1.23-windows.exe?mh=Mb&pl=24&shardbypass=yes&redirect_counter=1&rm=sn-bg5hxxo2ivox-wngl7z&req_id=1aa75c067a069bb9&cms_redirect=yes&mip=37.111.222.57&mm=42&mn=sn-npoeeney&ms=onc&mt=1629362184&mv=m&mvi=4&rmhost=r5---sn-npoeeney.gvt1.com"));
                startActivity(intent);
            }
        });
    }
}