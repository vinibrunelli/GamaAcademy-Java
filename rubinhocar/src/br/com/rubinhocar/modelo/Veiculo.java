package br.com.rubinhocar.modelo;

public class Veiculo {
	
	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean status;
	private short velocidadeMaxima;
	private String modelo;
	
	/* Escreve na variável através de um método
	usa o void pq nao precisa mostrar msg nenhuma que escreveu
	*/
	
	public String retornaTudo () {
		return ("Montadora: " + montadora + "\nModelo: " + modelo + "\nValor: " + valor);
	}
	
	public void preencherBasico (boolean pStatus, short pVelocidadeMaxima) {
		status= pStatus;
		velocidadeMaxima = pVelocidadeMaxima;
	}
	/*
	public float retornaValor () {
		return valor;
	}
	*/
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}
	}
	/*
	public String retornaModelo () {
		return modelo;
	}
	*/
	public void preencherModelo (String param) {
		modelo = param.toUpperCase();
	}
	
	/*
	public String retornaMontadora () {
		return montadora;
	}
	*/
	
//	Informações de status e velocidade
	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "Desligado";
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
//	 Informaçoes sobre o veiculo
	public void preencherMontadora (String param) {
		montadora = param.toUpperCase();
	}

	
	public void acelerar (short velocidade) {
		if (status==true && (velocidadeAtual+velocidade)<=velocidadeMaxima) {
			velocidadeAtual+=velocidade;
		}
	}

	
	
}
