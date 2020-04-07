package com.bzuniga.Chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bzuniga.R;

import java.util.ArrayList;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.chatListViewHolder> {

    ArrayList<ChatObject> chatList;

    public ChatListAdapter(ArrayList<ChatObject> chatList) {
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public chatListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        chatListViewHolder rev = new chatListViewHolder(layoutView);
        return rev;
    }

    @Override
    public void onBindViewHolder(@NonNull chatListViewHolder holder, final int position) {
        holder.mTitle.setText(chatList.get(position).getChatId());

        holder.mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public class chatListViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public LinearLayout mLayout;

        public chatListViewHolder(View view) {
            super(view);
            mTitle = view.findViewById(R.id.title);
            mLayout = view.findViewById(R.id.layout);
        }
    }
}
