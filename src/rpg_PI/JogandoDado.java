package com.mycompany.projetointegrador;

import java.util.Scanner;

public class JogandoDado {

    public static void main(String[] args) {

        char lancar = 's';
        
        char jogadas;

        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        
       int soma = 0;
       
        do {
        
        switch (lancar) {
        
            case's':
            if(contador<=3) {
               
            System.out.println("LANÇAMENTO DO DADO ....\n");

            int dado = (int) (Math.random() * 6 + 1);

            System.out.println("FACE:  " + dado);
            
            soma = soma+dado;
         
            System.out.println("\nDESEJA LANÇAR O DADO NOVAMENTE(s/n)?");
    
            jogadas = teclado.next().charAt(0);
            if(contador == 3) {
               System.out.println("Tentativas esgotadas");
            }
            
           lancar = Character.toLowerCase(jogadas);
           
          contador = contador + 1;
         break; }
        }
          
        }
         while (contador<=3);
        
        if(soma>=11) {
        
        System.out.println("GANHOU");
        } else {
         System.out.println("PERDEU ");
        }
        
      
        

        }
    
        }

        
     
        
        





       
    


