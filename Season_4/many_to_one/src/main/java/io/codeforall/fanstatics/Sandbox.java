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

        Car car = new Car();
        car.setMake("Bmw");
        car.setModel("E36");


        Type type1 = new Type();
        type1.setName("Sport");


        Type type2 = new Type();
        type2.setName("SUV");


        car.addType(type1);
        car.addType(type2);


        em.getTransaction().begin();
        em.persist(car);
        em.getTransaction().commit();

        // Recuperar o carro e seus tipos
        Car foundCar = em.find(Car.class, car.getId());
        System.out.println("Carro encontrado: " + foundCar.getMake() + " " + foundCar.getModel());
        foundCar.getTypeSet().forEach(type -> System.out.println("Tipo: " + type.getName()));

        // Adicionar um novo tipo ao carro
        Type type3 = new Type();
        type3.setName("Luxury");

        em.getTransaction().begin();
        foundCar.addType(type3); // Atualiza a associação
        em.merge(foundCar); // Apenas o carro é atualizado
        em.getTransaction().commit();

        // Recuperar novamente para confirmar a atualização
        Car updatedCar = em.find(Car.class, car.getId());
        System.out.println("Carro atualizado: " + updatedCar.getMake() + " " + updatedCar.getModel());
        updatedCar.getTypeSet().forEach(type -> System.out.println("Tipo: " + type.getName()));

        // Fechar o EntityManager
        em.close();
        emf.close();
    }
}