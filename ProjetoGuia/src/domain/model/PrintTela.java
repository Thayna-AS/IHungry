package domain.model;

public class PrintTela {

	//Reset Color
	public static final String TEXT_RESET = "\u001B[0m";
	//Text Color
	public static final String TEXT_BLACK = "\u001B[30m" ;
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_YELLOW_BOLD = "\033[1;33m"; 
	public static final String TEXT_WHITE_BOLD = "\033[1;37m";
	// Background Color
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	
	
		public static void menuInicio() {
			
			 
					System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
							         + "-------------------------------------------------------------- ");
					System.out.println("                   bem-vindo ao  I HUNGRY                      ");
					System.out.println("---------------------------------------------------------------");
					System.out.println(" _____________________________________________________________ ");
					System.out.println("|                                                             |");
					System.out.println("|       1 - lanches                                           |");
					System.out.println("|       2 - bebidas                                           |");
					System.out.println("|       3 - sobremesa                                         |");
					System.out.println("|       4 - finaliza compra                                   |");
					System.out.println("|       5 - retira itens                                      |");
					System.out.println("|       6 - sair do cardapio                                  |");
					System.out.println("                                                               ");
					System.out.println("---------------------------------------------------------------");
					System.out.println("          digite o úmero da opçao que voçê deseja escolhe      ");
					System.out.println("---------------------------------------------------------------");
					System.out.println("" +TEXT_RESET);
		}
	
		/* print da ária de lanches */
		public static void escolhaLanches() {
			System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND
					         + "-------------------------------------------------------------- ");
			System.out.println("                   ESCOLHA SEU LANCHE                          ");
			System.out.println("---------------------------------------------------------------");
			System.out.println(" _____________________________________________________________ ");
			System.out.println("|                                                             |");
			System.out.println("|   1 CHICKEN BARBECUE BURGER-------------avulso R$ 24,90     |");
			System.out.println("|   2 CLASSIC BACON BURGER ---------------avulso R$ 29,90     |");
			System.out.println("|   3 CHEESE BACON BURGER ----------------avulso R$ 27,90     |");
			System.out.println("|   4 BIB´S BURGER PLANT -----------------avulso R$ 24,90     |");
			System.out.println("|   5 TRADICIONAL ROSBIFE ----------------avulso R$ 28,90     |");
			System.out.println(" _____________________________________________________________ ");
			System.out.println("                                                               ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("          digite o úmero da opçao que voçê deseja escolhe      ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("" +TEXT_RESET);
		}

		public static void escolhaQuantidade() {
			System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND+
					           "---------------------------------------------------------------");
			System.out.println("                     Escolha a quantidade                      ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("" +TEXT_RESET);
		}
		public static void adicionarFinalizar(){
			System.out.println(TEXT_YELLOW + ANSI_BLACK_BACKGROUND+
					           "---------------------------------------------------------------");
			System.out.println("             gostaria de adicionar mais itens?                 ");
			System.out.println("                          1 não                                ");
			System.out.println("                          2 sim                                ");
			System.out.println("---------------------------------------------------------------");
			System.out.println("" +TEXT_RESET);
		}
}
