
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Workshop06 {
    
   
    public static void main(String[] args){
        float TOTALINCOME;
        float FIXEDQUOTA;
        float LOWERLIMIT;
        float TOTALAMOUNT;
        float PORCENTOVERLOWERLIMIT=0;
       Scanner keyboardinput = new Scanner(System.in);
       System.out.println("WORKSHOP06 BY EDUARDO MORTENSEN");
       System.out.println("==RENT INCOME TAX (with figures) ==");
       System.out.println("WRITE DOWN FIXED QUOTA ");
       FIXEDQUOTA= keyboardinput.nextFloat();
       System.out.println("WRITE DOWN TOTAL INCOME");
       TOTALINCOME= keyboardinput.nextFloat();
       System.out.println("WRITE DOWN LOWER LIMIT");
      LOWERLIMIT= keyboardinput.nextFloat();
        System.out.println("WRITE DOWN PORCENT OVER LOWER LIMIT");
       PORCENTOVERLOWERLIMIT= keyboardinput.nextFloat();
       TOTALAMOUNT= RENTINCOMETAX( TOTALINCOME, FIXEDQUOTA, LOWERLIMIT,PORCENTOVERLOWERLIMIT);
       System.out.println("TOTALTAX IS="+TOTALAMOUNT);
       
    }
    public static float RENTINCOMETAX(float TOTALINCOME, float FIXEDQUOTA, float LOWERLIMIT, float PORCENTOVERLOWERLIMIT){
    float TOTALAMOUNT;
    TOTALAMOUNT=(TOTALINCOME-LOWERLIMIT)*(PORCENTOVERLOWERLIMIT/100)+FIXEDQUOTA;
     return TOTALAMOUNT;
   }
     
   }
  