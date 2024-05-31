package com.itsc.todolist;

import org.w3c.dom.ls.LSOutput;

public class Task {
    String taskTitle, description;
    boolean completed;

    public Task(String taskTitle, String description){
        this.taskTitle = taskTitle;
        this.description = description;
        this.completed = false;
    }

    public String getTitle(){
        return this.taskTitle;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean isCompleted(){
        return this.completed;
    }

    public void markCompleted(){
        this.completed = true;
    }

    public String toTaskString(){
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Title: " +  taskTitle);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Description: " + description);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        String status = isCompleted()? "Status: Completed." : "Status: Not completed.";
        System.out.println(status);
        return"----------------------------------------------------------------------------------------------------------------------------------";
    }
}