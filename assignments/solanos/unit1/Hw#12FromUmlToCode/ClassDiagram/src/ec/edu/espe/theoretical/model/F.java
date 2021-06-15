/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class F {
    private String name;
    private int age;
    
    public F(String _name, int _age){
       name = _name;
       age = _age;         
    } 

    
    public void showData(){
        System.out.println("The name is: " +name);
        System.out.println("The age is: " +age);
               
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
     * @param age the edad to set
     */
    public void setAge(int age) {
        this.age = age;
    }
   
}
