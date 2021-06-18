/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvsfiles;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lizbeth Cajas
 */
public class CvsFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Usuario>usuarios = new ArrayList<Usuario>();
        
        usuarios.add(new Usuario("sebastian cabascango ","56845","j y gallegos","seba@hotmail.com"));
        
        ExportarCSV(usuarios);
    }
    public static void ExportarCVS(List<Usuario>usuarios){
        String salidaArchivo = "Usuarios.csv";//nombre del archivo 
        boolean existe = new File(salidaArchivo).exists();
        
        if(existe){
            File archivoUsuarios = new File(salidaArchivo);
            archivoUsuarios.delete();
        }
        
        try{
        //crea el archivo 
        CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
        salidaCSV.write("client");
        salidaCSV.write("clientId");
        salidaCSV.write("direction");
        salidaCSV.write("email");
        salidaCSV.endRecord();
        
        for(Usuario user : usuarios){
            salidaCSV.write(user.getClient());
            salidaCSV.write(user.getClientId());
            salidaCSV.write(user.getDirection());
            salidaCSV.write(user.getEmail());
            
            salidaCSV.endRecord();//se deja de escribir en el archivo     
        }
        
        salidaCSV.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    } 

    private static void ExportarCSV(List<Usuario> usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
