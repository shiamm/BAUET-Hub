package com.edu.bauet.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.Admission.AdmissionNotice.AdmissionNoticeMainActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class AdmissionMainActivity extends AppCompatActivity {
    MaterialCardView card_notice, card_info, card_bank, card_waiver, card_apply, card_office;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_main);

        card_notice = findViewById(R.id.card_notice);
        card_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdmissionMainActivity.this, AdmissionNoticeMainActivity. class);
                startActivity(intent);
            }
        });
        card_info = findViewById(R.id.card_info);
        card_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdmissionMainActivity.this, AdmissionInformationActivity. class);
                startActivity(intent);
            }
        });

        card_bank = findViewById(R.id.card_bankdtl);
        card_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdmissionMainActivity.this,HowToPayActivity. class);
                startActivity(intent);
            }
        });
        card_waiver = findViewById(R.id.card_waiver);
        card_waiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdmissionMainActivity.this,ScholarshipWaiverActivity. class);
                startActivity(intent);
            }
        });
        card_apply = findViewById(R.id.card_apply);
        card_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bauet.ac.bd/oaf/"));
                startActivity(intent);
            }
        });
        card_office = findViewById(R.id.card_office);
        card_office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdmissionMainActivity.this,AdmissionOfficeActivity. class);
                startActivity(intent);
            }
        });

    }
}