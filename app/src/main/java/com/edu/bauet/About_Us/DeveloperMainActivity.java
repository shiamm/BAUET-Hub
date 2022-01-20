package com.edu.bauet.About_Us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class DeveloperMainActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton btncall, btnin, btnfb, btnmessenger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        btnfb = findViewById(R.id.btnfb);
        btnin = findViewById(R.id.btnin);
        btncall = findViewById(R.id.btncall);
        btnmessenger = findViewById(R.id.btnmessenger);

        btnfb.setOnClickListener(this);
        btnin.setOnClickListener(this);
        btncall.setOnClickListener(this);
        btnmessenger.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnfb) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Shiammmmm"));
            startActivity(intent);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        } else if (v.getId() == R.id.btnmessenger) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.me/Shiammmmm"));
            startActivity(intent);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        } else if (v.getId() == R.id.btnin) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/shiam-mahmud-303638213"));
            startActivity(intent);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        } else if (v.getId() == R.id.btncall) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01769176144"));
            startActivity(intent);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        }
    }

    public void gmailButton(View view) {
        boolean isGmailInstalled = isAppInstalled(DeveloperMainActivity.this, "com.google.android.gm");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"shiam171998@gmail.com"});
        if (isGmailInstalled) {
            intent.setType("text/html");
            intent.setPackage("com.google.android.gm");
            startActivity(intent);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        } else {
            intent.setType("message/rfc822");
            intent.setPackage("com.google.android.gm");
            startActivity(intent);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        }
    }

    private boolean isAppInstalled(DeveloperMainActivity developerMainActivity, String s) {
        return false;
    }

    public void whatsappButton(View v) {
        String num = "+880 1769-176144";
        String url = "https://api.whatsapp.com/send?phone=" + num;
        try {
            PackageManager pm = v.getContext().getPackageManager();
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            v.getContext().startActivity(i);
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        } catch (PackageManager.NameNotFoundException e) {
            v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
        }
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
    }
}