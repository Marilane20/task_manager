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

    public void markTaskAsComplet(int id) {
        tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .ifPresentOrElse(
                        task -> {
                            task.markCompleted();
                            System.out.println("Task marked as completed.");
                        },
                        () -> System.out.println("Task not found with ID: " + id)
                );
    }

    public void deleteTasks(int id) {
        boolean isRemoved = tasks.removeIf(task -> task.getId() == id);

        if (isRemoved) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found with ID: " + id);
        }
    }

}
