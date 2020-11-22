package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public static List<User> getUsers(int size){
        List<User> users=new ArrayList<>();

        for (int i=0;i<size;i++){
            String name = "user"+i;
            String email=name+"@gmail.com";
            User u=new User(name,email);
            users.add(u);
        }

    return users;
    }
}




