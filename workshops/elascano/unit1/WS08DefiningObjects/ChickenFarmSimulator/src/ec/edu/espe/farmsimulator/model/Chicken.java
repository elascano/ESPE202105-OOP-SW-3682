/** Copyright ESPE-DECC
*/

package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Edison Lascano Hypertech ESPE-DCCO
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private Date age;
    private boolean isMolting;

    
    
    public void doStuff(int forTime){
        System.out.println("doing some stuff");
    }
    
    private void cluck(){
        
    }
    
    private Egg layAnEgg(){
        return new Egg();
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the age
     */
    public Date getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Date age) {
        this.age = age;
    }

    /**
     * @return the isMolting
     */
    public boolean isIsMolting() {
        return isMolting;
    }

    /**
     * @param isMolting the isMolting to set
     */
    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }
    

}
