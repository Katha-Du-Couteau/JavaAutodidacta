/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentasbancarias;

/**
 *
 * @author yimid
 */
public class CuentaCorriente extends CuentasBancarias {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, titular, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public double retirar(double monto) {
        double nuevoSaldo = saldo - monto;

        if (nuevoSaldo < -limiteSobregiro || monto <= 0) {
            System.out.println("Error al retirar dinero");
            return saldo;
        } else {
            saldo = nuevoSaldo;
            return saldo;
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Limite de sobregiro: " + limiteSobregiro);
    }
}
