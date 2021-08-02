/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.groceryStore.Controller;

import ec.edu.espe.groceryStore.model.Client;
import ec.edu.espe.groceryStore.model.Product;
import ec.edu.espe.groceryStore.view.FrmClient;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class ClientController {
    
    private Client client;
    private FrmClient frmClient = new FrmClient();
    
    private ArrayList<Product> product= new ArrayList<>();
    
    public ClientController(Client client,  FrmClient frmClient, ArrayList<Product> product) {
        this.client = client;
        this.frmClient=frmClient;
        this.product=product;
    }

    public ClientController(Client client, FrmClient aThis, String product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
    public void addClient(Client client){
        
    //TODO read contacts(list)from database
    //TODO add tp database
    //usinf the utils class
   
    }
   
    public ArrayList<Client> readClients(){
       
        ArrayList<Client>clients = new ArrayList<>();
        
        //TODO read contacts from database
        //TODO use the utils class
        
        Client client = new Client("Milena Cordero", "1724614579", "0981548039", "mcordero@gmail.com", "Mile123", "", 0);
        clients.add(client);
        client = new Client("Paul Mena", "1724614589", "0979211060", "kpmena1@espe.edu.ec", "Paul123", "", 0);
        clients.add(client);
        return clients;
    }
   
    
    ArrayList<Client> findClient(String name){
        ArrayList<Client> clients = new ArrayList<>();
        //TODO find 
        //TODO call our utils class to find the erson in the database 
        Client client = new Client("Paul Mena", "1724614589", "0979211060", "kpmena1@espe.edu.ec", "Paul123", "",  0);
        clients.add(client);
        return clients;
    }
    
    boolean removeClient(String name){
    return true;
    }
    
    void updateClient(String name, Client client){
        
    }

 
    

    
    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the frmClient
     */
    public FrmClient getFrmClient() {
        return frmClient;
    }

    /**
     * @param frmClient the frmClient to set
     */
    public void setFrmClient(FrmClient frmClient) {
        this.frmClient = frmClient;
    }

    /**
     * @return the product
     */
    public ArrayList<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
    
    
    
}
