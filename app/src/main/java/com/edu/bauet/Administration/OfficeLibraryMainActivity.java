package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class OfficeLibraryMainActivity extends AppCompatActivity {
    CircleImageView img_Sazzad,img_Sohidul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_library_main);

        img_Sazzad = findViewById(R.id.img_Sazzad);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Md.-Sazzad-Hossain.jpg").into(img_Sazzad);

        img_Sohidul = findViewById(R.id.img_Sohidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/03/20210301_092404.jpg").into(img_Sohidul);
    }
}