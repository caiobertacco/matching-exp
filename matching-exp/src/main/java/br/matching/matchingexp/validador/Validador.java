package br.matching.matchingexp.validador;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import br.matching.matchingexp.model.Oferta;

public class Validador {
	private static final BiFunction<Oferta, Oferta, Boolean> PRODUTO = (o1, o2) -> o1.getProduct().equals(o2.getProduct());
	private static final BiFunction<Oferta, Oferta, Boolean> PRECO = (o1, o2) -> o1.getPreco() == o2.getPreco();
	
	private static final List<BiFunction<Oferta, Oferta, Boolean>> VALIDADORES = Arrays.asList(PRODUTO, PRECO);
	
	public static boolean isValid(Oferta compra, Oferta venda) {
		return VALIDADORES.stream().allMatch(v -> v.apply(compra, venda));
	}
}
