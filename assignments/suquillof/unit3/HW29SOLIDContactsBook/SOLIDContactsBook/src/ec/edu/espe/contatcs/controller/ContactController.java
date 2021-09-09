/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.controller;

import com.google.gson.Gson;
import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.Contact;
import utils.MongoDBManager;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController implements ContactControllerI{
    
    @Override
    public boolean addContactToBook(Book book, Contact contact){
        
        book.getContacts().add(contact);
        String cluster = "mongodb+srv://NullPointers:admin123@finalproyect.6vyqq.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";
        Gson gson = new Gson();
        MongoDBManager mongo = new MongoDBManager();
        
        String jsonObject = gson.toJson(contact);
        mongo.add(cluster, jsonObject, "Contact");
        
        return true;
        
    }
}
