package com.kdtech.suppernatural.jsondemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kusha_000 on 25-01-2017.
 */

public class event_adapter  extends RecyclerView.Adapter<event_adapter.MyViewHolder> {

    private List<event> eventList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
        }
    }


    public event_adapter(List<event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.event_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        event event = eventList.get(position);
        holder.title.setText(event.getTitle());
        holder.genre.setText(event.getGenre());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}