package org.example;

public class Task {

    private final int id;
    private String title;
    private Boolean completed;



    public Task(int id , String title){
        this.id= id;
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public  void setTitle( String title){
        this.title = title;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" +(completed? "x" : "" )  + "]" + id + ": " + title;
    }
}
