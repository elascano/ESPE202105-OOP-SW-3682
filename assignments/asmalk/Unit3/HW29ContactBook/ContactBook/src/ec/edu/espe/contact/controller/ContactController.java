/** Copyright ESPE-DECC
*/

package ec.edu.espe.contact.controller;

import com.google.gson.Gson;
import ec.edu.espe.contact.mondel.Book;
import ec.edu.espe.contact.mondel.Contact;
import ec.edu.espe.contact.view.FrmContactsRegistration;
import java.util.ArrayList;
import utils.MongoDBManager;

/**
 *
 * @author Asmal Kevin
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
