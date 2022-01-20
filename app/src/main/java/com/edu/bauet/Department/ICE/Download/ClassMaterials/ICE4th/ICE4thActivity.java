package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE4th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE4thActivity extends AppCompatActivity {
    MaterialCardView card_ice4211, card_ice4221, card_ice4231,card_ice4261;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4th);

        card_ice4211= findViewById(R.id.card_ICE4211);
        card_ice4211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thActivity.this, ICE4211Activity.class);
                startActivity(intent);
            }
        });

        card_ice4221= findViewById(R.id.card_ICE4221);
        card_ice4221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thActivity.this, ICE4221Activity.class);
                startActivity(intent);
            }
        });

        card_ice4231= findViewById(R.id.card_ICE4231);
        card_ice4231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thActivity.this, ICE4231Activity.class);
                startActivity(intent);
            }
        });

        card_ice4261= findViewById(R.id.card_ICE4261);
        card_ice4261.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE4thActivity.this, ICE4261Activity.class);
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