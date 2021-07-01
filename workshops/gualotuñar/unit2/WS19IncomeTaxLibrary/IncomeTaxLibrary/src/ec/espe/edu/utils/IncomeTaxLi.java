/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import ec.espe.edu.utils.Amount;
import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class IncomeTaxLi {
        
    public static float calculateIncomeTax(float salary, float deductibleExpenses){
        float taxBase;
        float annualIncome;
        float incomeTax = 0F;
        
        annualIncome = salary * 12;
        taxBase = annualIncome - deductibleExpenses;
        
        if(taxBase <= 11212){
            incomeTax = taxBase * 0.00F + 0.00F;
        }
        else if(taxBase > 11212 && taxBase <= 14285){
            incomeTax = taxBase * 0.05F + 0.00F;
        }
        else if(taxBase > 14285 && taxBase <= 17854){
            incomeTax = taxBase * 0.1F + 154F;
        }
        else if(taxBase > 17854 && taxBase <= 21442){
            incomeTax = taxBase * 0.12F + 511F;
        }
        else if(taxBase > 21442 && taxBase <= 42874){
            incomeTax = taxBase * 0.15F + 941F;
        }
        else if(taxBase > 42874 && taxBase <= 64297){
            incomeTax = taxBase * 0.2F + 4156F;
        }
        else if(taxBase > 64297 && taxBase <= 85729){
            incomeTax = taxBase * 0.25F + 8440F;
        }
        else if(taxBase > 85729 && taxBase <= 114288){
            incomeTax = taxBase * 0.3F + 13798F;
        }
        else if(taxBase > 114288){
            incomeTax = taxBase * 0.35F + 22366F;
        }
        else{
            System.out.println("Can not calculate the income tax.");
        }
        return incomeTax;
    }
    
    public static void writeDatajson() throws IOException{
        float taxBase = 0.0F;
        float annualIncome = 0.0F;
        float incomeTax = 0.0F;
        float salary = 0.0F;
        ArrayList<Amount>amounts=new ArrayList<Amount>();
        Amount amountsArray[] = new Amount[10];
        
        System.out.println("WS 18 Libraries, by Felix Cristian, Gonzales Ariel and Gualotuña Richard");
        System.out.print("Total amount ->" );
        System.out.print("The tax for " + salary + " is " + incomeTax);
        
        Amount amount = new Amount();
        System.out.println("Amount object ->" + amount);
        
        amount = new Amount(taxBase,annualIncome,incomeTax,salary);
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
