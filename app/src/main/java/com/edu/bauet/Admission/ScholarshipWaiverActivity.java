package com.edu.bauet.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class ScholarshipWaiverActivity extends AppCompatActivity {
    ImageView imageViewsclrshp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scholarship_waiver_activity);

        imageViewsclrshp1 = findViewById(R.id.sclrshp_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/Fall-2018-Scholarship-held-on-4-Aug-2019.jpg").into(imageViewsclrshp1);
    }
}