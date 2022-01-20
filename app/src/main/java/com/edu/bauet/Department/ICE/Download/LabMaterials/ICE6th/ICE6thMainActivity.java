package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE6thMainActivity extends AppCompatActivity {
    MaterialCardView card_ice3212, card_ice3222, card_ice3232, card_ice3242;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice6th_main);

        card_ice3212 = findViewById(R.id.card_ice3212);
        card_ice3212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thMainActivity.this, ICE3212Activity.class);
                startActivity(intent);
            }
        });
        card_ice3222 = findViewById(R.id.card_ice3222);
        card_ice3222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thMainActivity.this, ICE3222Activity.class);
                startActivity(intent);
            }
        });
        card_ice3232 = findViewById(R.id.card_ice3232);
        card_ice3232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thMainActivity.this, ICE3232Activity.class);
                startActivity(intent);
            }
        });
        card_ice3242 = findViewById(R.id.card_ice3242);
        card_ice3242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE6thMainActivity.this, ICE3242Activity.class);
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