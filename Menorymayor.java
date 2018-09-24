/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menorymayor;

import java.io.*;

/**
 *
 * @author ejercicio1
 */
public class Menorymayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader in;
in = new BufferedReader (new InputStreamReader (System.in));
int[]vector=new int[20];
int suma=0,aux1,aux2,n;
System.out.println ("introdusca el tamaño de n e introdusca los valores correspondientes a n : ");n = Integer.parseInt (in.readLine ());
for(int i=1;i<=n;i++)
{vector[i]=Integer.parseInt(in.readLine());

}

aux1=vector[1];
aux2=vector[1];
for(int j=1;j<=n;j++)
{if(vector[j]>aux1)aux1=vector[j];
else;
if(vector[j]<aux2)
aux2=vector[j];}

System.out.println("EL MAYOR VALOR ES: "+aux1);
System.out.println("EL MENOR VALOR ES: "+aux2);

    }
    
}
