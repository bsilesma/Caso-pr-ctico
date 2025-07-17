/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supel.el.má.balato;

import java.nio.channels.Pipe;
import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
// En esta clase, se van a realizar todos los metodos
public class Utilidades {

    //Método para solicitar los datos del Supermercado
    public void solicitarDatosSupermercado(Supermercado[] vector) {
        Supermercado supermercado = new Supermercado();
        supermercado.setNomnbreSupermercado(JOptionPane.showInputDialog("Digite el nomnbre del supermercado: "));
        supermercado.setCodigoSupermercado(Integer.parseInt(JOptionPane.showInputDialog("Digite el código del supermercado")));
    }

    //Método para solicitar datos del empleado
    public void solicitarDatosEmpleado(Empleado[] vector) {
        Empleado empleado = new Empleado();
        empleado.setNombreEmpleado("Digite el nombre del empleado: ");
        empleado.setCedulaEmpleado(Integer.parseInt(JOptionPane.showInputDialog("Digite el número del empleado:")));
    }

    //Método para solicitar los productos
    public void solicitarProductos(Producto[] vector) {
        Producto producto = new Producto();
        for (int i = 0; i < vector.length; i++) {
            String tipoProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            vector[i] = new Producto(tipoProducto);

        }
    }

    //Metodo que imprime todo en consola
    public void imprimirDatos() {
        JOptionPane.showMessageDialog(null, "Nombre de supermercado: " );
        JOptionPane.showMessageDialog(null, "Codigo supermercado: ");
        JOptionPane.showMessageDialog(null, "Nombre del empleado: ");
        JOptionPane.showMessageDialog(null, "Código empleado");
        JOptionPane.showMessageDialog(null, "El código ni siquiera va a llegar a este punto...");
        
    }
}
