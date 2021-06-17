/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class ChickenFarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        int chickenId;
        String name;
        String color;
        int monthBorn=Calendar.MONTH, yearBorn=Calendar.YEAR,
                dayBorn=Calendar.DAY_OF_MONTH;
        int monthActual=6, yearActual=2021, dayActual=17;
        boolean isMolting;
        ArrayList<Chicken> chickens = new ArrayList<>();
        Chicken chickensArray[] = new Chicken[10];
        
        //Input by Keyboard
        
        Chicken chicken = new Chicken(1, "Lucy", "white", 1, 2001, 15, true);
        Chicken chicken2 = new Chicken(2, "Maruja", "black", 7, 2009, 17, false);
        Chicken chicken3 = new Chicken(3, "Juan", "red", 11, 2005, 5, true);
        Chicken chicken4 = new Chicken(4, "Maria", "brown", 9, 2003, 30, false);
        Chicken chicken5 = new Chicken(5, "Pedro", "Gray", 11, 2012, 29, true);
        Chicken chicken6 = new Chicken(6, "Manuel", "White", 12, 2015, 25, false);
        Chicken chicken7 = new Chicken(7, "Lola", "Black", 5, 2016, 29, true);
        Chicken chicken8 = new Chicken(8, "Juana", "Brown", 2, 2018, 18, false);
        Chicken chicken9 = new Chicken(9, "Lucia", "Gray", 8, 2019, 21, true);
        Chicken chicken10 = new Chicken(10, "Tatiana", "red", 7, 2020, 13, false);
        
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
        
        int monthAge, yearAge, dayAge;
        monthAge = Math.abs(monthBorn - monthActual);
        yearAge = Math.abs(yearBorn - yearActual);
        dayAge = Math.abs(dayBorn - dayActual);
        
        System.out.println("chickens -> \n" + chickens);
        
        chickensArray[0] = chicken;
        System.out.println("chickensArray -> " + chickensArray[0]);
    }
    
}
