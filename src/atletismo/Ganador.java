/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atletismo;

/**
 *
 * @author USER
 */
public class Ganador {
     private int Numero;
     private float Tiempo;
     private String Nombre;
     
     public Ganador(int numero, float tiempo, String nombre)
     {
         Numero =numero;
         Tiempo = tiempo;
         Nombre = nombre;
  
     }

    public float getTiempo() {
        return Tiempo;
    }
     public String Resultado()
     {
  
         return "Numero de corredor: " + Numero + "Tiempo Recorrido: " + Tiempo + " Nombre: " + Nombre;
     }
     
            
    
    
    
    
    
    
    
}
