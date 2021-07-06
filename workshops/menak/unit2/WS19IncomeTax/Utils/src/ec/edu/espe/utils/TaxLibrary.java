/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;



/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class TaxLibrary {
    
    public static float calculateTaxLibrary(float entry){
        
        float incomeTax;
        
        if (entry <= 11212){
            incomeTax = entry; 
        }else 
            
            if(entry <= 14285){ 
                incomeTax =((entry - 11212)*5) /100;         
            }else 
                
                if(entry <= 17854){        
                    incomeTax = ((entry - 14285)*10) /100;
                    incomeTax += 154;           
                }else 
                    
                    if(entry <= 21442){
                        incomeTax = ((entry - 17854)*12) /100;
                        incomeTax += 511;   
                    }else 
                        
                        if(entry <= 42874){            
                            incomeTax = ((entry - 21442)*15) /100;
                            incomeTax += 941;           
                        }else 
                            
                            if (entry <= 64297){      
                                incomeTax = ((entry - 42874)*20) /100;
                                incomeTax += 4156;    
                        }else 
                                
                                if (entry <= 85729){          
                                    incomeTax = ((entry - 64297)*25) /100;
                                    incomeTax += 8440;           
                                }else 
                                    
                                    if (entry <= 114288){           
                                        incomeTax = ((entry - 85729)*30) /100;
                                        incomeTax += 13798;         
                                    }else {
                                        
                                        incomeTax = ((entry - 114288)*35) /100;
                                        incomeTax += 22366;            
                                    }
                                    return incomeTax;      
    }

}
