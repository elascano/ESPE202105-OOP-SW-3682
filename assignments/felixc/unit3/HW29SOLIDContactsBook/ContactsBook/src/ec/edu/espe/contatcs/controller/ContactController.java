/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.controller;

import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.Contact;
import ec.edu.espe.contatcs.view.FrmContactsRegistration;
import utils.MongoDBManager;
import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController implements ContactControllerI{
    
    Contact contact;
    MongoDBManager db;
    Gson gson;
    FrmContactsRegistration registration;
    
    public boolean addContactToBook(Book book, Contact contact){
        db = new MongoDBManager();
        gson = new Gson();
        
        book.getContacts().add(contact);
        //TODO add to database by calling utils
        
        return true;
        
    }

    @Override
    public boolean addContactToBook(ArrayList contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
