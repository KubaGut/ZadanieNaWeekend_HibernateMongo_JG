package entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String lastName;
    private int boss_id;


    public Employee() {
    }

    public Employee(int id, String name, String lastName, int boos_id) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.boss_id = boos_id;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBoos_id() {
        return boss_id;
    }

    public void setBoos_id(int boos_id) {
        this.boss_id = boos_id;
    }
}


