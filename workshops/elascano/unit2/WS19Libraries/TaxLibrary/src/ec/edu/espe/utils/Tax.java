/** Copyright ESPE-DECC
 */
package ec.edu.espe.utils;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Tax {

    private static float taxPercentage = 12.0F;

    /**
     * This function computes the IVA value of any product based on 
     * the percentage that the government has issued, currently 12%
     * @param amount This is the PVP of the product you are selling
     * @return The IVA of the PVP that the system will charge for tax declaration
     */
    public static float computeIva(float amount) {
        float ivaValue;
        ivaValue = amount * taxPercentage / 100;
        return ivaValue;
    }

    /**
     * compute the total price of products that need to add the IVA
     * @param amount the PVP
     * @return The total price that will be charged to the customer
     */
    public static float computeTotalPrice(float amount) {
        float total;
        total = amount + computeIva(amount);
        return total;
    }
    
    //read
    
    //write
    
    //add
    
    //find
}
