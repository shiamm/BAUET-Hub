package com.edu.bauet.Department.ICE.Download.LabMaterials;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE4th.ICE4thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE5th.ICE5thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE6th.ICE6thMainActivity;
import com.edu.bauet.Department.ICE.Download.LabMaterials.ICE7th.ICE7thMainActivity;
import com.edu.bauet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class LabLoginActivity extends AppCompatActivity {
    private TextInputEditText txt_id, txt_pass;
    private MaterialButton btn_login;
    private TextView txt_attempts, txt_qun;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_login);
        txt_id = findViewById(R.id.txt_id);
        txt_qun = findViewById(R.id.txt_qun);
        txt_pass = findViewById(R.id.txt_password);
        btn_login = findViewById(R.id.btn_login);
        txt_attempts = findViewById(R.id.txt_attempts);
        txt_attempts.setText("Number of attempts remaining : 5");

        txt_qun = findViewById(R.id.txt_qun);
        txt_qun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "Contact with Admin", Snackbar.LENGTH_LONG);
                snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
                snackbar.setAction("Contact Now", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isGmailInstalled = isAppInstalled(LabLoginActivity.this, "com.google.android.gm");

                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"shiam171998@gmail.com"});

                        if (isGmailInstalled) {
                            intent.setType("text/html");
                            intent.setPackage("com.google.android.gm");
                            startActivity(intent);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        } else {
                            intent.setType("message/rfc822");
                            intent.setPackage("com.google.android.gm");
                            startActivity(intent);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                        }
                    }

                    private boolean isAppInstalled(LabLoginActivity loginMainActivity, String s) {
                        return false;
                    }


                });
                snackbar.show();

            }
        });

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = txt_id.getText().toString();
                String pass = txt_pass.getText().toString();

                if (txt_id.getText().toString().equals("")) {
                    txt_id.setError("Enter Your Id");
                } else if (txt_pass.getText().toString().equals("")) {
                    txt_pass.setError("Enter Password");
                } else if (id.equals("17205002") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205003") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205005") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205006") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205007") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205009") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205010") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205011") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205012") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205013") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205016") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205019") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205021") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205022") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205023") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105002") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105003") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105004") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105005") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105007") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105008") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105009") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105010") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105012") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105013") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18105015") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205001") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("17205015") && pass.equals("53758448")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE4thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205002") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205003") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205004") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205006") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205007") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205008") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205009") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205010") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205012") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205013") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205014") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205015") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205016") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205018") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205019") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205020") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205022") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205023") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205024") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205025") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205026") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205027") && pass.equals("73152488")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE5thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105001") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105002") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105003") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105005") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105006") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105007") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105008") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105009") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105010") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105012") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105013") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105015") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105016") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105017") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105019") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105020") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105021") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105023") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105025") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105026") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105027") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105028") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105029") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105030") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105031") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105032") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105033") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105034") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19105035") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205011") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("18205017") && pass.equals("49112389")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE6thMainActivity.class);
                    startActivity(intent);
                    finish();
                } else if (id.equals("19205001") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205002") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205004") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205005") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205008") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205009") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205010") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205011") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205012") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205013") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205014") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else if (id.equals("19205016") && pass.equals("75943747")) {
                    Intent intent = new Intent(LabLoginActivity.this, ICE7thMainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    counter--;
                    txt_attempts.setText("Number of attempts remaining : " + counter);
                    if (counter == 0) {
                        btn_login.setEnabled(false);
                    }
                }

            }
        });
    }
}