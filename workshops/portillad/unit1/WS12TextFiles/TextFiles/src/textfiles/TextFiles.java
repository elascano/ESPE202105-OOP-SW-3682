/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import ec.edu.espe.Persona.constructor.Persona;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try{
        FileWriter fw = new FileWriter ("C:\\Users\\Diego Portilla\\OneDrive\\Escritorio\\Semestre MAY21-SEP21\\Orient Objets Programing\\ESPE202105-OOP-SW-3682\\workshops\\portillad\\unit1\\WS12TextFiles\\Archivo.txt", true);
        
    
        String nombre;
        int edad;
        String email;
        
        Persona persona;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=sc.nextLine();
        System.out.println("Ingrese su email");
        email=sc.nextLine();
        System.out.println("Ingrese su edad");
        edad=sc.nextInt();
        
        
        persona= new Persona(nombre,email,edad);
                   
    
        System.out. println ("Name ->" + nombre);
        System.out. println ("Email ->" + email);
        System.out. println ("Edad ->"+ edad);
        
        fw.write("Name-> "+ nombre + "\n");
        fw.write("Email-> " + email + "\n");
        fw.write("Edad-> " + edad + "\n");
        
        fw.close();
     
     }catch (IOException ex){
            Logger.getLogger(TextFiles.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
       
       
  

    

