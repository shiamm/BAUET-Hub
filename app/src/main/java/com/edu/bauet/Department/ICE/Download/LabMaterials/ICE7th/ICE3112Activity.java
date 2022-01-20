package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3112Activity extends AppCompatActivity {
    private MaterialButton btn_ice3112_lab1, btn_ice3112_lab2, btn_ice3112_lab3, btn_ice3112_lab4, btn_ice3112_lab5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3112);

        btn_ice3112_lab1 = findViewById(R.id.btn_ice3112_lab1);
        btn_ice3112_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3112%2FLAB%20SESSION%2001.docx?alt=media&token=1d34ea0e-5f43-4244-8639-61e1b50ca633"));
                startActivity(intent);
            }
        });
        btn_ice3112_lab2 = findViewById(R.id.btn_ice3112_lab2);
        btn_ice3112_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3112%2FPresentation_SMW1_2_3_4.ppt?alt=media&token=922e4a8b-6120-411e-a13b-82e3a5b87278"));
                startActivity(intent);
            }
        });
        btn_ice3112_lab3 = findViewById(R.id.btn_ice3112_lab3);
        btn_ice3112_lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3112%2FBSCCL%20Presntation.pptx?alt=media&token=5ee4ace6-894d-4ef7-9ef4-f5d127a0b56c"));
                startActivity(intent);
            }
        });
        btn_ice3112_lab4 = findViewById(R.id.btn_ice3112_lab4);
        btn_ice3112_lab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3112%2FFiber-optic-Short-question%20for%20viva%2C%20quiz.pdf?alt=media&token=2890e664-d2f2-47b1-966f-f1e52c9412b2"));
                startActivity(intent);
            }
        });
        btn_ice3112_lab5 = findViewById(R.id.btn_ice3112_lab5);
        btn_ice3112_lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE7th%2F3112%2FOptical_Viva_Question.docx?alt=media&token=5cec5c91-fd76-431c-a7df-9c15bd3f6605"));
                startActivity(intent);
            }
        });
    }
}