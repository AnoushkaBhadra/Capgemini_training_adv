package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TaskDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public TaskDAO(){
        this.emf = Persistence.createEntityManagerFactory("taskPU");
        this.em = emf.createEntityManager();
    }

    public TaskDTO create(Task task){
        try{
            em.getTransaction().begin();
            em.persist(task);
            em.getTransaction().commit();

            System.out.println("Task Created Successfully with id : "+task.getId());
            return convertToDTO(task);
        }
        catch (Exception e) {
            if(em.getTransaction().isActive())
                em.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }
        finally{
            em.close();
        }
    }

    private TaskDTO convertToDTO(Task task){
        return new TaskDTO(
                task.getId(),
                task.getTask(),
                task.getDescription()
        );
    }
}