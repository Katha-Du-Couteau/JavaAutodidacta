/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentasbancarias;

/**
 *
 * @author yimid
 */
public class CuentaAhorro extends CuentasBancarias {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, String titular, double saldoInicial, double tasaInteres) {
        super(numeroCuenta, titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        double interes = getSaldo() * tasaInteres;
        depositar(interes);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tasa de interes: " + tasaInteres);
    }
}
