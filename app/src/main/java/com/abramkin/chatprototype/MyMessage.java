package com.abramkin.chatprototype;

import com.abramkin.chatprototype.chat.*;
import com.abramkin.chatprototype.chat.User;

import java.util.Date;


public class MyMessage implements Message {

    Date date;
    String text;
    MyUser sender;
    MyUser receiver;

    public MyMessage(Date date, String text, MyUser sender, MyUser receiver) {
        this.date = date;
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public User getReceiver() {
        return receiver;
    }
}
