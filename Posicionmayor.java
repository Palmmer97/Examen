/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posicionmayor;
import java.util.*;
/**
 *
 * @autho Ejercicio 3 
 */
public class Posicionmayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int i,mayor=0,indice=0;
      int []x=new int[5];
      
      for (i=0;i<5;i++)
      {
          System.out.println("Elemento["+i+"]");
          x[i]=sc.nextInt();
      }
      
      mayor=x[0];
      for(i=0;i<5;i++)
      {
          if(x[i]>mayor)
          {
              mayor= x[i];
              indice=i+1;
          }
          
          
      }
      for(i=0;i<5;i++)
          System.out.println("Elemento["+i+"]"+x[i]);
      
      System.out.println("El numero mayor es: "+mayor+"Su posicion es: "+indice);
      
    }
    
}
