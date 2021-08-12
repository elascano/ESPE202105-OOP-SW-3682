/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.father.model;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class father {
    private String fatherName;
    private String sonName;

    public father(String fatherName, String sonName) {
        this.fatherName = fatherName;
        this.sonName = sonName;
    }

    @Override
    public String toString() {
        return "father{" + "fatherName=" + getFatherName() + ", sonName=" + getSonName() + '}';
    }

    /**
     * @return the fatherName
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * @param fatherName the fatherName to set
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    /**
     * @return the sonName
     */
    public String getSonName() {
        return sonName;
    }

    /**
     * @param sonName the sonName to set
     */
    public void setSonName(String sonName) {
        this.sonName = sonName;
    }
    
    
    
}
