package decisao;

import javax.swing.JOptionPane;

public class Lista2Exe5 {
	public static void main(String[] args) {

		/* Media de 3 notas
 trabalho lab - peso 2
  avaliacaoSemestral - peso 3
  exameFinal - peso5
*/
	float trabalhoLab = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota do Trabalho de Lab"));
	float avaliacaoSemestral = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota da Avaliação semestral"));
	float exameFinal = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota do exame final"));
	float pesoTrabalholab = (float)0.20 * trabalhoLab;
	float pesoAvaliacao = (float)0.30 * avaliacaoSemestral;
	float pesoExame = (float)0.50 * exameFinal;
	float media = (pesoTrabalholab + pesoAvaliacao + pesoExame);
	
	if(media >=8) {
		System.out.println("Você tirou " + media + ("de média e ficou com A"));
	} else	if(media >=7) {
		System.out.println("Você tirou " + media + ("de média e ficou com B"));
	} else	if(media >=6) {
		System.out.println("Você tirou " + media + ("de média e ficou com C"));
	} else	if(media >=5) {
		System.out.println("Você tirou " + media + ("de média e ficou com D"));
	} else {
		System.out.println("Você tirou " + media + ("de média e ficou com E"));

	}






	}

}
