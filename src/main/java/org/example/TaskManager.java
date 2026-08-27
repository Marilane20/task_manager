package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

   final List<Task> tasks = new ArrayList<>();
   private int nextId;

    public void addTask( String title){
        tasks.add( new Task(nextId++, title));
        System.out.println("task add:"+ title);
    }

    public void listTask(){

        if (tasks.isEmpty()) {
            System.out.println("Not Found");
            return;
        }
        System.out.println( "Your Task");
        tasks.forEach(System.out::println);
    }
}
