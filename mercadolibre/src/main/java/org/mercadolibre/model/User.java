package org.mercadolibre.model;

public class User {
    private int id;
    private String user;
    private String password;

    public int getId() {
        return this.id;
    }

    public void setId() {
        this.id++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
