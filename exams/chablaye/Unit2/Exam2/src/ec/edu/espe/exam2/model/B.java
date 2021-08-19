/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam2.model;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class B extends A implements H{
    private String university;

    public B(String university, String name, String id) {
        super(name, id);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "B{" + "university=" + university + '}';
    }

    @Override
    public void pagar() {
        System.out.println("El cliente ha pagado.");
    }
    
}
