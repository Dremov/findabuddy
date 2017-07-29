package com.dremov.android.findabuddy.model.entities;

/**
 * Created by Dremov on 26.07.17.
 */

public class Event {

    private String id;

    private String title;
    private String description;
    private String imgUrl;
    private String buddiesNumber;

    public Event() {

    }

    public Event(String title, String description, String imgUrl, String buddiesNumber) {
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.buddiesNumber = buddiesNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBuddiesNumber() {
        return buddiesNumber;
    }

    public void setBuddiesNumber(String buddiesNumber) {
        this.buddiesNumber = buddiesNumber;
    }
}
