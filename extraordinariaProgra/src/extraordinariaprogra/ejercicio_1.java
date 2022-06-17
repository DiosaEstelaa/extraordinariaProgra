/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraordinariaprogra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    /*
    Queremos mostrar un resumen de las farolas que hay en Madrid:
    -De qué tipo hay más farolas y cuántas. Por ejemplo, hay más de tipo LED y son 10000.
    -Cuántas hay en total por cada distrito. Indica el nombre del distrito. Por ejemplo 500 farolas en Chamartín
    -Cuántas farolas hay de media en Marid por distrito
    Requisitos:
    -Para que el programa sea más eficiente, el archivo que enumera las farolas solo debe leerse una vez.
    -Almacena los totales de bombillas por distrito en un HashMap.
    -Realiza commits según avances
    Entrega:
    -El código comprimido
    -Y el enlace a tu repositorio en GitHub*/
    //************************************************************************************************************************
    /////////////////////////////////////
    //FUNCIONES/MÉTODOS/////////////////////////////////////////////////////////
    /////////////////////////////////////
    public static ArrayList<farola> leer(File fichero_f) throws FileNotFoundException, IOException {
        ArrayList<farola> listaDatos = new ArrayList<farola>();
        try {
            FileReader fr = new FileReader(fichero_f);
            BufferedReader bf = new BufferedReader(fr);
            String datos;

            while ((datos = bf.readLine()) != null) {
                String[] celdas = datos.split(";");
                if (celdas.length > 1) {
                    if (!celdas[3].equals("VIA_PAR,C,254")) {
                        farola infoFarola = new farola(celdas[0], celdas[1], celdas[2], celdas[3], celdas[4], celdas[5], celdas[6], celdas[7], celdas[8], celdas[9], celdas[10], celdas[11]);
                        listaDatos.add(infoFarola);
                        //dejo comentado esto porque si no se carga mucho el programa, era para comprobar yo si se leia
                        //System.out.println(infoFarola);
                    }//fin if 2
                }//fin if 1
            }//fin while

        } catch (Exception e) {
            e.printStackTrace();
        }//fin try-catch
        return listaDatos;
    }//fin función leer

    /*public static String laFarolaMasPopular_y_Cantidad(ArrayList<farola> columnasFarolas_f) {
        //variables

        int contadorLed = 0;
        int contadorDescarga = 0;
        int contadoLedDescarga = 0;
        //objeto de tipo farola
        String laFarola;
        for (farola farolita : columnasFarolas_f) {
            if (farolita.getTipo_B().equals("LED")) {
                contadorLed++;
            }
            if (farolita.getTipo_B().equals("DESCARGA")) {
                contadorDescarga++;
            }
            if (farolita.getTipo_B().equals("LED-DESCARGA")) {
                contadoLedDescarga++;
            }
        }//fin for-each

        laFarola = "led:" + contadorLed + "descarga:" + contadorDescarga + "led-descarga:" + contadoLedDescarga;
        return laFarola;

    }//fin funció laFarolaMasPopular_y_Cantidad*/
    //************************************************************************************************************************
    //************************************************************************************************************************
    //************************************************************************************************************************
    //************************************************************************************************************************
    //************************************************************************************************************************
    //************************************************************************************************************************
    //************************************************************************************************************************
    //************************************************************************************************************************        
    /////////////////////////////////////
    //MAIN//////////////////////////////////////////////////////////////////////
    /////////////////////////////////////
    public static void main(String[] args) {
        // TODO code application logic here

        File archivo;

        /*
        trabajamos con el excel de datos de luces donde hay 12 columnas. Vamos a meter
        cada columna en un ArrayList que llamaremos "archivoLucesFarola"
         */
        ArrayList<farola> archivoLucesFarola = new ArrayList<farola>();
        do {
            Scanner leer2 = new Scanner(System.in);
            //ordenador clase:
            archivo = new File("C:\\Users\\DAW\\Desktop\\extraordinariaProgra\\extraordinariaProgra\\faroleo\\DATOS_ABIERTOS_UNIDAD_LUMINOSA_.csv");
            if (!archivo.exists()) {
                System.err.println("El archivo no existe, prueba de nuevo.");
            }//fin if
        } while (!archivo.exists());

        //para el manejo de errores trabajaremos el código en un try-catch
        try {

            // archivoLucesFarola = leer(archivo);
            System.out.println("");

            // Creamos un FileReader para leer del fichero en forma de Bytes 
            FileReader fr = new FileReader(archivo);
            /* Creamos un BufferedReader a partir del FileReader para poder leer caracteres */
            BufferedReader br = new BufferedReader(fr);

            //String farolaaaaaaaaa = laFarolaMasPopular_y_Cantidad(archivoLucesFarola);
            String linea = null;
            int contadorLed = 0;
            int contadorDescarga = 0;
            int contadorLedDescarga = 0;

            while ((linea = br.readLine()) != null) {
                String[] arrayPalabras = linea.split(";");

                for (String palabra : arrayPalabras) {

                    if (palabra.equals("LED")) {
                        contadorLed++;
                    }

                    if (palabra.equals("DESCARGA")) {
                        contadorDescarga++;
                    }

                    if (palabra.equals("LED-DESCARGA")) {
                        contadorLedDescarga++;
                    }
                }
            }//fin while 

            System.out.println("hay de led: " + contadorLed + ", de descarga hay : " + contadorDescarga + " y de led-descarga: " + contadorLedDescarga);

            if (contadorLed > contadorDescarga && contadorLed > contadorLedDescarga) {
                System.out.println("la luz que más tiene es led con un total de " + contadorLed);
            }
            if (contadorDescarga > contadorLed && contadorDescarga > contadorLedDescarga) {
                System.out.println("la luz que más tiene es descarga con un total de " + contadorDescarga);
            }
            if (contadorLedDescarga > contadorLed && contadorLedDescarga > contadorDescarga) {
                System.out.println("la luz que más tiene es led-descarga con un total de " + contadorLedDescarga);
            }
            

        } catch (Exception e) {
            System.err.println("errooooooooooooooooooooooor");
            e.printStackTrace();
        }

    }//fin main
}//fin class
