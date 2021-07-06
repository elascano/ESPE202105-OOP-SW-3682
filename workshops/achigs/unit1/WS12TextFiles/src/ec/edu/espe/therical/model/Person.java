/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.therical.model;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Person {
    private String name;
    private int id;
    private int numberPhone;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + ", numberPhone=" + numberPhone + '}';
    }
    
    public Person(String name, int id, int numberPhone) {
        this.name = name;
        this.id = id;
        this.numberPhone = numberPhone;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the numberPhone
     */
    public int getNumberPhone() {
        return numberPhone;
    }

    /**
     * @param numberPhone the numberPhone to set
     */
    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }
}
