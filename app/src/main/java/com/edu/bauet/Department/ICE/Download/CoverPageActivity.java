package com.edu.bauet.Department.ICE.Download;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class CoverPageActivity extends AppCompatActivity {
    private MaterialButton Toppage,Assignmenttop,ClassTesttop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_page);

        Toppage=findViewById(R.id.Toppage);
        Toppage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FTop-page-of-Lab-Report.pdf?alt=media&token=e0d1c366-1dc7-497a-89e8-65a3f0e0a2fd"));
                startActivity(intent);
            }
        });

        Assignmenttop=findViewById(R.id.Assignmenttop);
        Assignmenttop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FTop-Page-for-Assignment.pdf?alt=media&token=c8e7870d-3724-4b56-81d3-eedf8ff16312"));
                startActivity(intent);
            }
        });

        ClassTesttop=findViewById(R.id.ClassTesttop);
        ClassTesttop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FTop-Page-for-Class-Test.pdf?alt=media&token=3435963a-a807-4dee-b306-5c0083c28103"));
                startActivity(intent);
            }
        });
    }
}