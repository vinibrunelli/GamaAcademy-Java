package br.com.projeto1.modelo;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	
	
//============= MEtodo para trazer somente RD e CPF===============/
	public String getDocumentos() {
		return cpf + "   " + rg;
	}
	
//========== TO STRING ========== //	

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + super.toString() + "]";
	}


//========== Construtor cheio ==========/

	public PessoaFisica(String nome, String email, String cpf, String rg) {
	super(nome, email);
	this.cpf = cpf;
	this.rg = rg;
}


//========== Construtor vazio ==========/
public PessoaFisica() {
	super();
}


public String getCpf() {
	return cpf;
}


//========== Getters and Setters ==========/
public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getRg() {
	return rg;
}


public void setRg(String rg) {
	this.rg = rg;
}



	
	
	
	
	
}
