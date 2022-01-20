package com.edu.bauet.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.edu.bauet.R;

public class AdmissionInformationActivity extends AppCompatActivity {
    ImageView imageViewadd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admission_information_activity);

        imageViewadd1 = findViewById(R.id.addmission_img1);
        Glide.with(this).load("file:///C:/Users/shiam/Downloads/Admission%20Information%20-%20Bangladesh%20Army%20University%20of%20Engineering%20&%20Technology_files/BAUET-Ad-Summer-2021-749x1024.jpg").into(imageViewadd1);
    }
}