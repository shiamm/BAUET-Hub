package com.edu.bauet.Academic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class AcademicRegulationsActivity extends AppCompatActivity {
    private MaterialButton academic_regulations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_regulations);

        academic_regulations=findViewById(R.id.academic_regulations);
        academic_regulations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bauet.ac.bd/wp-content/uploads/2020/12/Examination-policy-.pdf"));
                startActivity(intent);
            }
        });
    }
}