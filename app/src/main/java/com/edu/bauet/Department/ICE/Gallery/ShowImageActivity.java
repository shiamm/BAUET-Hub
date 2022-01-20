package com.edu.bauet.Department.ICE.Gallery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.edu.bauet.Database.Gallery.Model;
import com.edu.bauet.Database.Gallery.MyAdapter;
import com.edu.bauet.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ShowImageActivity extends AppCompatActivity {

    private RecyclerView icerecyclerView;
    private ArrayList<Model> list;
    private ProgressBar gprogressbar;
    private MyAdapter adapter;

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference("iceImage");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);


        icerecyclerView = findViewById(R.id.icerecyclerview);
        icerecyclerView.setHasFixedSize(true);
        icerecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        gprogressbar = findViewById(R.id.gprogressbar);
        adapter = new MyAdapter(this , list);
        icerecyclerView.setAdapter(adapter);

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Model model = dataSnapshot.getValue(Model.class);
                    list.add(0,model);
                }
                adapter.notifyDataSetChanged();
                gprogressbar.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                gprogressbar.setVisibility(View.GONE);
            }
        });
    }
}