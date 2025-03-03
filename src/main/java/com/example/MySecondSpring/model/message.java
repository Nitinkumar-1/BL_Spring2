package com.example.MySecondSpring.model;

public class message {
    private String text;

    public  message(String text){
        this.text=text;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text=text;
    }
}