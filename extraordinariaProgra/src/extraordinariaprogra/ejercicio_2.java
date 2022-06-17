/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraordinariaprogra;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    /*
    Entrada
    La entrada comienza con un número indicando cuántos casos de prueba deberán ser procesados. Cada uno es un número entre 1 y 10.000.

    Salida
    Por cada caso de prueba el programa escribirá el siglo al que pertenece el año de la entrada. Por simplicidad, se escribirá con números normales (arábigos) en lugar de números romanos.

    Entrada de ejemplo
    3
    1582
    2000
    2101
    Salida de ejemplo
    16
    20
    22
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaro mi scanner 
        Scanner leer = new Scanner(System.in);
        
        //variables
        int anio;
        int casos;
        System.out.println("¿cuántos casos de prueba quieres procesar?");
        //lo leemos
        casos = leer.nextInt();

        while(casos--!=0){
            
            
        }//fin while
    }

}
