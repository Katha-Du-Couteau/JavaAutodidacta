/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavehiculos;

/**
 *
 * @author yimid
 */
public class SistemaVehiculos {

    public static void main(String[] args) {
        
        Auto auto = new Auto("A123456", "Toyota", 2020, 50.0, 4);
        Camion camion = new Camion("C789012", "Volvo", 2010, 100.0, 3000);
        Motocicleta moto = new Motocicleta("M345678", "Honda", 2022, 50.0, 250);

        auto.mostrarInfo();
        System.out.println("Costo por 10 días: " + auto.calcularCostoAlquiler(10));
        System.out.println();

        camion.mostrarInfo();
        System.out.println("Costo por 10 días: " + camion.calcularCostoAlquiler(10));
        System.out.println();

        moto.mostrarInfo();
        System.out.println("Costo por 10 días: " + moto.calcularCostoAlquiler(10));
        
    }
}
