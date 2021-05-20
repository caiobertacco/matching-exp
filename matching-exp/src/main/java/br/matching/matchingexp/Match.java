package br.matching.matchingexp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.javatuples.Pair;

public class Match {
	Map<Pair<String, Double>, List<Oferta>> oCompraMap = new HashMap<Pair<String,Double>, List<Oferta>>();
	Map<Pair<String, Double>, List<Oferta>> oVendaMap = new HashMap<Pair<String,Double>, List<Oferta>>();
	
	public void excutar(Oferta oCompra, Oferta oVenda) {
		if (Validador.isValid(oCompra, oVenda)) {
			System.out.println("Novo negócio gerado:");
			System.out.println("Produto: " + oCompra.getProduct());
			System.out.println("Preço: " + oCompra.getPreco());
			System.out.println("Quantidade: " + oCompra.getQuantidade());
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
