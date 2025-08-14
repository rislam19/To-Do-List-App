import main.java.com.ToDoList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("To-Do List App");

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark complete");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Description: ");
                String description = scanner.nextLine();
                todoList.addTask(title, description);
                System.out.println("Added!");
            } else if (choice == 2) {
                todoList.displayAllTasks();
            } else if (choice == 3) {
                System.out.print("Task ID: ");
                int id = scanner.nextInt();
                todoList.markTaskCompleted(id);
                System.out.println("Marked complete!");
            } else if (choice == 4) {
                System.out.print("Task ID: ");
                int id = scanner.nextInt();
                todoList.removeTask(id);
                System.out.println("Deleted!");
            } else if (choice == 5) {
                break;
            }
        }

        scanner.close();
    }
}
