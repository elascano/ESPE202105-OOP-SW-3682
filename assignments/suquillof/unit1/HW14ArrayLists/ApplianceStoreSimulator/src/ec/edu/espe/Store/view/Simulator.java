/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Store.view;

import ec.edu.espe.Store.model.Kitchen;
import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Simulator {
 
    public static void main(String[] args) {
        
    int kitchenId;
    int size;
    String color;
    float weight;
    String material;
    int knobs; 
    ArrayList<Kitchen> kitchens = new ArrayList<>();
    Kitchen kitchensArray[] = new Kitchen[5];
    
    kitchenId = 146792;
    size = 240;
    color = "White";
    weight = 32.0F;
    material = "Steel";
    knobs = 6;
    
    Kitchen kitchen = new Kitchen();
        System.out.println("Kitche  object -> " + kitchen);
       
    kitchen = new Kitchen(kitchenId, size, color, weight, material, knobs);
        System.out.println("Kitchen object -> " + kitchen);
       
    Kitchen kitchen2 = new Kitchen(134566, 280, "Black", 31.5F, "Steel", 8);
        System.out.println("Kitchen object - > " + kitchen2);
        
    kitchens.add(kitchen);
    kitchens.add(kitchen2);
    
        System.out.println("Kitchen - > " + kitchens);
        
    kitchensArray[0] = kitchen;
    kitchensArray[1] = kitchen2;
    
        for(int i = 0; i<kitchensArray.length; i++){
            System.out.println("KitchensArray -> " + kitchensArray[i]);
        }
    }
}
