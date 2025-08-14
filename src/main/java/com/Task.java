package main.java.com;

import java.time.LocalDateTime;

public class Task {

    private int id; // Integer that gives each task a unique identity
    private String title;
    private String description; // The description
    private boolean isCompleted;
    private LocalDateTime createdAt;
    private LocalDateTime dueDate;

    public Task(int id, String title, String description, boolean isCompleted) { // Task constructor
        this.id = id;
        this.description = description;
        this.title = title;
        this.description = description;
        this.isCompleted = false;
        this.createdAt = LocalDateTime.now();
        this.dueDate = null
    }

    /**
     *
     * @return the id of the current task
     */
    public int getId() { // Getter for ID
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() { // Getter for description
        return description;
    }

    public boolean isCompleted() { // Getter for completion
        return isCompleted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) { // Setter for description
        this.description = description;
    }

    public void setCompleted(boolean completed) { // Setter for completion
        this.isCompleted = completed;
    }

    public String toString() {
        return "Task ID: " + id + ", Title: " + title + ", Description: " + description + ", Completed: " + isCompleted;
    }

}
