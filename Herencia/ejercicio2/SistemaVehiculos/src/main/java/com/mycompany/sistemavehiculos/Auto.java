/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavehiculos;

/**
 *
 * @author yimid
 */
public class Auto extends Vehiculo{

    int numerosPuertas;
    public Auto(String placa, String marca, int anio, double tarifaBaseDiaria, int numerosPuertas) {
        super(placa, marca, anio, tarifaBaseDiaria);
        this.numerosPuertas = numerosPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("numero de puertas: " + numerosPuertas);
    }

}
