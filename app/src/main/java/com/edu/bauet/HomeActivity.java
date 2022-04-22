package com.edu.bauet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.edu.bauet.About_Us.AboutUsMainActivity;
import com.edu.bauet.About_Us.Contact_Us_Activity;
import com.edu.bauet.Academic.AcademicMainActivity;
import com.edu.bauet.Database.AdminLogInActivity;
import com.edu.bauet.Database.Event.EventMainActivity;
import com.edu.bauet.Database.News.NewsMainActivity;
import com.edu.bauet.Database.Notice.NoticeMainActivity;
import com.edu.bauet.Administration.AdministratorMainActivity;
import com.edu.bauet.Admission.AdmissionMainActivity;
import com.edu.bauet.Department.DepartmentMainActivity;
import com.edu.bauet.Facilities.FacilitiesMainActivity;
import com.edu.bauet.Database.Gallery.ShowImageMainActivity;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    MaterialCardView card_department, card_about, card_facilities, card_academic, card_admission, card_archive, card_gallery, card_event, card_news, card_administration,card_contact;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        card_department = findViewById(R.id.card_department);
        card_department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, DepartmentMainActivity.class);
                startActivity(intent);
            }
        });

        card_about = findViewById(R.id.card_aboutus);
        card_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AboutUsMainActivity.class);
                startActivity(intent);
            }
        });

        card_facilities = findViewById(R.id.card_facilities);
        card_facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FacilitiesMainActivity.class);
                startActivity(intent);
            }
        });

        card_academic = findViewById(R.id.card_academic);
        card_academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AcademicMainActivity.class);
                startActivity(intent);
            }
        });

        card_admission = findViewById(R.id.card_admission);
        card_admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AdmissionMainActivity.class);
                startActivity(intent);
            }
        });

        card_gallery = findViewById(R.id.card_gallery);
        card_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ShowImageMainActivity.class);
                startActivity(intent);
            }
        });

        card_archive = findViewById(R.id.card_archive);
        card_archive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NoticeMainActivity.class);
                startActivity(intent);
            }
        });

        card_news = findViewById(R.id.card_news);
        card_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, NewsMainActivity.class);
                startActivity(intent);
            }
        });

        card_event = findViewById(R.id.card_event);
        card_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, EventMainActivity.class);
                startActivity(intent);
            }
        });

        card_administration = findViewById(R.id.card_administration);
        card_administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AdministratorMainActivity.class);
                startActivity(intent);
            }
        });

        card_contact = findViewById(R.id.card_contact);
        card_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, Contact_Us_Activity.class);
                startActivity(intent);
            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.OpenNavDrawer,
                R.string.CloseNavDrawer
        );

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_website:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bauet.ac.bd"));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.nav_fb:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bauetqadirabad/"));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.nav_youtube:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/channel/UCqG_-7t4Hv3K_gcT7YMhMWw"));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.nav_wikipedia:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Bangladesh_Army_University_of_Engineering_%26_Technology"));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.nav_linkdin:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bd.linkedin.com/company/bauet"));
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;

        }
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    @Override
    public void onBackPressed() {
        MaterialAlertDialogBuilder builder=new MaterialAlertDialogBuilder(HomeActivity.this);
                builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        overridePendingTransition(R.anim.shrink_fade_out_center, R.anim.shrink_fade_out_center);
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }



    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        GoogleSignIn.getClient(this,new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build())
                .signOut().addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                startActivity(new Intent(view.getContext(),LoginActivity.class));
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(HomeActivity.this, "Signout Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}