/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shakersort;

import java.util.Scanner;

/**
 *
 * @author luisr
 */
public class Shakersort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Shakersort ord = new Shakersort();
        System.out.println("¿Cuantos números deseas registrar?");
        int n = sc.nextInt();
        int [] datos = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println("Ingrese números de la posicion "+(i+1)+" : ");
            datos[i] = sc.nextInt();
        }
        ord.Shakersort(datos);
    }
    public void Shakersort (int [] datos){
        
        int tam = datos.length;
        int liminf = 0;
        int limsup = tam-1;
        
        while(liminf <= limsup){
            
            for(int i = limsup; i > liminf; i--){
                
                if(datos[i] < datos[i-1]){
                    
                    int temp = datos[i];
                    datos[i] = datos[i-1];
                    datos[i-1] = temp;
                }
            }
            liminf++;
            for(int i = liminf; i < limsup; i++){
                
                if(datos[i] > datos[i+1]){
                    
                    int temp = datos[i];
                    datos[i] = datos[i+1];
                    datos[i+1] = temp; 
                }
            }
            limsup--;
        }
        Mostrar(datos);
    }
    public void Mostrar(int [] datos){
        
        System.out.println("Datos ya ordenados:");
        for (int i = 0; i < datos.length; i++){
            System.out.println(datos[i]);
        }
    }
    
}
