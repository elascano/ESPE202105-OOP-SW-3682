/*Codigo:Edison Lascano 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam1.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class Book {
    private String title;
    private String autor;
    private String editorial;
    private int yearOfPublication;

    
    public Book() {
    editorial = "";
    title = "";
    autor = "";
    yearOfPublication = 0;
    }
    
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", autor=" + autor + ", editorial=" + editorial + ", yearOfPublication=" + yearOfPublication + '}';
    }
    
    public Book(String title, String autor, String editorial, int yearOfPublication) {
        this.title = title;
        this.autor = autor;
        this.editorial = editorial;
        this.yearOfPublication = yearOfPublication;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the yearOfPublication
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}



//Rubric
//- Execution....... 0 pts. (No corre el programa)
//- Json file.............. 0 pts.( No se crea archivo json, no guarda información)
//- books list on screen....... 0pts.(No se guarda ningún dato)
//- Total number of books... 0pts.(No hay datos)
//- Code quality.......... 2.pts.(falta código  ,se califica por que tiene getter y setter mas constructor)
