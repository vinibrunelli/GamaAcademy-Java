package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {
	public static void main(String[] args) {
		
		/*** pegando email com laço de arroba***
		 
		String email = JOptionPane.showInputDialog("Entre com seu e-mail:");
		
		while (email.contains("@") == false) {
			 email = JOptionPane.showInputDialog("Entre com seu e-mail com @:");
		}
		System.out.println("Seu usuário é" + email.substring(0,email.indexOf("@")));
			 */
		
		String nome = JOptionPane.showInputDialog("Entre com seu nome:");
		while (nome.length() < 3 || nome.length() > 15 ) {
			nome = JOptionPane.showInputDialog("Entre com seu nome entre 3 e 15 caracteres:");
		}
		
		
		
		
		
		
		
	}
}
