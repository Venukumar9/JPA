package org.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.HashMap;
import java.util.Map;

public class Persistence
{
    private static EntityManagerFactory emfactotyobj;
    private final static String PERSISTANCE_UNIT_NAME = "test";
    public static EntityManager getEntityManager()
    {
        final Map<String,String> properties = new HashMap<String,String >();
        String url = "jdbc:postgresql://localhost:5432/motivity";
        properties.put("javax.persistence.jdbc.driver","org.postgresql.Driver");
        properties.put("javax.persistence.jdbc.url", url);
        properties.put("javax.persistence.jdbc.user", "postgres");
        properties.put("javax.persistence.jdbc.password","root");
        properties.put("javax.persistence.jdbc.hbm2ddl_auto","create-drop");
        emfactotyobj = javax.persistence.Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME,properties);
        return emfactotyobj.createEntityManager();
    }






}