package domain.model;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Map;

public class Cardapio {
	public static ArrayList<Produto> Lanches = new ArrayList<Produto>() {
		{
			add(new Produto("CHICKEN BARBECUE BURGER", "Pão de batata com manteiga, com 140 g de frango empanado,temperado com molho barbecue,cebola roxa fatiada,tomate fatiado, alface americana e um molho caprichado de picles", "Lanches", 24.90, 1));
			add(new Produto("CLASSIC BACON BURGER", "Pão de batata com manteiga, com 120 g de hambúrguer de carne, mix de cebola roxa e picles picados,crocante,sal temperado com pimenta e o molho especial com picles,além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado. ", "Lanches", 29.90, 2));
			add(new Produto("CHEESE BACON BURGER", "Pão de batata com manteiga, com 120 g de hambúrguer de carne,mix de cebola roxa e picles picados,crocante,sal temperado com pimenta e o molho especial com picles,além de ketchup e mostarda Heinz,queijo cheddar bacon fatiado. ", "Lanches", 27.90, 3));
			add(new Produto("BIB´S BURGER PLANT", "Pão de batata, 113 g de hambúrguer vegetal, tomate fatiado,alface americana,picles e um saboroso molho de tomatetemperado,Contém ovo na composição do pão. ","Lanches",24.90,4));
			add(new Produto("TRADICIONAL ROSBIFE","Pão sírio, dois ovos, alface americana, tomate, maionese especial,cremely cheddar cremoso e rosbife, é claro!","Lanches", 28.90, 5));
		}
	};

	//criar as bebidas e armazenar nesta propriedade
	public static ArrayList<Produto> Bebidas = new ArrayList<Produto>() {
		{
			add(new Produto("Suco de Maracuja", "Hmmmmmm! eu gostum", "Sucos", 10.00, 1));
			add(new Produto("Suco de Laranja", "Hmmmmmm! eu gostum", "Sucos", 10.00, 2));
			add(new Produto("Coca Cola", "Hmmmmmm! eu gostum", "Sucos", 10.00, 3));
		}
	};

	//criar as sobremesas e armazenar nesta propriedade
	public static ArrayList<Produto> Sobremesas = new ArrayList<Produto>() {
		{
			add(new Produto("Petit Gateau", "Hmmmmmm! eu gostum", "Sobremesas", 10.00, 1));
			add(new Produto("Sorvete", "Hmmmmmm! eu gostum", "Sobremesas", 10.00, 2));
			add(new Produto("Brigadeiro", "Hmmmmmm! eu gostum", "Sobremesas", 10.00, 3));
		}
	};
	
	public static ArrayList<Produto> Entradas = new ArrayList<Produto>() {
		{
			add(new Produto("Dadinho de tapioca", "Deliciosos dadinhos de tapioca com geléia de pimenta!", "Entradas", 25.00, 1));
			//adicionar demais Entradas.
		}
	};
	
	//percorre a lista de Lanches e printa elas
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
		for(Produto item : Entradas) {
			
			System.out.println(item.Id + " " + item.Nome + "---------" + item.Valor);
			}
	}
		
	//Percorre a listas de key and value (key == Produto.Id, value = quantidade escolhida pelo usuário) e realiza a contagem do valor total
	public void GerarNotaFiscal(Map<Integer,Integer>lanches, Map<Integer,Integer>bebidas, Map<Integer,Integer>sobremesas){
		double valorTotal = 0;
		int quantidade = 0;
		
		for (Produto item : Lanches) {
			if(lanches.containsKey(item.Id)) {
				quantidade = lanches.get(item.Id);
				valorTotal += item.Valor * quantidade;
				
				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade "+ quantidade);
			}
		}
		
		for (Produto item : Bebidas) {
			if(lanches.containsKey(item.Id)) {
				quantidade = bebidas.get(item.Id);
				valorTotal += item.Valor * quantidade;
				
				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade "+ quantidade);
			}
		}
		
		//Criar For de sobremesas
		
		System.out.printf("Total R$ %.2f",  valorTotal );
	}

}
