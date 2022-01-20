package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AcademicCouncilMainActivity extends AppCompatActivity {
    CircleImageView img_shafiuddin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_council_main);

        img_shafiuddin = findViewById(R.id.img_shafiuddinn);

        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/06/Chief.jpg").into(img_shafiuddin);
    }
}