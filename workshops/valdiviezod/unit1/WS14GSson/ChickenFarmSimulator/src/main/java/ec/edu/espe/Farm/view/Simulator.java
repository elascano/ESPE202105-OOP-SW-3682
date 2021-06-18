/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farm.view;


import ec.edu.espe.Farm.model.Chicken;
import ec.edu.espe.Farm.model.ChickenCoop;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class Simulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int chickenId;
        String name;
        String color;
        Calendar bornOn=new GregorianCalendar(2018,01,01);
        Calendar currentDate = Calendar.getInstance();
        int yearBornon=bornOn.get(Calendar.YEAR);
        int yearCurrent=currentDate.get(Calendar.YEAR);
        int age;
        boolean isMoting;
        ArrayList<Chicken>chickens=new ArrayList<>();
        Chicken chickensArray[] = new Chicken[10];
        
        //input by keayboard
        chickenId = 1;
        name = "Lucy";
        color = "White";
        age = yearCurrent-yearBornon;
        isMoting = true;
        
        Chicken chicken = new Chicken();
        System.out.println("Chicken object -> " + chicken);
        
        
        chicken = new Chicken(chickenId, name, color, age, isMoting);
        System.out.println("Chicken object -> " + chicken);
        
        
        
        
        Chicken chicken2 = new Chicken(2, "Maruja", "Black", age , false);
        Chicken chicken3 = new Chicken(3, "Claudia", "Coffee", age , true);
        Chicken chicken4 = new Chicken(4, "Fernanda", "Black", age , false);
        Chicken chicken5 = new Chicken(5, "Turuleca", "White", age , true);
        Chicken chicken6 = new Chicken(6, "Esmeralda", "Coffee", age , false);
        Chicken chicken7 = new Chicken(7, "Juana", "White", age , true);
        Chicken chicken8 = new Chicken(8, "Flor", "Black", age , false);
        Chicken chicken9 = new Chicken(9, "Espernza", "White", age , true);
        Chicken chicken10 = new Chicken(10, "Claudio", "Coffee", age , false);
        
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
             
        
        
        GsonBuilder gsonBuilder;
        gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonChicken;
        
        ChickenCoop chickenCoop = new ChickenCoop(1,chickens);
        System.out.println("ChickenCoop ->"+chickenCoop);
        chickenCoop.removeChicken(10);
        System.out.println("ChickenCoop ->"+chickenCoop); 
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

    private static class GsonBuilder {

        public GsonBuilder() {
        }

        private Gson create() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class Gson {

        public Gson() {
        }

        private String toJson(Chicken chicken) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Chicken fromJson(String jsonChicken, Class<Chicken> aClass) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}