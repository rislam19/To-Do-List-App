import main.java.com.ToDoList;
import java.util.Scanner;

/**
 * Simple To-Do List Application
 * A console-based task management system
 */
public class Main {
    public static void main(String[] args) {
        // Initialize the to-do list and scanner
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== To-Do List App ===");

        // Main application loop
        while (true) {
            // Display menu options
            System.out.println("\n1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark complete");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Handle user choice
            if (choice == 1) {
                // Add new task
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Description: ");
                String description = scanner.nextLine();
                todoList.addTask(title, description);
                System.out.println("Added!");

            } else if (choice == 2) {
                // Display all tasks
                todoList.displayAllTasks();

            } else if (choice == 3) {
                // Mark task as completed
                System.out.print("Task ID: ");
                int id = scanner.nextInt();
                todoList.markTaskCompleted(id);
                System.out.println("Marked complete!");

            } else if (choice == 4) {
                // Delete task
                System.out.print("Task ID: ");
                int id = scanner.nextInt();
                todoList.removeTask(id);
                System.out.println("Deleted!");

            } else if (choice == 5) {
                // Exit application
                System.out.println("Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
