package test.java.com;

import main.java.com.ToDoList;

public class TaskTest {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        todo.addTask("Make bed", "Straighten sheets, fold comforter, place pillows");
        todo.addTask("Clean bathroom", "Scrub toilet, sinks, shower, wipe mirror");
        System.out.println("Testing addTask");
        todo.displayAllTasks();

        System.out.println("Testing markTaskCompleted");
        todo.markTaskCompleted(1);
        todo.displayAllTasks();
        todo.displayCompletedTasks();

        System.out.println("Testing markTaskIncomplete");
        todo.markTaskIncomplete(1);
        todo.displayAllTasks();

        System.out.println("Testing editTask");
        todo.editTask(2, "Clean both bathrooms", "Clean each part of both bathrooms");
        todo.displayAllTasks();

        System.out.println("Testing getTask");
        System.out.println(todo.getTask(2));
        System.out.println(todo.getTask(3));

        System.out.println("Testing displayPendingTasks");
        todo.markTaskCompleted(1);
        todo.displayPendingTasks();
        todo.displayAllTasks();

        System.out.println("Testing counts");
        System.out.println(todo.getTotalTasks());
        System.out.println(todo.getCompletedTasksCount());
        System.out.println(todo.getPendingTasksCount());

        System.out.println("Testing removeTask");
        todo.removeTask(2);
        todo.displayAllTasks();

        System.out.println("Testing clearAllTasks");
        todo.clearAllTasks();
        todo.displayAllTasks();

        System.out.println("Testing edge cases");
        todo.displayAllTasks();
        todo.displayCompletedTasks();
        todo.displayPendingTasks();

        todo.markTaskCompleted(3);

        todo.clearAllTasks();
        todo.addTask("Take out trash", "Throw all trash in garbage");
        System.out.println(todo.getTask(1));
    }
}
