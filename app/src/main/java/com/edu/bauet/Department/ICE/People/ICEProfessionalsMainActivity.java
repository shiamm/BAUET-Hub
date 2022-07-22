package com.edu.bauet.Department.ICE.People;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;

import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ICEProfessionalsMainActivity extends AppCompatActivity {
    MaterialCardView card_rubayat, card_basar, card_partha, card_miti, card_lincon, card_nazmul, card_zihad, card_kabir, card_minhaz, card_arafat, card_imran,card_mouno;
    CircleImageView imgview, imgview1,imgview3, imgview4,imgview5, imgview6,imgview7, imgview8,imgview9, imgview10, imgview11, imgview12;
    private LinearLayout nazmul, zihad,rubaiyat,rubel,partha,miti,lincon,kabir,minhaz,arafat,imran,mouno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ice_professional_main_activity);


        nazmul = findViewById(R.id.nazmul);
        zihad = findViewById(R.id.zihad);
        rubaiyat = findViewById(R.id.rubaiyat);
        rubel = findViewById(R.id.basar);
        partha = findViewById(R.id.partha);
        miti = findViewById(R.id.miti);
        lincon = findViewById(R.id.lincon);
        kabir = findViewById(R.id.kabir);
        minhaz = findViewById(R.id.minhaz);
        arafat = findViewById(R.id.arafat);
        imran = findViewById(R.id.imran);
        mouno = findViewById(R.id.mouno);

        imgview = findViewById(R.id.img);
        imgview1 = findViewById(R.id.img2);
        imgview3 = findViewById(R.id.img3);
        imgview4 = findViewById(R.id.img4);
        imgview5 = findViewById(R.id.img5);
        imgview6 = findViewById(R.id.img6);
        imgview7 = findViewById(R.id.img7);
        imgview8 = findViewById(R.id.img8);
        imgview9 = findViewById(R.id.img9);
        imgview10 = findViewById(R.id.img10);
        imgview11 = findViewById(R.id.img11);
        imgview12 = findViewById(R.id.img12);

        nazmul.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, NazmulMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        zihad.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, ZihadMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview1, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        rubaiyat.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, RubayatYasminActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview3, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        rubel.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, RubelMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview4, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        partha.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, ParthaMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview5, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        miti.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, MitiMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview6, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        lincon.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, LinconMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview7, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        kabir.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, KabirMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview8, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });



        minhaz.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, MinhazMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview9, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        arafat.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, ArafatMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview10, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        imran.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, ImranActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview11, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        mouno.setOnClickListener(v -> {
            Intent i = new Intent(ICEProfessionalsMainActivity.this, MumeninMainActivity.class);
            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(imgview12, "imgtransition");
            ActivityOptionsCompat OptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(ICEProfessionalsMainActivity.this, pairs);
            startActivity(i, OptionsCompat.toBundle());
        });

        card_rubayat = findViewById(R.id.card_rubayat);
        card_rubayat.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, RubayatYasminActivity.class);
            startActivity(intent);
        });

        card_basar = findViewById(R.id.card_basar);
        card_basar.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, RubelMainActivity.class);
            startActivity(intent);
        });

        card_partha = findViewById(R.id.card_partha);
        card_partha.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, ParthaMainActivity.class);
            startActivity(intent);
        });

        card_miti = findViewById(R.id.card_miti);
        card_miti.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, MitiMainActivity.class);
            startActivity(intent);
        });

        card_lincon = findViewById(R.id.card_lincon);
        card_lincon.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, LinconMainActivity.class);
            startActivity(intent);
        });

        card_nazmul = findViewById(R.id.card_nazmul);
        card_nazmul.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, NazmulMainActivity.class);
            startActivity(intent);
        });

        card_zihad = findViewById(R.id.card_zihad);
        card_zihad.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, ZihadMainActivity.class);
            startActivity(intent);
        });

        card_kabir = findViewById(R.id.card_kabir);
        card_kabir.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, KabirMainActivity.class);
            startActivity(intent);
        });

        card_minhaz = findViewById(R.id.card_minhaz);
        card_minhaz.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, MinhazMainActivity.class);
            startActivity(intent);
        });

        card_arafat = findViewById(R.id.card_arafat);
        card_arafat.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, ArafatMainActivity.class);
            startActivity(intent);
        });

        card_imran = findViewById(R.id.card_imran);
        card_imran.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, ImranActivity.class);
            startActivity(intent);
        });

        card_mouno = findViewById(R.id.card_mouno);
        card_mouno.setOnClickListener(v -> {
            Intent intent = new Intent(ICEProfessionalsMainActivity.this, MumeninMainActivity.class);
            startActivity(intent);
        });

    }
}