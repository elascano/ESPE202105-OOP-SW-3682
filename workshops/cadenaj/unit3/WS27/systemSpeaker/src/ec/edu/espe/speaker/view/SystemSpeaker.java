/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.bookstore.utils.Archive;
import ec.edu.espe.speaker.model.Speaker;
import java.util.Scanner;
import utils.Connection;

/**
 *
 * @author jejoc
 */
public class SystemSpeaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id = 1;
        int power; 
        float price;
        String manufacturer;
        String model;
        boolean bluetooth;
        Scanner scan = new Scanner(System.in);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonProduct;
        Connection connect = new Connection();
               
        System.out.println("power");
        scan.nextLine();
        power = scan.nextInt();
        System.out.println("price ");
        price = scan.nextFloat();
        System.out.println("manufacturer: ");
        manufacturer = scan.nextLine();
        System.out.println("model ");
        model = scan.nextLine();
        System.out.println("Bluetooth ");
        bluetooth = scan.nextBoolean();
        Speaker speaker;
        speaker =  new Speaker(id, power, price, manufacturer, model, bluetooth);
        jsonProduct = gson.toJson(speaker);
        System.out.println(jsonProduct);
        Archive.writeArchive(jsonProduct, "Speaker.json");

    }
    
}
