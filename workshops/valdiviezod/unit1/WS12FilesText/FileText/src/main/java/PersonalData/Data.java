/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonalData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Darwin Valdiviezo NullPunters ESPE-DCCO
 */
public class Data {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FileWriter Data = new FileWriter ("C:/Users/Darwin/Desktop/java/archivos/src/main/java/Data.txt");
        Scanner entrada = new Scanner(System.in);
        String name;
        String career;
        float id;
        float age;
        
        System.out.println("Enter your name: ");
        name = entrada.nextLine();
        System.out.println("Your name is: "+name);
        
        
        System.out.println("Enter your career: ");
        career = entrada.nextLine();
        System.out.println("Your career is: "+career);
        
        
        System.out.println("Enter your ID: ");
        id = entrada.nextFloat();
        System.out.println("Your ID is: "+id);
        
        
        System.out.println("Enter your age: ");
        age = entrada.nextFloat();
        System.out.println("Your age is: "+age);
       
        Data.write("Your name is: "+name+"\n");
        Data.write("Your career is: "+career+"\n");
        Data.write("Your ID is: "+id+"\n");
        Data.write("Your age is: "+age+"\n");
        
        Data.close();
    }
    
}
   
