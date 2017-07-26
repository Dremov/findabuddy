package com.dremov.android.findabuddy.view.ativities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


import com.dremov.android.findabuddy.R;
import com.dremov.android.findabuddy.model.entities.Event;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Dremov on 26.07.17.
 */

public class CreateEventActivity extends Activity {

    private EditText mTitle;
    private EditText mDescription;
    private Spinner mNumberOfPeopleSpinner;
    private TextView mCommitEventBtn;

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mEventsDatabaseReference;
    private ChildEventListener mChildEventListener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        mTitle = (EditText) findViewById(R.id.event_title_et);
        mDescription = (EditText) findViewById(R.id.event_description_et);
        mNumberOfPeopleSpinner = (Spinner) findViewById(R.id.required_buddies_spinner);

        Integer[] numbs = {1, 2, 3, 4, 5};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, numbs);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        mNumberOfPeopleSpinner.setAdapter(adapter);

        mCommitEventBtn = (TextView) findViewById(R.id.commit_event_btn);
        mCommitEventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commitEvent();
                finish();
            }
        });

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mEventsDatabaseReference = mFirebaseDatabase.getReference().child("events");
    }

    private void commitEvent() {
        Event event = new Event(mTitle.getText().toString(), mDescription.getText().toString(), null, mNumberOfPeopleSpinner.getSelectedItem().toString());
        mEventsDatabaseReference.push().setValue(event);
    }
}
