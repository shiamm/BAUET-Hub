package com.edu.bauet.Department.EEE.Professionals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import de.hdodenhof.circleimageview.CircleImageView;

public class RezaulMainActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton btncall, btnin, btnfb;
    CircleImageView img_Rezaul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezaul_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        img_Rezaul = findViewById(R.id.img_Rezaul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/A.M.-Rezaul-Karim-Talukder-241x300.jpg").into(img_Rezaul);

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
            Snackbar snackbar = Snackbar.make(v, "A.M. Rezaul Karim Talukder is not available in facebook.", Snackbar.LENGTH_LONG);
            snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            snackbar.show();

        } else if (v.getId() == R.id.btnin) {
            Snackbar snackbar = Snackbar.make(v, "A.M. Rezaul Karim Talukder is not available in Linkedin.", Snackbar.LENGTH_LONG);
            snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
            snackbar.show();
        } else if (v.getId() == R.id.btncall) {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01714020190"));
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
    }

    public void gmailButton(View view) {
        boolean isGmailInstalled = isAppInstalled(RezaulMainActivity.this, "com.google.android.gm");

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rkt.1946@gmail.com"});
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

    private boolean isAppInstalled(RezaulMainActivity rezaulMainActivity, String s) {
        return false;
    }

    public void whatsappButton(View v) {
        String num = "+880 1714-020190";
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