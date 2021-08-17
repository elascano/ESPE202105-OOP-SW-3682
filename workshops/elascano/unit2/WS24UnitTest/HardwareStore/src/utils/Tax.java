/** Copyright ESPE-DECC
 */
package utils;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class Tax {

    static float ivaPercentage = 12.00F;

    public static float computeIva(float price) {
        if(price<=0){
            return 0;
        }
        
        float ivaValue;
        ivaValue = price * ivaPercentage / 100;
        return ivaValue;
    }

    public static float computeTotalPrice(float price) {
        float totalPrice;
        totalPrice = price + computeIva(price);
        return totalPrice;
    }

    //TEST CASES for float computeIva(float price)
    // input/s          expected result        actual result
    // price                ivaValue
    // 100.00               12.00
    // 156.25               18.75
    //1789.23              214.71
    //     0.00               0.0
    // -2.45                  0.0
    // 123.876              14.86
    // 0.23                  0.03
    
    //TEST CASES for total price float computeTotalPrice(floa price
    // price               total price
    // 100.00              112.00
    // 156.25              175.00
    // ...
    
}
