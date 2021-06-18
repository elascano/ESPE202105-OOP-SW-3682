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
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ChickenCoop {
    private int id;
    private ArrayList<Chicken> chickens = new ArrayList<>();

    public ChickenCoop() {
    }

    public ChickenCoop(int i, ArrayList<Chicken> chickens) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ChickenCoop{" + "id=" + id + ", chickens=" + chickens + '}';
    }
    
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }
    
    public void Chicken(Chicken chicken){
        
    }
    
    public void remove(Chicken chicken){
       // int id = chicken.getId();
        chickens.remove(chicken);
    }
    
    //sobrecarga de funciones -> overloading
    public void remove(int id){
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
        Iterator<Chicken> Chicken=chickens.iterator();
        while(Chicken.hasNext()){
        id=Chicken.next().getId();
        }
        return new Chicken();
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
