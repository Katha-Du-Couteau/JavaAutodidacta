/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentasbancarias;

/**
 *
 * @author yimid
 */
public class CuentasBancarias {
    private String numeroCuenta;
    private String titular;
    protected double saldo;

    public CuentasBancarias(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error al depositar");
            return saldo;
        } else {
            saldo = saldo + monto;
            return saldo;
        }
    }

    public double retirar(double monto) {
        if (monto > saldo || monto <= 0) {
            System.out.println("Error al retirar dinero");
            return saldo;
        } else {
            saldo = saldo - monto;
            return saldo;
        }
    }

    public void mostrarInfo() {
        System.out.println("Numero de cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: " + saldo);
    }
    public static void main(String[] args) {
        CuentaAhorro ahorro = new CuentaAhorro("AH-001", "Katha", 1000, 0.03);
        CuentaCorriente corriente = new CuentaCorriente("CO-001", "Jimmy", 200, 300);

        System.out.println("Cuenta de ahorro");
        ahorro.depositar(500);
        ahorro.aplicarInteres();
        ahorro.mostrarInfo();

        System.out.println();
        System.out.println("Cuenta corriente");
        corriente.retirar(400);
        corriente.retirar(200);
        corriente.mostrarInfo();
    }
}
