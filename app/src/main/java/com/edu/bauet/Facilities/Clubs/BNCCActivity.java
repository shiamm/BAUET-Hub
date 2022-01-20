package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class BNCCActivity extends AppCompatActivity {
    ImageView bncc_img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnccactivity);

        bncc_img1 = findViewById(R.id.bncc_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Nasir-Uddin-287x300.jpg").into(bncc_img1);
    }
}