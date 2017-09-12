package com.abramkin.chatprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.abramkin.chatprototype.R.id.recyclerView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);




        ListView listView = (ListView) findViewById(R.id.listView);
        Button btn = (Button) findViewById(R.id.send_btn);
        final EditText edt = (EditText) findViewById(R.id.edt);


        final MyUser user = (MyUser) getIntent().getSerializableExtra("user");

       final MyMessageHistoryModel mmhm = new MyMessageHistoryModel();

       List<MyMessage> lmm = mmhm.getMessageHistory(user).getListOfMessages();

        final ArrayList<String> lmm_text = new ArrayList<>();

        for(MyMessage msg : lmm){

            lmm_text.add(msg.getText());

        }



        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,lmm_text);

        listView.setAdapter(adapter);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!String.valueOf(edt.getText()).equals("")) {

                    lmm_text.add(String.valueOf(edt.getText()));
                    edt.setText("");
                    adapter.notifyDataSetChanged();

                }

            }
        });



    }
}
