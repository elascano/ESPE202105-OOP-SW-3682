/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Simulator {
    public static void main(String[] args) {
        int chickenId;
        String name;
        String color;
        LocalDate age = LocalDate.now();
        LocalDate borOn = LocalDate.of(1999, 12, 04);
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chickensArray[] = new Chicken[5];
        
        //input by keyboard
        chickenId = 1;
        name = "Lucy";
        color = "White";
        isMolting = true;
        
        Chicken chicken = new Chicken(chickenId, name, color, age, LocalDate.of(2002, 5, 7), isMolting);
        //System.out.println("Chicken object: " +chicken);
        
        Chicken chicken2 = new Chicken(2, "Marta", "Black", age, LocalDate.of(2004, 12, 1), false);
        //System.out.println("Chicken 2 object: " +chicken2);
        
        //Creacion de Chickens
        Chicken chicken3 = new Chicken(3, "Julia", "Brown", age, LocalDate.of(2000, 10, 5), true);
        Chicken chicken4 = new Chicken(4, "Maria", "White", age, LocalDate.of(2004, 3, 4), false);
        Chicken chicken5 = new Chicken(5, "Rose", "Black", age, LocalDate.of(2007, 1, 6), true);
        Chicken chicken6 = new Chicken(6, "Maruja", "Black", age, LocalDate.of(1999, 1, 23), true);
        Chicken chicken7 = new Chicken(7, "Juana", "White", age, LocalDate.of(2008, 5, 1), false);
        Chicken chicken8 = new Chicken(8, "Piolina", "White", age, LocalDate.of(2003, 2, 7), false);
        Chicken chicken9 = new Chicken(9, "Toto", "Brown", age, LocalDate.of(2002, 1, 23), true);
        Chicken chicken10 = new Chicken(10, "Plumas", "White", age, LocalDate.of(2001, 3, 14), true);
        
        //Calculo de edades
        chicken.calculatedAge();
        chicken2.calculatedAge();
        chicken3.calculatedAge();
        chicken4.calculatedAge();
        chicken5.calculatedAge();
        chicken6.calculatedAge();
        chicken7.calculatedAge();
        chicken8.calculatedAge();
        chicken9.calculatedAge();
        chicken10.calculatedAge();
        
        //Adicion de gallinas
        chickens.add(chicken);
        chickens.add(chicken2);
        chickens.add(chicken3);
        chickens.add(chicken4);
        chickens.add(chicken5);
        chickens.add(chicken6);
        chickens.add(chicken7);
        chickens.add(chicken8);
        chickens.add(chicken9);
        chickens.add(chicken10);
        
        
        
        System.out.println("Chickens in the Coop: " +chickens);
        
        //Eliminar gallina
        
        chickens.remove(chicken3);
        chickens.remove(chicken5);
        System.out.println("\n-----  Eliminando Gallinas -----\n");
        System.out.println("Chickens in the Coop: " +chickens);
        
        
        //chickensArray[0] = chicken;
        //System.out.println("Chickens Array: " +chickensArray[0]);
        
        /*Chicken chicken2 = new Chicken(123, "Julia", "White",null , true);
        System.out.println("Chicken2 object: " +chicken2);*/
        
        
//        Period edad = Period.between(LocalDate.of(1987, 4, 8), LocalDate.now());
//        System.out.println(String.format("%d años, %d meses y %d días",
//        edad.getYears(),
//        edad.getMonths(),
//        edad.getDays()));
        
        
    }
    
}
