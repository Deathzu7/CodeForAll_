package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

        Athlete athlete = new Athlete();
        Sponsor sponsor = new Sponsor();

        athlete.setGender("Men");
        athlete.setSport("100m");
        sponsor.setName("Adidas");
        sponsor.setSalary(1000);




        em.getTransaction().begin();
        em.persist(athlete);
        em.persist(sponsor);
        em.getTransaction().commit();



// Close the database connection
        em.close();

// Shutdown JPA
        emf.close();
    }
}
