/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
class Client {
    String name;
    int id;
    float spending;
    
    public void buy(ApplianceStore buy){
        
    }
    
    public Payment totalToPay(){
        return new Payment();
    }
}
