
package br.com.db1.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExerciciosColecao {
	List<String> vogais2 = new ArrayList<>();

	public ExerciciosColecao() {
		vogais2.add("a");
		vogais2.add("e");
		vogais2.add("i");
		vogais2.add("o");
		vogais2.add("u");
	}

	public Set<String> getVogais(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letra = nomeParametro.substring(x, x + 1);
			if (vogais2.contains(letra)) {
				vogaisEncontradas.add(letra);
			}
		}

		return vogaisEncontradas;
	}

	public Set<String> getConsoantes(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> consoantes = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letra = nomeParametro.substring(x, x + 1);
			if (!vogais2.contains(letra)) {
				consoantes.add(letra);
			}
		}

		return consoantes;
	}

	public List<Integer> excluirValor(List<Integer> valores) {

		valores.remove(2);

		return valores;

	}

	public List<Integer> multiplosDeTres(List<Integer> valores) {
		return null;
	}

	public void copiarListaNaOutra(List<String> listaUm) {
		
		List<String> listaDois = listaUm;
		System.out.println(listaDois);
	}
}
