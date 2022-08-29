package org.example;

import javax.persistence.EntityManager;

public class StudentMain {


        static EntityManager entityManager;
        public static void main(String[] args) {
            entityManager = org.example.Persistence.getEntityManager();
            entityManager.getTransaction().begin();

            Student s = new Student(13,"venu",455);
            Student s1 = new Student(3,"banu",55);
            Student s2 = new Student(23,"sriny",755);

            entityManager.persist(s);
            entityManager.persist(s1);
            entityManager.persist(s2);
            entityManager.getTransaction().commit();
            entityManager.close();
            System.out.println("insertion success.......");
    }
}
