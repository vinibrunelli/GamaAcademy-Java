package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo2 {
	public static void main(String[] args) {

/*
 Mais utilizado quando nao precisa de usuario entrar com as interações
 por exemplo em um arquivo de log
 
 Sintaxe:
 (Contador e valor inicial; Condição (ate quando) ; Como vai o incremento)
 
 */
		
		short tabuada =Short.parseShort(JOptionPane.showInputDialog("Entre com a tabuada"));
		
		for (int contador=1;contador<11;contador+=1) {
			System.out.println(tabuada + "x" + contador +"=" + (tabuada*contador));
		}
		
		
		
		
		


		}
	}
