package br.com.exeheranca.implantacao;

import br.com.exeheranca.modelo.Cliente;
import br.com.exeheranca.modelo.Conta;
import br.com.exeheranca.modelo.Corrente;
import br.com.exeheranca.modelo.Poupanca;
import br.com.exeherenca.util.Magica;

public class TesteConta {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				Magica.i("Entre com o ID: "),
				Magica.s("Nome: "),
				Magica.s("CPF:"),
				Magica.s("Fone:")
				);
			
		Conta conta = new Conta();
		
		if(Magica.b("Abrir conta corrente?")==true) {
			conta = new Corrente (
					(short)Magica.i("Numero"),
					(byte)Magica.i("Digito"),
					(short)Magica.i("Agencia"),
					Magica.f("Saldo: "),
					cliente,
					Magica.f("Limite: "),
					Magica.f("Taxa: ")
					);
		} else {
			conta = new Poupanca (
					(short)Magica.i("Numero"),
					(byte)Magica.i("Digito"),
					(short)Magica.i("Agencia"),
					Magica.f("Saldo:"),
					cliente,
					Magica.f("Rendimento")
					);
		}
		
		System.out.println(conta.sacar(200));
		System.out.println(conta.verificarSaldo());
		System.out.println(conta);
		
		/*
		 * Para usar um metodo que dee acontecer somente na classe certa
		 */
		
		if (conta instanceof Corrente) {
			((Corrente) conta).aumentarLimite(15);
			System.out.println("Limite: "+((Corrente)conta).getLimite());
		}else if (conta instanceof Poupanca) {
			((Poupanca) conta).creditarRendimentos();
			System.out.println("Saldo após creditar rendimento: "+ conta.verificarSaldo());
		}
		
		
		
		
		
		
		
		
		
	}
}
