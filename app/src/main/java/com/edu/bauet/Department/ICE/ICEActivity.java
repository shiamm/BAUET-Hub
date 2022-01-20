package com.edu.bauet.Department.ICE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Department.ICE.About.AboutMainActivity;
import com.edu.bauet.Department.ICE.About.AchievementActivity;
import com.edu.bauet.Department.ICE.Download.DownloadMainActivity;
import com.edu.bauet.Department.ICE.Event.ICEEventMainActivity;
import com.edu.bauet.Department.ICE.Gallery.ShowImageActivity;
import com.edu.bauet.Department.ICE.Notice.IceNoticeActivity;
import com.edu.bauet.Department.ICE.People.PeopleMainActivity;
import com.edu.bauet.Department.ICE.Student.StudentMainActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class ICEActivity extends AppCompatActivity {
    MaterialCardView card_people_ice,card_about_ice,card_notice_ice,card_student_ice,card_download_ice,card_gallery_ice,card_event_ice, card_achievement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iceactivity);

        card_achievement = findViewById(R.id.card_achievement);
        card_achievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, AchievementActivity.class);
                startActivity(intent);
            }
        });

        card_people_ice = findViewById(R.id.card_people_ice);
        card_people_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, PeopleMainActivity.class);
                startActivity(intent);
            }
        });

        card_about_ice = findViewById(R.id.card_about_ice);
        card_about_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, AboutMainActivity.class);
                startActivity(intent);
            }
        });

        card_notice_ice = findViewById(R.id.card_notice_ice);
        card_notice_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, IceNoticeActivity.class);
                startActivity(intent);
            }
        });

        card_student_ice = findViewById(R.id.card_student_ice);
        card_student_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, StudentMainActivity.class);
                startActivity(intent);
            }
        });

        card_download_ice = findViewById(R.id.card_download_ice);
        card_download_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, DownloadMainActivity.class);
                startActivity(intent);
            }
        });

        card_gallery_ice = findViewById(R.id.card_gallery_ice);
        card_gallery_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, ShowImageActivity.class);
                startActivity(intent);
            }
        });

        card_event_ice = findViewById(R.id.card_event_ice);
        card_event_ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ICEActivity.this, ICEEventMainActivity.class);
                startActivity(intent);
            }
        });
    }
}