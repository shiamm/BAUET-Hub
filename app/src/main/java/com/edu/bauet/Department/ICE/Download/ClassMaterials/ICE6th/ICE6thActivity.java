package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE5th.ICE4111Activity;
import com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE5th.ICE5thActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE6thActivity extends AppCompatActivity {
    MaterialCardView card_ice3211, card_ice3221, card_ice3231, card_ice3241, card_ice3251;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice6th);

        card_ice3211 = findViewById(R.id.card_ICE3211);
        card_ice3211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thActivity.this, ICE3211Activity.class);
                startActivity(intent);
            }
        });
        card_ice3221 = findViewById(R.id.card_ICE3221);
        card_ice3221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thActivity.this, ICE3221Activity.class);
                startActivity(intent);
            }
        });
        card_ice3231 = findViewById(R.id.card_ICE3231);
        card_ice3231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thActivity.this, ICE3231Activity.class);
                startActivity(intent);
            }
        });
        card_ice3241 = findViewById(R.id.card_ICE3241);
        card_ice3241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thActivity.this, ICE3241Activity.class);
                startActivity(intent);
            }
        });
        card_ice3251 = findViewById(R.id.card_ICE3251);
        card_ice3251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thActivity.this, ICE3251Activity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        MaterialAlertDialogBuilder builder=new MaterialAlertDialogBuilder(this);
        builder.setMessage("Are you sure you want to Logout?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}