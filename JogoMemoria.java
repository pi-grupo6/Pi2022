package rpg_PI;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JogoMemoria {
	public static boolean main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
				e.printStackTrace();
			}
			
			//limparTela();
			System.out.println("Escreva abaixo sequência correta. ");
			
			int resposta[]=new int[5];
		
			for(int i=0; i<=4;i++){
				System.out.print(i+1 + "° número: ");
				resposta[i] = sc.nextInt();
		    }
			 
			for(int i=0; i<=4;i++)  
			        if (enunciado[i]== resposta[i]) {
					    	teste1 = true;
					    } else {					    	
			          teste1=false;
					    }
					    
			sc.close();
		    
		    return teste1;
	}

}
