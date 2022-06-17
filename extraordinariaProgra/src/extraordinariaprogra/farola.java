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
    solo nos interesan las columnas 2 y 9 (B y I).
    12 variables en total
     */
    private String A;
    private String tipo_B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String id_Distrito_I;
    private String J;
    private String K;
    private String L;

    /////////////////////////////////////
    //CONSTRUCTORES/////////////////////////////////////////////////////////////
    /////////////////////////////////////
    //el vacío siempre lo pongo por si acaso
    public farola() {
    }

    //el de con todo
    public farola(String A, String tipo_B, String C, String D, String E, String F, String G, String H, String id_Distrito_I, String J, String K, String L) {
        this.A = A;
        this.tipo_B = tipo_B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
        this.G = G;
        this.H = H;
        this.id_Distrito_I = Integer.parseInt(id_Distrito_I);
        this.J = J;
        this.K = K;
        this.L = L;
    }

    //solo tipo e id_distrito
    public farola(String tipo_B, String id_Distrito_I) {
        this.tipo_B = tipo_B;
        this.id_Distrito_I = id_Distrito_I;
    }

    /////////////////////////////////////
    //GETTERS Y SETTERS/////////////////////////////////////////////////////////
    /////////////////////////////////////
    
    
    public String getA() {
        return A;
    }

    public String getTipo_B() {
        return tipo_B;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }

    public String getE() {
        return E;
    }

    public String getF() {
        return F;
    }

    public String getG() {
        return G;
    }

    public String getH() {
        return H;
    }

    public String getId_Distrito_I() {
        return id_Distrito_I;
    }

    public String getJ() {
        return J;
    }

    public String getK() {
        return K;
    }

    public String getL() {
        return L;
    }
    
    /////////////////////////////////////
    //FUNCIONES/MÉTODOS/////////////////////////////////////////////////////////
    /////////////////////////////////////

    @Override
    public String toString() {
        return "farola de tipo = " + tipo_B + " tien id_Distrito = " + id_Distrito_I ;
    }
    

}//fin class
