package br.matching.matchingexp;

public class Oferta {

	private String product;
	private Lado tipo;
	private long quantidade;
	private double preco;

	public Oferta(String product, Lado tipo, long quantidade, double preco) {
		this.product = product;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Lado getTipo() {
		return tipo;
	}

	public void setTipo(Lado tipo) {
		this.tipo = tipo;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
