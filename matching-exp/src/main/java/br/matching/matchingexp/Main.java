package br.matching.matchingexp;

public class Main {
	public static void main(String[] args) {
		Match match = new Match();
		
		Oferta ofertaCompra = new Oferta("PRODUTOX", Lado.COMPRA, 100l, 10.5);
		Oferta ofertaVenda = new Oferta("PRODUTOX", Lado.VENDA, 100l, 10.5);
		match.excutar(ofertaCompra, ofertaVenda);
		
		Oferta ofertaCompra2 = new Oferta("PRODUTOX", Lado.COMPRA, 100l, 10.5);
		Oferta ofertaVenda2 = new Oferta("PRODUTOX", Lado.VENDA, 100l, 11.5);
		match.excutar(ofertaCompra2, ofertaVenda2);
		
		Oferta ofertaCompra3 = new Oferta("PRODUTOX", Lado.COMPRA, 100l, 10.5);
		Oferta ofertaVenda3 = new Oferta("PRODUTOX", Lado.VENDA, 100l, 11.5);
		match.excutar(ofertaCompra3, ofertaVenda3);
		
		Oferta ofertaCompra4 = new Oferta("PRODUTOX", Lado.COMPRA, 100l, 11.5);
		Oferta ofertaVenda4 = new Oferta("PRODUTOX", Lado.VENDA, 100l, 12.5);
		match.excutar(ofertaCompra4, ofertaVenda4);
	}
}
