package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class RoboticActivity extends AppCompatActivity {
    ImageView rob_img1,rob_img2,rob_img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotic);


        rob_img1 = findViewById(R.id.rob_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/BARC_Or.png").into(rob_img1);

        rob_img2 = findViewById(R.id.rob_img2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/BARC.png").into(rob_img2);

        rob_img3 = findViewById(R.id.rob_img3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/BARC2.png").into(rob_img3);
    }
}