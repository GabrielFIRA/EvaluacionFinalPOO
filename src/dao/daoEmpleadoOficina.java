/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelos.EmpleadoOficina;
import interfaces.IOperaciones;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class daoEmpleadoOficina implements IOperaciones{

    private ArrayList<EmpleadoOficina> lista = new ArrayList<>();
    
    /**
     * 
     * @param o 
     */
    @Override
    public void agregarRegistro(Object o) {
        lista.add((EmpleadoOficina)o);
    }

    /**
     * 
     * @param apellidos
     * @param horasExtra
     * @param id
     * @param nombre
     * @param salarioBase 
     */
    public void agregarRegistro(String apellidos, double horasExtra, int id, 
            String nombre, double salarioBase){
        lista.add(new EmpleadoOficina(
                apellidos, 
                horasExtra, 
                id, 
                nombre, 
                salarioBase));
        
    }
    
    @Override
    public void mostrarRegistro() {
        for(EmpleadoOficina emp : lista){
            System.out.println(emp.toString());
        }
    }
    
}