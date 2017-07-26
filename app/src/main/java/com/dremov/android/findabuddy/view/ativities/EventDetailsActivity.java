package com.dremov.android.findabuddy.view.ativities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dremov.android.findabuddy.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Dremov on 27.07.17.
 */

public class EventDetailsActivity extends Activity {

    @Bind(R.id.details_activity_icon)
    ImageView icon;

    @Bind(R.id.details_activity_description)
    TextView mDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        ButterKnife.bind(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mDescription.setText(extras.getString("description"));

//            setUpData();
        }
    }


    private void setUpData() {
//        Picasso.with(this).load(imgUrl).into(icon);
        mDescription.setText("");
    }
}