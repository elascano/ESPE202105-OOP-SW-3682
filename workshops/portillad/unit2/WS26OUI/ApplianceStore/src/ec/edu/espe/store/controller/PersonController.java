/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.controller;

import ec.edu.espe.store.model.Person;
import ec.edu.espe.store.model.Gender;
import ec.edu.espe.store.view.FrmPerson;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class PersonController {
    private Person data;
    private FrmPerson frmPerson = new FrmPerson();
    private ArrayList <Gender> genders = new ArrayList<>();
    private Persistence dataManager = new DBManager();
    
    public void addPerson(Person data){
        //TODO read perosn  (List) from database
        //TODO add person to database
        //using the utils class
        
        //TODO contact 
        String personJson="{}";
        dataManager.crete(personJson, "persons");

    }
    
    public ArrayList<Person> readPerson(){
        ArrayList<Person> datas= new ArrayList<>();
        //TODO read data fron databse
        //TODO use the utils class
        Person data = new Person("Diego", "Portilla","daportilla1@espe.edu.ec","Diego123","0995047657","Luluncoto","",Date.valueOf(LocalDate.MAX), 0);
        datas.add(data);
        data = new Person("Alejandro", "Andrade","espe1@espe.edu.ec","Diego123","0987143019","labiloxi","",Date.valueOf(LocalDate.MAX), 0);
        datas.add(data);
        return datas;
        
    }
    ArrayList<Person> findPerson(String lastName){
        ArrayList<Person> datas = new ArrayList<>();
        //TODO find 
        //TODO call our utils class to find the erson in the database 
        Person data = new Person("Diego", "Portilla","daportilla1@espe.edu.ec","Diego123","0995047657","Luluncoto","",Date.valueOf(LocalDate.MAX), 0);
        datas.add(data);
        return datas;
    }
    
    boolean removePerson(String fulName){
    return true;
    }
    
    void updatePerson(String fulName,Person person){
        
    }
    public PersonController(Person data, FrmPerson frmPerson, ArrayList<Gender> genders) {
        this.data = data;
        this.frmPerson = frmPerson;
        this.genders = genders;
    }
    
    
    /**
     * @return the data
     */
    public Person getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Person data) {
        this.data = data;
    }

    /**
     * @return the frmPerson
     */
    public FrmPerson getFrmPerson() {
        return frmPerson;
    }

    /**
     * @param frmPerson the frmPerson to set
     */
    public void setFrmPerson(FrmPerson frmPerson) {
        this.frmPerson = frmPerson;
    }

    /**
     * @return the genders
     */
    public ArrayList <Gender> getGenders() {
        return genders;
    }

    /**
     * @param genders the genders to set
     */
    public void setGenders(ArrayList <Gender> genders) {
        this.genders = genders;
    }
    
    
}
