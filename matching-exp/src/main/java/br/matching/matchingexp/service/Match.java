package br.matching.matchingexp.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.javatuples.Pair;

import br.matching.matchingexp.model.Oferta;
import br.matching.matchingexp.validador.Validador;

public class Match {
	Map<Pair<String, Double>, List<Oferta>> oCompraMap = new HashMap<Pair<String,Double>, List<Oferta>>();
	Map<Pair<String, Double>, List<Oferta>> oVendaMap = new HashMap<Pair<String,Double>, List<Oferta>>();
	
	public void excutar(Oferta oCompra, Oferta oVenda) {
		if (Validador.isValid(oCompra, oVenda)) {
			if (oCompra.getQuantidade() < oVenda.getQuantidade()) {
				oVenda.setQuantidadeSobra(oVenda.getQuantidade() - oCompra.getQuantidade());
				
				Pair<String, Double> keyVenda = new Pair<String, Double>(oVenda.getProduct(), oVenda.getPreco());
				oVendaMap.putIfAbsent(keyVenda, new LinkedList<Oferta>());
				oVendaMap.get(keyVenda).add(oVenda);
			} else if (oCompra.getQuantidade() > oVenda.getQuantidade()) {
				oCompra.setQuantidadeSobra(oCompra.getQuantidade() - oVenda.getQuantidade());
				
				Pair<String, Double> keyCompra = new Pair<String, Double>(oCompra.getProduct(), oCompra.getPreco());
				oCompraMap.putIfAbsent(keyCompra, new LinkedList<Oferta>());
				oCompraMap.get(keyCompra).add(oCompra);
			}
			
			System.out.println("--------------------");
			System.out.println("Novo negócio gerado:");
			System.out.println("Produto: " + oCompra.getProduct());
			System.out.println("Preço: " + oCompra.getPreco());
			System.out.println("Quantidade: " + oCompra.getQuantidadeSobra());
			System.out.println("--------------------");
		} else {
			Pair<String, Double> keyCompra = new Pair<String, Double>(oCompra.getProduct(), oCompra.getPreco());
			oCompraMap.putIfAbsent(keyCompra, new LinkedList<Oferta>());
			oCompraMap.get(keyCompra).add(oCompra);
			
			Pair<String, Double> keyVenda = new Pair<String, Double>(oVenda.getProduct(), oVenda.getPreco());
			oVendaMap.putIfAbsent(keyVenda, new LinkedList<Oferta>());
			oVendaMap.get(keyVenda).add(oVenda);
		}
		
		System.out.println("-----");
		System.out.println("Book: ");
		System.out.println("Compra");
		oCompraMap.forEach((a,b) -> {
			System.out.println("Produto: " + a.getValue0());
			System.out.println("Preço: " + a.getValue1());
			b.stream().forEach(o -> System.out.println(o));
		});
		
		System.out.println("-----");
		System.out.println("Venda");
		oVendaMap.forEach((a,b) -> {
			System.out.println("Produto: " + a.getValue0());
			System.out.println("Preço: " + a.getValue1());
			b.stream().forEach(o -> System.out.println(o));
		});
	}
}
