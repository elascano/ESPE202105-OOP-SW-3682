/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class USTax {
    private Static USTax instance = new USTax();

    private USTax(Static USTax) {
        this.USTax = USTax;
    }
     public static USTax getInstance(){
         if(instance == null){
             instance = new USTax();
             return instance;
         }
     }
     
     public float salesTotal(){
         
     }
}
