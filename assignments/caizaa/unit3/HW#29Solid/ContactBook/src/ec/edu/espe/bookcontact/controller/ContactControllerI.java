/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookcontact.controller;


import ec.edu.espe.bookcontact.mondel.Book;
import ec.edu.espe.bookcontact.mondel.Contact;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public interface ContactControllerI {
    public boolean addContactToBook(Book book , Contact contact);
}
