package com.edu.bauet.Department.ICE.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class StudentMainActivity extends AppCompatActivity {
    MaterialCardView card_routine,card_troutine,card_result,card_ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main);

        card_routine = findViewById(R.id.card_routine);
        card_routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentMainActivity.this, RoutineActivity.class);
                startActivity(intent);
            }
        });

        card_troutine = findViewById(R.id.card_troutine);
        card_troutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentMainActivity.this, TRoutineActivity.class);
                startActivity(intent);
            }
        });

        card_result = findViewById(R.id.card_result);
        card_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentMainActivity.this, ResultsActivity.class);
                startActivity(intent);
            }
        });

        card_ct = findViewById(R.id.card_ct);
        card_ct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentMainActivity.this, CTActivity.class);
                startActivity(intent);
            }
        });
    }
}