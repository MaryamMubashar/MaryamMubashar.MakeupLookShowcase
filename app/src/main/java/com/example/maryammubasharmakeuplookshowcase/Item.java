package com.example.maryammubasharmakeuplookshowcase;

public class Item {
    String title;
    String name;
    String date;
    int image;

    public Item() {
    }

    public Item(String title, String name, String date, int image) {
        this.title = title;
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
