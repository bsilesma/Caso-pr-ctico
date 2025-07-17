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
public class Producto {
    int cantidadProducto;
    int precioProducto;
    String tipoProducto;
    int precioFinal;
    int gananciaEsperada;

    //Constructor vacío
    public Producto() {
    }

    //Constructor lleno
    public Producto(String tipoProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
        this.tipoProducto = tipoProducto;
        this.precioFinal = precioFinal;
        this.gananciaEsperada = gananciaEsperada;
    }

    //Setters y Getters
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    public int getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(int gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }

    //toString
    @Override
    public String toString() {
        return "Producto{" + "cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto + ", tipoProducto=" + tipoProducto + ", precioFinal=" + precioFinal + ", gananciaEsperada=" + gananciaEsperada + '}';
    }
    
    
}
