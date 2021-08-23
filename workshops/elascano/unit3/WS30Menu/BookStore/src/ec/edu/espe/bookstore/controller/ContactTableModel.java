/** Copyright ESPE-DECC
*/

package ec.edu.espe.bookstore.controller;

import ec.edu.espe.bookstore.model.Contact;
import java.util.ArrayList;
import java.util.List;


import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class ContactTableModel extends AbstractTableModel{
private List<Contact> contactData = new ArrayList<Contact>();
    private String[] columnNames =  {"Name", "Address", "Email", "Phone Number"};

    public ContactTableModel() {}

    public ContactTableModel(List<Contact> contactData) {
        this.contactData = contactData;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return contactData.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        Object contactAttribute = null;
        Contact contactObject = contactData.get(row);
        switch(column) {
            case 0: contactAttribute = contactObject.getName(); break;
            case 1: contactAttribute = contactObject.getAddress(); break;
            case 2: contactAttribute = contactObject.getEmail(); break;
            case 3: contactAttribute = contactObject.getPhoneNumber(); break;
            default: break;
        }
        return contactAttribute;
    }

    public void addContact(Contact contact) {
        contactData.add(contact);
        fireTableDataChanged();
    }
}
