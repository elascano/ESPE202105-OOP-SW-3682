/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author MILTON
 */
public class Dictionary {
    private boolean bilingual;
    private boolean conceptual;
    private int numberOfPages;
    
    
    
    private void buy(){
        System.out.println("Buying box of dictionaries...");
    }
    public void bid(){
        System.out.println("today two for one");
    }
    public void sell(){
        System.out.println("Dictionary price is 3$");
    }

    /**
     * @return the bilingual
     */
    public boolean isBilingual() {
        return bilingual;
    }

    /**
     * @param bilingual the bilingual to set
     */
    public void setBilingual(boolean bilingual) {
        this.bilingual = bilingual;
    }

    /**
     * @return the conceptual
     */
    public boolean isConceptual() {
        return conceptual;
    }

    /**
     * @param conceptual the conceptual to set
     */
    public void setConceptual(boolean conceptual) {
        this.conceptual = conceptual;
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
