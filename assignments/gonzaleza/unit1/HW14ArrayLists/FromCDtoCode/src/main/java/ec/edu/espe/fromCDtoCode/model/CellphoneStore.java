/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.model;

import java.util.ArrayList;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class CellphoneStore {
    private String name;
    private String id;
    private ArrayList <Warehouse> wareHouses = new ArrayList<>();
    
    public Warehouse add(Warehouse warehouses){
        return new Warehouse();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the wareHouses
     */
    public ArrayList <Warehouse> getWareHouses() {
        return wareHouses;
    }

    /**
     * @param wareHouses the wareHouses to set
     */
    public void setWareHouses(ArrayList <Warehouse> wareHouses) {
        this.wareHouses = wareHouses;
    }
}
