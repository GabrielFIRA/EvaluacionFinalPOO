/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author DELL
 */
public class EmpleadoOficina extends Empleado{

    public EmpleadoOficina() {
    }

    public EmpleadoOficina(String apellidos, double horasExtra, int id, String nombre, double salarioBase) {
        super(apellidos, horasExtra, id, nombre, salarioBase);
    }    
    
}
