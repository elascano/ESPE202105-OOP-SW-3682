/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import com.mongodb.DB;
import ec.edu.espe.appliancestore.controller.WriteCSV;
import ec.edu.espe.appliancestore.controller.ApplianceStore;
import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.CoffeeMaker;
import ec.edu.espe.appliancestore.model.Computer;
import ec.edu.espe.appliancestore.model.Conection;
import ec.edu.espe.appliancestore.model.DVD;
import ec.edu.espe.appliancestore.model.Microwave;
import ec.edu.espe.appliancestore.model.Profit;
import ec.edu.espe.appliancestore.model.TV;
import ec.edu.espe.appliancestore.model.Toaster;

import java.util.Scanner;



/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 * @author Diego Portilla NullPointers ESPE-DCCO
 * @author Salazar Matthew NullPointers ESPE-DCCO
 */
public class Simulator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        systemMenu();
      
    }
    
    public static void systemMenu(){
        
        int selection;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the system Appliance Store \n");
        System.out.println("-------------------------------");
        System.out.println("|       Appliance Store       |");
        System.out.println("-------------------------------");
        System.out.println("| 1 -> View the Products      |");
        System.out.println("| 2 -> Remove the Porducts    |");
        System.out.println("| 3 -> Enter and View Product |");
        System.out.println("| 4 -> Generate Payment       |");
        System.out.println("| 5 -> Calculate Gain         |");
        System.out.println("-------------------------------");
        selection=sc.nextInt();
        
        switch (selection){
            case 1:
                viewProducts();
            break;
            case 2:
            break;
            case 3:
                selectObjects();
            break;
            case 4:
            break; 
            case 5:
                Profit.calculateProfit();
            break;
        }
        
    }
    public static void selectObjects(){
        
        int selection;
        int select;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------");
        System.out.println("|Select the product |");
        System.out.println("---------------------");
        System.out.println("|1-> Blender        |");
        System.out.println("|2-> CoffeeMaker    |");
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
                    if(selection==1){
                    WriteCSV.writeBlenderCsv();
                    }else{
                    if (selection==2){
                         
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
        case 2:
            
                System.out.println("---------------------");
                System.out.println("|   CoffeeMaker    |");
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
                    WriteCSV.writeCoffeeMarkerCsv();
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
                   WriteCSV.writeComputercsv();
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
                    WriteCSV.writeDvdcsv();
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
                    WriteCSV.writeMicrowaveCsv();
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
                    WriteCSV.writeTVCsv();
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
                    WriteCSV.writeToasterCsv();
                }else{
                        if (selection==2){
                        
                        }else{
                            System.out.println("Incorrect Number");
                         }
                     }
        
                  
            }else{
                if (selection ==2){
                    
                    System.out.println("-------------------------");
                    System.out.println("|1-> Insert in database |");
                    System.out.println("|2-> Show data|");
                    System.out.println("-------------------------");
                    selection=sc.nextInt();
                    if (selection==1){
                      Conection conection = new Conection();
                      conection.insert("Correr");  
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
    public static void viewProducts(){
    ApplianceStore applianceStore = new Blender(0, 0.0F, 0, 0);
    applianceStore = new Blender(12345,14.6F,3,2);
    System.out.println("Blender ->" + applianceStore);
    applianceStore = new CoffeeMaker(172921,25.5F,1.5F,5,"stainless steel","Indurama");
    System.out.println("CoffeeMaker ->" + applianceStore);
    applianceStore = new Computer(322134,300.45F,999,100,"HP");
    System.out.println("Computer ->" + applianceStore);
    applianceStore = new DVD(134589,20.0F,0.80F,"LG");
    System.out.println("DVD ->" + applianceStore);
    applianceStore = new Microwave(134567,150.8F,0.90F,5.45F,"stainless steel","Samsung");
    System.out.println("Microwave ->" + applianceStore);
    applianceStore = new TV(8756045,500.80F,55F,"Silver","Hight Definition","Riviera");
    System.out.println("TV ->" + applianceStore);
    applianceStore = new Toaster(4679034,150.8F,800,0.80F,3.5F,"stainless steel","WesterHouse");
    System.out.println("Toaster ->" + applianceStore);
    }
}