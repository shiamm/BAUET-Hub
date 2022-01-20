package com.edu.bauet.About_Us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class Contact_Us_Activity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton btncall1, btncall2, btnmaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        btncall1 = findViewById(R.id.btncall1);
        btncall2 = findViewById(R.id.btncall2);
        btnmaps  = findViewById(R.id.btnmaps);

        btncall1.setOnClickListener(this);
        btncall2.setOnClickListener(this);
        btnmaps.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btncall1) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01708503504"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (v.getId() == R.id.btncall2) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01708503503"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (v.getId() == R.id.btnmaps) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:24.290094,89.009396"));
            //intent.setPackage("com.google.android.apps.maps");
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    public void gmailButton(View view) {
        boolean isGmailInstalled = isAppInstalled(Contact_Us_Activity.this, "com.google.android.gm");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@bauet.ac.bd"});
        if (isGmailInstalled) {
            intent.setType("text/html");
            intent.setPackage("com.google.android.gm");
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else {
            intent.setType("message/rfc822");
            intent.setPackage("com.google.android.gm");
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    private boolean isAppInstalled(Contact_Us_Activity contact_now_activity, String s) {
        return false;
    }
}