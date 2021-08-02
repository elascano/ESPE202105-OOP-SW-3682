/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incomeTax.view;

import ec.edu.espe.incomeTax.controller.DataJson;
import java.io.IOException;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Incometax {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       DataJson.writeDatajson();
    }
}
