package domain;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import domain.model.Cardapio;
import domain.model.PrintTela;
import domain.model.Produto;
import domain.model.NF;

public class IHungry {

	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		
		
		Map<Integer, Integer> escolhaLanche = new HashMap<Integer, Integer>();
		Map<Integer, Integer> escolhaBebida = new HashMap<Integer, Integer>();
		Map<Integer, Integer> escolhaSobremesa = new HashMap<Integer, Integer>();
		Map<Integer, Integer> escolhaEntradas = new HashMap<Integer, Integer>();
		Map<Integer, Integer> RetiraLanche = new HashMap<Integer, Integer>();
		
		while (true) {
            
			PrintTela.MenuInicio();
			
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println("\n Volte sempre!");
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:int opentrada;
			do{
				PrintTela.EscolhaEntrada();
				int armazenaIdentrada = sc.nextInt();
                PrintTela.EscolhaQuantidade();
				int armazenaQuantidadeEntrada = sc.nextInt();
				PrintTela.AdicionarFinalizar();
				opentrada = sc.nextInt();
				escolhaEntradas.put(armazenaIdentrada, armazenaQuantidadeEntrada);
			}while( opentrada != 1);
				
				break;
			case 2:
				int opLanche;
				do{
					PrintTela.EscolhaLanches();
					int armazenaIdLanche = sc.nextInt();
                    PrintTela.EscolhaQuantidade();
					int armazenaQuantidadeLanche = sc.nextInt();
					PrintTela.AdicionarFinalizar();
					opLanche = sc.nextInt();
					escolhaLanche.put(armazenaIdLanche, armazenaQuantidadeLanche);
				}while( opLanche != 1);
				break;
			case 3:
				int opBebida;
				do{
					PrintTela.EscolhaBebida();
					int armazenaIdBebida = sc.nextInt();
                    PrintTela.EscolhaQuantidade();
					int armazenaQuantidadeBebida = sc.nextInt();
					PrintTela.AdicionarFinalizar();
					opBebida = sc.nextInt();
					escolhaBebida.put(armazenaIdBebida, armazenaQuantidadeBebida);
				}while( opBebida != 1);
				break;
			case 4:
				int opSobremesa;
				do{
					PrintTela.EscolhaSobremesa();
					int armazenaIdSobremesa = sc.nextInt();
                    PrintTela.EscolhaQuantidade();
					int armazenaQuantidadeSobremesa = sc.nextInt();
					PrintTela.AdicionarFinalizar();
					opSobremesa = sc.nextInt();
					escolhaSobremesa.put(armazenaIdSobremesa, armazenaQuantidadeSobremesa);
				}while( opSobremesa != 1);
				
				break;
			case 5:
				
				NF.GerarNotaFiscal (escolhaLanche, escolhaBebida, escolhaSobremesa, escolhaEntradas);

				keyPress();
				break;
			case 6:
				
			default:
				System.out.println("\nOpção Inválida");

				break;
			}
		}

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
