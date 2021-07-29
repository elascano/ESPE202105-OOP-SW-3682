/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.IncomeTax.view;

import ec.edu.espe.utils.IncomeTaxes;
import java.util.Scanner;
//import ec.edu.espe.utils.WriteJson;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float amount;
        float incomeTax;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo mensual: ");
        amount=scanner.nextFloat();
      
        
        incomeTax = IncomeTaxes.computeIncomeTax(amount);
        System.out.println("the income tax is ->" + incomeTax);
       
    }
    
}
