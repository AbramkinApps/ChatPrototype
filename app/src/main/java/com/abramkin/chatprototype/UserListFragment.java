package com.abramkin.chatprototype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jack on 25.04.2017.
 */

public class UserListFragment extends Fragment {

    private static final MyUser[] USERs = {
            new MyUser("Аркадий",0,true,R.drawable.arcadiy),
            new MyUser("Марина",1,false,R.drawable.marina),
            new MyUser("Варвара",2,true,R.drawable.varvara),
            new MyUser("Никита",3,false,R.drawable.nikita),
            new MyUser("Ульяна",4,true,R.drawable.uliana),

    };



    public UserListFragment(){}



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(new UserAdapter(USERs, new UserAdapter.OnUserClickListener() {
            @Override
            public void onClick(MyUser user) {

                launchUserActivity(user);}

        }));
    }

    private void launchUserActivity(MyUser user) {

        Intent i = new Intent(getContext(),MessageActivity.class);
        i.putExtra("user", user);
        startActivity(i);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
