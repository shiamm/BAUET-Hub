package com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ICE7thMainActivity extends AppCompatActivity {
    MaterialCardView card_ice3112, card_ice3122, card_ice3132, card_ice3142;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice7th_main);

        card_ice3112 = findViewById(R.id.card_ice3112);
        card_ice3112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thMainActivity.this, ICE3112Activity.class);
                startActivity(intent);
            }
        });
        card_ice3122 = findViewById(R.id.card_ice3122);
        card_ice3122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thMainActivity.this, ICE3122Activity.class);
                startActivity(intent);
            }
        });
        card_ice3132 = findViewById(R.id.card_ice3132);
        card_ice3132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thMainActivity.this, ICE3132Activity.class);
                startActivity(intent);
            }
        });
        card_ice3142 = findViewById(R.id.card_ice3142);
        card_ice3142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICE7thMainActivity.this, ICE3142Activity.class);
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