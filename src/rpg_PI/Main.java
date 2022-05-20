
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
	        + "                 CAP�TULO 1: CONVOCA��O\n"
	        + "-----------------------------------------------------"+RESET);
	continuar();


	System.out.println(VERDE +"  Alguns dias voc� recebeu uma mensagem de Odin,convocando-o\n"
	                + "at� seu sal�o em Asgard. Seu pai fora um deus\n"
	                + "que lutara ao lado de Odin na guerra contra os Franir, mas\n"
	                + "nunca o havia levado at� Asgard. Sua m�e era humana e n�o\n"
	                + "tinha permiss�o para adentrar aquele mundo, onde somente os\n"
	                + "mais bravos guerreiros que tiveram uma morte digna podem ficar.\n"
	                + " Mas hoje voc� ali estava, naquele sal�o grandioso, com\n"
	                + "in�meros escudos dourados enfeitando seu teto. As belas\n"
	                + "valqu�rias serviam a todos que ali estavam. Parecia um sonho.\n"
	                + "Heimdall o guiou desde a ponte do arco-�ris e anunciou sua presen�a a Odin.\n"
	                + "O rei dos deuses, ao notar sua presen�a, ordena a todos que saiam do sal�o,\n"
	                + "ficando apenas Thor e Heimdall."+ RESET);
	  continuar();
	  limparTela();
	 
	  // Deixar um cor �nica pra destacar a narrativa do narrador. Assim n�o confundindo as falas
	  
	  System.out.println("- Seja bem-vindo a Asgard, + nomeJogador + !- diz Odin.\n"+
	                     
	"- H� muito tempo seu pai me serviu e morou aqui. Hoje eu preciso que voc� me ajude a salvar os 9 mundos.\n"+
	                     
	"- E o que eu, um mero humano poderia fazer para ajud�-lo? - voc� responde com um leve tom ir�nico.\n"+
	                     
	"- Eu vi o futuro em meus sonhos. E nesse futuro o mundo se acabar� em chamas."
	+ " Mas voc� me ajudar� a impedir tudo isso. Voc� herdou a for�a e a intelig�ncia de seu pai, "
	+ "pe�o que se una a n�s e nos ajude a capturar os filhos de Loki.");
	  
	  continuar();
	  
	 System.out.println(VERDE + "Certamente, voc� possu�a uma for�a sobre-humana, mas nunca lutara contra um deus. "
	 		+ "Enquanto voc� ponderava sobre a proposta de Odin, as portas do sal�o se abrem de repente:\n"+ RESET+
	                    
		"- Odin! Meu caro, vejo que trouxe uma visita inusitada a esta terra. Um humano?" + VERDE + "- diz Loki, sorrindo. "
				+ "Era poss�vel perceber um leve tom de desprezo em seu olhar.\n"+ RESET+
	                    
	  "- Loki, os seus filhos s�o uma amea�a para n�s. Espero que n�o tenha vindo at� aqui se opor aos meus planos."
	  + " - diz Odin com um tom amea�ador.\n"
	  + "	- Mas � claro que n�o! Vim apenas cumpriment�-lo...\n"
	  + "	- Chega de enrola��o, vamos logo garoto! -  diz Thor, afastando Loki do caminho enquanto "
	  + "acenava a voc� para que o acompanhasse.");
	 
	 continuar();
	 limparTela();
	
	 
	 System.out.println("Ap�s reunir o ex�rcito, voc� e Thor v�o at� o lar da giganta Angrboda, a m�e dos filhos de Loki.\n"
	 		+ "  A fortaleza era enorme, com um grande sal�o na sua parte externa. Felizmente n�o havia ningu�m para det�-los, "
	 		+ "mas as crian�as eram gigantes e n�o seria t�o f�cil captur�-las.\n"
	 		+ "- Essa � sua chance de mostrar o qu�o capaz �, garoto.- diz Thor"
	 		+ " - V� e lute contra os dois mais velhos, eu darei conta do lobo.\r\n"
	 		+ "Thor havia lhe dado uma lan�a para lutar. Ela era pesada, mas conseguia esticar e diminuir "
	 		+ "seu tamanho quando ordenasse. A crian�a mais perto era Jorgmund, uma serpente enorme.\n"
	 		+ "Voc� se prepara para lutar contra o primeiro filho de Loki");
	 continuar();
	
	 System.out.println(VERMELHO +"-----------------------------------------------------\n"
		        + "               		  DESAFIO 1\n"
		        + "-----------------------------------------------------"+RESET+
		        "\nPara passar este desafio, memorize a sequ�ncia de n�meros a seguir. Voc� ter� 10 segundos.");
	 
	 do{
		 result=jogoMemoria();
	 } while (result ==!true);
		 System.out.println("Parab�ns! Voc� passou esse desafio!");
	limparTela();
		 
	 System.out.println("	Ap�s alguns poucos golpes, a serpente cai no ch�o. Rapidamente voc� a amarra em um tronco "
			+ "com a ajuda dos outros deuses.\n	Assim que recupera o f�lego, voc� vai at� a segunda filha."
			+ "Ao se aproximar por um lado, voc� v� uma bela garota sentada ao ch�o e observando a todos."
			+ "No entanto, quando a garota vira sua face para te encarar, a metade de seu rosto que"
			+ " lembra a morte o faz se espantar e pular para tr�s. Voc� empunha sua arma novamente e se prepara para o ataque.");
			     
	 System.out.println(VERMELHO +"-----------------------------------------------------\n"
		        + "               		  DESAFIO 2\n"
		        + "-----------------------------------------------------"+RESET+
		        "\nPara passar este desafio, memorize a sequ�ncia de n�meros a seguir. Voc� ter� 10 segundos.");
	 
	 do{
		 result=jogoMemoria();
	 } while (result ==!true);
	 limparTela();
	 
		 System.out.println("Ap�s vencer os dois irm�os, voc� acena para Thor, que o ajuda a prend�-los.\n"
		 		+ "	- Pelo visto os sonhos de Odin n�o estavam errados!"
		 		+ " Vamos voltar a Asgard antes que os gigantes apare�am. - diz Thor orgulhoso de seu feito.\n"
		 		+ "Ao chegar no sal�o, Odin decide o destino de cada um dos filhos de Loki: "
		 		+ "A serpente � jogada no mar para que n�o pudesse ferir ningu�m. "
		 		+ "Hell foi enviada para governar o submundo, pois sua apar�ncia grotesca e p�trida incomodava a todos. "
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
		boolean teste1;//testa se passou ou n�o no desafio
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
			System.out.println("Escreva abaixo sequ�ncia correta. ");
			
			int resposta[]=new int[5];
		
			for(int i=0; i<=4;i++){
				System.out.print(i+1 + "� n�mero: ");
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



		



