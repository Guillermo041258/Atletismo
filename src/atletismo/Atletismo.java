/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atletismo;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author USER
 */
public class Atletismo {

    
    public static void main(String[] args) throws IOException {
   float tiempo;
   String nombre;
   int  n_corredor,corredores,ganador;
   Scanner in = new Scanner(System.in);
  BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
   
   
   System.out.print("Cuantos corredores son");
   corredores = in.nextInt();
   
   
   
   Ganador corredor[] = new Ganador[corredores];
   
   for(int i =0; i<corredor.length;i++)
   {
   System.out.println("Dime el numero del corredor");
   n_corredor = in.nextInt();
   
   System.out.println("Dame el nombre del corredor");
   nombre = bc.readLine();
   
   System.out.print("Dame el tiempo que se recorrio");
   tiempo = in.nextFloat();
   
   corredor[i] = new Ganador(n_corredor,tiempo,nombre);      
   }
   ganador = MasRapido(corredor);
   System.out.println("Ganador: ");
   System.out.println(corredor[ganador].Resultado());
   
        
        
    }
    public static int MasRapido(Ganador corredor[])
    {
     float distance;
     int num =0;
     
     distance = corredor[0].getTiempo();
     for(int i =1; i<corredor.length;i++)
     {
       if(corredor[i].getTiempo() < distance)
       {
         distance = corredor[i].getTiempo();
         num = i;
                   
       }  
     }
        
    return num;    
    }
    
}
