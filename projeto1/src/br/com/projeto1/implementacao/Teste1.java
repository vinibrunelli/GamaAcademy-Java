package br.com.projeto1.implementacao;

import br.com.projeto1.modelo.Cliente;
import br.com.projeto1.modelo.Fabricante;
import br.com.projeto1.modelo.Produto;
import br.com.projeto1.modelo.Venda;
import br.com.projeto1.util.Magica;

public class Teste1 {
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				123,
				1000,
				new Cliente(
						Magica.s("Entre com a empresa"),
						"XPTP@gmail.com"
						),
				new Produto(						
						1,
						"Mouse",
						new Fabricante(
							"1234567",
							"HP",
							"2733-3344"
								),
						10,
						5,
						1000
						)
				);
		
		System.out.println(venda.toString());
		System.out.println("Resumo"+ venda.getResumo());
		System.out.println("Total estoque venda" + venda.getProduto().totalEstoqueVenda());
		System.out.println("Total estoque compra"+ venda.getProduto().totalEstoqueCompra());
		
		/*
		
		Produto produto = new Produto(
				i("Entre com o ID"),
,
				"Mouse",
				"HP",
				"50",
				"30",
				10
				);
	*/
	}
}
