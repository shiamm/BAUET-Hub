package com.edu.bauet.Department.ICE.Event;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.edu.bauet.Database.Event.EventAdapter;
import com.edu.bauet.Database.Event.EventData;
import com.edu.bauet.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ICEEventMainActivity extends AppCompatActivity {
    private RecyclerView iceEventRecycler;
    private ProgressBar iceEventprogressbar;
    private ArrayList<EventData> list;
    private EventAdapter adapter;
    private DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_main2);

        iceEventRecycler = findViewById(R.id.iceEventRecycler);
        iceEventprogressbar = findViewById(R.id.iceEventprogressbar);
        reference= FirebaseDatabase.getInstance().getReference().child("iceEvent");
        iceEventRecycler.setLayoutManager(new LinearLayoutManager(this));
        iceEventRecycler.setHasFixedSize(true);

        getEvent();
    }

    private void getEvent() {
        reference.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot Snapshot : dataSnapshot.getChildren()) {
                    EventData data = Snapshot.getValue(EventData.class);
                    list.add(0,data);
                }
                adapter = new EventAdapter(ICEEventMainActivity.this,list);
                adapter.notifyDataSetChanged();
                iceEventprogressbar.setVisibility(View.GONE);
                iceEventRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                iceEventprogressbar.setVisibility(View.GONE);
                Toast.makeText(ICEEventMainActivity.this,databaseError.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}