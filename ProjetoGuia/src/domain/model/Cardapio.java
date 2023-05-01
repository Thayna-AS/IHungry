package domain.model;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Map;

public class Cardapio {

	public static ArrayList<Produto> Lanches = new ArrayList<Produto>() {
		{
			add(new Produto("CHICKEN BARBECUE BURGER",
					"Pão de batata com manteiga, com 140 g de frango empanado,temperado com molho barbecue,cebola roxa fatiada,tomate fatiado, alface americana e um molho caprichado de picles",
					"Lanches", 24.90, 1));
			add(new Produto("CLASSIC BACON BURGER",
					"Pão de batata com manteiga, com 120 g de hambúrguer de carne, mix de cebola roxa e picles picados,crocante,sal temperado com pimenta e o molho especial com picles,além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado. ",
					"Lanches", 29.90, 2));
			add(new Produto("CHEESE BACON BURGER",
					"Pão de batata com manteiga, com 120 g de hambúrguer de carne,mix de cebola roxa e picles picados,crocante,sal temperado com pimenta e o molho especial com picles,além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado. ",
					"Lanches", 27.90, 3));
			add(new Produto("BIB´S BURGER PLANT",
					"Pão de batata, 113 g de hambúrguer vegetal, tomate fatiado,alface americana,picles e um saboroso molho de tomatetemperado,Contém ovo na composição do pão. ",
					"Lanches", 24.90, 4));
			add(new Produto("TRADICIONAL ROSBIFE",
					"Pão sírio, dois ovos, alface americana, tomate, maionese especial,cremely cheddar cremoso e rosbife, é claro!",
					"Lanches", 28.90, 5));
		}
	};

	// criar as bebidas e armazenar nesta propriedade
	public static ArrayList<Produto> Bebidas = new ArrayList<Produto>() {
		{
			add(new Produto("água", "Água fresca Bonafont.", "Bebidas", 5.00, 1));
			add(new Produto("Chá", "Chá Matte sabores", "Bebidas", 5.00, 2));
			add(new Produto("Refrigerante Lata", "Coca-cola, Pepsi, Guaraná, Fanta", "Bebidas", 7.00, 3));
			add(new Produto("Heineken", "600ml", "Bebidas", 15.00, 4));
			add(new Produto("Brahma", "Duplo Malte 600ml", "Bebidas", 12.00, 5));
			add(new Produto("Skol", "600ml", "Bebidas", 10.00, 6));
			add(new Produto("Colmeia Drinks", "Destilado com água de coco e Mel", "Bebidas", 10.00, 7));
		}
	};

	// criar as sobremesas e armazenar nesta propriedade
	public static ArrayList<Produto> Sobremesas = new ArrayList<Produto>() {
		{
			add(new Produto("Petit Gateau",
					"pequeno bolo de chocolate com casca e recheio cremoso servido com sorvete de creme.", "Sobremesas",
					22.00, 1));
			add(new Produto("Torta de Maçã", "Deliciosa torta de Maçã Servida com Sorvete de Canela", "Sobremesas",
					25.00, 2));
			add(new Produto("Açai", "Açai na Taça com acompanhamentos à escolha do cliente.", "Sobremesas", 17.00, 3));
		}
	};

	public static ArrayList<Produto> Entradas = new ArrayList<Produto>() {
		{
			add(new Produto("Coxinha", "Deliciosa coxinha tradicional.", "Entradas", 8.00, 1));
			add(new Produto("Pastel de queijo", "Sabores: Pizza, Queijo, Carne.", "Entradas", 12.00, 2));
			add(new Produto("Pastel de carne", "Sabores: Pizza, Queijo, Carne.", "Entradas", 12.00, 3));
			add(new Produto("Pão de queijo", "Tradicional Pão de Queijo quentinho.", "Entradas", 5.00, 4));
			// Adicionar demais entradas.
		}
	};

	// percorre a lista de Lanches e printa elas
	public void MostrarLanches() {
		for (Produto item : Lanches) {
			System.out.println(item.Id + " " + item.Nome + " -------- " + item.Valor);
		}
	}

	public void MostrarBebidas() {
		for (Produto item : Bebidas) {
			System.out.println(item.Id + " " + item.Nome + " -------- " + item.Valor);
		}
	}

	public void MostrarSobremesas() {
		for (Produto item : Sobremesas) {
			System.out.println(item.Id + " " + item.Nome + " -------- " + item.Valor);
		}
	}

	public static void MostraEntradas() {
		for (Produto item : Entradas) {

			System.out.println(item.Id + " " + item.Nome + "---------" + item.Valor);
		}
	}

	// Percorre a listas de key and value (key == Produto.Id, value = quantidade
	// escolhida pelo usuário) e realiza a contagem do valor total
	public void GerarNotaFiscal(Map<Integer, Integer> lanches, Map<Integer, Integer> bebidas,
			Map<Integer, Integer> sobremesas, Map<Integer, Integer> entradas) {
		double valorTotal = 0;
		int quantidade = 0;

		for (Produto item : Lanches) {
			if (lanches.containsKey(item.Id)) {
				quantidade = lanches.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade " + quantidade);
			}
		}

		for (Produto item : Bebidas)
			if (bebidas.containsKey(item.Id)) {
				quantidade = bebidas.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade " + quantidade);
			}

		for (Produto item : Sobremesas) {
			if (sobremesas.containsKey(item.Id)) {
				quantidade = sobremesas.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade " + quantidade);
			}
		}

		for (Produto item : Entradas) {
			if (entradas.containsKey(item.Id)) {
				quantidade = entradas.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade " + quantidade);
			}
		}

		System.out.printf("Total R$ %.2f", valorTotal);
	}

}
