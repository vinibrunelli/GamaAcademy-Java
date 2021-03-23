package br.com.projeto1.modelo;

public class Produto {

	private int id;
	private String descricao;
	private Fabricante fabricante;
	private float valorVenda;
	private float valorCompra;
	private int qtde;

// ---------- Getters and setters ----------//
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
		
// ---------- Construtor Cheio ----------//	
	
public Produto(int id, String descricao, Fabricante fabricante, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

//---------- Construtor Vazio ----------//	
public Produto() {
	super();
}

// ---------- MÉTODO TRAZER O VALOR TOTAL POR PRODUTOS COM PREÇO DE VENDA ----------//
		public float totalEstoqueVenda() {
			return qtde*valorVenda;
		}

	public float totalEstoqueCompra() {
		return qtde*valorCompra;
	}
	
	public String verificarEstoque() {
		if (qtde <= 5) {
			return "Estoque baixo.";
		}else if (qtde > 5 && qtde<15) {
			return "Estoque regular.";	
		}else {
			return "Estoque alto.";
		}
		
	}
	
	
	
}

