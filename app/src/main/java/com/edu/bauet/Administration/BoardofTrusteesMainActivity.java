package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class BoardofTrusteesMainActivity extends AppCompatActivity {
    CircleImageView img_shafiuddin,img_sarwar,img_Moshfequr,img_Shakil,img_Sayed,img_Fazal,img_Wahid,img_Nazmul,img_Mansur,img_Mustafa,img_Kazi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardof_trustees_main);

        img_shafiuddin = findViewById(R.id.img_shafiuddin);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/06/Chief.jpg").into(img_shafiuddin);

        img_sarwar = findViewById(R.id.img_sarwar);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/02/Ataul.jpg").into(img_sarwar);

        img_Moshfequr = findViewById(R.id.img_Moshfequr);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/02/Md-Moshfequr-Rahman.jpg").into(img_Moshfequr);

        img_Shakil = findViewById(R.id.img_Shakil);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/02/Shakil-Ahmed.jpg").into(img_Shakil);

        img_Sayed = findViewById(R.id.img_Sayed);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Maj-Gen-Md-Abu-Sayed-Siddique.jpg").into(img_Sayed);

        img_Fazal = findViewById(R.id.img_Fazal);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Maj-Gen-Ibne-Fazal-Shayekhuzzaman.jpg").into(img_Fazal);

        img_Wahid = findViewById(R.id.img_Wahid);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Maj-Gen-Md-Wahid-UZ-Zaman.jpg").into(img_Wahid);

        img_Nazmul = findViewById(R.id.img_Nazmul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Major-General-AKM-Nazmul-Hasan.jpg").into(img_Nazmul);

        img_Mansur = findViewById(R.id.img_Mansur);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Brig-Gen-Abul-Mansur-Md-Ashraf-Khan.jpg").into(img_Mansur);

        img_Mustafa = findViewById(R.id.img_Mustafa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/BrigGenMMustafaKamal.jpg").into(img_Mustafa);

        img_Kazi = findViewById(R.id.img_Kazi);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Brig-Gen-Kazi-A-S-M-Arif.jpg").into(img_Kazi);
    }
}