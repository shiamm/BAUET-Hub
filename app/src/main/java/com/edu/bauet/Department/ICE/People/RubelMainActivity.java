package com.edu.bauet.Department.ICE.People;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class RubelMainActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton btncall, btnin, btnfb, btnmessenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rubel_main_activity);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        btnfb = findViewById(R.id.btnfb);
        btnin = findViewById(R.id.btnin);
        btncall = findViewById(R.id.btncall);

        btnmessenger = findViewById(R.id.btnmessenger);
        btnmessenger.setOnClickListener(this);

        btnfb.setOnClickListener(this);
        btnin.setOnClickListener(this);
        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnfb) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rubel.basar.5"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (v.getId() == R.id.btnmessenger) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.me/rubel.basar.5"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }  else if (v.getId() == R.id.btnin) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bd.linkedin.com/in/rubel-basar-0a638535"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (v.getId() == R.id.btncall) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01710280226"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    public void gmailButton(View view) {
        boolean isGmailInstalled = isAppInstalled(RubelMainActivity.this, "com.google.android.gm");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rubel@um.edu.my"});
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

    private boolean isAppInstalled(RubelMainActivity rubelMainActivity, String s) {
        return false;
    }

    public void whatsappButton(View v) {
        String num = "+880 1710-280226";
        String url = "https://api.whatsapp.com/send?phone=" + num;
        try {
            PackageManager pm = v.getContext().getPackageManager();
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            v.getContext().startActivity(i);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } catch (PackageManager.NameNotFoundException e) {
            v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }
}