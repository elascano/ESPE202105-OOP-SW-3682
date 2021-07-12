/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.appliancestore.model.Blender;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, IOException, Exception  {
        
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<>();
        Blender blendersArray[] = new Blender[3];
        int selection;
        int select;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the system Appliance Store \n");
        System.out.println("---------------------");
        System.out.println("|Select the product |");
        System.out.println("---------------------");
        System.out.println("|1-> Blender        |");
        System.out.println("|2-> CoffeeMarker   |");
        System.out.println("|3-> Computer       |");
        System.out.println("|4 -> DVD           |");
        System.out.println("|5 -> Microwave     |");
        System.out.println("|6 -> TV            |");
        System.out.println("|7 -> Toaster       |");
        System.out.println("---------------------");
        select=sc.nextInt();
        
        switch(select){
            case 1:    
                System.out.println("---------------------");
                System.out.println("|    Blender        |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){
    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    writeCSVblender();
                }else{
                        if (selection==2){
                         readCSVblender();
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    System.out.println("------------------------|");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        writeJSONblender();
                    }else{
                        if (selection==2){
                            readJSONblender();
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }
        }
        break;    
        case 2:
            
                System.out.println("---------------------");
                System.out.println("|   CoffeeMarker    |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){   
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }  
    }
        break; 
        case(3):
              
                System.out.println("---------------------");
                System.out.println("|     Computer      |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
            }  
    }
        break; 
        case(4) :  
                System.out.println("---------------------");
                System.out.println("|       DVD         |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case (5):
                System.out.println("---------------------");
                System.out.println("|     Microwave     |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case (6):
                System.out.println("---------------------");
                System.out.println("|       TV          |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break; 
        case(7):
                System.out.println("---------------------");
                System.out.println("|       Toaster     |");
                System.out.println("---------------------");
                System.out.println("|1-> data CSV       |");
                System.out.println("|2-> data JSON      |");
                System.out.println("---------------------");
                selection=sc.nextInt();
            if(selection==1){    
                System.out.println("-----------------------");
                System.out.println("|1-> Enter data to CSV |");
                System.out.println("|2-> read data from CSV|"); 
                System.out.println("-----------------------");
                selection=sc.nextInt();
            
                if (selection==1){
                    
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Enter data to Json |");
                    System.out.println("|2-> read data from Json|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                        
                    }else{
                        if (selection==2){
                            
                        }else{
                           System.out.println("Incorrect Number");
                        }
                    }
            }else{
                System.out.println("Incorrect Number");
                }
            }
        break;
        }
    

} 
    

    public static void readCSVblender() throws FileNotFoundException, IOException{
        try{
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        System.out.println("read data from CSV"); 
        CsvReader readBlender = new CsvReader("ApplianceStore.csv");
        readBlender.readHeaders();
        while(readBlender.readRecord()){
            String serialnumber = readBlender.get(0);
            String price = readBlender.get(1);
            String velocity = readBlender.get(2);
            String ability = readBlender.get(3);
            
            
            
        blenders.add(new Blender(Integer.parseInt(serialnumber), Float.parseFloat(price), 
                        Integer.parseInt(velocity),Integer.parseInt(ability)));   
        }
        readBlender.close();
        
        for(Blender BlenderArray : blenders){
            System.out.println(BlenderArray.getSerialnumber()+"," +
            BlenderArray.getPrice() + "," + BlenderArray.getVelocity() + "," +
                    BlenderArray.getAbility());   
        }
     
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
    public static void writeCSVblender() throws IOException{
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        Blender blendersArray[] = new Blender[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to csv");
                                   
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        
        Blender blender = new Blender();
        System.out.println("Blender object -> " + blender);
        
        blender = new Blender(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + blender);
                   
        blenders.add(blender);
               
        System.out.println("Blenders -> " + blenders + "\n");
        
        blendersArray[0] = blender;
        String fileOutput = "ApplianceStore.csv"; 
        boolean exists = new File(fileOutput).exists(); 
        
        
        if(exists) {
            File blenderFile = new File(fileOutput);
            blenderFile.delete();
        }
        
        try {
            
            CsvWriter outputCSV = new CsvWriter(new FileWriter(fileOutput, true), ',');
            
     
            outputCSV.write("Serialnumber");            
            outputCSV.write("Price");
            outputCSV.write("Velocity");
            outputCSV.write("Ability");
            
            
            outputCSV.endRecord(); 
            
            
            for(Blender BlenderArray : blenders) {
                outputCSV.write(String.valueOf(BlenderArray.getSerialnumber()));
                outputCSV.write(String.valueOf(BlenderArray.getPrice()));
                outputCSV.write(String.valueOf(BlenderArray.getVelocity()));
                outputCSV.write(String.valueOf(BlenderArray.getAbility()));
                              
                outputCSV.endRecord(); 
            }
            
            outputCSV.close(); 
            
        } catch(IOException e) {
            e.printStackTrace();
        }    
    
        
    }
    public static void writeJSONblender() throws IOException, Exception{
        
        int velocity;
        int ability;
        float price;
        int serialnumber;
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        Blender blendersArray[] = new Blender[3];
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
                            
        System.out.println("Ingrese el numero de serie :");
        serialnumber=sc.nextInt();
        System.out.println("Ingrese el precio :");
        price=sc.nextFloat();
        System.out.println("Ingrese las velocidades :");
        velocity=sc.nextInt();
        System.out.println("Ingrese las capacidad :");
        ability=sc.nextInt();
        
        Blender blender = new Blender();
        System.out.println("Blender object -> " + blender);
        
        blender = new Blender(serialnumber,price,velocity,ability);
        System.out.println("Blender object -> " + blender);
                   
        blenders.add(blender);
               
        System.out.println("Blenders -> " + blenders + "\n");
        blendersArray[0] = blender;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String jsonBlender;
        jsonBlender = gson.toJson(blender);
        
        
        gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("ApplianceStore.json")) {
                 writer.write(gson.toJson(blenders));
             }
    }
    public static void readJSONblender() throws Exception , ParseException {
        ArrayList<Blender>blenders=new ArrayList<Blender>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("ApplianceStore.json");
        Object obj = parser.parse(reader);
        JSONObject jsonObj = (JSONObject)obj;
                       
            int serialnumber =(int) jsonObj.get("serialnumber");
            float price =(float) jsonObj.get("price");
            int velocity =(int) jsonObj.get("velocity");
            int ability =(int) jsonObj.get("ability");
            
            System.out.println( "SerialNumber: " + serialnumber);
            System.out.println( "Price: " + price);
            System.out.println( "Velocity: " + velocity);
            System.out.println( "Ability: " + ability); 
            Iterator iterator = blenders.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }

		} catch (FileNotFoundException e) {
		e.printStackTrace();
		
			
		}
         
    }

   
        
    }
        
                

        


    
    
    

        
        
        
						
		    
        
    
    
    
