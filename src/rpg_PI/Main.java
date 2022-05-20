
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Random;


public class Main {
	public static Scanner resp = new Scanner(System.in);
	private static final String VERMELHO = "\u001B[31m";
	private static final String VERDE = "\u001B[32m";
	private static final String AMARELO = "\u001B[33m";
	private static final String BRANCO = "\u001B[37m";
	public static final String CYAN = "\u001B[36m";
	public static final String RESET = "\u001B[0m";
	    
public static void main(String[] args)throws IOException {
	boolean result=false;
	     
	System.out.println(CYAN +"-----------------------------------------------------\n"
	        + "                 CAPÍTULO 1: CONVOCAÇÃO\n"
	        + "-----------------------------------------------------"+RESET);
	continuar();


	System.out.println(VERDE +"  Alguns dias você recebeu uma mensagem de Odin,convocando-o\n"
	                + "até seu salão em Asgard. Seu pai fora um deus\n"
	                + "que lutara ao lado de Odin na guerra contra os Franir, mas\n"
	                + "nunca o havia levado até Asgard. Sua mãe era humana e não\n"
	                + "tinha permissão para adentrar aquele mundo, onde somente os\n"
	                + "mais bravos guerreiros que tiveram uma morte digna podem ficar.\n"
	                + " Mas hoje você ali estava, naquele salão grandioso, com\n"
	                + "inúmeros escudos dourados enfeitando seu teto. As belas\n"
	                + "valquírias serviam a todos que ali estavam. Parecia um sonho.\n"
	                + "Heimdall o guiou desde a ponte do arco-íris e anunciou sua presença a Odin.\n"
	                + "O rei dos deuses, ao notar sua presença, ordena a todos que saiam do salão,\n"
	                + "ficando apenas Thor e Heimdall."+ RESET);
	  continuar();
	  limparTela();
	 
	  // Deixar um cor única pra destacar a narrativa do narrador. Assim não confundindo as falas
	  
	  System.out.println("- Seja bem-vindo a Asgard, + nomeJogador + !- diz Odin.\n"+
	                     
	"- Há muito tempo seu pai me serviu e morou aqui. Hoje eu preciso que você me ajude a salvar os 9 mundos.\n"+
	                     
	"- E o que eu, um mero humano poderia fazer para ajudá-lo? - você responde com um leve tom irônico.\n"+
	                     
	"- Eu vi o futuro em meus sonhos. E nesse futuro o mundo se acabará em chamas."
	+ " Mas você me ajudará a impedir tudo isso. Você herdou a força e a inteligência de seu pai, "
	+ "peço que se una a nós e nos ajude a capturar os filhos de Loki.");
	  
	  continuar();
	  
	 System.out.println(VERDE + "Certamente, você possuía uma força sobre-humana, mas nunca lutara contra um deus. "
	 		+ "Enquanto você ponderava sobre a proposta de Odin, as portas do salão se abrem de repente:\n"+ RESET+
	                    
		"- Odin! Meu caro, vejo que trouxe uma visita inusitada a esta terra. Um humano?" + VERDE + "- diz Loki, sorrindo. "
				+ "Era possível perceber um leve tom de desprezo em seu olhar.\n"+ RESET+
	                    
	  "- Loki, os seus filhos são uma ameaça para nós. Espero que não tenha vindo até aqui se opor aos meus planos."
	  + " - diz Odin com um tom ameaçador.\n"
	  + "	- Mas é claro que não! Vim apenas cumprimentá-lo...\n"
	  + "	- Chega de enrolação, vamos logo garoto! -  diz Thor, afastando Loki do caminho enquanto "
	  + "acenava a você para que o acompanhasse.");
	 
	 continuar();
	 limparTela();
	
	 
	 System.out.println("Após reunir o exército, você e Thor vão até o lar da giganta Angrboda, a mãe dos filhos de Loki.\n"
	 		+ "  A fortaleza era enorme, com um grande salão na sua parte externa. Felizmente não havia ninguém para detê-los, "
	 		+ "mas as crianças eram gigantes e não seria tão fácil capturá-las.\n"
	 		+ "- Essa é sua chance de mostrar o quão capaz é, garoto.- diz Thor"
	 		+ " - Vá e lute contra os dois mais velhos, eu darei conta do lobo.\r\n"
	 		+ "Thor havia lhe dado uma lança para lutar. Ela era pesada, mas conseguia esticar e diminuir "
	 		+ "seu tamanho quando ordenasse. A criança mais perto era Jorgmund, uma serpente enorme.\n"
	 		+ "Você se prepara para lutar contra o primeiro filho de Loki");
	 continuar();
	
	 System.out.println(VERMELHO +"-----------------------------------------------------\n"
		        + "               		  DESAFIO 1\n"
		        + "-----------------------------------------------------"+RESET+
		        "\nPara passar este desafio, memorize a sequência de números a seguir. Você terá 10 segundos.");
	 
	 do{
		 result=jogoMemoria();
	 } while (result ==!true);
		 System.out.println("Parabéns! Você passou esse desafio!");
	limparTela();
		 
	 System.out.println("	Após alguns poucos golpes, a serpente cai no chão. Rapidamente você a amarra em um tronco "
			+ "com a ajuda dos outros deuses.\n	Assim que recupera o fôlego, você vai até a segunda filha."
			+ "Ao se aproximar por um lado, você vê uma bela garota sentada ao chão e observando a todos."
			+ "No entanto, quando a garota vira sua face para te encarar, a metade de seu rosto que"
			+ " lembra a morte o faz se espantar e pular para trás. Você empunha sua arma novamente e se prepara para o ataque.");
			     
	 System.out.println(VERMELHO +"-----------------------------------------------------\n"
		        + "               		  DESAFIO 2\n"
		        + "-----------------------------------------------------"+RESET+
		        "\nPara passar este desafio, memorize a sequência de números a seguir. Você terá 10 segundos.");
	 
	 do{
		 result=jogoMemoria();
	 } while (result ==!true);
	 limparTela();
	 
		 System.out.println("Após vencer os dois irmãos, você acena para Thor, que o ajuda a prendê-los.\n"
		 		+ "	- Pelo visto os sonhos de Odin não estavam errados!"
		 		+ " Vamos voltar a Asgard antes que os gigantes apareçam. - diz Thor orgulhoso de seu feito.\n"
		 		+ "Ao chegar no salão, Odin decide o destino de cada um dos filhos de Loki: "
		 		+ "A serpente é jogada no mar para que não pudesse ferir ninguém. "
		 		+ "Hell foi enviada para governar o submundo, pois sua aparência grotesca e pútrida incomodava a todos. "
		 		+ "Fenrir ainda era pequeno e ficou aos cuidados do deus Tyr.\n"
		 		+ "");
	 
	 }
	 
	
	public static void limparTela() {
	    try {
	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}catch (Exception ex) {
	      ex.printStackTrace();
	    }	
	}
	public static void continuar()throws IOException{

	System.out.print("Pressione ENTER para continuar...");
	       System.in.read();      
	}
	
	public static boolean jogoMemoria() {
		
		Random numeros = new Random();
		int enunciado[] = new int[5];
		boolean teste1;//testa se passou ou não no desafio
		teste1= false;
		
		
			System.out.print("[ ");
			for (int n=0;n<=4;n++) {
				enunciado[n]= numeros.nextInt(100);
				System.out.print(enunciado[n]+" ");
			}
			
			System.out.print("]");
			try {
				TimeUnit.SECONDS.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			limparTela();
			System.out.println("Escreva abaixo sequência correta. ");
			
			int resposta[]=new int[5];
		
			for(int i=0; i<=4;i++){
				System.out.print(i+1 + "° número: ");
				resposta[i] = resp.nextInt();
		    }
			 
			for(int i=0; i<=4;i++)  
			        if (enunciado[i]== resposta[i]) {
					    	teste1 = true;
					    } else {					    	
			          teste1=false;
					    }
					    
			resp.reset();
		    
		    return teste1;
	}
}



		



