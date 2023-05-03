package domain.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class NF {
	
	
	// Percorre a listas de key and value (key == Produto.Id, value = quantidade
	// escolhida pelo usuário) e realiza a contagem do valor total
	public static void GerarNotaFiscal(Map<Integer, Integer> lanches, Map<Integer, Integer> bebidas,
			Map<Integer, Integer> sobremesas, Map<Integer, Integer> entradas) {
		double valorTotal = 0;
		int quantidade = 0;
		
		Date dataAtual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = formato.format(dataAtual);
		System.out.println();
		System.out.println("""
	--------------------------------------------------------
			C U P O M   F I S C A L					
	--------------------------------------------------------
				""");
        System.out.println("\t\tData atual: " + dataFormatada+"\n");
        System.out.println("--------------------------------------------------------\n");

        
		for (Produto item : Cardapio.Lanches) {
			if (lanches.containsKey(item.Id))  {
				quantidade = lanches.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade: " + quantidade);
			}
		}

		for (Produto item : Cardapio.Bebidas)
			if (bebidas.containsKey(item.Id)) {
				quantidade = bebidas.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade: " + quantidade);
			}

		for (Produto item : Cardapio.Sobremesas) {
			if (sobremesas.containsKey(item.Id)) {
				quantidade = sobremesas.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade: " + quantidade);
			}
		}

		for (Produto item : Cardapio.Entradas) {
			
			if (entradas.containsKey(item.Id)) {
				quantidade = entradas.get(item.Id);
				valorTotal += item.Valor * quantidade;

				System.out.println(item.Nome + " -------- " + item.Valor + " --------------- Quantidade: " + quantidade);
			}
		}

		System.out.printf("Total   -------- R$ %.2f\n\n", valorTotal);
		System.out.println("\t\tV O L T E   S E M P R E");
		System.out.println("--------------------------------------------------------");
	}
	public static void retira(Map<Integer, Integer> lanches, Map<Integer, Integer> bebidas,
			Map<Integer, Integer> sobremesas, Map<Integer, Integer> entradas, int id) {
	
		for (Produto item : Cardapio.Lanches) {
			if (lanches.containsKey(item.Id)) {
                lanches.remove(id);
			}
		}

		for (Produto item : Cardapio.Bebidas)
			if (bebidas.containsKey(item.Id)) {
				bebidas.remove(id);
			}

		for (Produto item : Cardapio.Sobremesas) {
			if (sobremesas.containsKey(item.Id)) {
				sobremesas.remove(id);
			}
		}

		for (Produto item : Cardapio.Entradas) {
			if (entradas.containsKey(item.Id)) {
                entradas.remove(id);
			}
		}

	}
	public static void mostraId(Map<Integer, Integer> lanches, Map<Integer, Integer> bebidas,
			Map<Integer, Integer> sobremesas, Map<Integer, Integer> entradas) {
	
		for (Produto item : Cardapio.Lanches) {
			if (lanches.containsKey(item.Id)) {

				System.out.println(item.Nome + " -------- ID "+item.Id);
			}
		}

		for (Produto item : Cardapio.Bebidas)
			if (bebidas.containsKey(item.Id)) {

				System.out.println(item.Nome + " -------- ID "+item.Id);
			}

		for (Produto item : Cardapio.Sobremesas) {
			if (sobremesas.containsKey(item.Id)) {
				
				System.out.println(item.Nome + " -------- ID "+item.Id);
			}
		}

		for (Produto item : Cardapio.Entradas) {
			if (entradas.containsKey(item.Id)) {
				
				System.out.println(item.Nome + " -------- ID "+item.Id);
			}
		}

	}
	
}
