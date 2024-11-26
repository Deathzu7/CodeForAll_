package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {

        // Use the test persistence unit to configure a new
// entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        // Open a new database connection by getting a new
// entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

        Car car1 = new Car();
        car1.setId(1);
        car1.setMake("Bmw");
        car1.setModel("E36");


        Owner owner1 = new Owner();
        owner1.setId(1);
        owner1.setCar(car1);
        owner1.setName("JOKA");

        car1.setOwner(owner1);


        em.getTransaction().begin();
        em.persist(car1);
        em.persist(owner1);
        em.getTransaction().commit();

// Close the database connection
        em.close();

// Shutdown JPA
        emf.close();
    }
}