package decisao;

import javax.swing.JOptionPane;
// Crtl + Shift + O --> Importa o Joption

public class Lista2Exe4 {
	public static void main(String[] args) {

		/* Media de 3 notas
 trabalho lab - peso 2
  avaliacaoSemestral - peso 3
  exameFinal - peso5

	float trabalhoLab = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota do Trabalho de Lab"));
	float avaliacaoSemestral = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota da Avaliação semestral"));
	float exameFinal = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota do exame final"));
	float pesoTrabalholab = (float)0.20 * trabalhoLab;
		 */
		

		//Leia três valores inteiros e coloque em ordem crescente

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor 1"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor 1"));

		if (valor1 < valor2 && valor1 < valor3) {
			if (valor2 < valor3) {
				System.out.println(valor1);
				System.out.println(valor2);
				System.out.println(valor3);
			} else {
				System.out.println(valor1);
				System.out.println(valor3);
				System.out.println(valor2);
			} 
		} 

		if (valor3 < valor1 && valor3 < valor2) {
			if (valor1 < valor2) {
				System.out.println(valor3);
				System.out.println(valor1);
				System.out.println(valor2);
			} else {
				System.out.println(valor3);
				System.out.println(valor2);
				System.out.println(valor1);
			} 
		} 
		
		if (valor2 < valor1 && valor2 < valor3) {
			if (valor1 < valor3) {
				System.out.println(valor2);
				System.out.println(valor1);
				System.out.println(valor3);
			} else {
				System.out.println(valor2);
				System.out.println(valor3);
				System.out.println(valor1);
			} 
		}
	
//parse é quando muda o tipo de variavel
// por padrao inteiro é int e quebrado é double
//Cast é quando um tipo maior vai para um menor e dá pau


	}

}
