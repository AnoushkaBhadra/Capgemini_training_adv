package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Task;
    private String Description;

    public long getId(){
        return Id;
    }
    public String getDescription() {
        return Description;
    }
    public String getTask(){
        return Task;
    }

    public void setId(Long id){
        this.Id = id;
    }
    public void setTask(String task){
        this.Task = task;
    }
    public void setDescription(String description){
        this.Description = description;
    }
}
