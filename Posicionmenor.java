/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posicionmenor;
import java.util.*;
/**
 *
 * @author Ejercicio 5
 */
public class Posicionmenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
      int i,menor=0,indice=0;
      int []x=new int[5];
      
      for (i=0;i<5;i++)
      {
          System.out.println("Elemento["+i+"]");
          x[i]=sc.nextInt();
      }
      
      menor=x[0];
      for(i=0;i<5;i++)
      {
          if(x[i]<menor)
          {
              menor= x[i];
              indice=i+1;
          }
          
          
      }
      for(i=0;i<5;i++)
          System.out.println("Elemento["+i+"]"+x[i]);
      
      System.out.println("El numero mayor es: "+menor+"Su posicion es: "+indice);
      
    }
    
}
