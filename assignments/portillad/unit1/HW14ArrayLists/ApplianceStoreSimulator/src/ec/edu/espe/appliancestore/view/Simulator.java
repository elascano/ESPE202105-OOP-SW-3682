/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import ec.edu.espe.appliancestore.model.Blender;
import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<>();
        Blender blendersArray[] = new Blender[3];
        
        serialnumber = 123456;
        price = 25.5F;
        velocity = 5;
        ability = 3;
        
        Blender blender = new Blender();
        System.out.println("Blender object -> " + blender);
        
        blender = new Blender(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + blender);
    
        Blender blender2 = new Blender(135790,23.4F,4,2);
        Blender blender3 = new Blender(172921,27.9F,7,5);
        
        blenders.add(blender);
        blenders.add(blender2);
        blenders.add(blender3);
        
        System.out.println("Blenders -> " + blenders + "\n");
        
        blendersArray[0] = blender;
        
        for (int i = 0; i < blendersArray.length; i++) {
			System.out.print("BlendersArray -> " + blendersArray[i] + "\n");
		}
						
		    
        
    }  
    
    }
