package br.com.projeto1.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto1.modelo.Cliente;
import br.com.projeto1.modelo.PessoaFisica;
import br.com.projeto1.modelo.PessoaJuridica;

public class TesteClienteHeranca {
	public static void main(String[] args) {
		
		//Criando pela sub e instanciando pela sub
		//PessoaFisica pf = new PessoaFisica();
		
		//Criando pela super e instanciando pela sub
		//Cliente cli = new PessoaFisica();
		
		Cliente cliente = new Cliente();
		
		if (JOptionPane.showInputDialog("Digite <F> ou <J>").toUpperCase().contentEquals("F")) {
			cliente = new PessoaFisica(
					"Nome PF",
					"pf@gmail.com",
					"cpf-pf",
					"rg-pf"
					);
				
		}else {
			cliente = new PessoaJuridica(
					"Nome-pJuridica",
					"Juridica@gmail.com",
					"CNPJ-454645647674567",
					"Contato-PJ-Prime",
					"IE-24365756868"
					);
		}
		
		System.out.println(cliente.toString());
		System.out.println(cliente.getDocumentos());
	}
}
