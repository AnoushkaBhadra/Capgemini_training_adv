package com.example.queryextraction;

import com.example.queryextraction.entities.Employees;
import jakarta.persistence.*;

import java.util.List;

public class Main {
    public static void main(String args[]){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityExtraction");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Query query = em.createQuery("Select e from Employees e where e.name = 'ali'");
        List<Employees> list = query.getResultList();

        for(Employees e: list){
            System.out.println(e);
        }

        tx.commit();

    }
}
