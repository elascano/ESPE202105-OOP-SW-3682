package ec.edu.espe.groserystoremanagenment.model;

public class Meats {
    private float price;
    private String client;
    private String brandType;
    private float alcoholDegree;
    private int expediationDate;
    
    public void sell(){       
    }
    public void buy(){       
    }
    public void checkQuality(){       
    }
    public void checkStatus(){       
    }


    public float getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the client
     */
    public String getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * @return the brandType
     */
    public String getBrandType() {
        return brandType;
    }

    /**
     * @param brandType the brandType to set
     */
    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    /**
     * @return the alcoholDegree
     */
    public float getAlcoholDegree() {
        return alcoholDegree;
    }

    /**
     * @param alcoholDegree the alcoholDegree to set
     */
    public void setAlcoholDegree(float alcoholDegree) {
        this.alcoholDegree = alcoholDegree;
    }

    /**
     * @return the expediationDate
     */
    public int getExpediationDate() {
        return expediationDate;
    }

    /**
     * @param expediationDate the expediationDate to set
     */
    public void setExpediationDate(int expediationDate) {
        this.expediationDate = expediationDate;
    }
    
    
}
