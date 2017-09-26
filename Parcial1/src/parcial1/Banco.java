/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Banco {
    private String codigo;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<Tipo> tipos;
    public Banco(String codigo){
        this.codigo=codigo;
        this.cuentas = new ArrayList<>();
        this.tipos = new ArrayList<>();
    }
    public boolean addCuenta(Cuenta cuenta){
       if(this.cuentas.add(cuenta)){
           return true;
       }else{ 
           return false;
       }
    }
     public boolean addTipo(Tipo tipo){
       if(this.tipos.add(tipo)){
           return true;
       }else{ 
           return false;
       }
    }
     public void listarCuentas(){
         ArrayList<Cuenta> cuentas = this.cuentas;
            for (Cuenta cuenta : cuentas) {
                System.out.println();
                cuenta.listarmovimientos();
            }
     }
}
