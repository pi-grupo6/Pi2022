package rpg_PI;

import java.util.Scanner;

public class Ragnarok {

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
	public static void jogo() {

		// metodos dos capítulos
		cap1();

		System.out.println("Você Passou pelo Capítulo 1 com sucesso");

		// cap2();

	}

	static int cap1() {

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
		return 0;

	}

	/*
	 * static boolean cap2() { System.out.println("jogando capitulo 2");
	 * 
	 * return true; }
	 */
}
