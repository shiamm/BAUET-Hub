package com.edu.bauet.Admission.AdmissionNotice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.edu.bauet.Database.Notice.NoticeAdapter;
import com.edu.bauet.Database.Notice.NoticeData;
import com.edu.bauet.Database.Notice.NoticeMainActivity;
import com.edu.bauet.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AdmissionNoticeMainActivity extends AppCompatActivity {
    private RecyclerView AdmissionNoticeRecycler;
    private ProgressBar admissionnoticeprogressbar;
    private ArrayList<NoticeData> list;
    private NoticeAdapter adapter;
    ShimmerFrameLayout shimmerFrameLayout;

    private DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_notice_main);


        AdmissionNoticeRecycler = findViewById(R.id.AdmissionNoticeRecycler);
      //  admissionnoticeprogressbar = findViewById(R.id.admissionnoticeprogressbar);
        reference= FirebaseDatabase.getInstance().getReference().child("AdmissionNotice");
        AdmissionNoticeRecycler.setLayoutManager(new LinearLayoutManager(this));
        AdmissionNoticeRecycler.setHasFixedSize(true);
        shimmerFrameLayout=findViewById(R.id.shimmer);
        shimmerFrameLayout.startShimmer();

        getNotice();
    }

    private void getNotice() {
        reference.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot Snapshot : dataSnapshot.getChildren()) {
                    NoticeData data = Snapshot.getValue(NoticeData.class);
                    list.add(0,data);
                }
                adapter = new NoticeAdapter(AdmissionNoticeMainActivity.this,list);
                adapter.notifyDataSetChanged();
                shimmerFrameLayout.stopShimmer();
                shimmerFrameLayout.setVisibility(View.GONE);
               // admissionnoticeprogressbar.setVisibility(View.GONE);
                AdmissionNoticeRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
              //  admissionnoticeprogressbar.setVisibility(View.GONE);
                Toast.makeText(AdmissionNoticeMainActivity.this,databaseError.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}