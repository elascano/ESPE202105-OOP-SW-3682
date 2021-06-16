/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreManagement.model;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class ShopCart {
    
    public int numberofproducts;
    public float price;
  ArrayList<Bill> give = new ArrayList<>();
  
public  Pasta pasta(){
  return new Pasta();
  }
public  Appetizers appetizers(){
  return new Appetizers();
}
public  Drinks drinks(){
  return new Drinks();
}
public  Meats meats(){
  return new Meats();
}
public  NutsandSeeds nutandseeds(){
  return new NutsandSeeds();
}
public  Oils oils (){
  return new Oils();
  
}
public  Cereals cereals(){
  return new Cereals();
  }
private void add(){
}
private void remove(){
}
private void count(){
}
}
