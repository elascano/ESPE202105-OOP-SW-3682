/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class IncomeTaxes {
    
    private static float taxPercentaje;
    
    public static float computeIncomeTax(float amount){
        float incomeTax; 
        float totalAmount;
        totalAmount=amount*12;
        if (totalAmount<=11212.0 ){
            taxPercentaje=0.0F;
        }
        
        
        else if(totalAmount>11212.0 && totalAmount<=14285.0){
            taxPercentaje=5.0F;
        }
        
        
        else if(totalAmount>14285.0 && totalAmount<=17884.0){
            taxPercentaje=10.0F;
        }
        
        else if(totalAmount>17884.0 && totalAmount<=21442.0){
            taxPercentaje=12.0F;
        }
        
        else if(totalAmount>21442.0 &&totalAmount<=42874.0){
            taxPercentaje=15.0F;
        }
        
        else if(totalAmount>42874.0 && totalAmount<=64297.0){
            taxPercentaje=20.0F;
        }
        
        else if(totalAmount>64297.0 && totalAmount<=85729.0){
            taxPercentaje=25.0F;
        }
        
        else if(totalAmount>85729.0 && totalAmount<=114288.0){
            taxPercentaje=30.0F;
        }
        
        else if (totalAmount>114288.0 ){
            taxPercentaje=35.0F;
        }
        
        incomeTax =  totalAmount * taxPercentaje /100;
        return incomeTax;
    }
}
