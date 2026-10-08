/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author yimid
 */
public class Gerente extends Empleado{
    protected double bono;
    public Gerente(String nombre, double salarioBase, double bono){
        super(nombre, salarioBase);
        this.bono = bono;
    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + bono;
    }
}
