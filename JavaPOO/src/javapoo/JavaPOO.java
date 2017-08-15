package javapoo;
import java.util.Scanner;


public class JavaPOO {

    
    public static void main(String[] args) {
       int i = 0, resultado = 0;
       int numero = 0;
       Scanner in = new Scanner(System.in);
       System.out.println(" Por favor ingrese un número: ");
        numero = in.nextInt();
       
       if ( numero > 0) {
           for (i=0; i< numero; i++){
               System.out.println(i);
           }
        } else {
           resultado = funcion(numero);
       }
          
    }
    public static double funcion(){
        
    }
}
