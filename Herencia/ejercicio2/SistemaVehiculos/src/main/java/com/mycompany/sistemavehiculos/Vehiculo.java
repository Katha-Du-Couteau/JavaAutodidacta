/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculos;

/**
 *
 * @author yimid
 */
public class Vehiculo {
    
    private String placa;
    private String marca;
    private int anio;
    private double tarifaBaseDiaria;

    public Vehiculo(String placa, String marca, int anio, double tarifaBaseDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.tarifaBaseDiaria = tarifaBaseDiaria;
    }
    
    public String getPlaca(){
        return placa;
    }
        public String getMarca(){
        return marca;
    }
        public int getAnio(){
        return anio;
    }
        public double getTariaBaseDiaria(){
        return tarifaBaseDiaria;
    }
        
    public double calcularCostoAlquiler(int dias){
        return tarifaBaseDiaria * dias;
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + marca + "Placa: " + placa + "anio: " + anio + "tarifaBaseDiaria: " + tarifaBaseDiaria);
    }
}
