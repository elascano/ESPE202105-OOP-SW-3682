/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
class ApplianceStore {
    
    private String name;
    private String location;
    private ArrayList<Kitchen> kitchens = new ArrayList<>();
    private ArrayList<Oven> ovens = new ArrayList<>();
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Toaster> toasters = new ArrayList<>();
    private ArrayList<AirPurifier> airpurifiers= new ArrayList<>();
    private ArrayList<Dryer> dryers = new ArrayList<>();
    private ArrayList<Fridge> fridges = new ArrayList<>();
    
    public Kitchen add(Kitchen kitchens){
        return new Kitchen();
    }
    
    public Oven add(Oven ovens){
        return new Oven();
    }
    
    public Computer add(Computer computers){
        return new Computer();
    }
    
    public Toaster add(Toaster toasters){
        return new Toaster();
    }
    
    public AirPurifier add(AirPurifier airPurifiers){
        return new AirPurifier();
    }
    
    public Dryer add(Dryer dryers){
        return new Dryer();
    }
    
    public Fridge add(Fridge fridges){
        return new Fridge();
    }
    
}
