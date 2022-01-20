package com.edu.bauet.Database.Notice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Admission.AdmissionNotice.UploadAdmissNoticeActivity;
import com.edu.bauet.Database.Gallery.GalleryActivity;
import com.edu.bauet.Department.ICE.Gallery.UploadiceimageActivity;
import com.edu.bauet.Department.ICE.Notice.IceUploadNoticeActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class NoticeActivity extends AppCompatActivity {
    MaterialCardView card_icenot, card_csenot, card_cenot, card_eeenot,card_bauetnot,card_admnot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        card_bauetnot = findViewById(R.id.card_bauetnot);
        card_bauetnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoticeActivity.this, UploadNoticeActivity.class);
                startActivity(intent);
            }
        });

        card_icenot = findViewById(R.id.card_icenot);
        card_icenot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoticeActivity.this, IceUploadNoticeActivity.class);
                startActivity(intent);
            }
        });

        card_admnot = findViewById(R.id.card_admnot);
        card_admnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NoticeActivity.this, UploadAdmissNoticeActivity.class);
                startActivity(intent);
            }
        });
    }
}