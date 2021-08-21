/** Copyright ESPE-DECC
 */
package ec.edu.espe.book.controller;

import ec.edu.espe.book.model.Contact;
import ec.edu.espe.book.model.Sport;
import ec.edu.espe.book.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactController {

    private Contact contact;
    private FrmContact frmContact;
    private ArrayList<Sport> sports;
    private Persistence dataManager = new DBManager();

    public void addContact(Contact contact) {
        //TODO read contacts (list) from database
        //TODO add contact to database
        //using the utils class
        
        //TODO contact object to JSON
        String contactJson= "{}";
        dataManager.create(contactJson, "contacts");

    }

    public ArrayList<Contact> readContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO read contacts from database
        //TODO use the utils class
        Contact contact = new Contact("Edi", "Lascano", "lascano", "0961195050", "el@espe.edu.ec", "Chimbacalle", "amigo", "male", LocalDateTime.MIN, 0);
        
        contacts.add(contact);
        contact = new Contact("Jorge", "Salazar", "salazar", "0961195051", "jo@espe.edu.ec", "Chimbacalle", "amigo", "male", LocalDateTime.MIN, 0);
        contacts.add(contact);
        
        return contacts;
    }
    
    ArrayList<Contact> findContact(String LastName){
        ArrayList<Contact> contacts = new ArrayList<>();
        
        //TODO find in database
        //TODO call our utils class to find the contact in the database
        Contact contact = new Contact("Edi", "Lascano", "lascano", "0961195050", "el@espe.edu.ec", "Chimbacalle", "amigo", "male", LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
    }
    
    // Contact findContact(String id);

    boolean removeContact(String fullName){
        //TODO findContac(fullname)
        //TODO verify what contact to remove
        return true;
    }
    
    void updateContact(String fullName, Contact contact){
        //TODO update the contact in the database
    }

    public ContactController(Contact contact, FrmContact frmContact, ArrayList<Sport> sports) {
        this.contact = contact;
        this.frmContact = frmContact;
        this.sports = sports;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the frmContact
     */
    public FrmContact getFrmContact() {
        return frmContact;
    }

    /**
     * @param frmContact the frmContact to set
     */
    public void setFrmContact(FrmContact frmContact) {
        this.frmContact = frmContact;
    }

    /**
     * @return the sports
     */
    public ArrayList<Sport> getSports() {
        return sports;
    }

    /**
     * @param sports the sports to set
     */
    public void setSports(ArrayList<Sport> sports) {
        this.sports = sports;
    }

}
