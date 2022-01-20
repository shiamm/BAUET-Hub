package com.edu.bauet.Department.ICE.Download;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class FormsActivity extends AppCompatActivity {
    private MaterialButton course,application,Cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        course=findViewById(R.id.course);
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FFillable-Course-Registration-Summer-2021.pdf?alt=media&token=188cc381-5981-4669-b578-9f442b96ea62"));
                startActivity(intent);
            }
        });

        application=findViewById(R.id.application);
        application.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FFillable-Application-form-for-EXAM-New-2021.pdf?alt=media&token=15f747ce-356f-4130-b959-9b0c96610f70"));
                startActivity(intent);
            }
        });

        Cancel=findViewById(R.id.cancel);
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FAdmission-Cancellation-Form.pdf?alt=media&token=b6ca4557-8089-404f-b7a6-57a39587953e"));
                startActivity(intent);
            }
        });
    }
}