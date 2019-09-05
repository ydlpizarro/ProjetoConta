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
		Conta conta = new ContaEspecial(0,1000);
		Integer opcao;
		Integer[] valores = {1, 2, 3, 4};
		conta.setCliente(JOptionPane.
				showInputDialog("Entre com o nome do cliente:"));
		do {

			opcao = (Integer) JOptionPane.showInputDialog(null, "Escolha a opçao: \n(1) Deposita:\n" + "(2) Sacar:\n(3) Saldo\n(4)Sair", "Opçao", JOptionPane.QUESTION_MESSAGE, null, valores, 1);
			switch (opcao) {
				case 1:
					conta.depositar(Double.parseDouble(JOptionPane.
							showInputDialog("Entre com o valor de depositar")));
					break;
				case 2:
					if (!conta.sacar(Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de saque")))) {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente!!!");
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, conta.imprimeSaldo(true));
					break;
				default:
					JOptionPane.showMessageDialog(null, "BYE!!!");
					break;

			}
		} while (opcao != 4);

	}

}
