/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.ChickenCoop;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Simulator {
    public static void main(String[] args) {
        int age = 0;
        Chicken chickensArray[] = new Chicken[10];
        
        //input by keyboard
        Chicken chicken1 = new Chicken(1, "Maruja", "white", LocalDate.now(), LocalDate.of(2017, 5, 12), age, true);
        Chicken chicken2 = new Chicken(2, "Graciela", "brown", LocalDate.now(), LocalDate.of(2016,7,13), age, true);
        Chicken chicken3 = new Chicken(3, "Piyo", "yellow", LocalDate.now(), LocalDate.of(2020,8,28), age, false);
        Chicken chicken4 = new Chicken(4, "Juan", "black and white", LocalDate.now(), LocalDate.of(2017,1,30), age, false);        
        Chicken chicken5 = new Chicken(5, "Yopo", "white", LocalDate.now(), LocalDate.of(2017,5,17), age, false);
        Chicken chicken6 = new Chicken(6, "Fifi", "white", LocalDate.now(), LocalDate.of(2019,3,03), age, true);
        Chicken chicken7 = new Chicken(7, "Pancracia", "grey", LocalDate.now(), LocalDate.of(2017,12,20), age, true);
        Chicken chicken8 = new Chicken(8, "Pancho", "black", LocalDate.now(), LocalDate.of(2016,9,07), age, false);
        Chicken chicken9 = new Chicken(9, "Toto", "brown and white", LocalDate.now(), LocalDate.of(2021,1,10), age, false);
        Chicken chicken10 = new Chicken(10, "Priscila", "black and brown", LocalDate.now(), LocalDate.of(2016,9,16), age, true);
        
        chickensArray[0] = chicken1;
        chickensArray[1] = chicken2;
        chickensArray[2] = chicken3;
        chickensArray[3] = chicken4;
        chickensArray[4] = chicken5;
        chickensArray[5] = chicken6;
        chickensArray[6] = chicken7;
        chickensArray[7] = chicken8;
        chickensArray[8] = chicken9;
        chickensArray[9] = chicken10;
        
        for(int i=0; i==9; i++){
            System.out.println("chickensArray -> " + chickensArray[i]);
        }
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonChicken;
        ArrayList<Chicken> chickens = null;
        
        ChickenCoop chickenCoop = new ChickenCoop(age, chickens);
        System.out.println("ChickenCoop ->"+chickenCoop);
        chickenCoop.removeChicken(10);
        System.out.println("ChickenCoop ->"+chickenCoop); 
        Object chicken = null;
        jsonChicken = gson.toJson(chicken);
        
        System.out.println("jsonChicken -> " + jsonChicken);
        Chicken Chicken2;
        Chicken2 = gson.fromJson(jsonChicken,Chicken.class);
        System.out.println("Chicken2 name ->" + chicken2.getName());
        //jsonChicken = "{\"id\":\"" + chicken.getId() +"}";
        //System.out.println("jsonString" + jsonChicken);
        
        //String json;
        //json = 
    }
}
