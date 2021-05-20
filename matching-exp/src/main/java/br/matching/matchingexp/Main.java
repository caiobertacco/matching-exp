package br.matching.matchingexp;

public class Main {
	public static void main(String[] args) {
		Oferta ofertaCompra = new Oferta("PRODUTOX", Lado.COMPRA, 100l, 10.5);
		Oferta ofertaVenda = new Oferta("PRODUTOX", Lado.VENDA, 100l, 10.5);
		
		if (ofertaCompra.getProduct().equals(ofertaVenda.getProduct()) && 
				ofertaCompra.getQuantidade() == ofertaVenda.getQuantidade()) {
			if (ofertaCompra.getPreco() == ofertaVenda.getPreco()) {
				System.out.println("Novo negócio gerado:");
				System.out.println("Produto: " + ofertaCompra.getProduct());
				System.out.println("Preço: " + ofertaCompra.getPreco());
				System.out.println("Quantidade: " + ofertaCompra.getQuantidade());
			}
		}
	}
}
