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
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class ShamsActivity extends AppCompatActivity implements View.OnClickListener{
    private MaterialButton btncall, btnin, btnfb, btnmessenger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shams);
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
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shams.tabrig"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (v.getId() == R.id.btnmessenger) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.me/shams.tabrig"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }  else if (v.getId() == R.id.btnin) {
            Snackbar snackbar=Snackbar.make(v,"Shams Tabrig is not available in Linkedin.",Snackbar.LENGTH_LONG);
            snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            snackbar.show();
        } else if (v.getId() == R.id.btncall) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01713748631"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    public void gmailButton(View view) {
        boolean isGmailInstalled = isAppInstalled(ShamsActivity.this, "com.google.android.gm");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"shamsbauet@gmail.com"});
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

    private boolean isAppInstalled(ShamsActivity rubayatYasminActivity, String s) {
        return false;
    }

    public void whatsappButton(View v) {
        String num = "+880 1713-748631";
        String url = "https://api.whatsapp.com/send?phone=" + num;
        try {
            PackageManager pm = v.getContext().getPackageManager();
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            v.getContext().startActivity(i);
        } catch (PackageManager.NameNotFoundException e) {
            v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }
    @Override
    public void finish() {
        super.finish();
    }
}