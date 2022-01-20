package com.edu.bauet.Database;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.edu.bauet.Administration.AdministratorMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE4th.ICE4thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE5th.ICE5thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th.ICE6thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th.ICE7thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.LabLoginActivity;
import com.edu.bauet.HomeActivity;
import com.edu.bauet.LoginActivity;
import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class AdminLogInActivity extends AppCompatActivity {
    private TextInputEditText txt_name, txt_pass;
    private MaterialButton btn_login;
    private TextView txt_attempts;
    private int counter = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log_in);

        txt_name = findViewById(R.id.txt_admin_name);
        txt_pass = findViewById(R.id.txt_admin_password);
        btn_login = findViewById(R.id.btn_admin_login);
        txt_attempts = findViewById(R.id.txt_admin_attempts);
        txt_attempts.setText("Number of attempts remaining : 5");

        btn_login = findViewById(R.id.btn_admin_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = txt_name.getText().toString();
                String pass = txt_pass.getText().toString();

                if (txt_name.getText().toString().equals("")) {
                    txt_name.setError("Enter Admin Name");
                } else if (txt_pass.getText().toString().equals("")) {
                    txt_pass.setError("Enter Admin Password");
                } else if (id.equals("Shiam") && pass.equals("Shiam402828")) {
                    Intent intent = new Intent(AdminLogInActivity.this, AdminHomeActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    counter--;
                    txt_attempts.setText("Number of attempts remaining : " + counter);
                    if (counter == 0) {
                        btn_login.setEnabled(false);
                    }
                }

            }
        });
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(AdminLogInActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();


    }
}