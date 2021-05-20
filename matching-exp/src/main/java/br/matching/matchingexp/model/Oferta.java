package br.matching.matchingexp.model;

public class Oferta {

	private static int idCounter = 0;
	
	private int id;
	private String product;
	private Lado tipo;
	private long quantidade;
	private long quantidadeSobra;
	private double preco;

	public Oferta(String product, Lado tipo, long quantidade, double preco) {
		this.product = product;
		this.tipo = tipo;
		this.quantidade = quantidade;
		this.quantidadeSobra = quantidade;
		this.preco = preco;
		
		this.id = ++idCounter;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public long getQuantidadeSobra() {
		return quantidadeSobra;
	}

	public void setQuantidadeSobra(long quantidadeSobra) {
		this.quantidadeSobra = quantidadeSobra;
	}

	@Override
	public String toString() {
		return "Oferta [id=" + id + ", product=" + product + ", tipo=" + tipo + ", quantidade=" + quantidade
				+ ", quantidadeSobra=" + quantidadeSobra + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + (int) (quantidade ^ (quantidade >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

}
