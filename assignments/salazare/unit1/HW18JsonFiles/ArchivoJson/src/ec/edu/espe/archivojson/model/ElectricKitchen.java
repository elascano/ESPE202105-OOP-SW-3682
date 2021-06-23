/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.archivojson.model;

import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ElectricKitchen {
    private float price;
    private float weight;
    private String size;
    private String material;
    private int identificationNumber;
    
    public ElectricKitchen(){
       this.price = 0;
        this.weight = 0;
        this.size = "";
        this.material = "";
        this.identificationNumber = 0;
    }
        
       

    public ElectricKitchen(float price, float weight, String size, String material, int identificationNumber) {
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.material = material;
        this.identificationNumber = identificationNumber;
    }


    @Override
    public String toString() {
        return "ElectricKitchen{" + "price=" + price + ", weight=" + weight + ", size=" + size + ", material=" + material + ", identificationNumber=" + identificationNumber + '}';
    }
    
    public String []getArray(){
        
       String[] date ={"Price -> " + String.valueOf(price)+ " Weight ->" +String.valueOf(weight)+ " Size -> "+String.valueOf(size)+" IdentificationNumber -> "+String.valueOf(identificationNumber)+" Material -> "+String.valueOf(material)};
       return date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    
    
}
