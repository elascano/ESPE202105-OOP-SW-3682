package appliancestore;
public class Iron { 
    public static void main(String[] args) {
   
    }
     private int SerialNumber;
    private String material;
    private String model;
    private float size;
    private float weight;
    private float price;
    private float purchaseprice;
    private float saleprice;
    
  
    private void sell(float purchaseprice) {
    }
    private void buy(float saleprice){
    
    }
    private void instock(){
    
    }
    private void generateprofit (){
    
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    
    public float getpurchaseprice(){
        float purchaserprice = 0;
        return purchaserprice;
    }
    
    public void setpurchaseprice(float purchaseprice){
    this.purchaseprice = purchaseprice;
    }
    public float getSaleprice() {
        float saleprice1 = 0;
        return saleprice1;
    }

    public void setSaleprice(float saleprice) {
        this.saleprice = saleprice;
    }
     public String getModel() {
        return model;
    }


    public void setBrand(String model) {
        this.model = model;
    }

  
    public String getmaterial() {
        return material;

    }
    public void setmaterial(String material) {
        this.material = material;
    }

}

