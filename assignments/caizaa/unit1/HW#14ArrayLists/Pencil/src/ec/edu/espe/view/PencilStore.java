/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.Pencil;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class PencilStore {
    public static void main(String[] args) {
        int pencilId;
        String name;
        String color;
        Date date = new Date();
        boolean tiptype;
        ArrayList<Pencil> pencils = new ArrayList<>();
        Pencil pencilsArray[] = new Pencil[5];
        
        
        //Input by Keyboard
        pencilId = 1;
        name="Noma";
        color="blue";
        tiptype = true;
        
        
        Pencil pencil = new Pencil();
        System.out.println("pencil object ->" + pencil);
        
        pencil = new Pencil(pencilId, name, color, date, tiptype);
        System.out.println("Pencil object ->" + pencil);
        
        Pencil pencil2 = new Pencil(2, "Maruja", "blue", new Date(), false);
                
        pencils.add(pencil);
        pencils.add(pencil2);
        
        System.out.println("pencil ->" + pencils);
        
        pencilsArray[0] = pencil;
        System.out.println("pencilsArray -> " + pencilsArray[0]);
    }
    
}
