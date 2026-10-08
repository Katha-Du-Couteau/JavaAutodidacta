/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author yimid
 */
public class Vendedor extends Empleado{
    protected int ventas;
    protected double comision;
    
    public Vendedor(String nombre, double salarioBase, int ventas, double comision){
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventas = ventas;
    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + (ventas * comision);
    }
}
