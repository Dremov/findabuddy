package com.dremov.android.findabuddy.entities;

/**
 * Created by Dremov on 26.07.17.
 */

public class Event {
    private String title;
    private String description;
    private String imgUrl;
    private String buddiesNumber;

    public Event(String title, String description, String imgUrl, String buddiesNumber) {
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.buddiesNumber = buddiesNumber;
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
