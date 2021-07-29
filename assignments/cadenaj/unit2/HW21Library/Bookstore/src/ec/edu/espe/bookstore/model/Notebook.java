/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author jejoc
 */
public class Notebook extends Product{
    private String type;
    private int numberOfPages;

    public Notebook(String type, int numberOfPages, int id, float price, int amount) {
        super(id, price, amount);
        this.type = type;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "\nNotebook\n" + "type = " + type + "\nnumberOfPages = " + numberOfPages + super.toString();
    }
  
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages the numberOfPages to set
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
