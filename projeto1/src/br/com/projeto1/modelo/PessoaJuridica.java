package br.com.projeto1.modelo;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String contato;
	private String ie;
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", contato=" + contato + ", ie=" + ie + ", "+ super.toString() +" ]";
	}

	public PessoaJuridica(String nome, String email, String cnpj, String contato, String ie) {
		super(nome, email);
		this.cnpj = cnpj;
		this.contato = contato;
		this.ie = ie;
	}

	public PessoaJuridica() {
		super();
	}

	
// ========== Getter and setter ========== //	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}
	

	
	
	
	
}
