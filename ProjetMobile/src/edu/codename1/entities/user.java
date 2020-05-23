/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.codename1.entities;

/**
 *
 * @author Ayadi
 */
public class user {
    
    protected int id;
    protected String username;

    protected String email;
    protected String password;
    protected String roles;


  
    public user(){
        
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "user{" + "id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", roles=" + roles + '}';
    }

  

    

    

}
