package com.edu.bauet.Database;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.edu.bauet.Admission.AdmissionNotice.UploadAdmissNoticeActivity;
import com.edu.bauet.Database.Event.EventActivity;
import com.edu.bauet.Database.Event.UploadEventActivity;
import com.edu.bauet.Database.Gallery.GalleryActivity;
import com.edu.bauet.Database.Gallery.UploadImageMainActivity;
import com.edu.bauet.Database.News.UploadNewsActivity;
import com.edu.bauet.Database.Notice.NoticeActivity;
import com.edu.bauet.Database.Notice.UploadNoticeActivity;
import com.edu.bauet.Department.ICE.Gallery.UploadiceimageActivity;
import com.edu.bauet.Department.ICE.Notice.IceUploadNoticeActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class AdminHomeActivity extends AppCompatActivity {
    MaterialCardView card_notice, card_image, card_events, card_news,card_icenotice,card_iceimage,card_gallery, card_adminlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home_activity);

        card_notice = findViewById(R.id.card_uploadNotice);
        card_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        card_image = findViewById(R.id.card_UploadImage);
        card_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, GalleryActivity.class);
                startActivity(intent);
            }
        });

        card_events = findViewById(R.id.card_events);
        card_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, EventActivity.class);
                startActivity(intent);
            }
        });

        card_news = findViewById(R.id.card_news);
        card_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, UploadNewsActivity.class);
                startActivity(intent);
            }
        });

        card_adminlogout = findViewById(R.id.card_adminlogout);
        card_adminlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminHomeActivity.this, AdminLogInActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });


    }
    @Override
    public void onBackPressed() {
        MaterialAlertDialogBuilder builder=new MaterialAlertDialogBuilder(this);
                builder.setMessage("Are you sure you want to exit?")
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