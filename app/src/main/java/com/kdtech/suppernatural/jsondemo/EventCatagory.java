package com.kdtech.suppernatural.jsondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class EventCatagory extends AppCompatActivity {
    private RecyclerView recyclerView;
    private event_detail_adapter adapter;
    private List<eventDetails> eventCatogories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_catagory);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_catagory);

        eventCatogories = new ArrayList<>();
        adapter = new event_detail_adapter(this, eventCatogories);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareList();

        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent  eventcatagory = new Intent(EventCatagory.this,selectedCatagory.class);
                startActivity(eventcatagory);
                return true;
            }
        });
    }
    private void prepareList() {
        eventDetails a = new eventDetails("Technical events",  R.drawable.ideation);
        eventCatogories.add(a);

        a = new eventDetails("non technical events", R.drawable.workshops);
        eventCatogories.add(a);

     //   a = new eventDetails("special",R.drawable.event);
      //  eventCatogories.add(a);

        adapter.notifyDataSetChanged();
    }


}
