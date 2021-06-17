/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.espe.cellphone.view;

import ec.espe.edu.espe.cellphone.model.CellPhone;
import java.util.ArrayList;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class Inventory {
     public static void main(String [] args){
        int cellPhoneId;
        Float price;
        Float size;
        String color;
        String model;
        Float weight;
        ArrayList<CellPhone> cellphone = new ArrayList<>();
        
         //input by keyboard
        cellPhoneId = 1;
        price = (float) 350;
        color="White";
        model = "Samsung A70";
        weight = (float) 1.8;
        size = (float) 164.3;
        CellPhone cellPhone = new CellPhone ();
        
        
        System.out.println("cellphone object -> " + cellphone);
        
        cellPhone = new CellPhone (price, color, model, weight, size, (int) cellPhoneId);
        System.out.println("cellphone object -> " + cellphone);
        
        CellPhone cellPhone2 = new CellPhone(2,"Iphone 12", "black", (float) 1.7, (float) 165.2);
        System.out.println("cellphone2 object -> " + cellPhone2);
        
        CellPhone.add(cellPhone);
        cellphone.add(cellPhone2);
        
        System.out.println("cellphones -> " + cellphone);
         CellPhone[] cellphoneArray = new CellPhone[5];
        cellphoneArray[0]= cellPhone;
        
        System.out.println("cellphonesArray -> " + cellphoneArray[0]);
    }
           
}
