package com.edu.bauet.Department.ICE.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class CTActivity extends AppCompatActivity {
    private MaterialButton CT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctactivity);

        CT=findViewById(R.id.CT);
        CT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FCT-Routine-Summer-2021.pdf?alt=media&token=143a1e16-2315-4808-831c-2dacede2a120"));
                startActivity(intent);
            }
        });


    }
}