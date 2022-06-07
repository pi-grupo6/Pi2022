package rpg_PI;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class RagnarokBackup {

	// variaveis globais
	String nomeJogador = "";
	public static boolean fenirPreso = false; // teste cap2
	public static boolean muroTerminado = false; // teste cap3
	public static boolean pazHumanos = false; // teste cap4

	/*
	 * private static final String VERMELHO = "\u001B[31m"; private static final
	 * String VERDE = "\u001B[32m"; private static final String AMARELO =
	 * "\u001B[33m"; private static final String BRANCO = "\u001B[37m"; public
	 * static final String CYAN = "\u001B[36m"; public static final String RESET =
	 * "\u001B[0m";
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 4) {

			System.out.println("----Menu----");
			System.out.println("1 - Introdu��o");
			System.out.println("2 - Jogar");
			System.out.println("3 - Cr�ditos");
			System.out.println("4 - Sair");
			System.out.print("Digite a op��o desejada:");

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println(
						"Bem vindo jogador! A aventura come�a agora.\nNavegue pela hist�ria desde a cria��o do mundo"
								+ " e a profecia do Ragnarok. \nSer� que voc� consegue evita-la?");
				break;
			case 2:
				System.out.println("Op��o 2 - Jogar -");

				// chamando o metodo jogo
				jogo();
				System.out.println("Fim de jogo");
				System.exit(0);
				break;
			case 3:
				System.out.println("Cr�ditos:"

						+ "\nEnredo e roteiro: " + "\nLuana Donomai e Valdinei Santana dos Reis"

						+ "\nDesenvolvimento:"
						+ "\nCarolina Orlowski Damaceno, �talo Felix Terciano, Luana Donomai, Valdinei Santana, Jose Ivo Oliveira Silva."

						+ "\nInforma��es T�cnicas:"
						+ "\nEste projeto foi desenvolvido na linguagem Java 17 e IDE Eclipse, pelo grupo 6 da turma D de Projeto Integrador.");
				break;
			case 4:
				System.out.println(
						"Op��o 4 - Sair \n" + "Voc� saiu do menu. Para iniciar um novo jogo, execute novamente.");
				break;

			default:
				System.out.println("Op��o inv�lida.");
			}

		}

		sc.close();

	}

	// metodo do inicio do jogo
	public static void jogo() {

		// metodos dos cap�tulos
		// cap1();
		// System.out.println("Voc� Passou pelo Cap�tulo 1 com sucesso");

		// cap2(); System.out.println("Voc� Passou pelo Cap�tulo 2 com sucesso");

		// cap3();
		System.out.println("Voc� Passou pelo Cap�tulo 3 com sucesso");

		cap4();
		System.out.println("Voc� Passou pelo Cap�tulo 4 com sucesso");

		cap5();
		System.out.println("Voc� Passou pelo Cap�tulo 5 com sucesso");

		cap6();

	}

	public static boolean cap2() {

		boolean venceuCap2 = false;

		System.out.println("jogando capitulo 2");
		while (venceuCap2 == false) {

		}

		return true;
	}

	public static boolean cap3() {

		boolean venceuCap3 = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------------\n" + "          A GRANDE MURALHA\n"
				+ "------------------------------------\n");
		System.out.println(
				"Na semana seguinte, Odin reuniu todos no sal�o para discutir sobre a estrutura de defesa de Asgard. "
						+ "\nThor era forte e dava conta de todos os inimigos, mas agora n�o estava l�, fora lutar contra os gigantes problem�ticos de Jotunheim. "
						+ "\nEra necess�rio construir um muro que fosse capaz de conter desde o mais forte dos trolls at� o maior das criaturas.\r\n"
						+ "- Precisamos de algu�m que construa esse muro o mais r�pido poss�vel - disse Odin.\r\n"
						+ "- Ha, mesmo assim levaria anos para terminar. A sua profecia n�o est� prestes a ocorrer? - riu Loki, tentando conter sua excita��o ao ver a preocupa��o dos deuses.\r\n"
						+ "- Podemos enviar (nome do jogador) para reunir os melhores construtores. Os an�es poderiam fabricar um equip�- dizia Freya quando foi interrompida por Heimdall:\r\n"
						+ "- Odin, h� um construtor que diz ser capaz de construir a muralha em tr�s esta��es. Mas a recompensa que ele pede � absurda�exigiu o Sol, a Lua e a m�o de Freya..\r\n"
						+ "- � um valor muito alto, mande-o embora. - irritou-se Odin.\r\n"
						+ "- Mas precisamos do muro! � uma boa proposta, n�o h� ningu�m capaz de tal fa�anha neste mundo! - adiantou-se Loki\r\n"
						+ "- Voc� parece animado Loki, ficarei feliz em me voltar contra voc�s quando eu for embora para o reino desse construtor - rebateu Freya com a frieza que somente a mais bela deusa sabia demonstrar.\r\n"
						+ "- Diminuamos o prazo. Daremos a ele somente uma esta��o, durante a qual ele ter� que construir sozinho, sem ajuda. Ser� imposs�vel que ele finalize t�o r�pido."
						+ "\n E ent�o o mandamos embora sem nada tendo a estrutura do muro j� em andamento! - disse Loki, orgulhoso de sua intelig�ncia.\r\n"
						+ "- Assim faremos ent�o, chame-o Heimdall - ordenou Odin.\r\n"
						+ "Foi passado ao construtor os termos que os deuses estipularam. Sem se abalar, o construtor deu in�cio � constru��o do muro.\r\n"
						+ "Para a surpresa de todos, em apenas 2 semanas ele j� havia levantado metade do muro. Nesse ritmo, terminaria tudo antes mesmo do final do inverno. Desesperado, Odin lhe ordena que atrapalhe o construtor e impe�a a finaliza��o do muro.\r\n");

		while (venceuCap3 == false) {

			String senha = ("235813");

			System.out.println("Jogador, para interromper a constru��o do muro, tranque o ba�:\n");

			System.out.println(
					"Para trancar, desvende o seguinte mist�rio: a senha � uma sequ�ncia de 5 runas, que correspondem aos primeiros n�meros da sequencia Fibonacci a partir do primeiro numero par.");

			System.out.print("\nDigite a senha (Todos os n�meros na sequencia): ");

			String palpite = ("");
			palpite = sc.next();

			if (palpite.equals(senha)) {
				System.out.println("Voc� acertou!");
				System.out.println(
						"Ao terminar o prazo, os deuses riam com a derrota do construtor. Se gabavam de seu plano bem sucedido. N�o haviam gastado um �nico recurso e a muralha estava quase completa. \r\n"
								+ "\nVoc�s trapacearam! Se n�o tivessem me atrapalhado, eu teria finalizado esse muro h� dias! - gritou o construtor enfurecido, revelando sua verdadeira forma gigantesca.\r\n"
								+ "\nE voc� trapaceou ao esconder sua verdadeira forma! - voc� diz, empunhando sua arma e se preparando para a batalha.\r\n");
				System.out.println(
						"\nVoc�s poderiam ter me esperado para a festa! - disse Thor, ao ver o inimigo derrotado no ch�o.\r\n"
								+ "\nJogador, voc� teve sucesso e conseguiu interromper a constru��o do muro!\r\n");
				venceuCap3 = true;
			} else {
				System.out.println("Voc� errou!");
				System.out.println(
						"\n n�o dar o �ltimo golpe, o gigante percebe a presen�a de Thor, mas antes que possa reagir � nocauteado com um golpe do poderoso martelo.\r\n"
								+ "\nVejo que voc�s se divertiram durante minha aus�ncia. Ainda bem que cheguei a tempo da festa! - disse Thor animado com a luta que antecedera.\r\n + \"Jogador, voc� falhou e n�o conseguiu interromper a constru��o do muro!\\r\\n");
			}

		}
		sc.close();

		return true;
	}

	public static boolean cap4() {

		boolean venceuCap4 = false;
		Scanner sc = new Scanner(System.in);
		String escolha = ("");

		System.out.println("------------------------------------\n" + " FREYA, A MAIS BELA DEUSA DOS FRANIR \n"
				+ "-------------------------------------\n");
		System.out.println(
				"Algum tempo depois, Loki volta a Asgard com um sorriso ir�nico no rosto, dirigindo-se a Odin:\r\n"
						+ "Odin, trago �timas not�cias de Svartalfheim!\r\n"
						+ "Mais uma competi��o de presentes? - Pergunta Odin.\r\n"
						+ "N�o, algo muito melhor! Desta vez s�o eles que est�o recebendo um agrado dos deuses..\r\n"
						+ "Pare de enrolar e diga logo.\r\n"
						+ "Sua querida neta Freya est� se engra�ando com os an�es para conseguir uma j�ia. Ao que ouvi dizerem, os an�es est�o fazendo fila para passar uma noite com ela!\r\n"
						+ "Maldita seja! Jogador! Voc� e Loki ir�o at� a terra dos an�es acabar com essa orgia.- diz Odin enfurecido pelos atos de Freya\r\n"
						+ "�----\r\n"
						+ "Ao se aproximar de Svartalfheim, Loki aponta para uma pequena constru��o em meio � floresta. No horizonte era poss�vel observar pequenas constru��es humanas e ouvir a agita��o da vida noturna. O local era calmo e trazia uma sensa��o de paz, n�o parecia que perto era a morada dos elfos negros, conhecidos por sua gan�ncia e trapa�as.\r\n"
						+ "Seguindo em dire��o � constru��o era poss�vel sentir o cheiro met�lico e empoeirado caracter�stico de minas. Na entrada havia uma longa escada que adentrava a terra e de onde era poss�vel observar apenas a escurid�o.\r\n"
						+ "Descendo essa escada chegaremos � terra dos an�es. Fique atento se n�o quiser passar o resto da vida vagando por esse labirinto que eles constru�ram. - diz Loki\r\n"
						+ "E como vamos encontrar Freya?\r\n"
						+ "N�o iremos encontrar Freya, ela ir� nos encontrar. Roubaremos o colar que ela tanto deseja e voltamos para Asgard hahahah.\r\n"
						+ "");

		System.out.println("Para avan�ar na jornada Jogador, lan�e os dados e tente a sorte! \n\n");

		while (venceuCap4 == false) {

			System.out.print("Escolha entre �mpar e par:");

			escolha = sc.next();

			Random aleatorio = new Random();

			// Jogo de dados deve-se tirar um numero maior que 3
			int faceDado = aleatorio.nextInt(5) + 1;// sorteia uma face de 0 a 5 por isso deve-se somar 1 para ser de 1
													// a 6

			

			switch (escolha.toUpperCase()) {

			case "PAR":

				if (faceDado % 2 == 0) {
					System.out.println("O n�mero do dado �: " + faceDado);
					System.out.println("\nVoc� venceu!");
					System.out.println(
							"Ap�s pegar o colar, Loki se transforma em um animal com garras enormes e fortes o suficientes para quebrar as paredes dos corredores das minas.\r\n"
									+ "Abrirei caminho at� a superf�cie, � melhor me acompanhar se n�o quiser morrer aqui.- diz Loki sorrindo como uma crian�a que acabara de receber o presente que tanto esperava.\r\n"
									+ "Chegando � superf�cie, voc�s dois voltam a Asgard e comunicam a Odin o sucesso da miss�o.\r\n"
									+ "----\r\n"
									+ "Poucas horas depois, Freya aparece no sal�o esbravejando sua raiva para cima de voc� e de Loki. Odin interrompe e sentencia a puni��o de Freya:\r\n"
									+ "Freya, o que voc� fez � imperdo�vel. Sua gan�ncia e lux�ria ser�o a sua queda. Voc� descer� a Midgard e plantar� a semente do caos no mundo dos humanos.\r\n"
									+ "Porque os humanos ser�o punidos? - voc� diz indignado com a decis�o de Odin.\r\n"
									+ "Os Vanir cuidam e protegem os humanos. � gra�as a eles que a civiliza��o humana conseguiu se desenvolver a tal ponto. A puni��o de Freya ser� destruir tudo o que protegeu.\r\n"
									+ "Midgard � seu mundo, seus pais humanos moravam l�. N�o � poss�vel que Odin queira destru�-lo. Desacreditado com o que acabara de ouvir, voc� tenta convencer Odin a mudar a puni��o.\r\n"
									+ "");
					venceuCap4 = true;
				} else {
					System.out.println("O n�mero do dado �: " + faceDado);
					System.out.println("\nVoc� perdeu.");
					System.out.println(
							"Freya, guiada pelos an�es, aparece diante de voc�s. O sorriso de Loki havia se esva�do h� algum tempo, ele sabia o que estava por vir. Estavam em desvantagem, n�o poderiam lutar contra todos os an�es e Freya.\r\n"
									+ "Freya, por sua vez, sorria um t�mido sorriso de satisfa��o. Odiava Loki e essa era a oportunidade perfeita para se vingar de todas as travessuras que havia pregado aos deuses. Sem exitar, Freya comanda os an�es e ataca voc� e Loki, arrancando suas cabe�as. Com o sangue e entranhas do s�bio deus, os an�es confeccionam uma joia para Freya, como um trof�u que recordaria esse honroso dia em que Loki finalmente deixaria a todos em paz.\r\n"
									+ "");
				}
				break;

			case "IMPAR":

				if (faceDado % 2 != 0) {
					System.out.println("O n�mero do dado �: " + faceDado);
					System.out.println("\nVoc� venceu!");
					System.out.println(
							"Ap�s pegar o colar, Loki se transforma em um animal com garras enormes e fortes o suficientes para quebrar as paredes dos corredores das minas.\r\n"
									+ "Abrirei caminho at� a superf�cie, � melhor me acompanhar se n�o quiser morrer aqui.- diz Loki sorrindo como uma crian�a que acabara de receber o presente que tanto esperava.\r\n"
									+ "Chegando � superf�cie, voc�s dois voltam a Asgard e comunicam a Odin o sucesso da miss�o.\r\n"
									+ "----\r\n"
									+ "Poucas horas depois, Freya aparece no sal�o esbravejando sua raiva para cima de voc� e de Loki. Odin interrompe e sentencia a puni��o de Freya:\r\n"
									+ "Freya, o que voc� fez � imperdo�vel. Sua gan�ncia e lux�ria ser�o a sua queda. Voc� descer� a Midgard e plantar� a semente do caos no mundo dos humanos.\r\n"
									+ "Porque os humanos ser�o punidos? - voc� diz indignado com a decis�o de Odin.\r\n"
									+ "Os Vanir cuidam e protegem os humanos. � gra�as a eles que a civiliza��o humana conseguiu se desenvolver a tal ponto. A puni��o de Freya ser� destruir tudo o que protegeu.\r\n"
									+ "Midgard � seu mundo, seus pais humanos moravam l�. N�o � poss�vel que Odin queira destru�-lo. Desacreditado com o que acabara de ouvir, voc� tenta convencer Odin a mudar a puni��o.\r\n"
									+ "");
					venceuCap4 = true;
				} else {
					System.out.println("O n�mero do dado �: " + faceDado);
					System.out.println("\nVoc� perdeu.");
					System.out.println(
							"Freya, guiada pelos an�es, aparece diante de voc�s. O sorriso de Loki havia se esva�do h� algum tempo, ele sabia o que estava por vir. Estavam em desvantagem, n�o poderiam lutar contra todos os an�es e Freya.\r\n"
									+ "Freya, por sua vez, sorria um t�mido sorriso de satisfa��o. Odiava Loki e essa era a oportunidade perfeita para se vingar de todas as travessuras que havia pregado aos deuses. Sem exitar, Freya comanda os an�es e ataca voc� e Loki, arrancando suas cabe�as. Com o sangue e entranhas do s�bio deus, os an�es confeccionam uma joia para Freya, como um trof�u que recordaria esse honroso dia em que Loki finalmente deixaria a todos em paz.\r\n"
									+ "");
				}
			break;
				
			default:
				System.out.println("\nOp��o Inv�lida");

			}

		}
		sc.close();
		return true;
	}

	public static boolean cap5() {

		boolean venceuCap5 = false;

		System.out.println("------------------------------------\n" + "             A PROFECIA\n"
				+ "------------------------------------\n");

		System.out.println("Enquanto os deuses dormiam, o caos se instalou no mundo\n\n"
				+ "O inverno chegou e n�o mais cessou. Povos come�aram a lutar entre si, a fome se espalhou por todos os cantos.\n"
				+ "O Sol e a Lua foram devorados e a escurid�o tomou conta dos c�us. Era o sinal para o in�cio da batalha.\n"
				+ "O ex�rcito de Loki, juntamente com seus filhos marchavam em dire��o a Vigrid para a batalha final.\n"
				+ "Por onde passavam, espalhavam destrui��o e deixavam tudo em chamas.\n\n"
				+ "Ao ver os acontecimentos, Heimdall tocou sua corneta, convocando a todos para a batalha.\n"
				+ "Prevendo os acontecimentos do Ragnarok, Odin esconde um casal de humanos na �rvore do mundo\n"
				+ "para salvar a humanidade da extin��o. Todos os deuses ent�o se dirigem para o campo de batalha.\n\n"
				+ "Sua hora chegou + nomeJogador + ! Sua miss�o � ajudar a conter os planos de Loki e proteger o casal na YggDrasil.");

		System.out.println("DESAFIO....\n");

		System.out.println("Acontece uma batalha em Asgard, o territ�rio dos deuses.\n\n"
				+ "De um lado est�o bem, liderado por Odin, o rei do pante�o e senhor da guerra.\n"
				+ "Do outro, o mal, representado por Loki, um gigante fanfarr�o que vive entre as divindades.\n"
				+ "Balder, filho de Odin e Frigga, amado e admirado por ser belo, inteligente e justo.\n\n"
				+ "Jogador, sua miss�o � impedir que Balder seja morto por Loki, com uma flexa no cora��o.\n\n"
				+ "Ven�a Loki em uma batalha de PEDRA,PAPEL,TESOURA, impedindo a execu��o do seu plano. Armar um armadilha para Balder.\n");

		int jogador, loki;

		Scanner sc = new Scanner(System.in);

		while (venceuCap5 == false) {

			System.out.println("DESAFIO - PEDRA,PAPEL,TESOURA\n");
			System.out.println("1 - PEDRA");
			System.out.println("2 - PAPEL");
			System.out.println("3 - TESOURA");
			System.out.println("\nDigite a op��o desejada: ");

			jogador = sc.nextInt();

			// System.out.println("");

			switch (jogador) {
			case 1:
				System.out.println("Jogador escolheu PEDRA");
				break;

			case 2:
				System.out.println("Jogador escolheu PAPEL");
				break;

			case 3:
				System.out.println("Jogador escolheu TESOURA");
				break;

			default:
				System.out.println("Op��o inv�lida");
				break;
			}

			loki = (int) (Math.random() * 3 + 1);

			sc.reset();

			switch (loki) {
			case 1:
				System.out.println("\nLoki escolheu PEDRA");
				break;

			case 2:
				System.out.println("Loki escolheu PAPEL");
				break;

			case 3:
				System.out.println("Loki escolheu TESOURA");
				break;
			}
			System.out.println("");

			if (jogador == loki) {
				System.out.println(
						"EMPATE! Por pouco o plano maligno de loki n�o foi executado. Se concentre e tente novamente.");
			} else {
				if ((jogador == 1 && loki == 3) || (jogador == 2 && loki == 1) || (jogador == 3 && loki == 2)) {
					System.out.println(
							"PARAB�NS, VOC� VENCEU! A sua garra impediu que as for�as do mal, pairassem sob Asgard.");

					venceuCap5 = true;

				} else {
					System.out.println(
							"LOKI VENCEU! Balder foi morto com uma flecha no cora��o, em uma armadilha tramada por Loki.\n\n");
					System.out.println("Tente novamente");

				}

			}
		}
		sc.close();
		return true;

	}

	public static void cap6() {
		System.out.println("Final cap 6");
	}

}
