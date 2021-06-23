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
 * @author Gualotuña Richard INNOVA CODE
 */
public class ChickenCoop {
    private int id;
    private ArrayList <Chicken>chickens = new ArrayList<>();
    
    
    public void addChicken(Chicken chicken){
        
       chickens.add(chicken);
       
    }
     public void removeChicken(Chicken chicken){
         //int id = chicken.getId();
         chickens.remove(chicken);
        
    }
    public void removeChicken(int id){
         Iterator iterator = chickens.iterator();
         while(iterator.hasNext()){
             Chicken chicken = (Chicken)iterator.next();
             if(id == chicken.getId()){
                 iterator.remove();
             }
         }
        
    }
     public void resetIteration(){
                
    }
    public Chicken nextChicken(){
        Iterator<Chicken> it=chickens.iterator();
     while(it.hasNext()){
        id=it.next().getId();
     }
     return new Chicken();
    }

    public ChickenCoop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
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
    public ArrayList <Chicken> getChickens() {
        return chickens;
    }

    /**
     * @param chickens the chickens to set
     */
    public void setChickens(ArrayList <Chicken> chickens) {
        this.chickens = chickens;
    }
    
}