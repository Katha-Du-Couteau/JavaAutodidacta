/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author yimid
 */
public class Herencia {

    public static void main(String[] args) {
        
        Empleado e = new Empleado("Ana", 1000);
        Gerente g = new Gerente("Luis", 2000, 500);
        Vendedor v = new Vendedor("Marta", 1500, 2000, 0.05);
        
        e.mostrarInfo();
        g.mostrarInfo();
        v.mostrarInfo();
        
    }
}
