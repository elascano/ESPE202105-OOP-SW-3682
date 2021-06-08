/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author MILTON
 */
public class Client {
    private String name;
    private int age;
    private boolean respectfull;
    
    public void buy(){
        
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the respectfull
     */
    public boolean isRespectfull() {
        return respectfull;
    }

    /**
     * @param respectfull the respectfull to set
     */
    public void setRespectfull(boolean respectfull) {
        this.respectfull = respectfull;
    }
}
