/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

/**
 *
 * @author DS4i
 */
public class Conta {

	private String cliente;
	protected double saldo;

	public Conta() {
		saldo = 0;
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {

		return saldo;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public String imprimeSaldo() {
		return "SALDO = " + saldo;
	}

	public String imprimeSaldo(boolean comCliente) {
		if (comCliente) {
			return "Cliente: " + cliente + "\n" + imprimeSaldo();
		}
		return imprimeSaldo();
	}
}
