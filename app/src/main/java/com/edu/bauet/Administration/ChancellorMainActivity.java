package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class ChancellorMainActivity extends AppCompatActivity {
    ImageView chancellor_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chancellor_main);

        chancellor_img1 = findViewById(R.id.cancellor_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Abdul-Hamid.jpg").into(chancellor_img1);
    }
}