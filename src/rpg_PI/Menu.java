package rpg_PI;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		System.out.println("1 - Introdu��o");
		System.out.println("2 - Jogar");
		System.out.println("3 - Cr�ditos");
		System.out.println("4 - Sair");

		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.print("Digite a op��o desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println(
						"Bem vindo jogador! A aventura come�a agora.\nNavegue pela hist�ria desde a cria��o do mundo"
								+ " e a profecia do Ragnarok. \nSer� que voc� consegue evita-la?");
				break;
			case 2:
				System.out.println("Op��o 2 - Jogar - verificar como executar a classe game aqui dentro");
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
				System.out.println("Op��o 4 - Sair \n" + "Voc� saiu do menu. Para iniciar um novo jogo, execute novamente.");
				break;

			default:
				System.out.println("Op��o inv�lida.");
			}

		} while (opcao != 4);

		sc.close();
		
	}
}

	



