/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ustax.model;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */

public class UsTax {
    private static UsTax instace;
    private float taxPercenage;
    
    private UsTax() {
        
    }
     public static UsTax getInstance (){
        if(instace == null){
            instace = new UsTax();
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

    public static UsTax getInstace() {
        return instace;
    }

    public static void setInstace(UsTax instace) {
        UsTax.instace = instace;
    }

    public float ComputeSalesTotal(float value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

       
   
