package com.edu.bauet.Database.Event;

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

public class EventMainActivity extends AppCompatActivity {

    private RecyclerView EventRecycler;
    private ProgressBar Eventprogressbar;
    private ArrayList<EventData> list;
    private EventAdapter adapter;
    private DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_main);

        EventRecycler = findViewById(R.id.EventRecycler);
        Eventprogressbar = findViewById(R.id.Eventprogressbar);
        reference= FirebaseDatabase.getInstance().getReference().child("Event");
        EventRecycler.setLayoutManager(new LinearLayoutManager(this));
        EventRecycler.setHasFixedSize(true);

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
                adapter = new EventAdapter(EventMainActivity.this,list);
                adapter.notifyDataSetChanged();
                Eventprogressbar.setVisibility(View.GONE);
                EventRecycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Eventprogressbar.setVisibility(View.GONE);
                Toast.makeText(EventMainActivity.this,databaseError.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}