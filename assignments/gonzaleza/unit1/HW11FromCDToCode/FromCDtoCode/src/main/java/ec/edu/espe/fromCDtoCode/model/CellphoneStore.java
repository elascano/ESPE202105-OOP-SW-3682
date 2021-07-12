/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class CellphoneStore {
    private String name;
    private String id;
    private ArrayList <Warehouse> wareHouses = new ArrayList<>();
    
    public Warehouse add(Warehouse warehouses){
        return new Warehouse();
    }
}
