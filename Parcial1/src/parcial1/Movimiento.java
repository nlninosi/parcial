/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Estudiante
 */
public class Movimiento {
    private String fecha;
    private double saldoinicial;
    private double cantidad;
    private Tipo tipo;
    public Movimiento(String fecha, double saldoinicial, double cantidad,Tipo tipo){
        this.cantidad=cantidad;
        this.fecha=fecha;
        this.saldoinicial=saldoinicial;
        this.tipo=tipo;
    }
    public String getFecha(){
        return fecha;
    }
    public double getSaldo(){
        return saldoinicial;
    }
    public double getCantidad(){
        return cantidad;
    }
    public String getTipo(){
        return tipo.getCodigo();
    }
    
}
