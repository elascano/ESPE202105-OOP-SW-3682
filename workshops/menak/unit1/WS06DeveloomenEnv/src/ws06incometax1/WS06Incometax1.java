
package ws06incometax1;

import java.util.Scanner;

public class WS06Incometax1 {

    
    public static void main(String[] args) {
        
        float salary;
        float tax;
       
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS 06 INCOME TAX BY PAUL MENA");
        System.out.println("--> Enter Salary: ");
        
        salary = keyboardinput.nextFloat();
        tax = Basicfraction(salary);
        
        System.out.println("The income tax is " + tax);
        
       
    }
    
    public static float Basicfraction(float Basicfraction){
       float total = 0;
       float difference;
       
       
       if(Basicfraction < 11212){
            total = 0;
        }
        
        if(Basicfraction > 11212 && Basicfraction < 14258){
            difference = Basicfraction - 11212;
            total = (difference * 5) / 100;
        }
        
        if(Basicfraction > 14258 && Basicfraction < 17854){
            difference = Basicfraction - 11212;
            total = 154 + (difference * 10) / 100;
        }
        
        if(Basicfraction > 17854 && Basicfraction < 21442){
            difference = Basicfraction - 11212;
            total = 511 + (difference * 12) / 100;
        }
        
        if(Basicfraction > 21442 && Basicfraction < 42874){
            difference = Basicfraction - 11212;
            total = 941 + (difference * 15) / 100;
        }
        
        if(Basicfraction > 42874 && Basicfraction < 64297){
            difference = Basicfraction - 11212;
            total = 4156 + (difference * 20) / 100;
        }
        
        if(Basicfraction > 64297 && Basicfraction < 85729){
            difference = Basicfraction - 11212;
            total = 8440 + (difference * 25) / 100;
        }
        
        if(Basicfraction > 85729 && Basicfraction < 114288){
            difference = Basicfraction - 11212;
            total = 13798 + (difference * 30) / 100;
        }
        
        if(Basicfraction > 114288 ){
            difference = Basicfraction - 11212;
            total = 22366 + (difference * 35) / 100;
        }
        
        return total;      
         
    }
    
}
