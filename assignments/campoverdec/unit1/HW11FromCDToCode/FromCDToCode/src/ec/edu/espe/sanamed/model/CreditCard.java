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
class CreditCard {
    private int CardNumber;
    
    public Visa m(){
        return new Visa();
    }
    public Mastercard m(CreditCard creditCard){
        return new Mastercard();
    }
    
}
