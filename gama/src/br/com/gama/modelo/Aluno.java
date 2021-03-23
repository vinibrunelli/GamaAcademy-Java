package br.com.gama.modelo;


/*
 Design pattern --> COnjunto de boas praticas para o desenvolvimento

 -	DTO (Data transfer object)--> é um pattern que descreve melhores praticas

 Regras:
 -1 TODOS os atributos devem ser privados;
 -2 CADA atributo deve possuir individualmente um metodo input e outro output;
 -3 TODA classe modelo deve possuir no minimo 2 construtores um vazio, e outro cheio(preenchendo tds atrb)

 - Modelo = model = beans (não feijão mas semente) = to = dto
 - Teste = implementação


 */


public class Aluno {

	//Atributos da classe
	private String nome;
	private int matricula;
	private String email;
	private String fone;
	private Endereco endereco;


	
	public Aluno(String nome, int matricula, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}


	public Aluno() {
		super();
	}


	public void setAll(Endereco endereco,String nome, int matricula, String email, String fone) {
		this.endereco = endereco;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		// this -> aponta que é o atributo privado (fone) pra ser = ao parametro (fone) que vai ser recebido.	
	}





	@Override
	public String toString() {
		return "Nome= " + nome + "\nMatricula=" + matricula + "\n Email=" + email + "\n Fone=" + fone
				+ "\n Endereco=" + endereco + "]";
	}





	// Métodos da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}







}
