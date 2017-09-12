package com.abramkin.chatprototype;

import android.media.Image;

import java.io.Serializable;


/**
 * Created by Jack on 25.04.2017.
 */

public class MyUser implements Serializable, com.abramkin.chatprototype.chat.User {

    private String name;
    private int id;
    private Boolean status;
    private int icon;

    public MyUser(String name, int id, Boolean status, int icon) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isOnline() {
        return status;
    }

    @Override
    public int getIcon() {
        return icon;
    }
}
