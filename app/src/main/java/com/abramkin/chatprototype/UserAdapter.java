package com.abramkin.chatprototype;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jack on 27.04.2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private final MyUser[] mUsers;
    private final OnUserClickListener listener;

    public UserAdapter(MyUser[] users, OnUserClickListener listener) {
        this.mUsers = users;
        this.listener=listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.view_user_item,parent,false);
        return new ViewHolder(itemView,listener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final MyUser user = mUsers[position];

        holder.bindTo(user);



    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return mUsers.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final TextView nameView;
        final TextView statusView;
        final TextView notificationView;
        final ImageView avatar;


        MyUser mUser;

        public ViewHolder(View itemView, final OnUserClickListener listener) {
            super(itemView);
            nameView = (TextView) itemView.findViewById(R.id.name);
            statusView = (TextView) itemView.findViewById(R.id.status);
            notificationView = (TextView) itemView.findViewById(R.id.notification);
            avatar = (ImageView) itemView.findViewById(R.id.avatar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    listener.onClick(mUser);
                }
            });
        }

        private void bindTo(MyUser user) {

            this.mUser = user;
            nameView.setText(user.getName());
            statusView.setText((user.isOnline())? "Online": "Offline");
            statusView.setTextColor((user.isOnline())? Color.GREEN: Color.RED);
            notificationView.setText("No new messages");
            avatar.setImageResource(user.getIcon());

        }
    }

    public interface OnUserClickListener {
        void onClick(MyUser user);
    }
}