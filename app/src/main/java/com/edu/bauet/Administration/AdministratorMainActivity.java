package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.Department.EEE.EEEProfessionalsMainActivity;
import com.edu.bauet.Department.EEE.Professionals.RezaulMainActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class AdministratorMainActivity extends AppCompatActivity {

    MaterialCardView card_chancellor, card_vc, card_board, card_syndicate, card_adminitrative, card_dean, card_academic_council, card_finance, card_treasurer, card_registarar, card_controller, card_library_office, card_proctor, card_std;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator_main);

        card_chancellor = findViewById(R.id.card_chancellor);
        card_chancellor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, ChancellorMainActivity.class);
                startActivity(intent);
            }
        });

        card_vc = findViewById(R.id.card_vc);
        card_vc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, ViceChancellorMainActivity.class);
                startActivity(intent);
            }
        });

        card_board = findViewById(R.id.card_board);
        card_board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, BoardofTrusteesMainActivity.class);
                startActivity(intent);
            }
        });
        card_academic_council = findViewById(R.id.card_academic_council);
        card_academic_council.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, AcademicCouncilMainActivity.class);
                startActivity(intent);
            }
        });
        card_syndicate = findViewById(R.id.card_syndicate);
        card_syndicate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, SyndicateofBAUETMainActivity.class);
                startActivity(intent);
            }
        });
        card_adminitrative = findViewById(R.id.card_adminitrative);
        card_adminitrative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, AdministrativeOfficersMainActivity.class);
                startActivity(intent);
            }
        });
        card_dean = findViewById(R.id.card_dean);
        card_dean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, DeanofFacultiesMainActivity.class);
                startActivity(intent);
            }
        });
        card_finance = findViewById(R.id.card_finance);
        card_finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, FinanceCommitteeMainActivity.class);
                startActivity(intent);
            }
        });
        card_treasurer = findViewById(R.id.card_treasurer);
        card_treasurer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, TreasurerMainActivity.class);
                startActivity(intent);
            }
        });
        card_registarar = findViewById(R.id.card_registarar);
        card_registarar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, RegistrarMainActivity.class);
                startActivity(intent);
            }
        });
        card_controller = findViewById(R.id.card_controller);
        card_controller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, ControllerofExamMainActivity.class);
                startActivity(intent);
            }
        });
        card_library_office = findViewById(R.id.card_library_office);
        card_library_office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, OfficeLibraryMainActivity.class);
                startActivity(intent);
            }
        });
        card_proctor = findViewById(R.id.card_proctor);
        card_proctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, ProctorMainActivity.class);
                startActivity(intent);
            }
        });
        card_std = findViewById(R.id.card_std);
        card_std.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdministratorMainActivity.this, StudentsWelfareMainActivity.class);
                startActivity(intent);
            }
        });

    }
}