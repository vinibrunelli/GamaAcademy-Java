package br.com.exeheranca.modelo;

public class Poupanca extends Conta {
	
	private float rendimento;


	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	
	public Poupanca() {
		super();
	}


	public float getrendimento() {
		return rendimento;
	}

	public void setrendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + super.toString() +"]";
	}
	
	public void creditarRendimentos() {
		super.setSaldo(getSaldo() + getSaldo()* (rendimento/100));
	}

}
