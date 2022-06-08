package com.mycompany.projetointegrador;

import java.util.Scanner;

public class CapituloCinco {

    private static final String AMARELO = "\u001B[33m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println("------------------------------------\n"
                + "             A PROFECIA\n"
                + "-------------------------------------\n");

        System.out.println("  Enquanto os deuses dormiam, o caos se instalou no mundo…\n\n"
                + "O inverno chegou e não mais cessou. Povos começaram a lutar entre si, a fome se espalhou por todos os cantos.\n"
                + "O Sol e a Lua foram devorados e a escuridão tomou conta dos céus. Era o sinal para o início da batalha.\n"
                + "O exército de Loki, juntamente com seus filhos marchavam em direção a Vigrid para a batalha final.\n"
                + "Por onde passavam, espalhavam destruição e deixavam tudo em chamas.\n\n"
                + "Ao ver os acontecimentos, Heimdall tocou sua corneta, convocando a todos para a batalha.\n"
                + "Prevendo os acontecimentos do Ragnarok, Odin esconde um casal de humanos na árvore do mundo\n"
                + "para salvar a humanidade da extinção. Todos os deuses então se dirigem para o campo de batalha.\n\n"
                + "Sua hora chegou + nomeJogador + ! Sua missão é ajudar a conter os planos de Loki e proteger o casal na YggDrasil.");

        System.out.println(/*AMARELO +*/ "\nPRESSIONE ENTER PARA CONTINUAR >>>\n" + RESET);

        System.out.println("DESAFIO....\n");

        System.out.println("Acontece uma batalha em Asgard, o território dos deuses.\n\n"
                + "De um lado está o bem, liderado por Odin, o rei do panteão e senhor da guerra.\n"
                + "Do outro, o mal, representado por Loki, um gigante fanfarrão que vive entre as divindades.\n"
                + "Balder, filho de Odin e Frigga, amado e admirado por ser belo, inteligente e justo.\n\n"
                + "+ nomeJogador+ sua missão é impedir que Balder seja morto por Loki, com uma flexa no coracão.\n\n"
                + "Vença Loki em uma batalha de PEDRA,PAPEL,TESOURA, impedindo a execução do seu plano. Armar um armadilha para Balder.\n");

        int jogador, loki;
        
        Scanner teclado = new Scanner(System.in);
        
        boolean destino;
        
        do { 
        
        destino = false;
            
        System.out.println("DESAFIO - PEDRA,PAPEL,TESOURA\n");
        System.out.println("1 - PEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TESOURA");
        System.out.println("\nDigite a opção desejada: \n");
    
        jogador = teclado.nextInt();
        
        System.out.println("");
        
        switch(jogador) {
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
        
        loki = (int)(Math.random()*3 +1);
        
        teclado.reset();
        
        switch(loki) {
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
        
        if(jogador == loki) {
            System.out.println("EMPATE! Por pouco o plano maligno de loki não foi executado. Se concentre e tente novamente.");
        }
            else {
                if((jogador == 1 && loki == 3) || (jogador == 2 && loki == 1) || (jogador == 3 && loki == 2)) {
                System.out.println("PARABÉNS, VOCÊ VENCEU! A sua garra impediu que as forças do mal, pairasse sob Asgard.");
                
                destino = true;
              
               } else {
                   System.out.println("LOKI VENCEU! Balder é morto com uma flecha no coração, em uma armadilha tramada por Loki.");
                
            }
       
           }               
        }  while (destino ==!true);
    }
    
    }

