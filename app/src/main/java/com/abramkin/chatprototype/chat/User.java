package com.abramkin.chatprototype.chat;

//import javafx.scene.image.Image;

import android.media.Image;

/**
 * Represents a user
 */
public interface User
{
    /**
     * @return MyUser's name
     */
    String getName();

    /**
     * @return MyUser's unique ID
     */
    int getId();

    /**
     * @return True if user is online
     */
    boolean isOnline();

    /**
     * @return MyUser's avatar
     */
    int getIcon();
}
