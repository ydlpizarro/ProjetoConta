/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

import javax.swing.JOptionPane;

/**
 *
 * @author DS4i
 */
public class ProjetoConta {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Conta conta = new Conta();

		conta.setCliente(JOptionPane.
				showInputDialog("Entre com o nome do cliente:"));
		conta.depositar(Double.parseDouble(JOptionPane.
				showInputDialog("Entre com o valor de depositar")));

		if (!conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Entra com o valor de saque:")))) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
		JOptionPane.showMessageDialog(null, conta.imprimeSaldo(true));
	}

}
