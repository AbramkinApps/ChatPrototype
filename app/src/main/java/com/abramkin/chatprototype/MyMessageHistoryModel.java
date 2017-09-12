package com.abramkin.chatprototype;

import com.abramkin.chatprototype.chat.*;
import com.abramkin.chatprototype.chat.User;

/**
 * Created by Jack on 11.09.2017.
 */

public class MyMessageHistoryModel implements MessageHistoryModel {

    @Override
    public MyMessageHistory getMessageHistory(User user) {
        MyUser mu = (MyUser) user;

        MyMessageHistory mmh = new MyMessageHistory(mu);
        return mmh;
    }
}
