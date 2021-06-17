/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.archivocsv.model;

import java.util.Scanner;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ElectricKitchen {
    float price;
    float weight;
    String size;
    String material;
    int identificationNumber;
    
    
        
       

    public ElectricKitchen(float price, float weight, String size, String material, int identificationNumber) {
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.material = material;
        this.identificationNumber = identificationNumber;
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
