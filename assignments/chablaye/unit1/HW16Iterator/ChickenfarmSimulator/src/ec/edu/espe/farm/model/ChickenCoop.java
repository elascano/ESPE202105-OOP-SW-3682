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
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class ChickenCoop {
    private int id;
    ArrayList<Chicken> chickens = new ArrayList<>();

    public ChickenCoop(int id) {
        this.id = id;
    }

    public ChickenCoop() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
    
    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }
    
    //Borrar mediante un objeto
    public void remove(Chicken chicken){
        //int id = chicken.getId();
        chickens.remove(chicken);
    }
    
    // Borrar mediante un identificador
    // SObrecarga de Funciones (overloading) -> Polimorfismo
    public void remove(int id){
        Iterator iterator = chickens.iterator();
        while(iterator.hasNext()){
            Chicken chicken = (Chicken)iterator.next();
            if(id == chicken.getId()){
                iterator.remove();
            }
        }
    }
    
    //No es necesario ya que no rompemos el bucle del iterator
    public void resetIteration(){
        //chickens.lastIndexOf(id);
    }
    
    public Chicken nextChicken(){
        return new Chicken();
    }
}
