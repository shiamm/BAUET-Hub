package com.edu.bauet.Department.ICE.Download;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ReportFormatActivity extends AppCompatActivity {
    private MaterialButton Thesis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_format);

        Thesis=findViewById(R.id.Thesis);
        Thesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FTh_Temp_ICE_BAUET.docx?alt=media&token=78acc40e-7992-4c6e-b765-2ac3ebce6930"));
                startActivity(intent);
            }
        });
    }
}