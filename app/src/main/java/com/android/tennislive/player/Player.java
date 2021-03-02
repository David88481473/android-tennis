package com.android.tennislive.player;

public class Player {

    private String name;

    private int imageId;

    public Player(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return this.name;
    }

    public int getImageId() {
        return  this.imageId;
    }
}
