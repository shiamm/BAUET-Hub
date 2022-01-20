package com.edu.bauet.Department.EEE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.Department.EEE.Professionals.AbdulMainActivity;
import com.edu.bauet.Department.EEE.Professionals.AmanurMainActivity;
import com.edu.bauet.Department.EEE.Professionals.BulbulMainActivity;
import com.edu.bauet.Department.EEE.Professionals.MahmudulMainActivity;
import com.edu.bauet.Department.EEE.Professionals.MomtazurMainActivity;
import com.edu.bauet.Department.EEE.Professionals.MotakabbirMainActivity;
import com.edu.bauet.Department.EEE.Professionals.NeepaMainActivity;
import com.edu.bauet.Department.EEE.Professionals.RabiullMainActivity;
import com.edu.bauet.Department.EEE.Professionals.RezaulMainActivity;
import com.edu.bauet.Department.EEE.Professionals.SamiaMainActivity;
import com.edu.bauet.Department.EEE.Professionals.SaraMainActivity;
import com.edu.bauet.Department.EEE.Professionals.SariulMainActivity;
import com.edu.bauet.Department.EEE.Professionals.ShahadatMainActivity;
import com.edu.bauet.Department.EEE.Professionals.SuvojitMainActivity;
import com.edu.bauet.Department.EEE.Professionals.TonmoyMainActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

import de.hdodenhof.circleimageview.CircleImageView;

public class EEEProfessionalsMainActivity extends AppCompatActivity {
    MaterialCardView card_Rezaul, card_Momtazur, card_Rabiul, card_Abdul, card_Mahmudul, card_Neepa, card_Bulbul, card_Tonmoy, card_Samia, card_Sariul, card_Sara, card_Motakabbir, card_Suvojit, card_Shahadat, card_Amanur;
    CircleImageView img_Rezaul, img_Momtazur, img_Rabiul, img_Abdul, img_Mahmudul, img_Neepa, img_Bulbul, img_Tonmoy, img_Samia, img_Sariul, img_Sara, img_Motakabbir, img_Suvojit, img_Shahadat, img_Amanur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eee_professional_main_activity);

        img_Rezaul = findViewById(R.id.img_Rezaul);
        img_Momtazur = findViewById(R.id.img_Momtazur);
        img_Rabiul = findViewById(R.id.img_Rabiul);
        img_Abdul = findViewById(R.id.img_Abdul);
        img_Mahmudul = findViewById(R.id.img_Mahmudul);
        img_Neepa = findViewById(R.id.img_Neepa);
        img_Bulbul = findViewById(R.id.img_Bulbul);
        img_Tonmoy = findViewById(R.id.img_Tonmoy);
        img_Samia = findViewById(R.id.img_Samia);
        img_Sariul = findViewById(R.id.img_Sariul);
        img_Sara = findViewById(R.id.img_Sara);
        img_Motakabbir = findViewById(R.id.img_Motakabbir);
        img_Suvojit = findViewById(R.id.img_Suvojit);
        img_Shahadat = findViewById(R.id.img_Shahadat);
        img_Amanur = findViewById(R.id.img_Amanur);

        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/A.M.-Rezaul-Karim-Talukder-241x300.jpg").into(img_Rezaul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Momtazur-RahmanOn-Leave-241x300.jpg").into(img_Momtazur);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Rabiul-Islam-224x300.jpg").into(img_Rabiul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Abdul-Al-Azmain-220x300.jpg").into(img_Abdul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Mahmudul-Hasan-240x300.jpg").into(img_Mahmudul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Neepa-Sarker-244x300.jpg").into(img_Neepa);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Bulbul-Ahmed-Bhadonl-218x300.jpg").into(img_Bulbul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Tonmoy-Islam-221x300.jpg").into(img_Tonmoy);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Samia-Ferdous-Mou.jpg").into(img_Samia);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Sariul-Hasan-240x300.jpg").into(img_Sariul);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Sara-Khan-221x300.jpg").into(img_Sara);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Motakabbir-Rahman-218x300.jpg").into(img_Motakabbir);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Suvojit-Kumar-Singha-224x300.jpg").into(img_Suvojit);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Md.-Shahadat-Hossain-215x300.jpg").into(img_Shahadat);
        Glide.with(this).load("https://bauet.ac.bd/eee/wp-content/uploads/sites/8/2020/12/Amanur-Rahman-219x300.jpg").into(img_Amanur);

        card_Rezaul = findViewById(R.id.card_Rezaul);
        card_Rezaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, RezaulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Abdul = findViewById(R.id.card_Abdul);
        card_Abdul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, AbdulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Amanur = findViewById(R.id.card_Amanur);
        card_Amanur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, AmanurMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Bulbul = findViewById(R.id.card_Bulbul);
        card_Bulbul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, BulbulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Mahmudul = findViewById(R.id.card_Mahmudul);
        card_Mahmudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, MahmudulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        }); card_Momtazur = findViewById(R.id.card_Momtazur);
        card_Momtazur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, MomtazurMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Motakabbir = findViewById(R.id.card_Motakabbir);
        card_Motakabbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, MotakabbirMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Neepa = findViewById(R.id.card_Neepa);
        card_Neepa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, NeepaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Rabiul = findViewById(R.id.card_Rabiul);
        card_Rabiul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, RabiullMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Rezaul = findViewById(R.id.card_Rezaul);
        card_Rezaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this,RezaulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Samia = findViewById(R.id.card_Samia);
        card_Samia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, SamiaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Sara = findViewById(R.id.card_Sara);
        card_Sara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, SaraMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Sariul = findViewById(R.id.card_Sariul);
        card_Sariul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, SariulMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Shahadat = findViewById(R.id.card_Shahadat);
        card_Shahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, ShahadatMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Suvojit = findViewById(R.id.card_Suvojit);
        card_Suvojit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, SuvojitMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Tonmoy = findViewById(R.id.card_Tonmoy);
        card_Tonmoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EEEProfessionalsMainActivity.this, TonmoyMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

    }
}