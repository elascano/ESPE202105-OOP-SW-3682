/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax.model;

/**
 *
 * @author Karlita
 */
public class USTax {
    private static USTax instace;
        
    private USTax() {
        
    }
       
    public static USTax getInstance (){
        if(instace == null){
            instace = new USTax();
        }
            return instace;
        
        
        
    }
    public float salesTotal(float amount){
        float ivaValue ;
        float taxPercentage = 20.0F;
        float total;
        
        ivaValue = amount * taxPercentage / 100;
        total = amount + ivaValue;
        
        return total;
    }

    public static USTax getInstace() {
        return instace;
    }

    public static void setInstace(USTax instace) {
        USTax.instace = instace;
    }
    
}
