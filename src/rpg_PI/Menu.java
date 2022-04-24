package rpg_PI;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		System.out.println("1 - Introdução");
		System.out.println("2 - Jogar");
		System.out.println("3 - Créditos");
		System.out.println("4 - Sair");

		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.print("Digite a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println(
						"Bem vindo jogador! A aventura começa agora.\nNavegue pela história desde a criação do mundo"
								+ " e a profecia do Ragnarok. \nSerá que você consegue evita-la?");
				break;
			case 2:
				System.out.println("Opção 2 - Jogar - verificar como executar a classe game aqui dentro");
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
				System.out.println("Opção 4 - Sair \n" + "Você saiu do menu. Para iniciar um novo jogo, execute novamente.");
				break;

			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 4);

		sc.close();
		
	}
}

	



