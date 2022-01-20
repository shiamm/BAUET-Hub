package com.edu.bauet.Facilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class LibraryMainActivity extends AppCompatActivity {
    ImageView imageView,imageView1,imageView2,imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_main);

        imageView = findViewById(R.id.img_library);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/12/black-1024x683.jpg").into(imageView);
        imageView1 = findViewById(R.id.img_library1);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/02/Library.jpg").into(imageView1);
        imageView2 = findViewById(R.id.img_library2);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/02/ELibreary.jpg").into(imageView2);
        imageView3 = findViewById(R.id.img_library3);
        Glide.with(this).load("https://bauet.ac.bd/wp-content/uploads/2020/02/EnLibrary.jpg").into(imageView3);

    }
}