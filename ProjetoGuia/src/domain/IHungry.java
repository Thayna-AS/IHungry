package domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import domain.model.Cardapio;

public class IHungry {

	        public static void main(String[] args) {
	    		
	    		
	    		Scanner sc = new Scanner(System.in);
	    		Cardapio cardapio = new Cardapio();
	    		
	    		Map<Integer,Integer> escolhaLanche = new HashMap<Integer,Integer>();
	    		Map<Integer,Integer> escolhaBebida = new HashMap<Integer,Integer>();
	    		

	    		
	    		
	    		int validadorLanche = 1;
	    		while(validadorLanche == 1)
	    		{
	    			System.out.println("                   ESCOLHA SEU LANCHE                          ");
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println(" _____________________________________________________________ ");
	    			cardapio.MostrarLanches();
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println("          digite o número da opção desejada           ");
	    			System.out.println("---------------------------------------------------------------");	
	    			int armazenaIdLanche = sc.nextInt();
	    			
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println("          Escolha a quantidade         ");
	    			System.out.println("---------------------------------------------------------------");		
	    			int armazenaQuantidadeLanche = sc.nextInt();
	    			
	    			escolhaLanche.put(armazenaIdLanche, armazenaQuantidadeLanche);
	    			
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println("          Prosseguir para bebidas?        ");
	    			System.out.println("          1 - Não       ");
	    			System.out.println("          2 - Sim       ");
	    			System.out.println("---------------------------------------------------------------");	
	    			validadorLanche = sc.nextInt();
	    		}
	    		
	    		int validadorBebida = 1;
	    		while(validadorBebida == 1)
	    		{
	    			System.out.println("                   ESCOLHA SUA BEBIDA                          ");
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println(" _____________________________________________________________ ");
	    			cardapio.MostrarBebidas();
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println("          digite o número da opção desejada           ");
	    			System.out.println("---------------------------------------------------------------");	
	    			int armazenaIdBebida = sc.nextInt();
	    			
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println("          Escolha a quantidade         ");
	    			System.out.println("---------------------------------------------------------------");		
	    			int armazenaQuantidadeBebida = sc.nextInt();
	    			
	    			escolhaBebida.put(armazenaIdBebida, armazenaQuantidadeBebida);
	    			
	    			System.out.println("---------------------------------------------------------------");
	    			System.out.println("          Prosseguir para Sobremesas?        ");
	    			System.out.println("          1 - Não       ");
	    			System.out.println("          2 - Sim       ");
	    			System.out.println("---------------------------------------------------------------");	
	    			validadorBebida = sc.nextInt();
	    		}

	    		cardapio.GerarNotaFiscal(escolhaBebida, escolhaBebida, escolhaBebida);
	    		

	    		//Criar De sobremesas


	}

}
