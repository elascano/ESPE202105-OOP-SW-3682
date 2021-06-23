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
    private String color;
    private float weight;
    private String material;
    private int knobs;

    @Override
    public String toString() {
        return "Kitchen{" + "id=" + id + ", color=" + color + ", weight=" + weight + ", material=" + material + ", knobs=" + knobs + '}';
    }

    public String[] getArray(){
        
        String[] data = {String.valueOf(id), color, String.valueOf(weight), material,String.valueOf(knobs)};
        return data;
    }
    
    public Kitchen(int id, String color, float weight, String material, int knobs) {
        this.id = id;
        this.color = color;
        this.weight = weight;
        this.material = material;
        this.knobs = knobs;
    }
    
    public Kitchen(){
        
        id = 0;
        color = "";
        weight = 0;
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
