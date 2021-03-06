package br.com.exeheranca.modelo;

import javax.swing.JOptionPane;

public class Conta {
	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	//Criando os metodos especificos das classes filhas, para evitar de dar pau no backend caso chame sem ter
	//nesse caso vai acontecer nada
	
	public void creditarRendimento() {}
	public void debitarTaxa() {}
	public void aumentarLimite(float porcentagem) {}
	
	
	
	
	
	//--- Construtores---//
		public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Conta() {
		super();
	}

	
	//---	gets and sets	---//
	
	
	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public byte getDigito() {
		return digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
	}

	public short getAgencia() {
		return agencia;
	}

	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	//---	to string	---/
	
	
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}
	
	public boolean depositar(float deposito) {
		if (deposito>0) {
		saldo += deposito;
		return true;
	}else
		return false;
	}

	public boolean sacar(float sacar) {
		if(saldo>=sacar) {
		saldo = saldo - sacar;
		return true;
	}else
		return false;
	
	}
	public float verificarSaldo() {
		return saldo;
	}


	

}
