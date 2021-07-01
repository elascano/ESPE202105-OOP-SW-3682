/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incometax.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.incometax.model.Amount;
import ec.edu.espe.utils.MyFileLibrary;
import ec.edu.espe.utils.MyIncomeTax;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        float annualAmount;
        float monthlyAmount;
        float amountPayable;
        File fileJson;
        String jsonAmount;
        ArrayList<Amount> amounts;
        
        amounts = new ArrayList<>();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        fileJson = new File("IncomeTax.json");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Income Tax ===");
        System.out.println("Enter the monthly ammount: ");
        monthlyAmount = scanner.nextFloat();
        
        Amount amount = new Amount();
        amount.setMonthly(monthlyAmount);
        annualAmount = amount.calculateAnnual(monthlyAmount);
        amount.setAnnual(annualAmount);
        amountPayable = MyIncomeTax.calculeIncometax(annualAmount);
        amount.setAmountPayable(amountPayable);
        amounts.add(amount);
        
        jsonAmount = gson.toJson(amount);
        MyFileLibrary.write("Income tax =>" + jsonAmount, fileJson);
        System.out.println("The annual ammount for ->" + monthlyAmount + "<- is : " + annualAmount);
        System.out.println("The amount to pay for the income tax is: " + amountPayable + "\n");
        System.out.println("File content ↓");
        MyFileLibrary.read(fileJson);
      
    }  
}
