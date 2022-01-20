package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentsWelfareMainActivity extends AppCompatActivity {
    CircleImageView img_Amin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_welfare_main);

        img_Amin = findViewById(R.id.img_Amin);
        Glide.with(this).load("https://bauet.ac.bd/soc/wp-content/uploads/sites/17/2020/02/DSC_4133.jpg").into(img_Amin);
    }
}