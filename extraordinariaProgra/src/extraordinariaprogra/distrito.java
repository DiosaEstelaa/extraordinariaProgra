/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraordinariaprogra;

/**
 *
 * @author DAW
 */
public class distrito {

/////////////////////////////////////
    //VARIABLES/////////////////////////////////////////////////////////////////
    /////////////////////////////////////
    /*el documento con el que vamos a trabajar es como un excel, va por filas y
    columna, en total son 8 apartados(columnas). Tal y como dice el enunciado
    solo nos interesan las columnas 2 y 9 (E y F).
    8 variables en total
     */
    private String A_2;
    private String B_2;
    private String C_2;
    private String D_2;
    private String E_ID;
    private String F_NOMBRE;
    private String G_2;
    private String H_2;
    private String I_2;

    /////////////////////////////////////
    //CONSTRUCTORES/////////////////////////////////////////////////////////////
    /////////////////////////////////////
    //el vacío siempre lo pongo por si acaso
    public distrito() {
    }

    //el de con todo
    public distrito(String A_2, String B_2, String C_2, String D_2, String E_ID, String F_NOMBRE, String G_2, String H_2, String I_2) {
        this.A_2 = A_2;
        this.B_2 = B_2;
        this.C_2 = C_2;
        this.D_2 = D_2;
        this.E_ID = E_ID;
        this.F_NOMBRE = F_NOMBRE;
        this.G_2 = G_2;
        this.H_2 = H_2;
        this.I_2 = I_2;
    }

    /////////////////////////////////////
    //GETTERS Y SETTERS/////////////////////////////////////////////////////////
    /////////////////////////////////////
    public String getA_2() {
        return A_2;
    }

    public void setA_2(String A_2) {
        this.A_2 = A_2;
    }

    public String getB_2() {
        return B_2;
    }

    public void setB_2(String B_2) {
        this.B_2 = B_2;
    }

    public String getC_2() {
        return C_2;
    }

    public void setC_2(String C_2) {
        this.C_2 = C_2;
    }

    public String getD_2() {
        return D_2;
    }

    public void setD_2(String D_2) {
        this.D_2 = D_2;
    }

    public String getE_ID() {
        return E_ID;
    }

    public void setE_ID(String E_ID) {
        this.E_ID = E_ID;
    }

    public String getF_NOMBRE() {
        return F_NOMBRE;
    }

    public void setF_NOMBRE(String F_NOMBRE) {
        this.F_NOMBRE = F_NOMBRE;
    }

    public String getG_2() {
        return G_2;
    }

    public void setG_2(String G_2) {
        this.G_2 = G_2;
    }

    public String getH_2() {
        return H_2;
    }

    public void setH_2(String H_2) {
        this.H_2 = H_2;
    }

    public String getI_2() {
        return I_2;
    }

    public void setI_2(String I_2) {
        this.I_2 = I_2;
    }

    /////////////////////////////////////
    //FUNCIONES/MÉTODOS/////////////////////////////////////////////////////////
    /////////////////////////////////////
}//fin class
