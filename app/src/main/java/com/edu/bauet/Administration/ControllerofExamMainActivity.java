package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ControllerofExamMainActivity extends AppCompatActivity {
    CircleImageView img_Shahidul,img_Imdad,img_Abdul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controllerof_exam_main);

        img_Shahidul = findViewById(R.id.img_Shahidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Md.-Shahidul-Islam.jpg").into(img_Shahidul);
        img_Imdad = findViewById(R.id.img_Imdad);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Imdad-Hossain-Khan.jpg").into(img_Imdad);
        img_Abdul = findViewById(R.id.img_Abdul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Abdul-Aziz-1.jpg").into(img_Abdul);
    }
}