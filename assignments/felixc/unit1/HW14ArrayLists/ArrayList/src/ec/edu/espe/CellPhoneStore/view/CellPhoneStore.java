/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.view;

import ec.edu.espe.CellPhoneStore.model.CellPhone;
import java.util.ArrayList;

/**
 *
 * @author 59399
 */
public class CellPhoneStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int priceRange;
        String color;
        String model;
        String brand;
        
        ArrayList<CellPhone> cellPhones = new ArrayList<>();
        CellPhone cellPhoneArray[] = new CellPhone[5];
        
        //input by keyboard
        priceRange = 330;
        color = "Mate Black";
        brand = "Samsung";
        model = "Galaxy A72";
        
        
        CellPhone cellPhone = new CellPhone(priceRange, brand, color, model);
        System.out.println("Cellphone object -> " + cellPhone);
        
        cellPhones.add(cellPhone);
        cellPhoneArray[0] = cellPhone;
        
        System.out.println("cellphones -> " + cellPhones);
        System.out.println("cellphoneArray -> " + cellPhoneArray[0]);
    }

    
}
