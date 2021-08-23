/** Copyright ESPE-DECC
*/

package ec.edu.espe.book.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Sport {
    private int id;
    private String description;
    private boolean teamSport;
    
    public Sport(int id, String description, boolean teamSport) {
        this.id = id;
        this.description = description;
        this.teamSport = teamSport;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the teamSport
     */
    public boolean isTeamSport() {
        return teamSport;
    }

    /**
     * @param teamSport the teamSport to set
     */
    public void setTeamSport(boolean teamSport) {
        this.teamSport = teamSport;
    }
    
}
