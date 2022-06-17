/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraordinariaprogra;

/**
 *
 * @author DAW
 */
public class farola {

    /////////////////////////////////////
    //VARIABLES/////////////////////////////////////////////////////////////////
    /////////////////////////////////////
    /*el documento con el que vamos a trabajar es como un excel, va por filas y
    columna, en total son 12 apartados(columnas). Tal y como dice el enunciado
    solo nos interesan las columnas 2 y 9 (B y I).2 variables en total
     */
    private String tipo = "";
    private String id_Distrito = "";

    /////////////////////////////////////
    //CONSTRUCTORES/////////////////////////////////////////////////////////////
    /////////////////////////////////////
    //el vacío siempre lo pongo por si acaso
    public farola() {
    }

    //el de con todo
    public farola(String tipo, String id_Distrito) {
        this.tipo = tipo;
        this.id_Distrito = id_Distrito;
    }

    /////////////////////////////////////
    //GETTERS Y SETTERS/////////////////////////////////////////////////////////
    /////////////////////////////////////
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId_Distrito() {
        return id_Distrito;
    }

    public void setId_Distrito(String id_Distrito) {
        this.id_Distrito = id_Distrito;
    }

    /////////////////////////////////////
    //FUNCIONES/MÉTODOS/////////////////////////////////////////////////////////
    /////////////////////////////////////
    @Override
    public String toString() {
        return "la farola " + " de tipo= " + tipo + " e id_Distrito =" + id_Distrito;
    }

}//fin class
