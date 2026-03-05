package com.example.foreignkey.entities;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {

    }

    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "customer_details")
    private Customer_Details details;

    public void setDetails(Customer_Details details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
