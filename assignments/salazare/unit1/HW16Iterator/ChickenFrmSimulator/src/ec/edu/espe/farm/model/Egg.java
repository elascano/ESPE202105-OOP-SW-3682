/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Egg {
   private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
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

   
   
}
