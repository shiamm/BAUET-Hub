package com.edu.bauet.About_Us;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class HistoryActivity extends AppCompatActivity {
    ImageView imageViewhis1, imageViewhis2, imageViewhis3, imageViewhis4, imageViewhis5, imageViewhis6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_activity);

        imageViewhis1 = findViewById(R.id.his_img1);
        imageViewhis2 = findViewById(R.id.his_img2);
        imageViewhis3 = findViewById(R.id.his_img3);
        imageViewhis4 = findViewById(R.id.his_img4);
        imageViewhis5 = findViewById(R.id.his_img5);
        imageViewhis6 = findViewById(R.id.his_img6);

        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/1-Inugurartion-of-BAUET-650x433.jpg").into(imageViewhis1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/3-Inugurartion-of-BAUET-1024x683.jpg").into(imageViewhis2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/4-Inugurartion-of-BAUET-380x263.jpg").into(imageViewhis3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/2-Inugurartion-of-BAUET-380x253.jpg").into(imageViewhis4);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/6-Inugurartion-of-BAUET-380x253.jpg").into(imageViewhis5);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/8-Inugurartion-of-BAUET-380x253.jpg").into(imageViewhis6);
    }
}