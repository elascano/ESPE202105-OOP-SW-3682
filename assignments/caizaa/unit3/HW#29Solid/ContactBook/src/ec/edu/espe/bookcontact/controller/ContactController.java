/** Copyright ESPE-DECC
*/

package ec.edu.espe.bookcontact.controller;

import com.google.gson.Gson;
import ec.edu.espe.bookcontact.mondel.Book;
import ec.edu.espe.bookcontact.mondel.Contact;
import ec.edu.espe.bookcontact.view.FrmContactsRegistration;
import java.util.ArrayList;
import utils.MongoDBManager;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController implements ContactControllerI{
    Contact contact;
    MongoDBManager db;
    FrmContactsRegistration registration;
    
   @Override
    public boolean addContactToBook(Book book , Contact contact) {
       book.getContacts().add(contact);
        return true;
    }
    
}
