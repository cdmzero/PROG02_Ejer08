
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class PROG02_Ejer08 {

     public static void main(String[] args) {
Scanner teclado= new Scanner(System.in); 
    //System.in is a standard input stream  

    System.out.print("Primer numero: ");  
    float a= teclado.nextInt();  

    System.out.print("Segundo numero: ");  
    float b= teclado.nextInt();  
    
    
    System.out.print("x = " + (a + " y = " + b) + "\n");
    System.out.print("x + y = " + (a + b) + "\n");
    System.out.print("x - y = " + (a - b) + "\n");
    System.out.print("x * y = " + (a * b) + "\n");
    System.out.print("x / y = " + (a / b) + "\n");
    System.out.print("x ^ 2 = " + (float)Math.pow(a, 2) + "\n");
    System.out.print("∫x = " + (float)Math.sqrt(a) + "\n");
    
    
    
    }
    
}
