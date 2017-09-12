package com.abramkin.chatprototype;

import com.abramkin.chatprototype.chat.MessageHistory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class MyMessageHistory extends MessageHistory {

    List<MyMessage> ListOfMessages = new ArrayList<>();
    MyUser user;

    public MyMessageHistory() {
    }

    public MyMessageHistory(MyUser user) {

        MyUser itsMe = new MyUser("It's me",77,true,R.drawable.arcadiy);

        MyUser arkadiy = new MyUser("Аркадий",0,true,R.drawable.arcadiy);
        MyUser marina = new MyUser("Марина",1,false,R.drawable.marina);
        MyUser varvara = new MyUser("Варвара",2,true,R.drawable.varvara);
        MyUser nikita =  new MyUser("Никита",3,false,R.drawable.nikita);
        MyUser uliana =  new MyUser("Ульяна",4,true,R.drawable.uliana);

        this.user=user;

        MyMessage m1 = new MyMessage(new Date(),"Привет, Аркадий",itsMe,arkadiy);
        MyMessage m2 = new MyMessage(new Date(),"Привет, Марина",itsMe,marina);
        MyMessage m3 = new MyMessage(new Date(),"Привет, Варвара",itsMe,varvara);
        MyMessage m4 = new MyMessage(new Date(),"Привет, Никита",itsMe,nikita);
        MyMessage m5 = new MyMessage(new Date(),"Привет, Ульяна",itsMe,uliana);

        ListOfMessages.add(m1);
        ListOfMessages.add(m2);
        ListOfMessages.add(m3);
        ListOfMessages.add(m4);
        ListOfMessages.add(m5);

    }

    public void setListOfMessages(List<MyMessage> listOfMessages) {
        ListOfMessages = listOfMessages;
    }

    public List<MyMessage> getListOfMessages() {

        List<MyMessage> lm = new ArrayList<>();

        if (ListOfMessages!=null) {

        for(MyMessage msg : ListOfMessages){

            if (msg.getReceiver().getId() == user.getId()) {
                lm.add(msg);
            }
        } }

        return lm;
    }
}
