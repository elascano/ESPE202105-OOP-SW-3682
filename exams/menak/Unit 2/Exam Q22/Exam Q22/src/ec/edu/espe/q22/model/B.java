/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q22.model;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class B {
    private String type;
    private int price;
    private int ID;
    private float weight;
    private String brand;
    private float volume;

    public B(String type, int price, int ID, float weight, String brand, float volume) {
        this.type = type;
        this.price = price;
        this.ID = ID;
        this.weight = weight;
        this.brand = brand;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "B{" + "type=" + getType() + ", price=" + getPrice() + ", ID=" + getID() + ", weight=" + getWeight() + ", brand=" + getBrand() + ", volume=" + getVolume() + '}';
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the volume
     */
    public float getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(float volume) {
        this.volume = volume;
    }
    
    
    
    
    
}
