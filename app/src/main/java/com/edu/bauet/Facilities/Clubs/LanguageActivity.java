package com.edu.bauet.Facilities.Clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class LanguageActivity extends AppCompatActivity {
    ImageView lan_img1,lan_img2,lan_img3,lan_img4,lan_img5,lan_img6,lan_img7,lan_img8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        lan_img1 = findViewById(R.id.lan_img1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB.jpg").into(lan_img1);
        lan_img2 = findViewById(R.id.lan_img2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB1.jpg").into(lan_img2);
        lan_img3 = findViewById(R.id.lan_img3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB2.jpg").into(lan_img3);
        lan_img4 = findViewById(R.id.lan_img4);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB3.jpg").into(lan_img4);
        lan_img5 = findViewById(R.id.lan_img5);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB4-1024x244.png").into(lan_img5);
        lan_img6 = findViewById(R.id.lan_img6);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB5.1.jpg").into(lan_img6);
        lan_img7 = findViewById(R.id.lan_img7);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/LLCB5.2.jpg").into(lan_img7);
        lan_img8 = findViewById(R.id.lan_img8);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/10/peritia-650x407.jpg").into(lan_img8);
    }
}