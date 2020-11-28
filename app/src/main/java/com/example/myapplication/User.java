package com.example.myapplication;

import android.graphics.drawable.Drawable;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class User {
  private int id;
  private Drawable itemImage;
  private String title;
  private String content;
  private String date;

    public User(int id, Drawable itemImage, String title, String content, String date) {
        this.id = id;
        this.itemImage = itemImage;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getItemImage() {
        return itemImage;
    }

    public void setItemImage(Drawable itemImage) {
        this.itemImage = itemImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
