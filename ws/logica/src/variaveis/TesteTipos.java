package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	public static void main(String[] args) {
		
		/*
		 Dados:
		 Nome do produto
		 Quantidade
		 Imposto
		 Valor unit�rio
		 
		 Final deve exibir
		  o valor acrescido de imposto
		  o valor do imposto isolado
		  o total com imposto
		  o total sem imposto
		 */
		
		String nomeProduto = JOptionPane.showInputDialog("Digite o produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		float imposto = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de imposto"));
		float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto"));
	
		float valorImpostoUnitario = valorProduto * (imposto/100);
		float produtoComImposto = valorProduto + valorImpostoUnitario;
		float totalComImposto = quantidade * produtoComImposto;
		float totalSemImposto = quantidade * valorProduto;
		
		 // valor acrescido de imposto
		System.out.printf("O Valor acrecido de imposto � R$ %.2f", produtoComImposto);
		 //valor do imposto isolado
		System.out.printf("O Valor do imposto � R$ %.2f", valorImpostoUnitario);
		 //total com imposto
		System.out.printf("O total com imposto � R$ %.2f", totalComImposto);
		 //total sem imposto
		System.out.printf("O total sem imposto � R$ %.2f", totalSemImposto);
		
		
		
		
		
		
		
		
	}

}
