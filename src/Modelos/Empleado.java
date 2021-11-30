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
public class Empleado {
    private String apellidos;
    private double horasExtra;
    private int id;
    private String nombre;
    private double salarioBase;

    public Empleado() {
    }
    
    public Empleado(String apellidos, double horasExtra, int id, String nombre, double salarioBase) {
        this.apellidos = apellidos;
        this.horasExtra = horasExtra;
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalarioBruto(){
        return (salarioBase + horasExtra);
    }
    
    public double calcularSeguro(){
        double total;
        total = (this.calcularSalarioBruto() * 7) / 100;
        return total;
    }
    
    public float calcularNeto(){
        float total;
        total = (float)calcularSalarioBruto() - (float)calcularSeguro();
        return total;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String toString() {
        return "Empleado: " + this.getNombre() + " " + this.getApellidos() + "\n" +
                "ID: " + this.getId() + "\n" +
                "Horas extra: " + this.getHorasExtra() + "\n" + 
                "Salario base: " + this.getSalarioBase() + "\n" +
                "Salario bruto: " + this.calcularSalarioBruto() + "\n" +
                "Salario neto: " + this.calcularNeto() + "\n" + 
                "Seguro social: " + this.calcularSeguro() + "\n" + 
                "--------------------------------------------------\n";
    }
}
