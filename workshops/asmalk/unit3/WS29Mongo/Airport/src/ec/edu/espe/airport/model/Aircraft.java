/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.airport.model;

/**
 *
 * @author Asmal Kevin
 */
public class Aircraft {
    private String id;
    private String model;
    private String seating;

    public Aircraft(String id, String model, String seating) {
        this.id = id;
        this.model = model;
        this.seating = seating;
    }

    public Aircraft() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeating() {
        return seating;
    }

    public void setSeating(String seating) {
        this.seating = seating;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "id=" + id + ", model=" + model + ", seating=" + seating + '}';
    }
}
