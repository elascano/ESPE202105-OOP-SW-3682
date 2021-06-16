/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Store.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Kitchen {
    
    private int id;
    private int size;
    private String color;
    private float weight;
    private String material;
    private int knobs;

    @Override
    public String toString() {
        return "Kitchen{" + "id=" + id + ", size=" + size + ", color=" + color + ", weight=" + weight + ", material=" + material + ", knobs=" + knobs + '}';
    }

    
    public Kitchen(int id, int size, String color, float weight, String material, int knobs) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.weight = weight;
        this.material = material;
        this.knobs = knobs;
    }

    public Kitchen(){
        id = 0;
        size = 0;
        color = "";
        weight = 0F;
        material = "";
        knobs = 0;   
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
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the knobs
     */
    public int getKnobs() {
        return knobs;
    }

    /**
     * @param knobs the knobs to set
     */
    public void setKnobs(int knobs) {
        this.knobs = knobs;
    }
    
}
