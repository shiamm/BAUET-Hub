package com.edu.bauet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.bauet.Database.AdminLogInActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    TextInputEditText reg_name, reg_email, reg_pass, reg_con_pass;
    MaterialButton reg_btn;
    TextView login;
    FirebaseAuth fauth;
    private ProgressBar loadingPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg_name = findViewById(R.id.register_Name);
        reg_email = findViewById(R.id.register_email);
        reg_pass = findViewById(R.id.register_pass);
        reg_con_pass = findViewById(R.id.register_con_pass);
        reg_btn = findViewById(R.id.register);
        loadingPB = findViewById(R.id.idPBLoading);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);

                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });

        fauth = FirebaseAuth.getInstance();

        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = reg_name.getText().toString();
                String email = reg_email.getText().toString();
                String pass = reg_pass.getText().toString();
                String conpass = reg_con_pass.getText().toString();

                if (name.isEmpty()) {
                    reg_name.setError("full name is required");
                    return;
                }

                if (email.isEmpty()) {
                    reg_email.setError("email address is required");
                    return;
                }

                if (pass.isEmpty()) {
                    reg_pass.setError("password is required");
                    return;
                }

                if (conpass.isEmpty()) {
                    reg_con_pass.setError("confirm password is required");
                    return;
                }

                if (!pass.equals(conpass)) {
                    reg_con_pass.setError("Password  Do not Match");
                    return;
                }
                loadingPB.setVisibility(View.VISIBLE);


                fauth.createUserWithEmailAndPassword(email, pass).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        loadingPB.setVisibility(View.GONE);
                        Toast.makeText(RegisterActivity.this, "Successfully Registered..", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        loadingPB.setVisibility(View.GONE);
                        Toast.makeText(RegisterActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish();
    }
}