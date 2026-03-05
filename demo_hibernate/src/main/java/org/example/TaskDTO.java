package org.example;

public class TaskDTO {

    private long id;
    private String tasks;
    private String description;

    // Default constructor
    public TaskDTO() {
    }

    // Parameterized constructor
    public TaskDTO(long id, String task, String description) {
        this.id = id;
        this.tasks = task;
        this.description = description;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getTasks() {
        return tasks;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTask(String tasks) {
        this.tasks = tasks;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TaskDTO(" +
                "id=" + id +
                ", task='" + tasks + '\'' +
                ", description='" + description + '\'' +
                ')';
    }
}