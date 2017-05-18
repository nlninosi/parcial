/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Artist extends User {
    protected String Curriculum;
    protected String Distintions;
    protected ArrayList<Artwork> works;
    
    public Artist( String Name, String Lname,String Curriculum, String Distintions) {
        super(Name, Lname);
        this.Curriculum = Curriculum;
        this.Distintions = Distintions;
    }
    
    
    
}
