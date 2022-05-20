package rpg_PI;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Ragnarok {

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
			System.out.println("1 - Introdução");
			System.out.println("2 - Jogar");
			System.out.println("3 - Créditos");
			System.out.println("4 - Sair");
			System.out.print("Digite a opção desejada:");

			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println(
						"Bem vindo jogador! A aventura começa agora.\nNavegue pela história desde a criação do mundo"
								+ " e a profecia do Ragnarok. \nSerá que você consegue evita-la?");
				break;
			case 2:
				System.out.println("Opção 2 - Jogar -");

				// chamando o metodo jogo
				jogo();
				System.out.println("Fim de jogo");
				System.exit(0);
				break;
			case 3:
				System.out.println("Créditos:"

						+ "\nEnredo e roteiro: " + "\nLuana Donomai e Valdinei Santana dos Reis"

						+ "\nDesenvolvimento:"
						+ "\nCarolina Orlowski Damaceno, Ítalo Felix Terciano, Luana Donomai, Valdinei Santana, Jose Ivo Oliveira Silva."

						+ "\nInformações Técnicas:"
						+ "\nEste projeto foi desenvolvido na linguagem Java 17 e IDE Eclipse, pelo grupo 6 da turma D de Projeto Integrador.");
				break;
			case 4:
				System.out.println(
						"Opção 4 - Sair \n" + "Você saiu do menu. Para iniciar um novo jogo, execute novamente.");
				break;

			default:
				System.out.println("Opção inválida.");
			}

		}

		sc.close();

	}

	// metodo do inicio do jogo
	public static void jogo() {

		// metodos dos capítulos
		// cap1();
		// System.out.println("Você Passou pelo Capítulo 1 com sucesso");

		// cap2(); System.out.println("Você Passou pelo Capítulo 2 com sucesso");

		// cap3();
		System.out.println("Você Passou pelo Capítulo 3 com sucesso");

		cap4();
		System.out.println("Você Passou pelo Capítulo 4 com sucesso");

		cap5();
		System.out.println("Você Passou pelo Capítulo 5 com sucesso");

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
				"Na semana seguinte, Odin reuniu todos no salão para discutir sobre a estrutura de defesa de Asgard. "
						+ "\nThor era forte e dava conta de todos os inimigos, mas agora não estava lá, fora lutar contra os gigantes problemáticos de Jotunheim. "
						+ "\nEra necessário construir um muro que fosse capaz de conter desde o mais forte dos trolls até o maior das criaturas.\r\n"
						+ "- Precisamos de alguém que construa esse muro o mais rápido possível - disse Odin.\r\n"
						+ "- Ha, mesmo assim levaria anos para terminar. A sua profecia não está prestes a ocorrer? - riu Loki, tentando conter sua excitação ao ver a preocupação dos deuses.\r\n"
						+ "- Podemos enviar (nome do jogador) para reunir os melhores construtores. Os anões poderiam fabricar um equip…- dizia Freya quando foi interrompida por Heimdall:\r\n"
						+ "- Odin, há um construtor que diz ser capaz de construir a muralha em três estações. Mas a recompensa que ele pede é absurda…exigiu o Sol, a Lua e a mão de Freya..\r\n"
						+ "- É um valor muito alto, mande-o embora. - irritou-se Odin.\r\n"
						+ "- Mas precisamos do muro! É uma boa proposta, não há ninguém capaz de tal façanha neste mundo! - adiantou-se Loki\r\n"
						+ "- Você parece animado Loki, ficarei feliz em me voltar contra vocês quando eu for embora para o reino desse construtor - rebateu Freya com a frieza que somente a mais bela deusa sabia demonstrar.\r\n"
						+ "- Diminuamos o prazo. Daremos a ele somente uma estação, durante a qual ele terá que construir sozinho, sem ajuda. Será impossível que ele finalize tão rápido."
						+ "\n E então o mandamos embora sem nada tendo a estrutura do muro já em andamento! - disse Loki, orgulhoso de sua inteligência.\r\n"
						+ "- Assim faremos então, chame-o Heimdall - ordenou Odin.\r\n"
						+ "Foi passado ao construtor os termos que os deuses estipularam. Sem se abalar, o construtor deu início à construção do muro.\r\n"
						+ "Para a surpresa de todos, em apenas 2 semanas ele já havia levantado metade do muro. Nesse ritmo, terminaria tudo antes mesmo do final do inverno. Desesperado, Odin lhe ordena que atrapalhe o construtor e impeça a finalização do muro.\r\n");

		while (venceuCap3 == false) {

			String senha = ("235813");

			System.out.println("Jogador, para interromper a construção do muro, tranque o baú:\n");

			System.out.println(
					"Para trancar, desvende o seguinte mistério: a senha é uma sequência de 5 runas, que correspondem aos primeiros números da sequencia Fibonacci a partir do primeiro numero par.");

			System.out.print("\nDigite a senha (Todos os números na sequencia): ");

			String palpite = ("");
			palpite = sc.next();

			if (palpite.equals(senha)) {
				System.out.println("Você acertou!");
				System.out.println(
						"Ao terminar o prazo, os deuses riam com a derrota do construtor. Se gabavam de seu plano bem sucedido. Não haviam gastado um único recurso e a muralha estava quase completa. \r\n"
								+ "\nVocês trapacearam! Se não tivessem me atrapalhado, eu teria finalizado esse muro há dias! - gritou o construtor enfurecido, revelando sua verdadeira forma gigantesca.\r\n"
								+ "\nE você trapaceou ao esconder sua verdadeira forma! - você diz, empunhando sua arma e se preparando para a batalha.\r\n");
				System.out.println(
						"\nVocês poderiam ter me esperado para a festa! - disse Thor, ao ver o inimigo derrotado no chão.\r\n"
								+ "\nJogador, você teve sucesso e conseguiu interromper a construção do muro!\r\n");
				venceuCap3 = true;
			} else {
				System.out.println("Você errou!");
				System.out.println(
						"\n não dar o último golpe, o gigante percebe a presença de Thor, mas antes que possa reagir é nocauteado com um golpe do poderoso martelo.\r\n"
								+ "\nVejo que vocês se divertiram durante minha ausência. Ainda bem que cheguei a tempo da festa! - disse Thor animado com a luta que antecedera.\r\n + \"Jogador, você falhou e não conseguiu interromper a construção do muro!\\r\\n");
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
				"Algum tempo depois, Loki volta a Asgard com um sorriso irônico no rosto, dirigindo-se a Odin:\r\n"
						+ "Odin, trago ótimas notícias de Svartalfheim!\r\n"
						+ "Mais uma competição de presentes? - Pergunta Odin.\r\n"
						+ "Não, algo muito melhor! Desta vez são eles que estão recebendo um agrado dos deuses..\r\n"
						+ "Pare de enrolar e diga logo.\r\n"
						+ "Sua querida neta Freya está se engraçando com os anões para conseguir uma jóia. Ao que ouvi dizerem, os anões estão fazendo fila para passar uma noite com ela!\r\n"
						+ "Maldita seja! Jogador! Você e Loki irão até a terra dos anões acabar com essa orgia.- diz Odin enfurecido pelos atos de Freya\r\n"
						+ "—----\r\n"
						+ "Ao se aproximar de Svartalfheim, Loki aponta para uma pequena construção em meio à floresta. No horizonte era possível observar pequenas construções humanas e ouvir a agitação da vida noturna. O local era calmo e trazia uma sensação de paz, não parecia que perto era a morada dos elfos negros, conhecidos por sua ganância e trapaças.\r\n"
						+ "Seguindo em direção à construção era possível sentir o cheiro metálico e empoeirado característico de minas. Na entrada havia uma longa escada que adentrava a terra e de onde era possível observar apenas a escuridão.\r\n"
						+ "Descendo essa escada chegaremos à terra dos anões. Fique atento se não quiser passar o resto da vida vagando por esse labirinto que eles construíram. - diz Loki\r\n"
						+ "E como vamos encontrar Freya?\r\n"
						+ "Não iremos encontrar Freya, ela irá nos encontrar. Roubaremos o colar que ela tanto deseja e voltamos para Asgard hahahah.\r\n"
						+ "");

		System.out.println("Para avançar na jornada Jogador, lançe os dados e tente a sorte! \n\n");

		while (venceuCap4 == false) {

			System.out.print("Escolha entre ímpar e par:");

			escolha = sc.next();

			Random aleatorio = new Random();

			// Jogo de dados deve-se tirar um numero maior que 3
			int faceDado = aleatorio.nextInt(5) + 1;// sorteia uma face de 0 a 5 por isso deve-se somar 1 para ser de 1
													// a 6

			

			switch (escolha.toUpperCase()) {

			case "PAR":

				if (faceDado % 2 == 0) {
					System.out.println("O número do dado é: " + faceDado);
					System.out.println("\nVocê venceu!");
					System.out.println(
							"Após pegar o colar, Loki se transforma em um animal com garras enormes e fortes o suficientes para quebrar as paredes dos corredores das minas.\r\n"
									+ "Abrirei caminho até a superfície, é melhor me acompanhar se não quiser morrer aqui.- diz Loki sorrindo como uma criança que acabara de receber o presente que tanto esperava.\r\n"
									+ "Chegando à superfície, vocês dois voltam a Asgard e comunicam a Odin o sucesso da missão.\r\n"
									+ "----\r\n"
									+ "Poucas horas depois, Freya aparece no salão esbravejando sua raiva para cima de você e de Loki. Odin interrompe e sentencia a punição de Freya:\r\n"
									+ "Freya, o que você fez é imperdoável. Sua ganância e luxúria serão a sua queda. Você descerá a Midgard e plantará a semente do caos no mundo dos humanos.\r\n"
									+ "Porque os humanos serão punidos? - você diz indignado com a decisão de Odin.\r\n"
									+ "Os Vanir cuidam e protegem os humanos. É graças a eles que a civilização humana conseguiu se desenvolver a tal ponto. A punição de Freya será destruir tudo o que protegeu.\r\n"
									+ "Midgard é seu mundo, seus pais humanos moravam lá. Não é possível que Odin queira destruí-lo. Desacreditado com o que acabara de ouvir, você tenta convencer Odin a mudar a punição.\r\n"
									+ "");
					venceuCap4 = true;
				} else {
					System.out.println("O número do dado é: " + faceDado);
					System.out.println("\nVocê perdeu.");
					System.out.println(
							"Freya, guiada pelos anões, aparece diante de vocês. O sorriso de Loki havia se esvaído há algum tempo, ele sabia o que estava por vir. Estavam em desvantagem, não poderiam lutar contra todos os anões e Freya.\r\n"
									+ "Freya, por sua vez, sorria um tímido sorriso de satisfação. Odiava Loki e essa era a oportunidade perfeita para se vingar de todas as travessuras que havia pregado aos deuses. Sem exitar, Freya comanda os anões e ataca você e Loki, arrancando suas cabeças. Com o sangue e entranhas do sábio deus, os anões confeccionam uma joia para Freya, como um troféu que recordaria esse honroso dia em que Loki finalmente deixaria a todos em paz.\r\n"
									+ "");
				}
				break;

			case "IMPAR":

				if (faceDado % 2 != 0) {
					System.out.println("O número do dado é: " + faceDado);
					System.out.println("\nVocê venceu!");
					System.out.println(
							"Após pegar o colar, Loki se transforma em um animal com garras enormes e fortes o suficientes para quebrar as paredes dos corredores das minas.\r\n"
									+ "Abrirei caminho até a superfície, é melhor me acompanhar se não quiser morrer aqui.- diz Loki sorrindo como uma criança que acabara de receber o presente que tanto esperava.\r\n"
									+ "Chegando à superfície, vocês dois voltam a Asgard e comunicam a Odin o sucesso da missão.\r\n"
									+ "----\r\n"
									+ "Poucas horas depois, Freya aparece no salão esbravejando sua raiva para cima de você e de Loki. Odin interrompe e sentencia a punição de Freya:\r\n"
									+ "Freya, o que você fez é imperdoável. Sua ganância e luxúria serão a sua queda. Você descerá a Midgard e plantará a semente do caos no mundo dos humanos.\r\n"
									+ "Porque os humanos serão punidos? - você diz indignado com a decisão de Odin.\r\n"
									+ "Os Vanir cuidam e protegem os humanos. É graças a eles que a civilização humana conseguiu se desenvolver a tal ponto. A punição de Freya será destruir tudo o que protegeu.\r\n"
									+ "Midgard é seu mundo, seus pais humanos moravam lá. Não é possível que Odin queira destruí-lo. Desacreditado com o que acabara de ouvir, você tenta convencer Odin a mudar a punição.\r\n"
									+ "");
					venceuCap4 = true;
				} else {
					System.out.println("O número do dado é: " + faceDado);
					System.out.println("\nVocê perdeu.");
					System.out.println(
							"Freya, guiada pelos anões, aparece diante de vocês. O sorriso de Loki havia se esvaído há algum tempo, ele sabia o que estava por vir. Estavam em desvantagem, não poderiam lutar contra todos os anões e Freya.\r\n"
									+ "Freya, por sua vez, sorria um tímido sorriso de satisfação. Odiava Loki e essa era a oportunidade perfeita para se vingar de todas as travessuras que havia pregado aos deuses. Sem exitar, Freya comanda os anões e ataca você e Loki, arrancando suas cabeças. Com o sangue e entranhas do sábio deus, os anões confeccionam uma joia para Freya, como um troféu que recordaria esse honroso dia em que Loki finalmente deixaria a todos em paz.\r\n"
									+ "");
				}
			break;
				
			default:
				System.out.println("\nOpção Inválida");

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
				+ "O inverno chegou e não mais cessou. Povos começaram a lutar entre si, a fome se espalhou por todos os cantos.\n"
				+ "O Sol e a Lua foram devorados e a escuridão tomou conta dos céus. Era o sinal para o início da batalha.\n"
				+ "O exército de Loki, juntamente com seus filhos marchavam em direção a Vigrid para a batalha final.\n"
				+ "Por onde passavam, espalhavam destruição e deixavam tudo em chamas.\n\n"
				+ "Ao ver os acontecimentos, Heimdall tocou sua corneta, convocando a todos para a batalha.\n"
				+ "Prevendo os acontecimentos do Ragnarok, Odin esconde um casal de humanos na árvore do mundo\n"
				+ "para salvar a humanidade da extinção. Todos os deuses então se dirigem para o campo de batalha.\n\n"
				+ "Sua hora chegou + nomeJogador + ! Sua missão é ajudar a conter os planos de Loki e proteger o casal na YggDrasil.");

		System.out.println("DESAFIO....\n");

		System.out.println("Acontece uma batalha em Asgard, o território dos deuses.\n\n"
				+ "De um lado estão bem, liderado por Odin, o rei do panteão e senhor da guerra.\n"
				+ "Do outro, o mal, representado por Loki, um gigante fanfarrão que vive entre as divindades.\n"
				+ "Balder, filho de Odin e Frigga, amado e admirado por ser belo, inteligente e justo.\n\n"
				+ "Jogador, sua missão é impedir que Balder seja morto por Loki, com uma flexa no coração.\n\n"
				+ "Vença Loki em uma batalha de PEDRA,PAPEL,TESOURA, impedindo a execução do seu plano. Armar um armadilha para Balder.\n");

		int jogador, loki;

		Scanner sc = new Scanner(System.in);

		while (venceuCap5 == false) {

			System.out.println("DESAFIO - PEDRA,PAPEL,TESOURA\n");
			System.out.println("1 - PEDRA");
			System.out.println("2 - PAPEL");
			System.out.println("3 - TESOURA");
			System.out.println("\nDigite a opção desejada: ");

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
				System.out.println("Opção inválida");
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
						"EMPATE! Por pouco o plano maligno de loki não foi executado. Se concentre e tente novamente.");
			} else {
				if ((jogador == 1 && loki == 3) || (jogador == 2 && loki == 1) || (jogador == 3 && loki == 2)) {
					System.out.println(
							"PARABÉNS, VOCÊ VENCEU! A sua garra impediu que as forças do mal, pairassem sob Asgard.");

					venceuCap5 = true;

				} else {
					System.out.println(
							"LOKI VENCEU! Balder foi morto com uma flecha no coração, em uma armadilha tramada por Loki.\n\n");
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
