/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q33.view;

import ec.edu.espe.q33.model.Books;
import org.json.simple.JSONArray;

/**
 *
 * @author jejoc
 */
public class SystemDisplay {
    
    public static void main (String[] args){
      String title;
      String author;
      String publisher;
      int yearOfPublication;
    
    
        public JSONArray arrayBooks(){
        JSONArray arr = new JSONArray();
            arr.add(new Books("El corazón de la piedra", "José Maria Garcia", "Nocturna", 2013));
            arr.add(new Books("Salmos de vísperas", "Esteban Hernandez", "Obra social de Caja de Avila", 203));
            arr.add(new Books("A guide to search", "Eugene Casjen", "Garland", 1998));
            return arr;
    }
}
 
