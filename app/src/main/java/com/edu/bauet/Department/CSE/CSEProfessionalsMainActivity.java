package com.edu.bauet.Department.CSE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.Department.CSE.Professionals.AbdullahMainActivity;
import com.edu.bauet.Department.CSE.Professionals.AnanyaMainActivity;
import com.edu.bauet.Department.CSE.Professionals.AroniMainActivity;
import com.edu.bauet.Department.CSE.Professionals.AsmaMainActivity;
import com.edu.bauet.Department.CSE.Professionals.BrishtiMainActivity;
import com.edu.bauet.Department.CSE.Professionals.GolamMainActivity;
import com.edu.bauet.Department.CSE.Professionals.HarunMainActivity;
import com.edu.bauet.Department.CSE.Professionals.IrinMainActivity;
import com.edu.bauet.Department.CSE.Professionals.MirzaMainActivity;
import com.edu.bauet.Department.CSE.Professionals.MithunMainActivity;
import com.edu.bauet.Department.CSE.Professionals.MuktarMainActivity;
import com.edu.bauet.Department.CSE.Professionals.NazmusMainActivity;
import com.edu.bauet.Department.CSE.Professionals.OmarMainActivity;
import com.edu.bauet.Department.CSE.Professionals.RakhiMainActivity;
import com.edu.bauet.Department.CSE.Professionals.SabbirMainActivity;
import com.edu.bauet.Department.CSE.Professionals.SubrataMainActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CSEProfessionalsMainActivity extends AppCompatActivity {
    MaterialCardView card_mirza, card_golam, card_asma, card_ananya, card_sabbir, card_Muktar, card_Mithun, card_Salman, card_Omar, card_Abdullah, card_Harun, card_Nazmus, card_Subrata, card_Bristi, card_Rakhi, card_Irin, card_Aroni;
    CircleImageView img_mirza, img_golam, img_asma, img_ananya, img_sabbir, img_Muktar, img_Mithun, img_Salman, img_Omar, img_Abdullah, img_Harun, img_Nazmus, img_Subrata, img_Bristi, img_Rakhi, img_Irin, img_Aroni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_professional_main_activity);

        img_mirza = findViewById(R.id.img_mirza);
        img_golam = findViewById(R.id.img_golam);
        img_asma = findViewById(R.id.img_asma);
        img_ananya = findViewById(R.id.img_ananya);
        img_sabbir = findViewById(R.id.img_sabbir);
        img_Muktar = findViewById(R.id.img_Muktar);
        img_Mithun = findViewById(R.id.img_Mithun);
        img_Omar = findViewById(R.id.img_Omar);
        img_Abdullah = findViewById(R.id.img_Abdullah);
        img_Harun = findViewById(R.id.img_Harun);
        img_Nazmus = findViewById(R.id.img_Nazmus);
        img_Subrata = findViewById(R.id.img_Subrata);
        img_Bristi = findViewById(R.id.img_Bristi);
        img_Rakhi = findViewById(R.id.img_Rakhi);
        img_Irin = findViewById(R.id.img_Irin);
        img_Aroni = findViewById(R.id.img_Aroni);

        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/photo-Mirza-266x300.jpg").into(img_mirza);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/CSE-02-299x300.jpg").into(img_golam);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/cse-03.jpg").into(img_asma);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/Ananya-Mam.jpg").into(img_ananya);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/CSE-07-336x300.jpg").into(img_sabbir);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/muktar-211x300.jpg").into(img_Muktar);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/mithun-300x300.jpg").into(img_Mithun);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/CSE-20-254x300.jpg").into(img_Omar);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/rahat-211x300.jpg").into(img_Abdullah);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/harun-237x300.jpg").into(img_Harun);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/salehin-238x300.jpg").into(img_Nazmus);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/skp-303x300.png").into(img_Subrata);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/bristy-150x150.jpg").into(img_Bristi);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/rrp-329x300.jpg").into(img_Rakhi);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/irin-245x300.jpeg").into(img_Irin);
        Glide.with(this).load("https://bauet.ac.bd/cse/wp-content/uploads/sites/2/2020/11/prapty-150x150.jpg").into(img_Aroni);


        card_mirza = findViewById(R.id.card_mirza);
        card_mirza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, MirzaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_golam = findViewById(R.id.card_golam);
        card_golam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, GolamMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_asma = findViewById(R.id.card_asma);
        card_asma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, AsmaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_ananya = findViewById(R.id.card_ananya);
        card_ananya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, AnanyaMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_sabbir = findViewById(R.id.card_sabbir);
        card_sabbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, SabbirMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Muktar = findViewById(R.id.card_Muktar);
        card_Muktar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, MuktarMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Mithun = findViewById(R.id.card_Mithun);
        card_Mithun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, MithunMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Omar = findViewById(R.id.card_Omar);
        card_Omar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, OmarMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });


        card_Abdullah = findViewById(R.id.card_Abdullah);
        card_Abdullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, AbdullahMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Harun = findViewById(R.id.card_Harun);
        card_Harun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, HarunMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Nazmus = findViewById(R.id.card_Nazmus);
        card_Nazmus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, NazmusMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Subrata = findViewById(R.id.card_Subrata);
        card_Subrata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, SubrataMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Bristi = findViewById(R.id.card_Bristi);
        card_Bristi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, BrishtiMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Rakhi = findViewById(R.id.card_Rakhi);
        card_Rakhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, RakhiMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Irin = findViewById(R.id.card_Irin);
        card_Irin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, IrinMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });

        card_Aroni = findViewById(R.id.card_Aroni);
        card_Aroni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSEProfessionalsMainActivity.this, AroniMainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_down);
            }
        });
    }
}