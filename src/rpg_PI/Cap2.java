import java.util.Scanner;

public class Main {
	public static Scanner resp = new Scanner(System.in);
	private static final String VERMELHO = "\u001B[31m";
	private static final String VERDE = "\u001B[32m";
	private static final String AMARELO = "\u001B[33m";
	private static final String BRANCO = "\u001B[37m";
	public static final String CYAN = "\u001B[36m";
	public static final String RESET = "\u001B[0m";

	public static void main(String[] args) {
		Scanner R = new Scanner(System.in);
		System.out.println(" Fenrir crescera rápido, não à toa era filho de uma giganta. E não era apenas seu tamanho que havia aumentado, sua força também crescia a cada dia. \r\n"
				+ "Tyr era o único que brincava com ele, os deuses estavam todos temerosos sobre o que aconteceria no futuro quando Fenrir virasse adulto. Tentaram amarrá-lo com vários tipos de corrente, mas o lobo conseguiu se soltar de todas elas. E quanto mais demonstrava sua força, mais arrogante e orgulhoso de si ele ficava.\r\n"
				+ "	- (Nome do jogador), quero que você vá até a terra dos anões e traga a corrente mais forte para prender aquele lobo - ordenou Odin.\r\n"
				+ "	A terra dos anões ficava no subterrâneo, era um labirinto de minas com cheiro metálico. Não era difícil se locomover por ali, mas um caminho tomado erroneamente e não era mais possível encontrar a saída. Felizmente os anões eram aliados dos deuses e confeccionavam o que lhes fosse preciso em troca de algumas regalias valiosas. Sim, esses elfos noturnos eram movidos pela ganância.\r\n"
				+ "	Frey o acompanhava dessa vez. Ele preferia não se aproximar deste mundo sujo, mas não perderia a oportunidade de se vingar de Loki por tudo que havia feito à sua irmã, Freya.\r\n"
				+ "	Vocês se dirigem à casa de fundição e explicam o que precisam aos anões. A corrente seria confeccionada, mas precisariam de sua ajuda, pois parte dos trabalhadores estavam reconstruindo danos feitos pelos trolls.\r\n");
		

		 System.out.println(VERMELHO +"-----------------------------------------------------\n"
			        + "               		  DESAFIO 3\n"
			        + "-----------------------------------------------------"+RESET+"\nVocê ficou encarregado de alimentar as chamas da fornalha."
			        		+ "Os anões lhe entregaram um manual com informações sobre a temperatura ideal para a confecção das correntes:"
			        		+ "\nAo lê-lo, você verifica que é necessário elevar a temperatura da fornalha até 2500°C e então mantê-la constante. No entanto, é imprescindível que a razão entre combustível utilizado e jatos de ar que alimentam a chama seja 0,2."
			        		+ "\nSabendo que 10g de combustível é capaz de elevar a temperatura em 500°C e que 3 jatos de ar são suficientes para aumentar 250°C, "
			        		+ "calcule quantos gramas de combustível e quantas borrifadas de ar serão necessários para alcançar a temperatura ideal, sendo que no momento, a fornalha se encontra a 100°C.");
		 System.out.print("\nSelecione a melhor alternativa que contém os valores aproximados:\n"
		 		+ "A)5g e 10 jatos de ar\nB)10g e 25 jatos de ar\nC)50g e 50 jatos de ar\nD)5g e 25 jatos de ar\nE)Nenhuma das anteriores"
		 		+ "\n\nResposta: ");
		 String resp = R.next();
		 resp.toUpperCase();
		 if (resp.equalsIgnoreCase("D")) {
			 System.out.println("\nResposta Correta! Parabéns você completou este desafio!");
			 //limparTela();
			
			 System.out.println("Após entregar a corrente a Odin, os deuses se dirigem ao local onde Fenrir era criado.\r\n"
			 		+ "	- Fenrir! Temos mais um desafio a você! - disse Odin, mostrando a corrente.\r\n"
			 		+ "	- Ha! Essa parece ser mais fraca que a última! - ri o lobo, virando as costas.\r\n"
			 		+ "	- Esse será o último, se você se soltar, lhe daremos o título de mais forte de Asgard.\r\n"
			 		+ "	Após convencer o lobo, os deuses o acorrentam. Fenrir começa a se debater, mas não consegue se soltar. Os deuses começam a rir orgulhosos de si e vão se afastando um a um.\r\n");
			 
			 int escolherCaminho = 0;
			 
			 System.out.print("Diante da situação você começa a pensar sobre a decisão dos deuses. Fenrir já era gigante e iria crescer mais. Até quando essa corrente seria forte o suficiente?"
			 		+ "\nEntão você decide:\n1-Convencer os deuses a soltá-lo, afinal a corrente poderia se romper no futuro e Fenrir viria para se vingar"
			 		+ "\n2-Deixá-lo preso mesmo. Solto, esse lobo seria uma ameaça a todos. Você está aqui para impedir o apocalipse e não para ajudá-lo a acontecer"
			 		+ "\nDigite o caminho escolhido: ");
			 escolherCaminho = R.nextInt();
			 //limparTela();
			 
			 switch (escolherCaminho) {
			 case 1:
				 System.out.println("\nFenrir se irrita com os deuses, por terem-no enganado. Mas reconhece a sua ajuda e agradece."
				 		+ "\n- Obrigado por ter me soltado (nome do jogador). Se um dia estiver em apuros, conte com minha ajuda. "
				 		+ "Eu não confiaria tanto nesses deuses se fosse você. Não somos um deles, eles irão te trair um dia, assim como fizeram comigo. - diz Fenrir antes de desaparecer na floresta.");
				 break;
			 case 2:
				 System.out.println("\nAo perceber que ninguém iria soltá-lo, Fenrir dá um grito de raiva:\r\n"
				 		+ "- Odin, seu traidor! Eu poderia ser amigo de vocês, mas agora irei matar a todos e você também!\r\n"
				 		+ "Sem se importar, os deuses continuam seu caminho de volta, comemorando o sucesso do plano.\r\n");
				 break;
			 }
			 
		 } else {
			 System.out.println("Resposta Errada! Você não conseguiu completar este desafio, mas pode continuar seguindo em frente!");
			//limparTela();
			 System.out.println("Infelizmente você não conseguiu manter a temperatura da fornalha na temperatura adequada e a corrente não saiu perfeita.\r\n"
			 		+ "Após entregar a corrente a Odin, os deuses se dirigem ao local onde Fenrir era criado.\r\n"
			 		+ "	- Fenrir! Temos mais um desafio a você! - disse Odin, mostrando a corrente.\r\n"
			 		+ "	- Ha! Essa parece ser mais fraca que a última! - ri o lobo, virando as costas.\r\n"
			 		+ "	- Esse será o último, se você se soltar, lhe daremos o título de mais forte de Asgard.\r\n"
			 		+ "Após convencer o lobo, os deuses o acorrentam. Fenrir começa a se debater e em alguns poucos minutos quebra a corrente e se solta.\r\n"
			 		+ "- Haha eu disse que esse pedaço de pano não ia me segurar! - diz Fenrir, tirando sarro dos deuses - Mal posso esperar pelo próximo 'desafio' que vocês tiverem para mim, seus fracotes!\r\n"
			 		+ "O lobo vai embora e some na floresta.\r\n"
			 		+ "Odin te olha irritado com sua falha, mas não diz nada. Talvez tivesse perdido algum detalhe dos sonhos, talvez eles não tenham sido uma visão do futuro\r\n"
			 		+ "- Não deveríamos ter confiado uma missão tão importante a um humano! - murmura Thor enquanto retorna. \r\n");
		 }
	}

}
