/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class IncomeTax {
    public static float calculateIncomeTax(float amount){
    float totalAmount=0;
       float excess;
       if( amount < 11212){
           totalAmount=0;
       }
       if(amount >11212 && amount<14258 ){
           excess = amount - 11212;
           totalAmount= (excess*5)/100;
       }
        if(amount >14258 && amount<17854 ){
           excess = amount - 14258;
           totalAmount= 154+((excess*10)/100);
       }
        if(amount >17854 && amount<21442 ){
           excess = amount - 17854;
           totalAmount= 511+((excess*12)/100);
       }
        if(amount >21442 && amount<42874 ){
           excess = amount - 21442;
           totalAmount= 941+((excess*15)/100);
       }
        if(amount >42874 && amount<64297 ){
           excess = amount - 42874;
           totalAmount= 4156+((excess*20)/100);
       }
        if(amount >64297 && amount<85729 ){
           excess = amount - 64297;
           totalAmount= 8440+((excess*25)/100);
       }
         if(amount >85729 && amount<114288 ){
           excess = amount - 85729;
           totalAmount= 13798+((excess*30)/100);
       }
         if(amount >114288){
           excess = amount - 114288;
           totalAmount= 22366+((excess*35)/100);
       }
       return totalAmount;
    }
    
    
    
}
