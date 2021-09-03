/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.espe.contac.controller;
import ec.edu.espe.contact.mondel.Book;
import ec.edu.espe.contact.mondel.Contact;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public interface ContactControllerI {
    public boolean addContactToBook(Book book , Contact contact);
}
