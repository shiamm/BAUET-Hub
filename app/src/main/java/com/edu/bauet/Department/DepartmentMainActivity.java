package com.edu.bauet.Department;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.edu.bauet.Department.CE.CEProfessionalMainActivity;
import com.edu.bauet.Department.CSE.CSEProfessionalsMainActivity;
import com.edu.bauet.Department.EEE.EEEProfessionalsMainActivity;
import com.edu.bauet.Department.ICE.ICEActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class DepartmentMainActivity extends AppCompatActivity {

    MaterialCardView card_ice, card_cse, card_ce, card_eee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_main_activity);


        card_ice = findViewById(R.id.card_ice);
        card_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepartmentMainActivity.this, ICEActivity.class);
                startActivity(intent);
            }
        });


        card_cse = findViewById(R.id.card_cse);
        card_cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepartmentMainActivity.this, CSEProfessionalsMainActivity.class);
                startActivity(intent);
            }
        });

        card_ce = findViewById(R.id.card_ce);
        card_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepartmentMainActivity.this, CEProfessionalMainActivity.class);
                startActivity(intent);
            }
        });

        card_eee = findViewById(R.id.card_eee);
        card_eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepartmentMainActivity.this, EEEProfessionalsMainActivity.class);
                startActivity(intent);
            }
        });
    }
}