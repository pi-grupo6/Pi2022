package rpg_PI;

import java.util.Scanner;

public class Ragnarok {

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
				System.out.println("fim de jogo");
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
		cap1();

		System.out.println("Voc� Passou pelo Cap�tulo 1 com sucesso");

		// cap2();

	}

	static int cap1() {

		int num;
		boolean venceuCap1 = false;

		while (venceuCap1 == false) {

			System.out.println("jogando capitulo 1");

			Scanner sc = new Scanner(System.in);

			System.out.print("Digite um n�mero para saber se � PAR ou �MPAR: ");
			num = sc.nextInt();

			if (num % 2 == 0) {
				System.out.println(num + " � PAR.");
				venceuCap1 = true;
			} else {
				System.out.println(num + " � �mpar");
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
