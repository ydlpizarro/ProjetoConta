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
public class ContaEspecial extends Conta{
	private double limite;
	public ContaEspecial(double saldo, double limite){
		super(saldo);
		this.limite=limite;
	}
	public double getLimite(){
		return limite;
	}
	public void setLimite(double limite){
		this.limite=limite;
	}
	@Override
	public boolean sacar(double valor){
		if(valor > saldo + limite){
			return false;
		}
		saldo = saldo - valor;
		return true;
	}
	@Override
	public String imprimeSaldo(){
		return "limtite = " + limite +"\n"+super.imprimeSaldo();
	}
}
