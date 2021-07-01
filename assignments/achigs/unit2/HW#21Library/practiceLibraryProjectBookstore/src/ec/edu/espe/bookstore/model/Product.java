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
public class Product {
    private Book books;
    private Calculator calculators;
    private Folder folders;
    private Marker markers;
    private Notebook notebooks;
    private Pen pens;
    

    public Product(Book books, Calculator calculators, Folder folders, Marker markers, Notebook notebooks, Pen pens) {
        this.books = books;
        this.calculators = calculators;
        this.folders = folders;
        this.markers = markers;
        this.notebooks = notebooks;
        this.pens = pens;
    }

    /**
     * @return the books
     */
    public Book getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(Book books) {
        this.books = books;
    }

    /**
     * @return the calculators
     */
    public Calculator getCalculators() {
        return calculators;
    }

    /**
     * @param calculators the calculators to set
     */
    public void setCalculators(Calculator calculators) {
        this.calculators = calculators;
    }

    /**
     * @return the folders
     */
    public Folder getFolders() {
        return folders;
    }

    /**
     * @param folders the folders to set
     */
    public void setFolders(Folder folders) {
        this.folders = folders;
    }

    /**
     * @return the markers
     */
    public Marker getMarkers() {
        return markers;
    }

    /**
     * @param markers the markers to set
     */
    public void setMarkers(Marker markers) {
        this.markers = markers;
    }

    /**
     * @return the notebooks
     */
    public Notebook getNotebooks() {
        return notebooks;
    }

    /**
     * @param notebooks the notebooks to set
     */
    public void setNotebooks(Notebook notebooks) {
        this.notebooks = notebooks;
    }

    /**
     * @return the pens
     */
    public Pen getPens() {
        return pens;
    }

    /**
     * @param pens the pens to set
     */
    public void setPens(Pen pens) {
        this.pens = pens;
    }
    
    public Book addBooks(Book books){
        return new Book();
    }
    
    public Calculator addCalculator(Calculator calculators){
        return new Calculator();
    }
            
    public Folder addFolder(Folder folders){
        return new Folder();
    }
    
    public Marker addMarker(Marker markers){
        return new Marker();
    }
    
    public Notebook addNotebook(Notebook notebooks){
        return new Notebook();
    }
    
    public Pen addPen(Pen pens){
        return new Pen();
    }
}
