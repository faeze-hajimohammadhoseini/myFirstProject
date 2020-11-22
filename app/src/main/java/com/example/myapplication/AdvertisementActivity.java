package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementActivity extends AppCompatActivity {

    private RecyclerView rcUsers;
    private UserRecyclerAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);

        userAdapter = new UserRecyclerAdapter();
        userAdapter.setUsers(DataProvider.getUsers(10));

        rcUsers = findViewById(R.id.rc_users);
        rcUsers.setAdapter(userAdapter);
        rcUsers.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}