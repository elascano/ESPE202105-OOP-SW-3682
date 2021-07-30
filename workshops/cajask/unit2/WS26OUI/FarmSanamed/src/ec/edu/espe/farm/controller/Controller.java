/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.controller;

import ec.edu.espe.farm.model.Client;
import ec.edu.espe.farm.model.Medicine;
import ec.edu.espe.farm.view.FrmClient;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Lizbeth Cajas
 */
public class Controller {
    private Client client;
    private FrmClient frmClient = new FrmClient();
    private ArrayList<Medicine> medicine = new ArrayList<>();

    public void addClient( Client client){
        //TODO read clients (lsit) from database
        //TODO add client to datebase
        //using the utils class
        
    }
    
    public ArrayList<Client> readClients(){
        ArrayList<Client> clients = new ArrayList<>();
        //TODO read clients from database
        //TODO usre the utils class
        Client client = new Client("Karla","cajas","0965985456","kl@hotmail.com"," chimbacalle","friend","male",LocalDateTime.MIN,0);
        clients.add(client);
        client  = new Client("Alejandra","fernadez","04222277587","af@hotmail.com"," sangolqui","friend2","ferna",LocalDateTime.MIN,0); 
        return clients;
    } 
    
    
    ArrayList<Client> findClient(String LastName){
     ArrayList<Client> clients = new ArrayList<>();
     //TODO finf  database 
      Client client = new Client("Karla","cajas","0965985456","kl@hotmail.com"," chimbacalle","friend","male",LocalDateTime.MIN,0);
      clients.add(client);
        return clients;
    }
    //Client findClient(String id);
    boolean removeClient(String fullName, Client client ){
        //TODO findClient(fullname)
        //TODO verify what contact to remove
        return false;
    }
    
    void updataClient(String fullName, Client client){
        //TODO update the client  to remove
    }
    
    public Controller(Client client, FrmClient frmClient, ArrayList<Medicine> medicine) {
        this.client = client;
        this.frmClient = frmClient;
        this.medicine = medicine;
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
     * @return the medicine
     */
    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }
    
    
    
    
}
