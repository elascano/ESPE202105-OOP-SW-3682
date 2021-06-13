/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.GroceryStoreManagement.model;

/**
 *
 * @author pc
 */
class Cereals {

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
ShopCart add;
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the amountperunit
     */
    public int getAmountperunit() {
        return amountperunit;
    }

    /**
     * @param amountperunit the amountperunit to set
     */
    public void setAmountperunit(int amountperunit) {
        this.amountperunit = amountperunit;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    private String type;
    private String brand;
    private int amountperunit;
    private float price;
  public void buy()
   {}   
}
