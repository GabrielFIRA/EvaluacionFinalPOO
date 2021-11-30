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
public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(double bono, String apellidos, double horasExtra, int id, String nombre, double salarioBase) {
        super(apellidos, horasExtra, id, nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    public float calcularNeto(){
        float total;
        total = (float)calcularSalarioBruto() - (float)calcularSeguro() + (float)bono;
        return total;
    }

    @Override
    public String toString() {
        return "Empleado: " + super.getNombre() + " " + super.getApellidos() + "\n" +
                "ID: " + super.getId() + "\n" +
                "Horas extra: " + super.getHorasExtra() + "\n" + 
                "Bono: " + this.bono + "\n" + 
                "Salario base: " + super.getSalarioBase() + "\n" +
                "Salario bruto: " + super.calcularSalarioBruto() + "\n" +
                "Salario neto: " + this.calcularNeto() + "\n" + 
                "Seguro social: " + super.calcularSeguro() + "\n" + 
                "--------------------------------------------------\n";
    }
    
    
    
    
}
