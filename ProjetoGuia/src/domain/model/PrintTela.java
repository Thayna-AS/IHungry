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

		
		//print Menu incial.
		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "-------------------------------------------------------------- ");
		System.out.println("                  BEM-VINDO AO I HUNGRY                        ");
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
		System.out.println("                 Informe a opção desejada                      ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}		

	/* print da área de lanches. */
	public static void EscolhaLanches() {
		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "---------------------------------------------------------------");
		System.out.println("                     ESCOLHA O LANCHE                          ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   5 CHICKEN BARBECUE BURGER-------------Unidade R$ 24,90    |");
		System.out.println("|   6 CLASSIC BACON BURGER ---------------Unidade R$ 29,90    |");
		System.out.println("|   7 CHEESE BACON BURGER ----------------Unidade R$ 27,90    |");
		System.out.println("|   8 BIB´S BURGER PLANT -----------------Unidade R$ 24,90    |");
		System.out.println("|   9 TRADICIONAL ROSBIFE ----------------Unidade R$ 28,90    |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                 Informe a opção que deseja                    ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}

	public static void EscolhaEntrada() {

		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "---------------------------------------------------------------");
		System.out.println("                   ESCOLHA A ENTRADA                           ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   1 Coxinha de frango-------------------Unidade R$ 8,00     |");
		System.out.println("|   2 Pastel de queijo--------------------Unidade R$ 12,00    |");
		System.out.println("|   3 Pastel de carne --------------------Unidade R$ 12,00    |");
		System.out.println("|   4 Pão de queijo ----------------------Unidade R$ 5,00     |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                 Informe a opção que deseja                    ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);

	}

	public static void EscolhaSobremesa() {

		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "---------------------------------------------------------------");
		System.out.println("                   ESCOLHA SUA SOBREMESA                       ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|  17 Petit Gateau -----------------------Unidade R$ 22,00    |");
		System.out.println("|        Pequeno bolo de chocolate, com casca e recheio       |");
		System.out.println("|        cremoso, servido com sorvete de creme.               |");
		System.out.println("|                                                             |");
		System.out.println("|  18 Torta de Maçã ----------------------Unidade R$ 25,00    |");
		System.out.println("|        Deliciosa torta de Maçã, servida com Sorvete         |");
		System.out.println("|        de Canela.                                           |");
		System.out.println("|                                                             |");
		System.out.println("|  19 Açai -------------------------------Unidade R$ 17,00    |");
		System.out.println("|         Açai na taça, com acompanhamentos à escolha         |");
		System.out.println("|         do cliente.                                         |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                   Informe a opção que deseja                  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);

	}

	public static void EscolhaBebida() {

		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "---------------------------------------------------------------");
		System.out.println("                     ESCOLHA A BEBIDA                          ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   10 Água 650ml -------------------------Unidade R$ 5,00    |");
		System.out.println("|   11 Chá matte --------------------------Unidade R$ 5,00    |");
		System.out.println("|   12 Refrigerante lata 350ml ------------Unidade R$ 7,00    |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                     BEBIDAS ALCOÓLICAS                        ");
		System.out.println("---------------------------------------------------------------");
		System.out.println(" _____________________________________________________________ ");
		System.out.println("|                                                             |");
		System.out.println("|   13 Heineken 600ml ---------------------Unidade R$ 15,00   |");
		System.out.println("|   14 Brahma 600ml -----------------------Unidade R$ 12,00   |");
		System.out.println("|   15 Skol 600ml -------------------------Unidade R$ 10,00   |");
		System.out.println("|   16 Colmeia Drinks ---------------------Unidade R$ 10,00   |");
		System.out.println("|_____________________________________________________________|");
		System.out.println("                                                               ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("                   Digite a opção que deseja                   ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}

	public static void EscolhaQuantidade() {
		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "---------------------------------------------------------------");
		System.out.println("                     Escolha a quantidade                      ");
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

	public static void confirma() {
		System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
				         + "---------------------------------------------------------------");
		System.out.println("              Informe  o  item a ser removido                  ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("" + TEXT_RESET);
	}
}
