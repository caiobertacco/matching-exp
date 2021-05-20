package br.matching.matchingexp;

import br.matching.matchingexp.model.Lado;
import br.matching.matchingexp.model.Oferta;
import br.matching.matchingexp.service.Match;

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
		
		Oferta ofertaCompra5 = new Oferta("PRODUTOX", Lado.COMPRA, 200l, 11.5);
		Oferta ofertaVenda5 = new Oferta("PRODUTOX", Lado.VENDA, 100l, 11.5);
		match.excutar(ofertaCompra5, ofertaVenda5);
		
		Oferta ofertaCompra6 = new Oferta("PRODUTOX", Lado.COMPRA, 100l, 11.5);
		Oferta ofertaVenda6 = new Oferta("PRODUTOX", Lado.VENDA, 200l, 11.5);
		match.excutar(ofertaCompra6, ofertaVenda6);
	}
}
