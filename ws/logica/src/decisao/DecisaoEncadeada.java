package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Capturar
		 * -Nome disciplina
		 * -Nota 1
		 * -Nota 2
		 * -M�dia
		 * -Parab�s somente se > que 6
		 */


		/*Capturar tb a qnt de faltas
		s� sera aprovado abaixo de 20 faltas
		Media maior que 6, faltas abaixo de 20*/


		/* Maneira menos otimizada
		if (media >= 6  && faltas < 20) {
			System.out.println("Sua nota de "+ nomeDisciplina + " foi "+ media +" Parab�ns, voc� foi aprovado!");
		}	else if (media < 4 || faltas > 20) {
			System.out.println("Sua nota foi " + media + " Voc� foi reprovado!");
		}	else  if ((media > 4 && media < 6) && faltas < 20){
			System.out.println("Sua nota foi " + media + " Exame");
		} 
		 */

		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Entre com a qnt de faltas"));

		if (faltas > 20) {
			System.out.println("Voc� foi reprovado por faltas");
		}	else {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina").toUpperCase();
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = ((nota1 + nota2) / 2);
			if (media >= 6  ) {
				System.out.println("Sua nota de "+ nomeDisciplina + " foi "+ media +" Parab�ns, voc� foi aprovado!");
			}	else if (media < 4 ) {
				System.out.println("Sua nota foi " + media + " Voc� foi reprovado!");
			}	else  {
				System.out.println("Sua nota foi " + media + ", ter� que fazer Exame");
			}	
		}




		/*
		 * Usamos decis�es encadeadas quando analisamos dois dados distintos ( media e faltas)
		 * 
		 */

		// && --> AND
		// || --> OR








	}
}
