/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.IncomeTax.view;

import ec.edu.espe.IncomeTax.model.Amount;
import ec.edu.espe.utils.TaxLibrary;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class WS19IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        
        float mensualAmount;
        float annualAmount;
        float incomeTax;
        
        File fileJson;
        String jsonAmount;
        ArrayList<Amount> amount1;
        
        amount1 = new ArrayList<>();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        fileJson = new File("IncomeTax.json");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Monthly Amount: ");
        mensualAmount = scanner.nextFloat();
        
        Amount amount = new Amount();
        amount.setMensualAmount(mensualAmount);
        annualAmount = amount.calculateAnnualAmount(mensualAmount);
        amount.setAnnualSAmount(annualAmount);
        incomeTax = .calculateTaxLibrary(annualAmount);
        amount.setIncomeTax(incomeTax);
        amount1.add(amount);
        
        
    }
}
