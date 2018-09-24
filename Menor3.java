/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menor3;
import java.util.Scanner;
/**
 *
 * @author Ejercicio 4
 */
public class Menor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
int n1,n2,n3;
System.out.print("Escribe primer número ");
n1 = sc.nextInt();
System.out.print("Escribe segundo número ");
n2 = sc.nextInt();
System.out.print("Escribe tercer número ");
n3= sc.nextInt();
if (n1 < n2 && n1<n3)
System.out.print("El mayor es " + n1);
else if (n2<n1 && n2<n3)
System.out.print("El mayor es " + n2);
else
System.out.print("El mayor es " + n3);
    }
    
}
