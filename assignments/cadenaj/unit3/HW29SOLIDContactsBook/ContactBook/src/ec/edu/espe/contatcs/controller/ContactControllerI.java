/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contatcs.controller;

import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.Contact;
import java.util.ArrayList;

/**
 *
 * @author jejoc
 */
public interface ContactControllerI {
    public boolean addContactToBook(ArrayList contact);
}
