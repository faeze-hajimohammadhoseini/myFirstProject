package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserRecyclerAdapter.ItemViewHolder>{

    private List<User> users=new ArrayList<>();

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        User u=users.get(position);
        holder.txtUsername.setText(u.getName());
        holder.txtEmail.setText(u.getEmail());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        private TextView txtUsername;
        private TextView txtEmail;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            txtUsername= itemView.findViewById(R.id.txt_name);
            txtEmail= itemView.findViewById(R.id.txt_email);
        }
    }

}
