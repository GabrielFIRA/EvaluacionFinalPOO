/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelos.EmpleadoProduccion;
import interfaces.IOperaciones;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class daoEmpleadoProduccion implements IOperaciones{

    public ArrayList<EmpleadoProduccion> lista = new ArrayList<>();
    
    /**
     * 
     * @param o 
     */
    
    @Override
    public void agregarRegistro(Object o) {
        lista.add((EmpleadoProduccion)o);
    }

    /**
     * 
     * @param bono
     * @param apellidos
     * @param horasExtra
     * @param id
     * @param nombre
     * @param salarioBase 
     */
    
    
    public void agregarRegistro(double bono, String apellidos, double horasExtra, int id, 
            String nombre, double salarioBase){
        lista.add(new EmpleadoProduccion(
                bono,
                apellidos, 
                horasExtra, 
                id, 
                nombre, 
                salarioBase));
        
    }
    @Override
    public void mostrarRegistro() {
        for(EmpleadoProduccion emp : lista){
            System.out.println(emp.toString());
        }
    }
    
}
