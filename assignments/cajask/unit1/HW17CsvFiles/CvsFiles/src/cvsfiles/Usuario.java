/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvsfiles;

/**
 *
 * @author Lizbeth Cajas
 */
class Usuario {
     private String client;
    private String clientId;
    private String direction;
    private String email;

    public Usuario(String client, String clientId, String direction, String email) {
        this.client = client;
        this.clientId = clientId;
        this.direction = direction;
        this.email = email;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
