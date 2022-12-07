package com.example.mobilki3;

import java.util.Date;
import java.util.UUID;

public class Task {

    private UUID id;
    private String name;
    private Date date;
    private Boolean done;
    private String details;
    private Category category;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
        done = false;
        category = Category.HOME;
    }

    public Date getDate() { return date; }

    public void setDate(Date d) { date =d; }

    public void setName(String n){
        name = n;
    }

    public boolean isDone(){
        return done;
    }

    public void setDone(boolean b){
        done = b;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setDetails(String d) { details = d;}

    public String getDetails(){ return details; }

    public void setCategory (Category c)  { category = c; }

    public Category getCategory (){ return category; }

}


