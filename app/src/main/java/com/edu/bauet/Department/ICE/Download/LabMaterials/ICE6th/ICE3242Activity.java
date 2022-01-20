package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3242Activity extends AppCompatActivity {
    private MaterialButton btn_ice3242_lab1, btn_ice4262_lab6, btn_ice3242_lab2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3242);

        btn_ice3242_lab1=findViewById(R.id.btn_ice3242_lab1);
        btn_ice3242_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3242%2FInformation%20System%20Analysis%20and%20Design%20Lab%20Manual.docx?alt=media&token=15d1f1a4-b22e-47ff-ab20-8b931fbcaf43"));
                startActivity(intent);
            }
        });

        btn_ice3242_lab2=findViewById(R.id.btn_ice3242_lab2);
        btn_ice3242_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://downloadsapachefriends.global.ssl.fastly.net/8.0.9/xampp-windows-x64-8.0.9-0-VS16-installer.exe?from_af=true"));
                startActivity(intent);
            }
        });



        btn_ice4262_lab6=findViewById(R.id.btn_ice4262_lab6);
        btn_ice4262_lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://download.sublimetext.com/sublime_text_build_4113_x64_setup.exe"));
                startActivity(intent);
            }
        });
    }
}