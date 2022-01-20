package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdministrativeOfficersMainActivity extends AppCompatActivity {
    CircleImageView img_Mustafa,img_Hamidul,img_Shameem,img_Rashidul,img_Shah,img_Shahidul,img_Golam,img_Sazzad,img_Amin;
    CircleImageView img_Ashraful,img_Imdad,img_Baten,img_Kamrujjaman,img_Chandra,img_Abdul,img_Sohidul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrative_officers_main);

        img_Mustafa = findViewById(R.id.img_Mustafa);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/BrigGenMMustafaKamal.jpg").into(img_Mustafa);

        img_Hamidul = findViewById(R.id.img_Hamidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Col-Mohammad-Hamidul-Haque.jpg").into(img_Hamidul);

        img_Shameem = findViewById(R.id.img_Shameem);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Lt.-Col-Shaikh-Shameem-Hussain.jpg").into(img_Shameem);

        img_Rashidul = findViewById(R.id.img_Rashidul);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/photo-Mirza.jpg").into(img_Rashidul);

        img_Shah = findViewById(R.id.img_Shah);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Md.-Shah-Alam.jpg").into(img_Shah);

        img_Shahidul = findViewById(R.id.img_Shahidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/MD-Shahidul-Islam.jpg").into(img_Shahidul);

        img_Golam = findViewById(R.id.img_Golam);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/CSE-02.jpg").into(img_Golam);

        img_Sazzad = findViewById(R.id.img_Sazzad);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Dr.-Md.-Sazzad-Hossain.jpg").into(img_Sazzad);

        img_Amin = findViewById(R.id.img_Amin);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Al-Amin.jpg").into(img_Amin);

        img_Ashraful = findViewById(R.id.img_Ashraful);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Ashraful-Islam.jpg").into(img_Ashraful);

        img_Imdad = findViewById(R.id.img_Imdad);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Imdad-Hossain-Khan.jpg").into(img_Imdad);

        img_Baten = findViewById(R.id.img_Baten);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Abdul-Baten-Khan.jpg").into(img_Baten);

        img_Kamrujjaman = findViewById(R.id.img_Kamrujjaman);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Kamrujjaman.jpg").into(img_Kamrujjaman);

        img_Chandra = findViewById(R.id.img_Chandra);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Palash-Chandra-Pal.jpg").into(img_Chandra);

        img_Abdul = findViewById(R.id.img_Abdul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Abdul-Aziz-1.jpg").into(img_Abdul);

        img_Sohidul = findViewById(R.id.img_Sohidul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2021/03/20210301_092404.jpg").into(img_Sohidul);

    }
}