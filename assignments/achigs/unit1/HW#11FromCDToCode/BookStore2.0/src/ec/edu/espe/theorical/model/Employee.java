/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

import java.util.Date;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Employee {
    String name;
    Date age;
    boolean responsable;
    
    public Product n(){
        return new Product();
    }
    public Invoice m(){
        return new Invoice();
    }

    public int Client (Client client){
        return 0;
    }
}