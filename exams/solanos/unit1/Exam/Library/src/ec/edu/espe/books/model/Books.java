/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Books {
    private String title;
    private String author;
    private int instances;
    private int rendered;
        private int borrowed;
    private String autor;

    public Books () {
    }

    public Books (String title, String author, int items, int borrowed) {
        this.title = title;
        this.autor = author;
        this.examples = exemplars;
        this.borrowed = rendered;
    }

    public String getAutor () {
        return author;
    }

    public void setAutor (String author) {
        this.autor = author;
    }

    public int getExamples () {
        return instances;
    }

    public void setExamples (int instances) {
        this.instances = exemplars;
    }

    public int getPrestados () {
        return rendered;
    }

    public void setPrestados (int rendered) {
        this.borrowed = rendered;
    }

    public String getTitle () {
        return title;
    }

    public void setTitulo (String title) {
        this.title = title;
    }

    public boolean loan () {
        boolean borrowed = true;
        if (borrowed <items) {
            rendered ++;
        } else {
            borrowed = false;
        }
        return borrowed;
    }

    public boolean returnq () {
        boolean returned = true;
        if (rendered == 0) {
            returned = false;
        } else {
            borrowed--;
        }
        return returned;
    }

    @Override
    public String toString () {
        return "title:" + title + "\ nautor:" + author +
                  "\ neissues:" + copies + "\ nloaned:" + borrowed;
    }
    }
