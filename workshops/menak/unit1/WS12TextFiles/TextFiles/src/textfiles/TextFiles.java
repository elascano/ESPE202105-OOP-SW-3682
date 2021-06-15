/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfiles;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class TextFiles {
    
    public static void main(String[] args)  throws IOException {
        
        String name;
        int ID;
        int age;
        
        FileWriter Data = new FileWriter ("D:\\- I. DE SOFTWARE\\Semestre\\1. Programacion Orientada a Objetos\\1er Pacrial\\2. Workshops\\WS12TextFiles\\archive.txt");
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Enter name: ");
        name = entrada.nextLine();
        
     
        System.out.println("Enter ID: ");
        ID = entrada.nextInt();

       
        
        System.out.println("Enter age: ");
        age = entrada.nextInt();

       
        Data.write("---> "+name);
        Data.write("\n");
        Data.write("---> "+ID);
        Data.write("\n");
        Data.write("---> "+age);
        
        
        Data.close();
        
        
    }
                   
}      

    
        
        

    
