package domain.model;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Map;

public class Cardapio {

	public static ArrayList<Produto> Lanches = new ArrayList<Produto>() {
		{
			add(new Produto("CHICKEN BARBECUE BURGER",
					"Pão de batata com manteiga, com 140 g de frango empanado,temperado com molho barbecue,cebola roxa fatiada,tomate fatiado, alface americana e um molho caprichado de picles",
					"Lanches", 24.90, 5));
			add(new Produto("CLASSIC BACON BURGER",
					"Pão de batata com manteiga, com 120 g de hambúrguer de carne, mix de cebola roxa e picles picados,crocante,sal temperado com pimenta e o molho especial com picles,além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado. ",
					"Lanches", 29.90, 6));
			add(new Produto("CHEESE BACON BURGER",
					"Pão de batata com manteiga, com 120 g de hambúrguer de carne,mix de cebola roxa e picles picados,crocante,sal temperado com pimenta e o molho especial com picles,além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado. ",
					"Lanches", 27.90, 7));
			add(new Produto("BIB´S BURGER PLANT",
					"Pão de batata, 113 g de hambúrguer vegetal, tomate fatiado,alface americana,picles e um saboroso molho de tomatetemperado,Contém ovo na composição do pão. ",
					"Lanches", 24.90, 8));
			add(new Produto("TRADICIONAL ROSBIFE",
					"Pão sírio, dois ovos, alface americana, tomate, maionese especial,cremely cheddar cremoso e rosbife, é claro!",
					"Lanches", 28.90, 9));
		}
	};

	// criar as bebidas e armazenar nesta propriedade
	public static ArrayList<Produto> Bebidas = new ArrayList<Produto>() {
		{
			add(new Produto("água", "Água fresca Bonafont.", "Bebidas", 5.00, 10));
			add(new Produto("Chá", "Chá Matte sabores", "Bebidas", 5.00, 11));
			add(new Produto("Refrigerante Lata", "Coca-cola, Pepsi, Guaraná, Fanta", "Bebidas", 7.00, 12));
			add(new Produto("Heineken", "600ml", "Bebidas", 15.00, 13));
			add(new Produto("Brahma", "Duplo Malte 600ml", "Bebidas", 12.00, 14));
			add(new Produto("Skol", "600ml", "Bebidas", 10.00, 15));
			add(new Produto("Colmeia Drinks", "Destilado com água de coco e Mel", "Bebidas", 10.00, 16));
		}
	};

	// criar as sobremesas e armazenar nesta propriedade
	public static ArrayList<Produto> Sobremesas = new ArrayList<Produto>() {
		{
			add(new Produto("Petit Gateau",
					"pequeno bolo de chocolate com casca e recheio cremoso servido com sorvete de creme.", "Sobremesas",
					22.00, 17));
			add(new Produto("Torta de Maçã", "Deliciosa torta de Maçã Servida com Sorvete de Canela", "Sobremesas",
					25.00, 18));
			add(new Produto("Açai", "Açai na Taça com acompanhamentos à escolha do cliente.", "Sobremesas", 17.00, 19));
		}
	};

	public static ArrayList<Produto> Entradas = new ArrayList<Produto>() {
		{
			add(new Produto("Coxinha", "Deliciosa coxinha tradicional.", "Entradas", 8.00, 1));
			add(new Produto("Pastel de carne", "Sabores: ,.", "Entradas", 12.00, 2));
			add(new Produto("Pastel de queijo", "Sabores:, , Carne.", "Entradas", 12.00, 3));
			add(new Produto("Pão de queijo", "Tradicional Pão de Queijo quentinho.", "Entradas", 5.00, 4));
			// Adicionar demais entradas.
		}
	};

	// percorre a lista de Lanches e printa elas
	public void MostrarLanches(Map<Integer, Integer> lanches) {
		double valorTotal = 0;
		int quantidade = 0;

		for (Produto item : Cardapio.Lanches) {
			if (lanches.containsKey(item.Id)) {
				quantidade = lanches.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Id);
			}
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
	
	}


