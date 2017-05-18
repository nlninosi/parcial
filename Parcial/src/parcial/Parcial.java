/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
         ArrayList<User> u = null;
        Scanner sc = new Scanner(System.in);
        File in = new File("in.txt");
        File out = new File("out.txt");       
        PrintStream outwriter;
        outwriter = new PrintStream(out);
        boolean start = true;
        while(start){
            System.out.println("Wellcome to WebGallery, what do you want to do?:");
            System.out.println("1: Register a new user");
            System.out.println("2: Print the info in a text file");
            System.out.println("3: Exit");
            int o = sc.nextInt();
            switch(o){
                case 1:
                   
                    System.out.println("insert the name:");
                    String n= sc.next();
                    System.out.println("insert the lastname:");
                    String ln=sc.next();
                    System.out.println("select 1:for artist   2:for buyer");
                    int t = sc.nextInt();
                    if (t==1) {
                        System.out.println("Insert the curriculum");
                        String c = sc.next();
                        System.out.println("Insert the Distintions");
                        String d = sc.next();
                        Artist a = new Artist(n,ln,c,d);
                        
                        System.out.println("How many artworks do you want register? (for anyone insert 0)");
                        int ar = sc.nextInt();
                        for (int i = 0; i < ar; i++) {
                            String[] ard = new String[4];
                            System.out.println("insert the name:");
                            ard[0] = sc.next();
                            System.out.println("insert the Description:");
                            ard[1] = sc.next();
                            System.out.println("insert the Style:");
                            ard[2] = sc.next();
                            System.out.println("insert the Value:");
                            int value = sc.nextInt();
                            Artwork art = new Artwork(ard[0],ard[1],ard[2],value);
                            a.addWork(art);
                        }
                        u.add(a);
                    }else{
                        Buyer b = new Buyer(n,ln);
                        u.add(b);
                    }
                    break;
                case 2:
                    for (int i = 0; i < u.size(); i++) {
                        if (u.get(i) instanceof Artist) {
                            Artist w = (Artist)u.get(i);
                            outwriter.println("Artista:"+u.get(i).getName()+":"+u.get(i).getLname()+":"+w.getCurriculum()+":"+w.getDistintions());
                            outwriter.println(w.getWorks().size());
                            for (int j = 0; j < w.getWorks().size(); j++) {
                                outwriter.println(w.getWorks().get(j).getName()+":"+w.getWorks().get(j).getDescription()+":"+w.getWorks().get(j).getStyle()+":"+w.getWorks().get(j).getValue());
                                
                            }
                        }else{
                            outwriter.println("Comprador:" + u.get(i).getName()+":"+u.get(i).getLname());
                        }
                    }
                    
                    break;
                    
            }
            
    }
    
}
