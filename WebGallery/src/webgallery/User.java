/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author Estudiante
 */
public abstract class User {
    protected String Name ;
    protected String Lname;

    public User(String Name, String Lname) {
        this.Name = Name;
        this.Lname = Lname;
    }
    
}
