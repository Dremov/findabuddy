package com.dremov.android.findabuddy.view.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.dremov.android.findabuddy.R;

/**
 * Created by Dremov on 26.07.17.
 */

public class EventCellHolder extends RecyclerView.ViewHolder {

    public TextView mHeaderTv;
    public TextView mNumberOfBuddiesTv;

    public EventCellHolder(View itemView) {
        super(itemView);

        mHeaderTv = (TextView) itemView.findViewById(R.id.event_cell_title);
        mNumberOfBuddiesTv = (TextView) itemView.findViewById(R.id.event_cell_number_of_buddies);
    }
}
