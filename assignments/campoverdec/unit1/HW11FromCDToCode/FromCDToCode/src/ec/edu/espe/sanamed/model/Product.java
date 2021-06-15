/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.model;

/**
 *
 * @author Carlos Campoverde <EMCL.java>
 */
class Product {
    private float price;
    private String type;
    private String description;
    private int amount;
    
    public Medicament m(){
        return new Medicament();
    }
    public PersonalCare m(Product product){
        return new PersonalCare();
    }
}
