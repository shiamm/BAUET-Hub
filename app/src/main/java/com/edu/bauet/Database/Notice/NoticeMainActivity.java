package com.edu.bauet.Database.Notice;

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

import com.edu.bauet.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class NoticeMainActivity extends AppCompatActivity {
    private RecyclerView deletenotice_recycler;
    private ProgressBar dltnoticeprogressbar;
    private ArrayList<NoticeData> list;
    private NoticeAdapter adapter;

    private DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_main);


        deletenotice_recycler = findViewById(R.id.DeleteNoticeRecycler);
        dltnoticeprogressbar = findViewById(R.id.dltnoticeprogressbar);
        reference= FirebaseDatabase.getInstance().getReference().child("Notice");
        deletenotice_recycler.setLayoutManager(new LinearLayoutManager(this));
        deletenotice_recycler.setHasFixedSize(true);

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
                adapter = new NoticeAdapter(NoticeMainActivity.this,list);
                adapter.notifyDataSetChanged();
                dltnoticeprogressbar.setVisibility(View.GONE);
                deletenotice_recycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                dltnoticeprogressbar.setVisibility(View.GONE);
                Toast.makeText(NoticeMainActivity.this,databaseError.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}