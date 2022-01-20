package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3232Activity extends AppCompatActivity {
    private MaterialButton btn_ice3232_lab1,btn_ice3232_lab2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3232);

        btn_ice3232_lab1 = findViewById(R.id.btn_ice3232_lab1);
        btn_ice3232_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab%20Material%2FICE6th%2F3232%2FLab%20manual.pdf?alt=media&token=37ac6677-d1cc-4495-8e61-fb0ecea248e0"));
                startActivity(intent);
            }
        });
        btn_ice3232_lab2 = findViewById(R.id.btn_ice3232_lab2);
        btn_ice3232_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.filehorse.com/download-cisco-packet-tracer-64/"));
                startActivity(intent);
            }
        });
    }
}