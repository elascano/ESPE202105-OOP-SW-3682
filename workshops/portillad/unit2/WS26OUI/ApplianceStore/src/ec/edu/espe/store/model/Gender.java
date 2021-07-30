/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Gender {
    private String male;
    private String feminine;
    private String other;
    private boolean teamGender;

    public Gender(String male, String feminine, String other, boolean teamGender) {
        this.male = male;
        this.feminine = feminine;
        this.other = other;
        this.teamGender = teamGender;
    }

    /**
     * @return the male
     */
    public String getMale() {
        return male;
    }

    /**
     * @param male the male to set
     */
    public void setMale(String male) {
        this.male = male;
    }

    /**
     * @return the feminine
     */
    public String getFeminine() {
        return feminine;
    }

    /**
     * @param feminine the feminine to set
     */
    public void setFeminine(String feminine) {
        this.feminine = feminine;
    }

    /**
     * @return the other
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * @return the teamGender
     */
    public boolean isTeamGender() {
        return teamGender;
    }

    /**
     * @param teamGender the teamGender to set
     */
    public void setTeamGender(boolean teamGender) {
        this.teamGender = teamGender;
    }
    
      
   
    
}
