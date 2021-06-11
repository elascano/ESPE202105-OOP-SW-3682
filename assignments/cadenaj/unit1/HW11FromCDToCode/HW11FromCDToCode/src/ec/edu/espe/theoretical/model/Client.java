/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author jejoc
 */
public class Client {
    private String name;
    private int age;
    
    public boolean askForProduct(){
        return true;        
    }
    
    public Employee m(){
        return new Employee();
    }
    
    public int buyProduct(Product product){
        return 1; 
    }
    
    public Product m1(){
        return new Product();
    }
}
