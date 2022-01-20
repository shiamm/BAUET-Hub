package com.edu.bauet.Database.Event;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.edu.bauet.Database.Notice.FullImageActivity;
import com.edu.bauet.R;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewAdapter> {

    private Context context;
    private ArrayList<EventData> list;

    public EventAdapter(Context context, ArrayList<EventData> list) {
        this.context = context;
        this.list = list;}

    @NonNull
    @Override
    public EventViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notice_item_adminlayout,parent,false);
        return new EventViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewAdapter holder, int position) {
        EventData currentItem = list.get(position);

        holder.deletenotice_title.setText(currentItem.getTitle());
        holder.date.setText(currentItem.getDate());
        holder.time.setText(currentItem.getTime());

        try {
            if (currentItem.getImage() != null)
                Glide.with(context).load(currentItem.getImage()).into(holder.deletenotice_image);
        } catch (Exception e) {
            e.printStackTrace();
        }

        holder.deletenotice_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FullImageActivity.class);
                intent.putExtra("image",currentItem.getImage());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class EventViewAdapter extends RecyclerView.ViewHolder {

        private TextView deletenotice_title,date,time;
        private ImageView deletenotice_image;

        public EventViewAdapter(@NonNull View itemView) {
            super(itemView);
            deletenotice_title = itemView.findViewById(R.id.deletenotice_title);
            deletenotice_image = itemView.findViewById(R.id.deletenotice_image);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
        }
    }
}
