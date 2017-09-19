package br.com.db1.exercicios.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.exercicios.ExerciciosColecao;

public class ExerciciosColecaoTest {
	ExerciciosColecao colec;

	@Before
	public void before() {
		colec = new ExerciciosColecao();

	}
	@Test
	public void getVogaisTest() {
		Set<String> vogais = colec.getVogais("Fusca");

		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("f"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));
	}

	@Test
	public void getConsoantesTest() {
		Set<String> consoantes = colec.getConsoantes("Fusca");

		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
	}

	@Test
	public void excluirValorTest() {
		List<Integer> valores = new ArrayList<>();
		for (Integer i = 0; i < 10; i++) {
			valores.add(i);
		}
		List<Integer> novaLista = colec.excluirValor(valores);
		
		Assert.assertFalse(novaLista.contains(2));

	}
	
	
	@Test
	public void copiarListaTest() {
		List<String> listaUm = new ArrayList<>();
		List<String> listaDois = new ArrayList<>();
		listaUm.add("Um");
		listaUm.add("Dois");
		listaUm.add("Tres");
		listaUm.add("Quatro");
		listaUm.add("Cinco");
		listaUm.add("Seis");
		listaUm.add("Sete");
		listaUm.add("Oito");
		listaUm.add("Nove");
		listaUm.add("Dez");
		
		
		
		
		
		
	}
	
}


