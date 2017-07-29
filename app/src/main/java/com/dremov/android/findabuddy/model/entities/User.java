package com.dremov.android.findabuddy.model.entities;

import java.util.List;

/**
 * Created by Dremov on 27.07.17.
 */

public class User {

    private int id;
    private List<Integer> eventsIds;
    private String usrName;
    private String email;

    public User(List<Integer> eventsIds, String usrName, String email) {
        this.eventsIds = eventsIds;
        this.usrName = usrName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getEventsIds() {
        return eventsIds;
    }

    public void setEventsIds(List<Integer> eventsIds) {
        this.eventsIds = eventsIds;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
