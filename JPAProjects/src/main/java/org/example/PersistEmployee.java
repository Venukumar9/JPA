package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistEmployee {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("test");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        EmployeeEntity e = new EmployeeEntity();
          e.setId(1229);
        e.setEname("venu");
        e.setSalary(8989.00);


        EmployeeEntity e2 = new EmployeeEntity();
        e2.setId(1203);
        e2.setEname("john");
        e2.setSalary(899.00);

        em.persist(e);
        em.persist(e2);


        em.getTransaction().commit();
        emf.close();
        em.close();


    }
}

