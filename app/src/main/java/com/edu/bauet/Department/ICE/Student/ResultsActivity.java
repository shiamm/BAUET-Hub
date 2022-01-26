package com.edu.bauet.Department.ICE.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ResultsActivity extends AppCompatActivity {
    private MaterialButton result_1,result_2, result_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        result_1=findViewById(R.id.result_1);
        result_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FICE-3rd-to-9th-Batch-Final-Fall-2020.pdf?alt=media&token=a16a4ba1-2f36-4140-8437-722f72787a13"));
                startActivity(intent);
            }
        });

        result_2=findViewById(R.id.result_2);
        result_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FICE-Result-Gazettee-Final-Summer-2020.pdf?alt=media&token=7acbb130-6523-4972-90d6-bce430561a8b"));
                startActivity(intent);
            }
        });

        result_3=findViewById(R.id.result_3);
        result_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FICE-3rd-to-8th-semeter-Summer-2021.pdf?alt=media&token=51998b80-c996-417b-b7e0-c7da28459f72"));
                startActivity(intent);
            }
        });

    }
}