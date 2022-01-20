package com.edu.bauet.Database.Event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Admission.AdmissionNotice.UploadAdmissNoticeActivity;
import com.edu.bauet.Database.Notice.NoticeActivity;
import com.edu.bauet.Database.Notice.UploadNoticeActivity;
import com.edu.bauet.Department.ICE.Event.ICEUploadEventActivity;
import com.edu.bauet.Department.ICE.Notice.IceUploadNoticeActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class EventActivity extends AppCompatActivity {
    MaterialCardView card_iceevnt, card_csenot, card_cenot, card_eeenot,card_bauetevnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        card_bauetevnt = findViewById(R.id.card_bauetevnt);
        card_bauetevnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventActivity.this, UploadEventActivity.class);
                startActivity(intent);
            }
        });

        card_iceevnt = findViewById(R.id.card_iceevnt);
        card_iceevnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventActivity.this, ICEUploadEventActivity.class);
                startActivity(intent);
            }
        });

    }
}