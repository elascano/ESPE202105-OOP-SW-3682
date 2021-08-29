/** Copyright ESPE-DECC
*/

package ec.edu.espe.contatcs.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.contatcs.model.Book;
import ec.edu.espe.contatcs.model.ConexionBook;
import ec.edu.espe.contatcs.model.ConexionContact;
import ec.edu.espe.contatcs.model.Contact;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController implements ContactControllerI{

    @Override
    public void addContactToBook(Book book, Contact contact) {
        ConexionContact con = new ConexionContact();
        BasicDBObject documento = new BasicDBObject();
        documento.put("name","'" +contact.getName()+ "'");
        documento.put("numberOfFriends","'" +contact.getNumberOfFriends()+ "'");
        documento.put("salary","'" +contact.getSalary()+ "'");
        documento.put("email","'" +contact.getEmail()+ "'");
        con.coleccion.insert(documento);
    }

    @Override
    public void addBook(Book book, Contact contact) {
        ConexionBook con = new ConexionBook();
        BasicDBObject documento = new BasicDBObject();
        documento.put("id","'" +book.getId()+ "'");
        documento.put("description","'" +book.getDescription()+ "'");
        documento.put("contact","'" +contact+ "'");
        con.coleccion.insert(documento);
    }

    @Override
    public void addContact(Contact contact) {
        ConexionContact con = new ConexionContact();
        BasicDBObject documento = new BasicDBObject();
        documento.put("name","'" +contact.getName()+ "'");
        documento.put("numberOfFriends","'" +contact.getNumberOfFriends()+ "'");
        documento.put("salary","'" +contact.getSalary()+ "'");
        documento.put("email","'" +contact.getEmail()+ "'");
        con.coleccion.insert(documento);
    }

    
    
    
}
