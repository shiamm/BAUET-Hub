package com.edu.bauet.Department.CSE.Professionals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.Department.EEE.Professionals.AbdulMainActivity;
import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import de.hdodenhof.circleimageview.CircleImageView;

public class MirzaMainActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton btncall, btnin, btnfb;
    CircleImageView img_mirza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirza_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        img_mirza = findViewById(R.id.img_mirza);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/photo-Mirza-266x300.jpg").into(img_mirza);

        btnfb = findViewById(R.id.btnfb);
        btnin = findViewById(R.id.btnin);
        btncall = findViewById(R.id.btncall);

        btnfb.setOnClickListener(this);
        btnin.setOnClickListener(this);
        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnfb) {
            Snackbar snackbar=Snackbar.make(v,"Dr. Mirza A.F.M. Rashidul Hasan is not available in facebook.", Snackbar.LENGTH_LONG);
            snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            snackbar.show();
        } else if (v.getId() == R.id.btnin) {
            Snackbar snackbar=Snackbar.make(v,"Dr. Mirza A.F.M. Rashidul Hasan is not available in Linkedin.", Snackbar.LENGTH_LONG);
            snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            snackbar.show();
        } else if (v.getId() == R.id.btncall) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01715249842"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    public void gmailButton(View view) {
        boolean isGmailInstalled = isAppInstalled(MirzaMainActivity.this, "com.google.android.gm");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mirzahasanice@gmail.com"});
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

    private boolean isAppInstalled(MirzaMainActivity mirzaMainActivity, String s) {
        return false;
    }

    public void whatsappButton(View v) {
        String num = "+880 1715-249842";
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
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
    }
}