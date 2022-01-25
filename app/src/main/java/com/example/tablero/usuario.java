package com.example.tablero;

public class usuario {
    public String username;
    public String email;
    //  public boolean acepto;

    public usuario(){

    }

    public usuario(String username, String email){
        this.username=username;
        this.email=email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
