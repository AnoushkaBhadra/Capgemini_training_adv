package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main{
    public static void main(String args[]){
        System.out.println("Starting JPA... ");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(("taskPU"));
        System.out.println("EntityManagerFactory created successfully");
        emf.close();
        System.out.println("Closed sucessfully");
    }
}
