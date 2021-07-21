/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Tax {
    static float ivaPercentaje=12.00F;
    
    
    
      public static float computeIva(float price){
          if(price<=0){
              return 0;  
          }
          float ivaValue;
          ivaValue = price * ivaPercentaje / 100;
          return ivaValue;
 
    }
  
    public static float computeTotalPrice(float price){
        float totalPrice;
        totalPrice = price + computeIva(price);
        return totalPrice;

    }
}
