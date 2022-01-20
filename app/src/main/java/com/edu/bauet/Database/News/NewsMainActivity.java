package com.edu.bauet.Database.News;

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

public class NewsMainActivity extends AppCompatActivity {
    private RecyclerView news_recycler;
    private ProgressBar newsprogressbar;
    private ArrayList<NewsData> list;
    private NewsAdapter adapter;

    private DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_main);

        news_recycler = findViewById(R.id.NewsRecycler);
        newsprogressbar = findViewById(R.id.Newsprogressbar);
        reference= FirebaseDatabase.getInstance().getReference().child("News");
        news_recycler.setLayoutManager(new LinearLayoutManager(this));
        news_recycler.setHasFixedSize(true);

        getNews();
    }

    private void getNews() {
        reference.addValueEventListener(new ValueEventListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list = new ArrayList<>();
                for (DataSnapshot Snapshot : dataSnapshot.getChildren()) {
                    NewsData data = Snapshot.getValue(NewsData.class);
                    list.add(0,data);
                }
                adapter = new NewsAdapter(NewsMainActivity.this,list);
                adapter.notifyDataSetChanged();
                newsprogressbar.setVisibility(View.GONE);
                news_recycler.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                newsprogressbar.setVisibility(View.GONE);
                Toast.makeText(NewsMainActivity.this,databaseError.getMessage() , Toast.LENGTH_SHORT).show();
            }
        });

    }
}