/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class Archive {
    public static void writeArchive(String route, String classProject){
            FileWriter file = null;
            PrintWriter printWriter = null;
        try {
            file = new FileWriter(route);
            printWriter = new PrintWriter(file);
            printWriter.write(classProject);
            
            printWriter.close();
            file.close();
        } catch (Exception except) {
            System.out.println("The error is: " + except.getMessage());
        }
    }
    public static void readArchive(String route){
        String content = "";
        File archive = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        
        try {
            archive = new File(route);
            fileReader = new FileReader(archive);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while((line=bufferedReader.readLine())!=null){
                content.concat(line + "\n");
                System.out.println(line);
            }
        } catch (Exception except) {
            System.out.println("the error is: "+ except.getMessage());
        }
    }
}
