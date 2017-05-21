package hibernate_MongoDB;


import entity.Employee;
import entity.Name;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class Mongo {

    private static EntityManagerFactory entityManagerFactory;
    private List<Integer> bossesList = new ArrayList<Integer>();



    public static void saveObjectToDataBase(){
        entityManagerFactory = Persistence.createEntityManagerFactory( "hikePu" );
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        for (int i = 1; i < 10001; i++) {
            Employee employee = new Employee(i, Name.giveName(), Name.giveLastName(), i / 2);
            entityManager.merge(employee);
        }

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void countSubordinates(int id) throws ClassNotFoundException {
        if ((id * 2) <= 10001){
            this.bossesList.add(id* 2);
            this.bossesList.add(id*2 +1);
            countSubordinates(id * 2);
            countSubordinates(id * 2 + 1);
        }
    }

    public void showSubordinates() throws ClassNotFoundException {
        entityManagerFactory = Persistence.createEntityManagerFactory( "hikePu" );
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

            for (Integer p: bossesList){
                Employee loadedPerson = entityManager.find(Employee.class, p );
                System.out.println(loadedPerson.getId() + " " + loadedPerson.getName()+ " " + loadedPerson.getLastName());
            }

        entityManager.getTransaction().commit();
        entityManager.close();

    }

}

