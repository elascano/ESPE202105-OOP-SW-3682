/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Contact {
    private String name;
    private int numberOfFriends;
    private float salary;
    private String email;

    public Contact(String name, int numberOfFriends, float salary, String email) {
        this.name = name;
        this.numberOfFriends = numberOfFriends;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
