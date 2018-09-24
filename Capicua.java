/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capicua;

import java.util.Scanner;



/**
 *
 * @author Ejercicio 8
 */
public class Capicua {
    
    /**
     * @param args the command line arguments
     */
   int numero;
	int faltante;
	int numeroInvertido;
	int restante;
        public void numeroCapicua() {	
	
		Scanner num=new Scanner(System.in);
		
		System.out.println("\n ingrese 5 numeros:\n");
        numero=num.nextInt();
		
		faltante=numero;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		
		}
		
	    if(numeroInvertido==numero){
			
        System.out.println("\n El numero es capicua\n");
        
		}else{
       
        System.out.println("\n El numero no es capicua\n");
		
		}
		
		}
    public static void main(String[] args) {
     Capicua capicua=new Capicua();
		capicua.numeroCapicua();
        
       
    }
    
}
