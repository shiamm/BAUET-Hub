package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE5thMainActivity extends AppCompatActivity {
    MaterialCardView card_ice4112, card_ice4122, card_ice4132;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice5th_main);

        card_ice4112= findViewById(R.id.card_ice4112);
        card_ice4112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thMainActivity.this, ICE4112Activity.class);
                startActivity(intent);
            }
        });

        card_ice4122= findViewById(R.id.card_ice4122);
        card_ice4122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thMainActivity.this, ICE4122Activity.class);
                startActivity(intent);
            }
        });

        card_ice4132= findViewById(R.id.card_ice4132);
        card_ice4132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE5thMainActivity.this, ICE4132Activity.class);
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