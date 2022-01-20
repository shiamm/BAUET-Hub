package com.edu.bauet.Database.Gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.Department.ICE.Gallery.UploadiceimageActivity;
import com.edu.bauet.R;
import com.google.android.material.card.MaterialCardView;

public class GalleryActivity extends AppCompatActivity {
    MaterialCardView card_iceimg, card_cseimg, card_ceimg, card_eeeimg,card_bauetimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        card_iceimg = findViewById(R.id.card_iceimg);
        card_iceimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, UploadiceimageActivity.class);
                startActivity(intent);
            }
        });

        card_bauetimg = findViewById(R.id.card_bauetimg);
        card_bauetimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GalleryActivity.this, UploadImageMainActivity.class);
                startActivity(intent);
            }
        });
    }
}