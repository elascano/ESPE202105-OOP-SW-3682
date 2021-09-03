/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.airport.view;

import ec.edu.espe.airport.model.AircraftDAO;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Airport {
    public static void main(String[] args) {
        AircraftDAO objectDAO = new AircraftDAO();
        AirportFrm vista = new AirportFrm();
        System.out.println("Modelos: ");
        objectDAO.showModels();
        System.out.println("Asientos: ");
        objectDAO.showSeating();
    }
    
}
