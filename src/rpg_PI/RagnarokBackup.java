package rpg_PI;

import java.util.Scanner;
import java.util.Random;

public class RagnarokBackup {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		// variáveis globais
		String nomeJogador = "";
		boolean fenirPreso = false; // teste cap2
		boolean muroTerminado = false; // teste cap3
		boolean pazHumanos = false; // teste cap4

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
				System.out.println("fim de jogo");
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
	public static int jogo() {

		// metodos dos capítulos
		cap1();
		System.out.println("Você Passou pelo Capítulo 1 com sucesso");

		/*
		 * cap2(); System.out.println("Você Passou pelo Capítulo 2 com sucesso");
		 */
		cap3();
		System.out.println("Você Passou pelo Capítulo 3 com sucesso");

		cap4();
		System.out.println("Você Passou pelo Capítulo 4 com sucesso");

		// if (cap1() && cap2()) {
		return 0;
		// }

	}

	public static boolean cap1() {

		int num;
		boolean venceuCap1 = false;

		while (venceuCap1 == false) {

			System.out.println("jogando capitulo 1");

			Scanner sc = new Scanner(System.in);

			System.out.print("Digite um número para saber se é PAR ou ÍMPAR: ");
			num = sc.nextInt();

			if (num % 2 == 0) {
				System.out.println(num + " é PAR.");
				venceuCap1 = true;
			} else {
				System.out.println(num + " é Ímpar");
			}
		}
		return true;

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

		System.out.println("Capitulo 3 - A Grande Muralha.");

		while (venceuCap3 == false) {

			String senha = ("235813");

			System.out.println(" A senha é uma sequência de 5 runas, " + "\n que correspondem aos primeiros "
					+ "\n números da sequencia Fibonacci " + "\n a partir do primeiro numero par");

			System.out.print("Digite a senha (Todos os numeros na sequencia): ");

			String palpite = ("");
			palpite = sc.next();

			if (palpite.equals(senha)) {
				System.out.println("Você acertou!");
				venceuCap3 = true;
			} else {
				System.out.println("Você errou");
			}

		}
		sc.close();

		return true;
	}

	public static boolean cap4() {

		boolean venceuCap4 = false;

		while (venceuCap4 == false) {

			Random aleatorio = new Random();

			// Jogo de dados deve-se tirar um numero maior que 3
			int faceDado = aleatorio.nextInt(5) + 1;// sorteia uma face de 0 a 5 por isso deve-se somar 1 para ser de 1
													// a 6

			System.out.println("O número do dado é: " + faceDado);
			if (faceDado > 3) {
				System.out.println("Você venceu!");
				venceuCap4 = true;
			} else {
				System.out.println("Você perdeu.");
			}

		}

		return true;
	}

}
