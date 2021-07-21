/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Invetory {
    private int id;
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
       books.add(book);
   }
   
   public void removeProduct(Book book){
        //int id = chicken.getId();
        books.remove(book);
   }
   
   //sobrecarga de funciones -> overloading
    public void removeProduct(int id){
        Iterator iterator = books.iterator();
        while(iterator .hasNext()){
            Book book = (Book)iterator.next();
            if(id == book.getId()){
                iterator.remove();
            }
        }
   }
   
   public void resetIterator(){
       
   }
   String title;
   String author;
   public Book nextBook(){
       return new Book(title, author, id, id);
   }
}
