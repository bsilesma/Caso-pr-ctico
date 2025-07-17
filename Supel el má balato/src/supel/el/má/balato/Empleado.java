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
public class Empleado {
    private String nombreEmpleado;
    private int cedulaEmpleado;

    //Constructor vacío
    public Empleado() {
    }

    //Constructor lleno
    public Empleado(String nombreEmpleado, int cedulaEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
    }

    //Setters y Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" + "nombreEmpleado=" + nombreEmpleado + ", cedulaEmpleado=" + cedulaEmpleado + '}';
    }
    
    
       
        
    
}
