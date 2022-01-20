package com.edu.bauet.Department.ICE.Download;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Department.ICE.Download.ClassMaterials.ClassMaterialsActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.BatchActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class DownloadMainActivity extends AppCompatActivity {
MaterialCardView card_labmaterials,card_classmaterials,card_cover,card_report,card_forms,card_Curriculum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_main);

        card_labmaterials = findViewById(R.id.card_labmaterials);
        card_labmaterials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DownloadMainActivity.this, BatchActivity.class);
                startActivity(intent);
            }
        });

        card_classmaterials = findViewById(R.id.card_classmaterials);
        card_classmaterials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DownloadMainActivity.this, ClassMaterialsActivity.class);
                startActivity(intent);
            }
        });

        card_Curriculum = findViewById(R.id.card_Curriculum);
        card_Curriculum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DownloadMainActivity.this, CurriculumActivity.class);
                startActivity(intent);
            }
        });

        card_cover = findViewById(R.id.card_cover);
        card_cover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DownloadMainActivity.this, CoverPageActivity.class);
                startActivity(intent);
            }
        });

        card_report = findViewById(R.id.card_report);
        card_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DownloadMainActivity.this, ReportFormatActivity.class);
                startActivity(intent);
            }
        });

        card_forms = findViewById(R.id.card_forms);
        card_forms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DownloadMainActivity.this, FormsActivity.class);
                startActivity(intent);
            }
        });
    }
}