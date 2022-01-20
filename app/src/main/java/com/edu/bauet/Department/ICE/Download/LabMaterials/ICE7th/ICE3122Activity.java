package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE3122Activity extends AppCompatActivity {
    private MaterialButton btn_ice3122_lab1, btn_ice3122_lab2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice3122);
        btn_ice3122_lab1=findViewById(R.id.btn_ice3122_lab1);
        btn_ice3122_lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Lab Material%2FICE7th%2F3122%2FDSP LAB manual(MLH).docx?alt=media&token=a4fbf250-add4-4d79-81a9-7b55a6dd1ba3"));
                startActivity(intent);
            }
        });
        btn_ice3122_lab2=findViewById(R.id.btn_ice3122_lab2);
        btn_ice3122_lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://igetintopc.com/matlab-2017-free-download/"));
                startActivity(intent);
            }
        });
    }
}