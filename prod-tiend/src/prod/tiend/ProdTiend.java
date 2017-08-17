/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.tiend;

/**
 *
 * @author Estudiante
 */
public class ProdTiend {

   
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido a la Tienda");
        System.out.println("Creación de Producto");
        System.out.println("Nombre Producto");
        String nombreProducto = in.next();
        System.out.println("Precio Producto");
        double precio = in.nextDouble();
        Producto producto = new Producto(nombre producto, precio);
        
        System.out.println("Nit de la Tienda");
        int nit = in.nextInt();
        System.out.println("Nombre Tienda");
        String nombreTienda = in.next();
        Tienda tienda = new Tienda(nit, nombreTienda);
        tienda.setProducto(producto);
        
    }
    
}
