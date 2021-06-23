/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.view;

import ec.edu.espe.fromCDtoCode.model.Cellphone;
import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Inventory {
    public static void main(String[] args) {
        float price;
        float size;
        String color;
        float weight;
        String model;
        String id;
        ArrayList<Cellphone> cellphones = new ArrayList<>();
        Cellphone cellphoneArray[] = new Cellphone[5];
        
        //input by keyboard
        price = 320.25F;
        size = 15.5F;
        color = "Electric blue";
        weight = 188.0F;
        model = "Redmi Note 8";
        id = "12345";
        
        Cellphone cellphone = new Cellphone(price, size, color, weight, model, id);
        System.out.println("Cellphone object -> " + cellphone);
        
        cellphones.add(cellphone);
        cellphoneArray[0] = cellphone;
        
        System.out.println("cellphones -> " + cellphones);
        System.out.println("cellphoneArray -> " + cellphoneArray[0]);
    }  
}
