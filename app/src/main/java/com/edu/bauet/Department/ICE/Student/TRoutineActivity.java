package com.edu.bauet.Department.ICE.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class TRoutineActivity extends AppCompatActivity {
    private MaterialButton rou_1,rou_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troutine);

        rou_1=findViewById(R.id.rou_1);
        rou_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FTeacher-wise-Combined-for-Web-31-AUG-2021-2.xlsx?alt=media&token=edbc055b-6757-491e-b51e-32a8810b7014"));
                startActivity(intent);
            }
        });

        rou_2=findViewById(R.id.rou_2);
        rou_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app-8d498.appspot.com/o/Other%2FTeacher-Wise-Routine-for-Class-room-Notice-board-1.docx?alt=media&token=8411043d-b98e-44d6-a50a-753430d04682"));
                startActivity(intent);
            }
        });

    }
}