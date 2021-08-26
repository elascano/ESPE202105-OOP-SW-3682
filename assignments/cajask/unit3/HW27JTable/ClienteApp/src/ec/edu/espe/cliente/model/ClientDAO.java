/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cliente.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import ec.edu.espe.cliente.view.ClientFrm;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class ClientDAO {
    DefaultTableModel modelo = new DefaultTableModel();
    public void insertClient(Client c){
        Conexion con = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("id","'" +c.getId()+ "'");
        documento.put("name","'" +c.getName()+ "'");
        documento.put("age","'" +c.getAge()+ "'");
        con.coleccion.insert(documento);
    }
    
//    public List getClient(Client c){
//        List<Client> clientList = new ArrayList<>();
//        Conexion objCon = new Conexion();
//        DBCursor cursor = objCon.coleccion.find();
//        Client objClient = new Client();
//        while(cursor.hasNext()){
//            objClient = (Client) cursor.next();
//            clientList.add(objClient);
//        }
//        return clientList;
//    }
    
    public ArrayList  mostrarColeccion(ClientFrm vista){
        Conexion objCon = new Conexion();
        DBCursor cursor = objCon.coleccion.find();
        String name = null;
        String id = null;
        String age = null;
        
        Object [] objeto = new Object[3];
        Client client = new Client();
        ArrayList Clients = new ArrayList();
        ArrayList listaNombres = new ArrayList();
        ArrayList listaId = new ArrayList();
        ArrayList listaAge = new ArrayList();
   
        while(cursor.hasNext()){
            //System.out.println("- " +cursor.next().get("name")+ " - " +cursor.curr().get("id"));
            //vista.textArea.setText("- " +cursor.next().get("name")+ " - " +cursor.curr().get("id"));
            name = (String) cursor.next().get("name");
            client.setName(name);
            System.out.println("Nombre: " +client.getName());
            listaNombres.add(name);
            
            id = (String) cursor.curr().get("id");
            client.setId(id);
            System.out.println("ID: " +client.getId());
            listaId.add(id);
            
            age = (String) cursor.curr().get("age");
            client.setAge(age);
            System.out.println("Age: " +client.getAge());
            listaAge.add(age);

            Clients.add(client);
        }
        System.out.println("LISTA -> " +listaNombres);
        System.out.println("ID-> " +listaId);
        System.out.println("Edades-> " +listaAge);
        System.out.println("Clientes: " +Clients);
        return Clients;
    }
}
