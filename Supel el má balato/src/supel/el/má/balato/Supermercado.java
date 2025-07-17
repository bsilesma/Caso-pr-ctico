/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supel.el.má.balato;

/**
 *
 * @author brand
 */

//Definición de variables
public class Supermercado {
    public String nomnbreSupermercado;
    public int codigoSupermercado;

    //Constructor vacío
    public Supermercado() {
    }

    //Constructor lleno
    public Supermercado(String nomnbreSupermercado, int codigoSupermercado) {
        this.nomnbreSupermercado = nomnbreSupermercado;
        this.codigoSupermercado = codigoSupermercado;
    }

    // Setters y Getters
    public String getNomnbreSupermercado() {
        return nomnbreSupermercado;
    }

    public void setNomnbreSupermercado(String nomnbreSupermercado) {
        this.nomnbreSupermercado = nomnbreSupermercado;
    }

    public int getCodigoSupermercado() {
        return codigoSupermercado;
    }

    public void setCodigoSupermercado(int codigoSupermercado) {
        this.codigoSupermercado = codigoSupermercado;
    }

    //toString
    @Override
    public String toString() {
        return "Supermercado{" + "nomnbreSupermercado=" + nomnbreSupermercado + ", codigoSupermercado=" + codigoSupermercado + '}';
    }
    
    
    
}
