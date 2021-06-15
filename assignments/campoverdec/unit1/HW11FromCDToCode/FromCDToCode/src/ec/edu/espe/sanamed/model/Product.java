/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.model;

/**
 *
<<<<<<< HEAD
 * @author Carlos Campoverde <EMCL.java>
 */
class Product {
    private float price;
    private String type;
    private String description;
    private int amount;
=======
 * @author Carlos Campoverde EMCL:java
 */
class Product {
    private float price;
    private String type; 
    private String description; 
    private int amount; 
>>>>>>> b0248f8fb7c20307928377337bf48b753c72edee
    
    public Medicament m(){
        return new Medicament();
    }
<<<<<<< HEAD
    public PersonalCare m(Product product){
        return new PersonalCare();
    }
=======
    
    public PersonalCare m(Product product){
        return new PersonalCare();
    }    
    

>>>>>>> b0248f8fb7c20307928377337bf48b753c72edee
}
