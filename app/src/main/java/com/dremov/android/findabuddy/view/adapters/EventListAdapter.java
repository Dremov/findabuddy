package com.dremov.android.findabuddy.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.dremov.android.findabuddy.R;
import com.dremov.android.findabuddy.model.entities.Event;
import com.dremov.android.findabuddy.view.holders.EventCellHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dremov on 26.07.17.
 */

public class EventListAdapter extends RecyclerView.Adapter<EventCellHolder> {

    private List<Event> mEventsList = new ArrayList<>();
    private Context mContext;

    private int lastPosition = -1;

    public EventListAdapter (Context context) {
        this.mContext = context;
    }

    public void setEventsList(List<Event> events) {
        this.mEventsList.addAll(events);
        notifyDataSetChanged();
//        if (eventsList.size() < 20) {
//            MyAppUtils.cacheUsers(usersList);
//        }
    }

    public void addEvent(Event event) {
        mEventsList.add(event);
        notifyDataSetChanged();
    }

    public void clear() {
        int size = this.mEventsList.size();
        this.mEventsList.clear();
        notifyItemRangeRemoved(0, size);
    }

    private void animate(View viewToAnimate, int position) {
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(mContext, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }

//        viewToAnimate.animate().cancel();
//        viewToAnimate.setTranslationY(100);
//        viewToAnimate.setAlpha(0);
//        viewToAnimate.animate().alpha(1.0f).translationY(0).setDuration(300).setStartDelay(position * 10);

    }

    @Override
    public EventCellHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_cell_container, parent, false);

        return new EventCellHolder(v);
    }

    @Override
    public void onBindViewHolder(EventCellHolder holder, int position) {
        Event event = mEventsList.get(position);

        holder.mHeaderTv.setText(event.getTitle());
        holder.mNumberOfBuddiesTv.setText("Buddies needed: " + event.getBuddiesNumber());

        holder.setSelectedEvent(mEventsList.get(position));

        animate(holder.itemView, position);
    }

    @Override
    public int getItemCount() {
        return mEventsList.size();
    }
}
