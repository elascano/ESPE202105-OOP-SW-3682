/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.theorital.model;


/**
 *
 * @author Lizbeth Cajas
 */
class invoice {
    Client client;

    private int costumerdata;
    private int VATinclude;
    private int product;
    private int totalsum;
    private int typeofinvoie;
    
    public ShoppingList m(){
        return new ShoppingList();
        
    }

}
