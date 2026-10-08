/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculos;

/**
 *
 * @author yimid
 */
public class Camion extends Vehiculo{
    double capacidadCarga;

    public Camion(String placa, String marca, int anio, double tarifaBaseDiaria, double capacidadCarga) {
        super(placa, marca, anio, tarifaBaseDiaria);
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public double calcularCostoAlquiler(int dias) {
        double costoBase = super.calcularCostoAlquiler(dias);
        double toneladas = capacidadCarga / 1000;
        double recargo = costoBase * (0.05 * toneladas);
        return costoBase + recargo;
    }
}
