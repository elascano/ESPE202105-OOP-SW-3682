/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.controller;

import com.google.gson.Gson;
import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.Contact;
import ec.edu.espe.contatcs.view.FrmContactsRegistration;
import java.util.ArrayList;
import utils.MongoDBManager;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController implements ContactControllerI{
    Contact contact;
    MongoDBManager db;
    Gson gson;
    FrmContactsRegistration registration;
    
   @Override
    public boolean addContactToBook(ArrayList contact) {
        db = new MongoDBManager();
        gson = new Gson();        
        return true;
    }
    
}
