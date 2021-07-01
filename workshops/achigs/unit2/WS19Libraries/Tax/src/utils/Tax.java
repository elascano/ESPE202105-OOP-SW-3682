package utils;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Tax {
    private static float iessContribution = 0.0945F;
    private static int months = 12;
    
    
    public static float computeAnnualIncome(float salary){
        float partialMonthly;
        float netMonthlyIncome;
        float annualNetIncome;
        
        partialMonthly = salary * iessContribution;
        netMonthlyIncome = salary - partialMonthly;
        
        annualNetIncome = netMonthlyIncome * months;
        return annualNetIncome;
    }
    
    public static float computeIncomeTax(float taxeableIncome, float expensive){
        float excedent;
        float incomeTax = 0;
        
        taxeableIncome = taxeableIncome - expensive;
        
        if(taxeableIncome <= 11212){
            return 0;
            }else if(taxeableIncome > 11212 && taxeableIncome <= 14285 ){
                excedent = taxeableIncome - 11212;
                incomeTax = excedent * 0.05F;
            }else if (taxeableIncome > 14285 && taxeableIncome <= 17854){
                excedent = taxeableIncome - 14285;
                incomeTax = (excedent * 0.10F) + 154;
            }else if(taxeableIncome > 17854 && taxeableIncome <= 21442){
                excedent = taxeableIncome - 17854;
                incomeTax = (excedent * 0.12F) + 511;
            }else if(taxeableIncome > 21442 && taxeableIncome <= 42874){
                excedent = taxeableIncome - 21442;
                incomeTax = (excedent * 0.15F) + 941;
            }else if(taxeableIncome > 42874 && taxeableIncome <= 64297){
                excedent = taxeableIncome - 42874;
                incomeTax = (excedent * 0.20F) + 4156;
            }else if(taxeableIncome > 64297 && taxeableIncome <= 85729){
                excedent = taxeableIncome - 64297;
                incomeTax = (excedent * 0.25F) + 8440;
            }else if(taxeableIncome > 85729 && taxeableIncome <= 114288){
                excedent = taxeableIncome - 85729;
                incomeTax = (excedent * 0.30F) + 13789;
            }else if(taxeableIncome > 114288){
                excedent = taxeableIncome - 114288;
                incomeTax = (excedent * 0.35F) + 22366;
            }
    return incomeTax;
        }
}
