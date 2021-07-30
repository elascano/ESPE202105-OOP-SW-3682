/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.view;

import ec.edu.espe.appliancestore.controller.WriteCSV;
import ec.edu.espe.appliancestore.controller.ReadCSV;
import ec.edu.espe.appliancestore.model.ApplianceStore;
import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.CoffeeMaker;
import ec.edu.espe.appliancestore.model.Computer;
import ec.edu.espe.appliancestore.model.DVD;
import ec.edu.espe.appliancestore.model.Microwave;
import ec.edu.espe.appliancestore.model.TV;
import ec.edu.espe.appliancestore.model.Toaster;
import ec.edu.espe.json.Descuent;
import ec.edu.espe.json.Tax;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        dataPerson();
    }
    public static String dataPerson(){
        int age;
        String name;
        String email;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\twelcome to the system Appliance Store \n");
        
        System.out.println("Enter the email");
        email=sc.nextLine();
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
               
        System.out.println("\t\tWelcome the Appliance Store :" + name);
        systemMenu();
        return name;
        
    }
    public static float generatePayment(){
        int amount;
        float price ;
        float total;
        float totalAmount=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many products you are going to buy");
        amount=sc.nextInt();
        for(int i=0;i<amount;i++){
        System.out.println("Enter price the product ->" + i);
        price=sc.nextFloat();
        totalAmount=totalAmount+price;
        }
        total= Tax.computeTotalPrice(totalAmount);
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        double totalDecimal = bd.doubleValue();
        
        System.out.println("total price " +totalDecimal);
        
        if(total>=1000){
            System.out.println("Discount for exceeding $ 1000 value");
            computeDescuent();
        }else{
            return total;
        
        }
        
        return total;
    }          
    public static float computeDescuent(){
        float totalIva;
        float descuent;
        float total;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the total");
        totalIva=sc.nextFloat();
        
        
        descuent = Descuent.computeDescuent(totalIva);
        
        System.out.println("The price is -> " + totalIva + " The descuent is -> " + descuent);
        
        total = Descuent.computeTotalPrice(totalIva);
        System.out.println("Price with descuent-> " + total);
        
        return total;
    }
    public static void systemMenu(){
        int selection;
        Scanner sc = new Scanner(System.in);
  
        System.out.println("-------------------------------");
        System.out.println("|       Appliance Store       |");
        System.out.println("-------------------------------");
        System.out.println("| 1 -> View the Products      |");
        System.out.println("| 2 -> Remove the Porducts    |");
        System.out.println("| 3 -> Enter and View Product |");
        System.out.println("| 4 -> Generate Payment       |");
        System.out.println("-------------------------------");
        selection=sc.nextInt();
        if(selection==1){
        viewProducts();
            
        }else{
            if(selection==2){
                
            }else{
                if(selection==3){
                  selectObjects();
                }else{
                    if(selection==4){
                        generatePayment();
                        }
                        
                    }
                }
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
            
                if (selection==1){
                    WriteCSV.writeBlenderCsv();
                }else{
                        if (selection==2){
                         ReadCSV.readBlendercsv();
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
                            ReadCSV.readCoffeeMarkercsv();
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
                            ReadCSV.readComputercsv();
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
                        ReadCSV.readDvdcsv();
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
                            ReadCSV.readMicrowavecsv();
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
                        ReadCSV.readTVcsv();
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
                        ReadCSV.readToastercsv();
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