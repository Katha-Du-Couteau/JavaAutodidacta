 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculos;

/**
 *
 * @author yimid
 */
public class Motocicleta extends Vehiculo{
    
    int cilindraje;

    public Motocicleta(String placa, String marca, int anio, double tarifaBaseDiaria, int cilindraje) {
        super(placa, marca, anio, tarifaBaseDiaria);
        this.cilindraje = cilindraje;
    }
    @Override
    public double calcularCostoAlquiler(int dias){
        if(dias >= 7){
            double costoBase = super.calcularCostoAlquiler(dias);
            double descuento = costoBase * 0.10;
            double total = costoBase - descuento;
            return total;
        }else{
            return super.calcularCostoAlquiler(dias);
        }
    }
    
}
