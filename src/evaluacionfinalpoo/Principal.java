/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinalpoo;

import Modelos.Empleado;
import Modelos.EmpleadoOficina;
import Modelos.EmpleadoProduccion;
import dao.daoEmpleadoOficina;
import dao.daoEmpleadoProduccion;

/**
 *
 * @author DELL
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado jose = new EmpleadoOficina("Perez", 50, 1, "Jose", 50);
        EmpleadoOficina juan = new EmpleadoOficina("Aluzin", 600, 2, "Juan", 3000);
        EmpleadoProduccion gabriel = new EmpleadoProduccion(10000000,
                "Merino", 1000000000, 3, "Gabriel", 10000000);
        
        daoEmpleadoProduccion dep = new daoEmpleadoProduccion();
        daoEmpleadoOficina deo = new daoEmpleadoOficina();
        
        dep.agregarRegistro(gabriel);
        deo.agregarRegistro(juan);
        deo.agregarRegistro(jose);
        
        deo.mostrarRegistro();
        dep.mostrarRegistro();
        
    }
    
}
