package com.example.foreignkey;


import com.example.foreignkey.entities.Customer;
import com.example.foreignkey.entities.Customer_Details;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Maven7");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Customer c1 = new Customer("Saran");
        Customer_Details deets = new Customer_Details("12345678", "Hyderabad", "ali@gmail.com");

        c1.setDetails(deets);

        em.persist(c1);
        //em.persis(deets);

        System.out.println(c1);

        tx.commit();

    }


}
