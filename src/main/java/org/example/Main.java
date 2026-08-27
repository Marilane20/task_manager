package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var taskManager = new TaskManager();
        var running = true;

        System.out.println("************************ WELCOME TO TASK MANAGER BY MARILANE ************************");

        while (running) {
            System.out.println("""
                    
                    Choose your option:
                    1 - Add a task
                    2 - List all tasks
                    3 - Mark a task as completed
                    4 - Delete a task
                    5 - Exit programme
                    """);

            System.out.print("Enter your choice: ");


            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            var choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the title of your task: ");
                    var title = scanner.nextLine();
                    taskManager.addTask(title);
                }
                case 2 -> {
                    System.out.println("\n--- Your Tasks ---");
                    taskManager.listTask();
                }
                case 3 -> {
                    System.out.print("Enter the ID of the task to mark as completed: ");
                    if (scanner.hasNextInt()) {
                        var id = scanner.nextInt();
                        scanner.nextLine();
                        taskManager.markTaskAsComplet(id);
                    } else {
                        System.out.println("Invalid ID. Must be a number.");
                        scanner.nextLine();
                    }
                }
                case 4 -> {
                    System.out.print("Enter the ID of the task to delete: ");
                    if (scanner.hasNextInt()) {
                        var id = scanner.nextInt();
                        scanner.nextLine();
                        taskManager.deleteTasks(id);
                    } else {
                        System.out.println("Invalid ID. Must be a number.");
                        scanner.nextLine();
                    }
                }
                case 5 -> {
                    System.out.println("Exiting application. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }

        scanner.close();
    }
}