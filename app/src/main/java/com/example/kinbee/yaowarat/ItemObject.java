package com.example.kinbee.yaowarat;

/**
 * Created by kinbee on 12/15/2016 AD.
 */

public class ItemObject {

    private String name;
    private int photo;

    public ItemObject(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
