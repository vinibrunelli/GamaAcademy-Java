package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	public static void main(String[] args) {
		/*
		 * Capturar nome e idade
		 * Obrigatorio = acima de 18
		 * Facultativo = 16 1 18
		 * Proibido = <16
		 */
		
		String nome = JOptionPane.showInputDialog("Nome completo");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		if (idade < 16) {
			System.out.println(nome + " voc� n�o pode votar");
		}
		if (idade >= 16 && idade < 18) {
			System.out.println(nome + " seu voto � facultativo");
		}
		if (idade >= 18 && idade < 70) {
			System.out.println(nome + " seu voto � obrigat�rio!");
		}	else {
			
			System.out.println("Voc� j� pode descansar querido");
			} 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
