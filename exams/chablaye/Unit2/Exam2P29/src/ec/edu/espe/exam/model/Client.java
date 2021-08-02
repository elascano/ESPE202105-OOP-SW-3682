/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Client {
    private String password;
    private String name;

    public Client() {
    }

    public Client(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" + "password=" + password + ", name=" + name + '}';
    }

    
}
