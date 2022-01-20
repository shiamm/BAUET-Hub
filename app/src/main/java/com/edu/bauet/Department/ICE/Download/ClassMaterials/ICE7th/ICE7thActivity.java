package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE6th.ICE3211Activity;
import com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE6th.ICE6thActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE7thActivity extends AppCompatActivity {
    MaterialCardView card_ice3111, card_ice3121, card_ice3131, card_ice3141;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice7th);

        card_ice3111 = findViewById(R.id.card_ice3111);
        card_ice3111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thActivity.this, ICE3111Activity.class);
                startActivity(intent);
            }
        });

        card_ice3121 = findViewById(R.id.card_ice3121);
        card_ice3121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thActivity.this, ICE3121Activity.class);
                startActivity(intent);
            }
        });

        card_ice3131 = findViewById(R.id.card_ice3131);
        card_ice3131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thActivity.this, ICE3131Activity.class);
                startActivity(intent);
            }
        });

        card_ice3141 = findViewById(R.id.card_ice3141);
        card_ice3141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thActivity.this, ICE3141Activity.class);
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