package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE4th;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE4thMainActivity extends AppCompatActivity {
    MaterialCardView card_ice4212, card_ice4222, card_ice4262;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4th_main);

        card_ice4212= findViewById(R.id.card_ice4212);
        card_ice4212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thMainActivity.this, ICE4212Activity.class);
                startActivity(intent);
            }
        });

        card_ice4222= findViewById(R.id.card_ice4222);
        card_ice4222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thMainActivity.this, ICE4222Activity.class);
                startActivity(intent);
            }
        });

        card_ice4262= findViewById(R.id.card_ice4262);
        card_ice4262.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thMainActivity.this, ICE4262Activity.class);
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