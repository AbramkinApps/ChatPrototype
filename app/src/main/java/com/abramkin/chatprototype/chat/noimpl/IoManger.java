package com.abramkin.chatprototype.chat.noimpl;


import com.abramkin.chatprototype.chat.Consumer;
import com.abramkin.chatprototype.chat.Message;
import com.abramkin.chatprototype.chat.User;
import com.abramkin.chatprototype.chat.UserStateChangeHandler;


/**
 * It's the interface you supposed to use with your virtual fellow programmer who implements network module.
 * You don't need to implement it but your application must to work with any implementation of this interface.
 */
public interface IoManger
{
    void sendMessage(User receiver, String text) throws Exception;

    void setRecieveMessageHandler(Consumer<Message> handler);

    void setUserStateChangeHandler(UserStateChangeHandler handler);

    void setUserAddedHandler(Consumer<User> handler);

    void setUserRemovedHandler(int userId);
}
