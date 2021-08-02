/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class F {
    private int id;
    private D ds[] = new D[1];

    public F(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "F{" + "id=" + id + '}';
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
