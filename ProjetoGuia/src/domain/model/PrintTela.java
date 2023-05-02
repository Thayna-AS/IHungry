package domain.model;

public class PrintTela {

	// Reset Color
	public static final String TEXT_RESET = "\u001B[0m";
	// Text Color
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_YELLOW_BOLD = "\033[1;33m";
	public static final String TEXT_WHITE_BOLD = "\033[1;37m";
	// Background Color
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	
	
		public static void MenuInicio() {
			
			 
					System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
							         + "-------------------------------------------------------------- ");
					System.out.println("                   Bem-vindo ao  I HUNGRY                      ");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" _____________________________________________________________ ");
					System.out.println("|                                                             |");
					System.out.println("|       1 - Entradas                                          |");
					System.out.println("|       2 - Lanches                                           |");
					System.out.println("|       3 - Bebidas                                           |");
					System.out.println("|       4 - Sobremesas                                        |");
					System.out.println("|       5 - Finaliza compra                                   |");
					System.out.println("|       6 - Retira itens                                      |");
					System.out.println("|       7 - Sair do cardapio                                  |");
					System.out.println("|                                                             |");
					System.out.println("---------------------------------------------------------------");
					System.out.println("          Digite a opção desejada                              ");
					System.out.println("---------------------------------------------------------------");
					System.out.println("" +TEXT_RESET);
		}
	
		/* print da ária de lanches */
		public static void EscolhaLanches() {
			System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
					         + "---------------------------------------------------------------");
			System.out.println("                   ESCOLHA SEU LANCHE                          ");
			System.out.println("---------------------------------------------------------------");
			System.out.println(" _____________________________________________________________ ");
			System.out.println("|                                                             |");
			System.out.println("|   1 CHICKEN BARBECUE BURGER-------------Avulso R$ 24,90     |");
			System.out.println("|   2 CLASSIC BACON BURGER ---------------Avulso R$ 29,90     |");
			System.out.println("|   3 CHEESE BACON BURGER ----------------Avulso R$ 27,90     |");
			System.out.println("|   4 BIB´S BURGER PLANT -----------------Avulso R$ 24,90     |");
			System.out.println("|   5 TRADICIONAL ROSBIFE ----------------Avulso R$ 28,90     |");
			System.out.println(" _____________________________________________________________ ");
			System.out.println("                                                               ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("                   Digite a opção desejada                     ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("" +TEXT_RESET);
		}

	


	public static void EscolhaEntrada() {

		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				+ "---------------------------------------------------------------");
		System.out.println("                   ESCOLHA SUA ENTRADA                         ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   1 Coxinha de frango-------------------avulso R$ 8,00      |");
		System.out.println("|   2 Pastel de queijo--------------------avulso R$ 12,00     |");
		System.out.println("|   3 Pastel de carne --------------------avulso R$ 12,00     |");
		System.out.println("|   3 Pão de queijo ----------------------avulso R$ 5,00      |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                   Digite a opção desejada                     ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);

	}

	public static void EscolhaSobremesa() {

		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				+ "---------------------------------------------------------------");
		System.out.println("                   ESCOLHA SUA ENTRADA                         ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   1 Petit Gateau -----------------------Avulso R$ 22,00     |");
		System.out.println("|        Pequeno bolo de chocolate, com casca e recheio       |");
		System.out.println("|        cremoso, servido com sorvete de creme.               |");
		System.out.println("|                                                             |");
		System.out.println("|   2 Torta de Maçã ----------------------Avulso R$ 25,00     |");
		System.out.println("|        Deliciosa torta de Maçã, servida com Sorvete         |");
		System.out.println("|        de Canela.                                           |");
		System.out.println("|                                                             |");
		System.out.println("|   3 Açai -------------------------------Avulso R$ 17,00     |");
		System.out.println("|         Açai na taça com acompanhamentos à escolha          |");
		System.out.println("|         do cliente.                                         |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                   Digite a opção desejada                     ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);

	}

	public static void EscolhaBebida() {

		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				+ "---------------------------------------------------------------");
		System.out.println("                   ESCOLHA SUA BEBIDA                          ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   1 Água 650ml -------------------------Avulso R$ 5,00      |");
		System.out.println("|   2 Chá matte --------------------------Avulso R$ 5,00      |");
		System.out.println("|   3 Refrigerante lata 350ml ------------Avulso R$ 7,00      |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                   BEBIDAS ALCOÓLICAS                          ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   4 Heineken 600ml ---------------------Avulso R$ 15,00     |");
		System.out.println("|   5 Brahma 600ml -----------------------Avulso R$ 12,00     |");
		System.out.println("|   6 Skol 600ml -------------------------Avulso R$ 10,00     |");
		System.out.println("|   7 Colmeia Drinks ---------------------Avulso R$ 10,00     |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                   Digite a opção desejada                     ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}

	public static void EscolhaQuantidade() {
		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				+ "---------------------------------------------------------------");
		System.out.println("                     Informe a quantidade                      ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}

	public static void AdicionarFinalizar() {
		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				+ "---------------------------------------------------------------");
		System.out.println("       Gostaria de adicionar outro item dessa categoria?       ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                          1 - Não                              ");
		System.out.println("                          2 - Sim                              ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}
}
