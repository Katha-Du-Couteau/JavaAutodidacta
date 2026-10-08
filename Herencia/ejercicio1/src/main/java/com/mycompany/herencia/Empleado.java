/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author yimid
 */
public class Empleado {
    
    private String nombre;
    protected double salarioBase;
    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double calcularSalario(){
        return this.salarioBase;
    }
    public void mostrarInfo(){
        System.out.println("nombre: " + this.nombre + " " + "salario base: " + this.salarioBase);
    } 
}
