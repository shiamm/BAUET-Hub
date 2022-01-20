package com.edu.bauet.Administration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegistrarMainActivity extends AppCompatActivity {
    CircleImageView img_Shaikh,img_Abdul,img_Ashraful,img_Baten,img_Palash,img_Sayantoni,img_Nazmul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_main);

        img_Shaikh = findViewById(R.id.img_Shaikh);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Lt.-Col-Shaikh-Shameem-Hussain.jpg").into(img_Shaikh);

        img_Abdul = findViewById(R.id.img_Abdul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/DeputyRegiAd.png").into(img_Abdul);

        img_Ashraful = findViewById(R.id.img_Ashraful);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Ashraful-Islam.jpg").into(img_Ashraful);

        img_Baten = findViewById(R.id.img_Baten);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Abdul-Baten-Khan.jpg").into(img_Baten);

        img_Palash = findViewById(R.id.img_Palash);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Palash-Chandra-Pal.jpg").into(img_Palash);

        img_Sayantoni = findViewById(R.id.img_Sayantoni);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Mst.-Semi-Sayantoni.jpg").into(img_Sayantoni);

        img_Nazmul = findViewById(R.id.img_Nazmul);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/11/Md.-Nazmul-Islam.jpg").into(img_Nazmul);

    }
}