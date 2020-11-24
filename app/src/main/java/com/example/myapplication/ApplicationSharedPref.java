package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

import java.net.PortUnreachableException;

public class ApplicationSharedPref {
    private SharedPreferences sharedPreferences;

    public  static final String USERNAME= "username";
    public  static final String PASSWORD= "password";
     public static String REMEMBER_ME ="remember_me";

    ApplicationSharedPref(Context context){
        sharedPreferences = context.getSharedPreferences("APP_SHARED",Context.MODE_PRIVATE);

    }
    public void saveUsernameAndPassword(String username,String password){
        sharedPreferences.edit().putString(USERNAME,username).apply();
        sharedPreferences.edit().putString(PASSWORD,password).apply();

    }

public String getPassword(){
       return sharedPreferences.getString(PASSWORD,"");
}
    public String getUsername(){
        return sharedPreferences.getString(USERNAME,"");
    }

    public  void setRememberMe(boolean rm) {
       sharedPreferences.edit().putBoolean(REMEMBER_ME,rm).apply();
    }
    public boolean getRememberME(){
        return  sharedPreferences.getBoolean(REMEMBER_ME,false);
    }

    public void clearUserInfo(){
        sharedPreferences.edit().remove(USERNAME).apply();
        sharedPreferences.edit().remove(PASSWORD).apply();
    }
}
