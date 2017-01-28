package com.kdtech.suppernatural.jsondemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by kusha_000 on 26-01-2017.
 */

public class event_detail_adapter extends RecyclerView.Adapter<event_detail_adapter.MyViewHolder> {

    private Context mContext;
    private List<eventDetails> eventList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.event_name);
            thumbnail = (ImageView) view.findViewById(R.id.event_image);
        }
    }


    public event_detail_adapter(Context mContext, List<eventDetails> eventList) {
        this.mContext = mContext;
        this.eventList = eventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_detail_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        eventDetails event_details = eventList.get(position);
        holder.title.setText(event_details.getEventName());
        // loading event_details cover using Glide library
        Glide.with(mContext).load(event_details.getEventImg()).into(holder.thumbnail);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int size = getItemCount();
                Bundle bundle = new Bundle();
                //EventCatagory activity has just 3 items in recycler view
                if (size<5) {
                    Intent intent = new Intent(mContext,selectedCatagory.class);
                    bundle.putInt("pos",position);
                    intent.putExtras(bundle);
                    mContext.startActivity(intent);
                }
                //in SelectedCatagory activity there are 12 items in non technical list
                else if(size>10) {
                    int pass =1;
                    Intent intent = new Intent(mContext, MainActivity.class);
                    bundle.putInt("pos",position);
                    bundle.putInt("pass",pass);
                    intent.putExtras(bundle);
                    mContext.startActivity(intent);
                }
                //in selectedCatagory activity  there are 10 items
                else if (size<=10){
                    int pass =0;
                    Intent intent = new Intent(mContext, MainActivity.class);
                    bundle.putInt("pos",position);
                    bundle.putInt("pass",pass);
                    intent.putExtras(bundle);
                    mContext.startActivity(intent);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return eventList.size();
    }
}