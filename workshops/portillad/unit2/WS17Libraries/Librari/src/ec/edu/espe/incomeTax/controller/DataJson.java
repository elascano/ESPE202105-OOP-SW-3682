/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incomeTax.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.incomexTax.model.Amount;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import utils.computeTax;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class DataJson {
    public static void writeDatajson() throws IOException{
        float totalAmount;
        float amountAnual;
        float computeTax;
        float totalPayment;
        Scanner keyboardinput = new Scanner(System.in);
        ArrayList<Amount>amounts=new ArrayList<Amount>();
        Amount amountsArray[] = new Amount[10];
        
        System.out.println("WS 18 Libraries, by Salazar Matthew and Portilla Diego");
        System.out.print("Total amount ->" );
        totalAmount = keyboardinput.nextFloat();
        amountAnual = totalAmount*12;
        computeTax = utils.computeTax.computeIncometax(totalAmount);
        totalPayment = totalAmount + computeTax;
        System.out.print("The tax for " + totalAmount + " is " + computeTax);
        System.out.print("\nYour total to pay is: " + totalPayment + "\n");
        
        Amount amount = new Amount();
        System.out.println("Amount object ->" + amount);
        
        amount = new Amount(totalAmount,amountAnual,totalPayment);
        System.out.println("Amount->" + amount + "\n");
        amounts.add(amount);
        
        
        amountsArray[0] = amount;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonAmount;
        jsonAmount = gson.toJson(amount);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("Amounts.json")) {
                 writer.write(gson.toJson(amounts));
             }
    }
}
