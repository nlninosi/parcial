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
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco b1=new Banco("123sdfg");
        Tipo t1= new Tipo("Consignacion");
        Tipo t2 =new Tipo("Retiro");
        Cuenta c1=new Cuenta(1234,1000,"26/09/17","NN"); 
        Cuenta c2=new Cuenta(1235,10000,"26/09/17","NN");
        b1.addCuenta(c1);
        b1.addCuenta(c2);
        c1.addMovimiento("26/09/17", c1.saldo, 100, t1);
        c1.addMovimiento("26/09/17", c1.saldo, 100, t2);
        c2.addMovimiento("26/09/17", c2.saldo, 100, t1);
        c2.addMovimiento("26/09/17", c2.saldo, 100, t2);
        b1.listarCuentas();
    }
    
}
