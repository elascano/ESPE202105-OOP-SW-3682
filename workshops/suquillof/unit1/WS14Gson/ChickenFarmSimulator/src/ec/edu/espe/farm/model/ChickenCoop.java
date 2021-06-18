/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken> chickens = new ArrayList<>();
    
    
    public void addChiken(Chicken chicken){
        
        chickens.add(chicken);
        
    }
    
    public void remove(Chicken chicken){
       // int id = chicken.getId();
        chickens.remove(chicken);
    }
    
    // sobrecarga de funciones -> overloading
    public void removeChicken(int id){
        
       Iterator iterator = chickens.iterator(); 
       while(iterator.hasNext()){
           Chicken chicken = (Chicken)iterator.next();
           if(id==chicken.getId()){
               iterator.remove(); 
           }
       }  
    }
            
    public void resetInteration(){
       
    }   
    public Chicken nextChicken(){
        
        Iterator<Chicken> iterator;
        
        iterator = chickens.iterator(); 
        while(iterator.hasNext()){
            id = iterator.next().getId();
        }
        return new Chicken();
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the chickens
     */
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
}
