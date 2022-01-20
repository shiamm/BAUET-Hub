package com.edu.bauet.Academic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.edu.bauet.R;

public class TranscriptDegreeCFDtilActivity extends AppCompatActivity {
private TextView link1,link2,link3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transcript_degree_c_f_dtil_activity);

        link1 = findViewById(R.id.link1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bauet.ac.bd/wp-content/uploads/2020/12/Application-form-for-Certificate.pdf"));
                startActivity(intent);
            }
        });
        link2 = findViewById(R.id.link2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bauet.ac.bd/wp-content/uploads/2020/12/Certificate-Application.pdf"));
                startActivity(intent);
            }
        });
        link3 = findViewById(R.id.link3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bauet.ac.bd/wp-content/uploads/2020/12/Clearance-form-final.pdf?_ga=2.211149205.1828183600.1628391578-541127397.1628391578"));
                startActivity(intent);
            }
        });
    }
}