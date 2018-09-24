/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertido;
import java.io.*;
/**
 *
 * @author Ejercicio 2
 */
public class Invertido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String entrada="";
        String salida="";
        int i=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresar una frase : " );

        entrada=br.readLine();

        for(i=entrada.length()-1;i>=0;i--){

            salida= salida + entrada.charAt(i);
        }

        System.out.println("La frase invertida es: " + salida);
    }
    
}
