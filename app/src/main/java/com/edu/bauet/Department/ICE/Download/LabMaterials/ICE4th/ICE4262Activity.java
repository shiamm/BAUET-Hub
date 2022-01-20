package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE4th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4262Activity extends AppCompatActivity {
    private MaterialButton btn_ice4262_lab1,btn_ice4262_lab2,btn_ice4262_lab3,btn_ice4262_lab4,btn_ice4262_lab5,btn_ice4262_lab6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4262);

        btn_ice4262_lab1=findViewById(R.id.btn_ice4262_lab1);
        btn_ice4262_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE4th%2F4262%2FICE%204262%20Lab%20Manual%20.pdf?alt=media&token=6f83d54e-7be7-4379-be18-306c43a18215"));
                startActivity(intent);
            }
        });

        btn_ice4262_lab2=findViewById(R.id.btn_ice4262_lab2);
        btn_ice4262_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://netix.dl.sourceforge.net/project/brackets.mirror/release-1.14.2/Brackets.Release.1.14.2.msi"));
                startActivity(intent);
            }
        });

        btn_ice4262_lab3=findViewById(R.id.btn_ice4262_lab3);
        btn_ice4262_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://atom-installer.github.com/v1.58.0/AtomSetup-x64.exe?s=1627025639&ext=.exe"));
                startActivity(intent);
            }
        });


        btn_ice4262_lab4=findViewById(R.id.btn_ice4262_lab4);
        btn_ice4262_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://az764295.vo.msecnd.net/stable/379476f0e13988d90fab105c5c19e7abc8b1dea8/VSCodeUserSetup-x64-1.59.0.exe"));
                startActivity(intent);
            }
        });

        btn_ice4262_lab5=findViewById(R.id.btn_ice4262_lab5);
        btn_ice4262_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://az764295.vo.msecnd.net/stable/379476f0e13988d90fab105c5c19e7abc8b1dea8/VSCodeUserSetup-ia32-1.59.0.exe"));
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