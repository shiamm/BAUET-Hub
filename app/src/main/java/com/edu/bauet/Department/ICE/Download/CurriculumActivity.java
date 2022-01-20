package com.edu.bauet.Department.ICE.Download;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class CurriculumActivity extends AppCompatActivity {
    private MaterialButton syl_1,syl_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curriculum);

        syl_1=findViewById(R.id.syl_1);
        syl_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FICE-Syllabus-2nd-Edition.pdf?alt=media&token=883518eb-ea1c-4b82-b302-e11d81144cb4"));
                startActivity(intent);
            }
        });

        syl_2=findViewById(R.id.syl_2);
        syl_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FICE-Old-Syllabus-1st-Edition-2016.pdf?alt=media&token=437213b2-bc87-4e4b-ab65-78b1e0c8561c"));
                startActivity(intent);
            }
        });

    }
}