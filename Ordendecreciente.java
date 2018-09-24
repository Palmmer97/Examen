/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the templante in the editor.
 */
package ordendecreciente;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author ejercicio 7
 */
public class Ordendecreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 
        Integer[] numeros = {1,12,13,14,2,50,3,4,7,6,8,5,6,9,11,10,21,22,23,24,25,15,16,17,18,19,20,31,32,33,34,35,36,26,27,28,29,30,44,45,46,47,48,49,50,51,52,53,54,94,95,96,97,98,99,100,64,65,66,67,68,69,70,71,72,73,74,84,85,86,87,88,89,90,91,38,39,40,41,42,43,37,75,76,77,78,79,80,92,93,59,60,61,62,63,81,82,83,55,56,57,58};


 
        System.out.print("\n\n [------- Ordenamientos de forma Descendente --------]");
        
        Arrays.sort(numeros, Collections.reverseOrder());

 
     
        System.out.print("\n\n[numeros] \n>> ");
        mostrar(numeros);
 

 
    }
 
   
    public static void mostrar(Integer ... datos){
        for(int i : datos)
            System.out.print(i + ",");
    }
 
   
 
   
    
}
