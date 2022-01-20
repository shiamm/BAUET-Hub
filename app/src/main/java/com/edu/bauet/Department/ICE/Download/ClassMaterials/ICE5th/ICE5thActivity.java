package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE5thActivity extends AppCompatActivity {
    MaterialCardView card_ice4111, card_ice4121, card_ice4131,card_ice4171;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice5th);

        card_ice4111= findViewById(R.id.card_ICE4111);
        card_ice4111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thActivity.this, ICE4111Activity.class);
                startActivity(intent);
            }
        });

        card_ice4121= findViewById(R.id.card_ICE4121);
        card_ice4121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thActivity.this, ICE4121Activity.class);
                startActivity(intent);
            }
        });

        card_ice4131= findViewById(R.id.card_ICE4131);
        card_ice4131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thActivity.this, ICE4131Activity.class);
                startActivity(intent);
            }
        });

        card_ice4171= findViewById(R.id.card_ICE4171);
        card_ice4171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thActivity.this, ICE4171Activity.class);
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