/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supel.el.má.balato;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class SupelElMáBalato {

    /**
     * @param args the command line arguments
     */
    
    //Main que solo llama metodos
    public static void main(String[] args) {
        // TODO code application logic here
        Supermercado supermercado[] = new Supermercado[5];
        Producto producto[] = new Producto[2];
        Empleado empleado[] = new Empleado[7];
        Utilidades util = new Utilidades();
        util.solicitarDatosSupermercado(supermercado);
        util.solicitarDatosEmpleado(empleado);
        util.solicitarProductos(producto);
        util.imprimirDatos();
        
        
        
    }

}
