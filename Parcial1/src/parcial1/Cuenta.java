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
public class Cuenta {
    private int numeroCuenta;
    public double saldo;
    private String fecha;
    private String nombre;
    private ArrayList<Movimiento> movimientos;
    public Cuenta(int numeroCuenta, double saldo, String fecha, String nombre){
        this.fecha=fecha;
        this.nombre=nombre;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.movimientos= new ArrayList<>();
    }
     public boolean addMovimiento(String fecha,double saldo,double cantidad,Tipo tipo){
       Movimiento movimiento= new Movimiento(fecha,saldo,cantidad,tipo);
       if(this.movimientos.add(movimiento)){
           return true;
       }else{ 
           return false;
       }
    }
     public void listarmovimientos(){
         ArrayList<Movimiento> movimientos = this.movimientos;
         for(Movimiento movimiento : movimientos){
             System.out.println("Fecha"+movimiento.getFecha()+" Saldo Inicial:"+movimiento.+"");
         }
     }
}
