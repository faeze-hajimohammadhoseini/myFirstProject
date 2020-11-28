package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.ItemViewHolder>{
    private  Context context;
    private List<User> users;
    public UserRecyclerAdapter(Context context, List<User> users){

        this.context = context;
        this.users = users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_user,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        User u=users.get(position);
        holder.itemImage.setImageDrawable(u.getItemImage());
        holder.itemTitle.setText(u.getTitle());
        holder.itemContent.setText(u.getContent());
        holder.itemDate.setText(u.getDate());

    }

    @Override
    public int getItemCount() {

        return users.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        private ImageView itemImage;
        private TextView itemContent;
        private TextView itemTitle;
        private TextView itemDate;
        @SuppressLint("WrongViewCast")
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = (ImageView) itemView.findViewById(R.id.item_image);
            itemContent = (TextView) itemView.findViewById(R.id.item_content);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDate = (TextView) itemView.findViewById(R.id.item_date);
        }
    }

}
