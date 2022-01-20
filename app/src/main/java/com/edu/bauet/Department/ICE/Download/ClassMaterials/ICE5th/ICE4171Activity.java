package com.edu.bauet.Department.ICE.Download.ClassMaterials.ICE5th;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;

public class ICE4171Activity extends AppCompatActivity {
    private MaterialButton btn_ice4171_1,btn_ice4171_2,btn_ice4171_3,btn_ice4171_4,btn_ice4171_5,btn_ice4171_6,btn_ice4171_7,btn_ice4171_8,btn_ice4171_9,btn_ice4171_10,btn_ice4171_11,btn_ice4171_12,btn_ice4171_13,btn_ice4171_14,btn_ice4171_15,btn_ice4171_16,btn_ice4171_17,btn_ice4171_18,btn_ice4171_19,btn_ice4171_20,btn_ice4171_21,btn_ice4171_22,btn_ice4171_23,btn_ice4171_24,btn_ice4171_25,btn_ice4171_26,btn_ice4171_27,btn_ice4171_28,btn_ice4171_29,btn_ice4171_30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice4171);

        btn_ice4171_1=findViewById(R.id.btn_ice4171_1);
        btn_ice4171_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204171%2F01%20Introduction.pptx?alt=media&token=2681822c-7ed5-49a9-8208-3f9817585542"));
                startActivity(intent);
            }
        });

        btn_ice4171_2=findViewById(R.id.btn_ice4171_2);
        btn_ice4171_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204171%2FTraditional-Symmetric-Ciphers.pptx?alt=media&token=3349e502-8003-4e45-9f67-42a3d4c94297"));
                startActivity(intent);
            }
        });

        btn_ice4171_3=findViewById(R.id.btn_ice4171_3);
        btn_ice4171_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204171%2F03%20Digital%20Signature%20%26%20Cryptographic%20Hash%20Function.pptx?alt=media&token=01c53a19-f57b-464f-90d4-102f99603891"));
                startActivity(intent);
            }
        });

        btn_ice4171_4=findViewById(R.id.btn_ice4171_4);
        btn_ice4171_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204171%2F04%20Law%20and%20Regulatory%20Aspect%20in%20Cyber%20Security.pptx?alt=media&token=f082754f-8dbc-49dd-b47b-8b58c49a81a0"));
                startActivity(intent);
            }
        });

        btn_ice4171_5=findViewById(R.id.btn_ice4171_5);
        btn_ice4171_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://firebasestorage.googleapis.com/v0/b/bauet-app.appspot.com/o/Class%20%20Material%2FICE5th%2FICE%204171%2F05-%20Authentication%20and%20Authorization.pptx?alt=media&token=cde10df4-d629-473a-8b24-b16cdc9f6b1e"));
                startActivity(intent);
            }
        });

    }
}