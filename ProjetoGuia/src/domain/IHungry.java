package domain;

import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import domain.model.Cardapio;
import domain.model.PrintTela;

public class IHungry {

	public static void main(String[] args) {

		int opcao;
		Scanner sc = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();

		Map<Integer, Integer> escolhaLanche = new HashMap<Integer, Integer>();
		Map<Integer, Integer> escolhaBebida = new HashMap<Integer, Integer>();

		while (true) {
            
			PrintTela.menuInicio();
			
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println("\n vou sempre ");
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				int opLanche;
				do{
					PrintTela.escolhaLanches();
					int armazenaIdLanche = sc.nextInt();
                    PrintTela.escolhaQuantidade();
					int armazenaQuantidadeLanche = sc.nextInt();
					PrintTela.adicionarFinalizar();
					opLanche = sc.nextInt();
					escolhaLanche.put(armazenaIdLanche, armazenaQuantidadeLanche);
				}while( opLanche != 1);
				break;
			case 2:

				int opbebida ;
				do {
					System.out.println("                   ESCOLHA SUA BEBIDA                          ");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" _____________________________________________________________ ");
					cardapio.MostrarBebidas();
					System.out.println("---------------------------------------------------------------");
					System.out.println("          digite o número da opção desejada           ");
					System.out.println("---------------------------------------------------------------");
					int armazenaIdBebida = sc.nextInt();
					PrintTela.escolhaQuantidade();
					int armazenaQuantidadeBebida = sc.nextInt();
					PrintTela.adicionarFinalizar();
					opbebida = sc.nextInt();

					escolhaBebida.put(armazenaIdBebida, armazenaQuantidadeBebida);
				}while (opbebida != 1);
				break;
			case 3:
				System.out.println("\n Buscar Conta por número");

				keyPress();
				break;
			case 4:
				cardapio.GerarNotaFiscal(escolhaBebida, escolhaBebida, escolhaBebida);

				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida");

				keyPress();
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
