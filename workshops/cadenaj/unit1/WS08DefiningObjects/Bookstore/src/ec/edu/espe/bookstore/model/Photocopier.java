/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author jejoc
 */
public class Photocopier {
    private String brand;
    private String size;
    private float cost;
    
    public void copy(int numberOfCopies){
        System.out.println("your papers are being copied");
    }
    
    public void moveImage(int images){
        System.out.println("Your images are moving");
    }
    
    public void combineImage(int images){
        System.out.println("Your images are combine");
    }
    
     public void sell(){
    }
    public void buy(){
    }
    public void bid(){
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
}
