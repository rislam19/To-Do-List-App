package main.java.com;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ToDoList {

    private List<Task> tasks;
    private int id;

    public ToDoList() {
        tasks = new ArrayList<Task>();
        id = 1;
    }

    public void addTask(String title, String description) {
        Task task = new Task(id, title, description, false);
        tasks.add(task);
        id++;
    }

    public void removeTask(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                tasks.remove(task);
                return;
            }
        }
    }

    public void markTaskCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                return;
            }
        }
        System.out.println("Task not found");
    }

    public void markTaskIncomplete(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setCompleted(false);
                return;
            }
        }
        System.out.println("Task not found");
    }

    public Task getTask(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                return task;
            }
        }
        return null;
    }

    public void editTask(int taskId, String newTitle, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                break;
            }
        }
    }

    public void displayAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks");
        }
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }

    public void displayCompletedTasks() {
        boolean hasCompleted = false;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                hasCompleted = true;
                System.out.println(task.toString());
            }
        }
        if (!hasCompleted) {
            System.out.println("No completed tasks");
        }
    }

    public void displayPendingTasks() {
        boolean hasPending = false;
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                hasPending = true;
                System.out.println(task.toString());
            }
        }
        if (!hasPending) {
            System.out.println("No pending tasks");
        }
    }

    public int getTotalTasks() {
        return tasks.size();
    }

    public int getCompletedTasksCount() {
        int count = 0;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                count++;
            }
        }
        return count;
    }

    public int getPendingTasksCount() {
        int count = 0;
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                count++;
            }
        }
        return count;
    }

    public List<Task> getAllTasks() {
        List<Task> copy = new ArrayList<>(tasks);
        return copy;
    }

    public void clearAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks");
        }
        tasks.clear();
        id = 1;
    }

    public void clearCompletedTasks() {
        Iterator<Task> taskIterator = tasks.iterator();

        if (tasks.isEmpty()) {
            System.out.println("No tasks");
        }
        while (taskIterator.hasNext()) {
            Task task = taskIterator.next();
            if (task.isCompleted()) {
                taskIterator.remove();
            }
        }
    }

}
