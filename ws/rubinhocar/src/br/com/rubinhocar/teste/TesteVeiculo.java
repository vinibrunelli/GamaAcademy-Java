package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	public static void main(String[] args) {
		
		/* Instanciar um objeto */
		 
		Veiculo carro = new Veiculo();
		
		carro.preencherMontadora(JOptionPane.showInputDialog("Entre com a montadora"));
		carro.preencherModelo(JOptionPane.showInputDialog("Entre como modelo"));
		carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor")));
		
		System.out.println(carro.retornaTudo());
	//	System.out.println(carro.retornaModelo());
	//	System.out.println(carro.retornaValor());
	//	JOptionPane.showMessageDialog(carro.retornaTudo(), message);
		
		
		
		
	}

}
