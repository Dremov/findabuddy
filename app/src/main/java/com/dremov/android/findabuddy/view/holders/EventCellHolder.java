package com.dremov.android.findabuddy.view.holders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dremov.android.findabuddy.R;
import com.dremov.android.findabuddy.model.entities.Event;
import com.dremov.android.findabuddy.view.ativities.MainActivity;

/**
 * Created by Dremov on 26.07.17.
 */

public class EventCellHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView mHeaderTv;
    public TextView mNumberOfBuddiesTv;

    private Context mContext;

    private Event mEvent;

    public EventCellHolder(View itemView) {
        super(itemView);

        mContext = itemView.getContext();

        mHeaderTv = (TextView) itemView.findViewById(R.id.event_cell_title);
        mNumberOfBuddiesTv = (TextView) itemView.findViewById(R.id.event_cell_number_of_buddies);

        itemView.setClickable(true);
        itemView.setOnClickListener(this);
    }

    public void setSelectedEvent(Event event) {
        this.mEvent = event;
    }

    @Override
    public void onClick(View view) {
        if (mContext instanceof MainActivity) {
            ((MainActivity)mContext).startDetailsActivity(mEvent);
        }
    }
}
