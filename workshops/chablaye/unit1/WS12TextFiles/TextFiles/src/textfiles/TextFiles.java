/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class TextFiles {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
               
        System.out.println("Persona 1");
        person1.dataEntry();
        System.out.println("Persona 2");
        person2.dataEntry();
        
        try {
            PrintWriter writer = new PrintWriter("TxtFile.txt", "UTF-8");
            writer.println("-- PERSONA 1 --");
            writer.println("Nombre: " +person1.getName());
            writer.println("Edad: " +person1.getAge());
            writer.println("Codigo: " +person1.getCode());
            writer.println("Pais: " +person1.getCountry());
            
            writer.println("-- PERSONA 2 --");
            writer.println("Nombre: " +person2.getName());
            writer.println("Edad: " +person2.getAge());
            writer.println("Codigo: " +person2.getCode());
            writer.println("Pais: " +person2.getCountry());
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
