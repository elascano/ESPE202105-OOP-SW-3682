/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incometax.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.utils.MyFileLibrary;
import ec.edu.espe.utils.MyIncomeTax;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        float annualAmount;
        float monthlyAmount;
        float amountpayable;
        File fileJson;
        String jsonMonthlyAmount;
        String jsonAnnualAmount;
        String amountPayable;
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        fileJson = new File("IncomeTax.json");
        
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("=== Income Tax ===");
        System.out.println("Enter the monthly ammount: ");
        monthlyAmount = keyboardinput.nextFloat();
        
        annualAmount = monthlyAmount * 12.0F;
        
        jsonAnnualAmount = gson.toJson(annualAmount);
        MyFileLibrary.write( "IncomeTax \n" + "Annual Amount -> " + jsonAnnualAmount, fileJson);
        jsonMonthlyAmount = gson.toJson(monthlyAmount);
        MyFileLibrary.write("Monthly Amount -> " + jsonMonthlyAmount, fileJson);
        amountpayable = MyIncomeTax.calculeIncometax(annualAmount);
        amountPayable = gson.toJson(amountpayable);
        MyFileLibrary.write("Payable Amount -> " + amountPayable, fileJson);
        
        System.out.println("The annual ammount for ->" + monthlyAmount + "<- is : " + annualAmount);
        System.out.println("The amount to pay for the income tax is: " + amountpayable);
    }  
}
