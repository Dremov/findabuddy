package com.dremov.android.findabuddy;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Dremov on 26.07.17.
 */

public class CreateEventActivity extends Activity {

    private TextView mCommitEventBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        mCommitEventBtn = (TextView) findViewById(R.id.commit_event_btn);
    }
}
