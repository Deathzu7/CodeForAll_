package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class CadetDao {

    private EntityManagerFactory emf;

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void addCadet(String name, Integer age, String city, String street, String zipcode) {
        EntityManager em = emf.createEntityManager();
        Cadet cadet = new Cadet();

        try {
            em.getTransaction().begin();

            em.persist(cadet);

            Address newAddress = new Address();
            cadet.setAge(age);
            cadet.setName(name);
            newAddress.setCity(city);
            newAddress.setZipcode(zipcode);
            newAddress.setStreet(street);
            cadet.setAddress(newAddress);


            em.getTransaction().commit();
        } catch (Exception ex) {
            // Catch all exceptions and roll back
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw ex;  // Re-throw to allow caller to handle
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    public Cadet saveOrUpdateAddress(Cadet cadet, String city, String zipcode, String street) {

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin(); // open transaction
            Cadet savedCadet = em.merge(cadet);
            Address newAddress = new Address();
            newAddress.setCity(city);
            newAddress.setZipcode(zipcode);
            newAddress.setStreet(street);
            savedCadet.setAddress(newAddress);
            em.getTransaction().commit(); // close transaction
            return savedCadet;

        } catch (RollbackException ex) {

            // something went wrong, make sure db is consistent
            em.getTransaction().rollback();
            return null;

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void delete(Integer id){
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Cadet cadet = em.find(Cadet.class, id);
            em.remove(cadet);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public boolean deleteListOfCadets(List<Integer> ids) {

        EntityManager em = emf.createEntityManager();

        if (ids != null && !ids.isEmpty()) {
            em.getTransaction().begin();
            Number result = em.createQuery(
                            "delete from Cadet where id in :ids")
                    .setParameter("ids", ids)
                    .executeUpdate();
            em.getTransaction().commit();
            return result.intValue() > 0;
        }
        else {
            return false;
        }
    }

}
