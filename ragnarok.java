package rpg_PI;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Random;


public class ragnarok {

    // variaveis globais
    public static String nomeJogador;
    public static boolean fenrirPreso = false; // teste cap2
    public static boolean muroTerminado = false; // teste cap3
    public static boolean pazHumanos = false; // teste cap4
    private static Scanner comando;

    public static void main(String[] args) throws IOException {

        comando = new Scanner(System.in);
        int opcao = 0;
        System.out.println("BEM VINDO AO RAGNAROK UM JOGO RPG DE MUITA AÇÃO E AVENTURA\n"
                + "QUE LHE DISPERTARÁ O DEUS INTERIOR QUE EXISTE EM VOCÊ!\n");
        continuar();
        while (opcao != 4) {
            System.out.println("----Menu----");
            System.out.println("1 - Introdução");
            System.out.println("2 - Instruções");
            System.out.println("3 - Jogar");
            System.out.println("4 - Créditos");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada:");
            opcao = comando.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\"-----------------------------------------------------\n"
                            + "                 INTRODUÇÃO\n"
                            + "-----------------------------------------------------");
                    System.out.println("	Na Mitologia Nórdica o universo era um disco gigante, formado por nove mundos.\r\n"
                            + "No centro do universo há Yggdrasil – uma árvore colossal que é o eixo do mundo – que liga os nove mundos da cosmologia nórdica. Suas raízes se encontram em Niflheim, o mundo do frio, da névoa e da neve. Mundo sombrio onde se localizavam árvores assombradas e um solo onde não se produzia nada, havia uma escuridão profunda e era habitado por gigantes e monstros.\r\n"
                            + "É possível viajar pelos mundos por meio da ponte arco-íris - Bifrost - guardada por Heimdall, o deus que tudo vê.\r\n"
                            + "No seu tronco estava Midgard, o mundo dos humanos, domínio da deusa Jörd e era cercado por oceanos.\r\n"
                            + "Na parte mais alta, que se dizia tocar o Sol e a Lua, encontrava-se o reino de Asgard (a cidade dourada), o reino dos deuses, com seu Valhala, local onde os guerreiros vikings eram recebidos após terem morrido, com grande honra, em batalha.\r\n"
                            + "Havia também o Vanaheim, repouso dos Vanir - deuses mais benevolentes, relacionados a agricultura, a fertilidade, comércio, prazer e paz.\r\n"
                            + "O outro reino era Helgardh, mundo dos mortos governado pela deusa Hela (ou Hel), esse é um reino mais frio, escuro e mais baixo. Encontra-se abaixo da terceira raiz de Yggdrasil.\r\n"
                            + "Havia também o Svartalfheim, o mundo dos anões ou elfos escuros e o Alfheim, o mundo dos elfos claros.\r\n"
                            + "Jotunheim era o mundo dos gigantes e Muspelheim é o reino do fogo, onde habitam os gigantes de fogo.\r\n"
                            + "Além disso, dizia-se que o Yggdrasil era guardado pelas valquírias, pois os seus frutos continham todas as respostas para as indagações da humanidade. Somente os deuses a visitavam. Dizia-se também, que as folhas de Yggdrasil podiam trazer os mortos de volta para a vida é apenas um de seus frutos, curaria qualquer doença e até mesmo salvaria uma pessoa da beira da morte.\r\n"
                            + "Havia também dois clãs de deuses, os Aesir e os Vanir, que foram inimigos, mas se uniram novamente. Enquanto os Vanir são deuses da natureza, os Aesir são belicosos.\r\n"
                            + "Os principais deuses Vanir são Njor e seus filhos Frey e Freya. Os Aesir mais famosos são Odin, Thor, Tyr e Frigga. Quase todos Aesir estavam predestinados a morrerem durante o Ragnarok – o fim dos deuses. Ambos clãs se uniram para lutar contra os gigantes, lembrando a mitologia grega, onde os deuses eram inimigos dos titãs.\r\n"
                            + "O conflito desses dois clãs representa a integração dos deuses do céu e da ordem com deuses da terra e da fertilidade, mostrando um equilíbrio entre essas duas forças. Algo que hoje falta em nossa tradição, que possui um deus apenas da ordem, da lei e do céu. Nos faltam deuses da fertilidade ligados à terra.\r\n"
                            + "Vamos apresentar uma aventura sobre essa história.");
                    break;
                case 2:
                    System.out.println(" BEM VINDO AO TUTORIAL DO JOGO!\n\n "
                            + "PRIMEIROS PASSOS: ESTE JOGO UTILIZA COMANDOS BEM SIMPLES\n "
                            + "ENTÃO SEMPRE LEIA ANTES DE INTERAGIR AO DIGITAR ALGO NO TECLADO\n"
                            + "VOCÊ SEMPRE VERÁ OPÇÕES OU PERGUNTAS COM NUMEROS NA FRENTE POR EXEMPLO (1) OU (2)\n"
                            + "ENTÃO LEIA TUDO QUE LHE APARECER NA TELA, E RESPONDA COM CAUTELA UTILIZANDO O TECLADO\n"
                            + "LEMBRE SE QUE SUAS ESCOLHAS AFETAM O DESENVOLVIMENTO DA HISTORIA\n\n"
                            + "                            BOM JOGO DIVIRTA-SE!");
                    break;
                case 3:
                    System.out.println("Opção 3 - Jogar -");
                    // chamando o metodo jogo
                    jogo();
                    System.out.println("Fim de jogo");
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("\"-----------------------------------------------------\n"
                            + "                 CRÉDITOS\n"
                            + "-----------------------------------------------------");
                    System.out.println(
                            "\nEnredo e roteiro: " + "\nLuana Donomai e Valdinei Santana dos Reis"
                                    + "\nDesenvolvimento:"
                                    + "\nCarolina Orlowski Damaceno, Ítalo Felix Terciano, Luana Donomai, Valdinei Santana, Jose Ivo Oliveira Silva."
                                    + "\nInformações Técnicas:"
                                    + "\nEste projeto foi desenvolvido na linguagem Java 17 e IDE Eclipse, pelo grupo 6 da turma D de Projeto Integrador.");
                    break;
                case 5:
                    System.out.println(
                            "Opção 5 - Sair \n" + "Você saiu do menu. Para iniciar um novo jogo, execute novamente.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    //metodo do inicio do jogo
    public static void jogo() {
		try {
			cap1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Você Passou pelo Capítulo 1 com sucesso");

		try {
			cap2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Você Passou pelo Capítulo 2 com sucesso");

        try {
            cap3();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Você Passou pelo Capítulo 3 com sucesso");

        try {
            cap4();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Você Passou pelo Capítulo 4 com sucesso");

        try {
            cap5();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Você Passou pelo Capítulo 5 com sucesso");

        cap6();
    }

    public static void cap1() throws IOException {
        boolean result = false;

        System.out.println("-----------------------------------------------------\n"
                + "                 CAPÍTULO 1: CONVOCAÇÃO\n"
                + "-----------------------------------------------------");

        inserirNomeDoJogador();

        System.out.println("  Alguns dias você recebeu uma mensagem de Odin,convocando-o\n"
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
                + "ficando apenas Thor e Heimdall.");
        continuar();
        limparTela();

        System.out.println("- Seja bem-vindo a Asgard," + nomeJogador + "!- diz Odin.\n" +

                "- Há muito tempo seu pai me serviu e morou aqui. Hoje eu preciso que você me ajude a salvar os 9 mundos.\n" +

                "- E o que eu, um mero humano poderia fazer para ajudá-lo? - você responde com um leve tom irônico.\n" +

                "- Eu vi o futuro em meus sonhos. E nesse futuro o mundo se acabará em chamas."
                + " Mas você me ajudará a impedir tudo isso. Você herdou a força e a inteligência de seu pai, "
                + "peço que se una a nós e nos ajude a capturar os filhos de Loki.");

        continuar();

        System.out.println("Certamente, você possuía uma força sobre-humana, mas nunca lutara contra um deus. "
                + "Enquanto você ponderava sobre a proposta de Odin, as portas do salão se abrem de repente:\n"
                + "- Odin! Meu caro, vejo que trouxe uma visita inusitada a esta terra. Um humano?- diz Loki, sorrindo."
                + "Era possível perceber um leve tom de desprezo em seu olhar.\n"

                + "- Loki, os seus filhos são uma ameaça para nós. Espero que não tenha vindo até aqui se opor aos meus planos."
                + " - diz Odin com um tom ameaçador.\n"
                + "	- Mas é claro que não! Vim apenas cumprimentá-lo...\n"
                + "	- Chega de enrolação, vamos logo garoto! -  diz Thor, afastando Loki do caminho enquanto "
                + "acenava a você para que o acompanhasse.");

        System.out.println("Após reunir o exército, você e Thor vão até o lar da giganta Angrboda, a mãe dos filhos de Loki.\n"
                + "  A fortaleza era enorme, com um grande salão na sua parte externa. Felizmente não havia ninguém para detê-los, "
                + "mas as crianças eram gigantes e não seria tão fácil capturá-las.\n"
                + "- Essa é sua chance de mostrar o quão capaz é, garoto.- diz Thor"
                + " - Vá e lute contra os dois mais velhos, eu darei conta do lobo.\r\n"
                + "Thor havia lhe dado uma lança para lutar. Ela era pesada, mas conseguia esticar e diminuir "
                + "seu tamanho quando ordenasse. A criança mais perto era Jorgmund, uma serpente enorme.\n"
                + "Você se prepara para lutar contra o primeiro filho de Loki");
        continuar();
        limparTela();

        System.out.println("-----------------------------------------------------\n"
                + "               		  DESAFIO 1\n"
                + "-----------------------------------------------------"
                + "\nPara passar este desafio, memorize a sequência de números a seguir. Você terá 10 segundos.");

        do {
            result = jogoMemoria();
            if (result == false) {
                System.out.print("Você errou, tente novamente!");
            }
        } while (result == !true);
        System.out.println("Parabéns! Você passou esse desafio!");


        System.out.println("	Após alguns poucos golpes, a serpente cai no chão. Rapidamente você a amarra em um tronco "
                + "com a ajuda dos outros deuses.\n	Assim que recupera o fôlego, você vai até a segunda filha."
                + "Ao se aproximar por um lado, você vê uma bela garota sentada ao chão e observando a todos."
                + "No entanto, quando a garota vira sua face para te encarar, a metade de seu rosto que"
                + " lembra a morte o faz se espantar e pular para trás. Você empunha sua arma novamente e se prepara para o ataque.");

        continuar();
        limparTela();

        System.out.println("-----------------------------------------------------\n"
                + "               		  DESAFIO 2\n"
                + "-----------------------------------------------------"
                + "\nMemorize novamente a sequência de números a seguir. Você terá 10 segundos.");

        do {
            result = jogoMemoria();
            if (result == false) {
                System.out.print("Você errou, tente novamente!");
            }
        } while (result == !true);
        System.out.println("Parabéns! Você passou esse desafio!");

        System.out.println("Após vencer os dois irmãos, você acena para Thor, que o ajuda a prendê-los.\n"
                + "	- Pelo visto os sonhos de Odin não estavam errados!"
                + " Vamos voltar a Asgard antes que os gigantes apareçam. - diz Thor orgulhoso de seu feito.\n"
                + "Ao chegar no salão, Odin decide o destino de cada um dos filhos de Loki: "
                + "A serpente é jogada no mar para que não pudesse ferir ninguém. "
                + "Hell foi enviada para governar o submundo, pois sua aparência grotesca e pútrida incomodava a todos. "
                + "Fenrir ainda era pequeno e ficou aos cuidados do deus Tyr.\n"
                + "");
        continuar();
        limparTela();
    }

    public static void inserirNomeDoJogador() {
        System.out.println("PARA COMEÇARMOS DIGA SEU NOME DEUS: ");
        do {
            nomeJogador = comando.nextLine();
        } while(nomeJogador.isEmpty());
    }

    public static void limparTela() {
        for(int i = 0; i < 80*300; i++)
            System.out.print("\b");
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void continuar() throws IOException {

        System.out.print("Pressione ENTER para continuar...");
        System.in.read();
    }

    public static boolean jogoMemoria() {
        Random numeros = new Random();
        int enunciado[] = new int[3];
        boolean teste1;//testa se passou ou não no desafio
        teste1 = false;


        System.out.print("[ ");
        for (int n = 0; n <= 2; n++) {
            enunciado[n] = numeros.nextInt(100);
            System.out.print(enunciado[n] + " ");
        }

        System.out.print("]");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        limparTela();
        System.out.println("Escreva abaixo a sequência correta. ");

        int resposta[] = new int[3];

        for (int i = 0; i <= 2; i++) {
            System.out.print(i + 1 + "° número: ");
            resposta[i] = comando.nextInt();
        }

        if (enunciado[0] == resposta[0] && enunciado[1] == resposta[1] && enunciado[2] == resposta[2]) {
            teste1 = true;
        } else {
            teste1 = false;
        }

        comando.reset();

        return teste1;

    }

    public static void cap2() throws IOException {
        String resp;
        System.out.println(" Fenrir crescera rápido, não à toa era filho de uma giganta. E não era apenas seu tamanho que havia aumentado, sua força também crescia a cada dia. \r\n"
                + "Tyr era o único que brincava com ele, os deuses estavam todos temerosos sobre o que aconteceria no futuro quando Fenrir virasse adulto. Tentaram amarrá-lo com vários tipos de corrente, mas o lobo conseguiu se soltar de todas elas. E quanto mais demonstrava sua força, mais arrogante e orgulhoso de si ele ficava.\r\n"
                + "	- " + nomeJogador + ", quero que você vá até a terra dos anões e traga a corrente mais forte para prender aquele lobo - ordenou Odin.\r\n"
                + "	A terra dos anões ficava no subterrâneo, era um labirinto de minas com cheiro metálico. Não era difícil se locomover por ali, mas um caminho tomado erroneamente e não era mais possível encontrar a saída. Felizmente os anões eram aliados dos deuses e confeccionavam o que lhes fosse preciso em troca de algumas regalias valiosas. Sim, esses elfos noturnos eram movidos pela ganância.\r\n"
                + "	Frey o acompanhava dessa vez. Ele preferia não se aproximar deste mundo sujo, mas não perderia a oportunidade de se vingar de Loki por tudo que havia feito à sua irmã, Freya.\r\n"
                + "	Vocês se dirigem à casa de fundição e explicam o que precisam aos anões. A corrente seria confeccionada, mas precisariam de sua ajuda, pois parte dos trabalhadores estavam reconstruindo danos feitos pelos trolls.\r\n");

        do {

            System.out.println("-----------------------------------------------------\n"
                    + "               		  FENRIR - O GRANDE LOBO\n"
                    + "-----------------------------------------------------"
                    + "\nVocê ficou encarregado de alimentar as chamas da fornalha."
                    + "Os anões lhe entregaram um manual com informações sobre a temperatura ideal para a confecção das correntes:"
                    + "\nAo lê-lo, você verifica que é necessário elevar a temperatura da fornalha até 2500°C e então mantê-la constante. No entanto, é imprescindível que a razão entre combustível utilizado e jatos de ar que alimentam a chama seja 0,2."
                    + "\nSabendo que 10g de combustível é capaz de elevar a temperatura em 500°C e que 3 jatos de ar são suficientes para aumentar 250°C, "
                    + "calcule quantos gramas de combustível e quantas borrifadas de ar serão necessários para alcançar a temperatura ideal, sendo que no momento, a fornalha se encontra a 100°C.");
            System.out.print("\nSelecione a melhor alternativa que contém os valores aproximados:\n"
                    + "A)5g e 10 jatos de ar\nB)10g e 25 jatos de ar\nC)50g e 50 jatos de ar\nD)5g e 25 jatos de ar\nE)Nenhuma das anteriores"
                    + "\n\nResposta: ");
            resp = comando.next();
            resp.toUpperCase();
            if (!resp.equalsIgnoreCase("D")) {
                System.out.println("Você errou! Tente novamente.");
                limparTela();
            }
        } while (!resp.equalsIgnoreCase("D"));

        System.out.println("\nResposta Correta! Parabéns você completou este desafio!");
        continuar();
        limparTela();
        comando.reset();

        System.out.println("Após entregar a corrente a Odin, os deuses se dirigem ao local onde Fenrir era criado.\r\n"
                + "	- Fenrir! Temos mais um desafio a você! - disse Odin, mostrando a corrente.\r\n"
                + "	- Ha! Essa parece ser mais fraca que a última! - ri o lobo, virando as costas.\r\n"
                + "	- Esse será o último, se você se soltar, lhe daremos o título de mais forte de Asgard.\r\n"
                + "	Após convencer o lobo, os deuses o acorrentam. Fenrir começa a se debater, mas não consegue se soltar. Os deuses começam a rir orgulhosos de si e vão se afastando um a um.\r\n");

        int escolherCaminho = 0;

        System.out.print("Diante da situação você começa a pensar sobre a decisão dos deuses. Fenrir já era gigante e iria crescer mais. Até quando essa corrente seria forte o suficiente?"
                + "\nEntão você decide:\n1-Convencer os deuses a soltá-lo, afinal a corrente poderia se romper no futuro e Fenrir viria para se vingar"
                + "\n2-Deixá-lo preso mesmo. Solto, esse lobo seria uma ameaça a todos. Você está aqui para impedir o apocalipse e não para ajudá-lo a acontecer"
                + "\nDigite o caminho escolhido: ");
        escolherCaminho = comando.nextInt();


        switch (escolherCaminho) {
            case 1: {
                System.out.println("\nFenrir se irrita com os deuses, por terem-no enganado. Mas reconhece a sua ajuda e agradece."
                        + "\n- Obrigado por ter me soltado " + nomeJogador + ". Se um dia estiver em apuros, conte com minha ajuda. "
                        + "Eu não confiaria tanto nesses deuses se fosse você. Não somos um deles, eles irão te trair um dia, assim como fizeram comigo. - diz Fenrir antes de desaparecer na floresta.");
                fenrirPreso = false;
            }
            break;

            case 2: {
                System.out.println("\nAo perceber que ninguém iria soltá-lo, Fenrir dá um grito de raiva:\r\n"
                        + "- Odin, seu traidor! Eu poderia ser amigo de vocês, mas agora irei matar a todos e você também!\r\n"
                        + "Sem se importar, os deuses continuam seu caminho de volta, comemorando o sucesso do plano.\r\n");
                fenrirPreso = true;
            }
            break;
        }
        continuar();
        limparTela();
    }


    public static void cap3() throws IOException {
        boolean venceuCap3 = false;
        System.out.println("------------------------------------\n" + "          A GRANDE MURALHA\n"
                + "------------------------------------\n");
        System.out.println(
                "Na semana seguinte, Odin reuniu todos no salão para discutir sobre a estrutura de defesa de Asgard. "
                        + "\nThor era forte e dava conta de todos os inimigos, mas agora não estava lá, fora lutar contra os gigantes problemáticos de Jotunheim. "
                        + "\nEra necessário construir um muro que fosse capaz de conter desde o mais forte dos trolls até o maior das criaturas.\r\n"
                        + "- Precisamos de alguém que construa esse muro o mais rápido possível - disse Odin.\r\n"
                        + "- Ha, mesmo assim levaria anos para terminar. A sua profecia não está prestes a ocorrer? - riu Loki, tentando conter sua excitação ao ver a preocupação dos deuses.\r\n"
                        + "- Podemos enviar" + nomeJogador + " para reunir os melhores construtores. Os anões poderiam fabricar um equip- dizia Freya quando foi interrompida por Heimdall:\r\n"
                        + "- Odin, há um construtor que diz ser capaz de construir a muralha em três estações. Mas a recompensa que ele pede é absurdaexigiu o Sol, a Lua e a mão de Freya..\r\n"
                        + "- É um valor muito alto, mande-o embora. - irritou-se Odin.\r\n"
                        + "- Mas precisamos do muro! É uma boa proposta, não há ninguém capaz de tal façanha neste mundo! - adiantou-se Loki\r\n"
                        + "- Você parece animado Loki, ficarei feliz em me voltar contra vocês quando eu for embora para o reino desse construtor - rebateu Freya com a frieza que somente a mais bela deusa sabia demonstrar.\r\n"
                        + "- Diminuamos o prazo. Daremos a ele somente uma estação, durante a qual ele terá que construir sozinho, sem ajuda. Será impossível que ele finalize tão rápido."
                        + "\n E então o mandamos embora sem nada tendo a estrutura do muro já em andamento! - disse Loki, orgulhoso de sua inteligência.\r\n"
                        + "- Assim faremos então, chame-o Heimdall - ordenou Odin.\r\n"
                        + "Foi passado ao construtor os termos que os deuses estipularam. Sem se abalar, o construtor deu início à construção do muro.\r\n"
                        + "Para a surpresa de todos, em apenas 2 semanas ele já havia levantado metade do muro. Nesse ritmo, terminaria tudo antes mesmo do final do inverno. Desesperado, Odin lhe ordena que atrapalhe o construtor e impeça a finalização do muro.\r\n");

        String senha = ("235813");
        System.out.println(nomeJogador + ", para interromper a construção do muro, tranque o baú:\n");
        System.out.println(
                "Para trancar, desvende o seguinte mistério: a senha é uma sequência de 5 runas, que correspondem aos primeiros números da sequencia Fibonacci a partir do primeiro numero par.");
        System.out.print("\nDigite a senha (Todos os números na sequencia): ");
        String palpite = ("");
        palpite = comando.next();
        if (palpite.equals(senha)) {
            System.out.println("Você acertou!");
            System.out.println(
                    "Ao terminar o prazo, os deuses riam com a derrota do construtor. Se gabavam de seu plano bem sucedido. Não haviam gastado um único recurso e a muralha estava quase completa. \r\n"
                            + "\nVocês trapacearam! Se não tivessem me atrapalhado, eu teria finalizado esse muro há dias! - gritou o construtor enfurecido, revelando sua verdadeira forma gigantesca.\r\n"
                            + "\nE você trapaceou ao esconder sua verdadeira forma! - você diz, empunhando sua arma e se preparando para a batalha.\r\n");
            System.out.println(
                    "\nVocês poderiam ter me esperado para a festa! - disse Thor, ao ver o inimigo derrotado no chão.\r\n"
                            + "Você pode ajudar agora Thor, precisamos terminar o muro. - você diz.\r\n"
                            + "Não podemos perder tempo! " + nomeJogador + " e Thor, vocês ficarão responsáveis por terminar o muro. - ordenou Odin.");
            venceuCap3 = true;
        } else {
            System.out.println("Você errou!");
            System.out.println(
                    "\n não dar o último golpe, o gigante percebe a presença de Thor, mas antes que possa reagir é nocauteado com um golpe do poderoso martelo.\r\n"
                            + "\nVejo que vocês se divertiram durante minha ausência. Ainda bem que cheguei a tempo da festa! - disse Thor animado com a luta que antecedera.\r\n"
                            + "\nJogador, você falhou e não conseguiu interromper a construção do muro!\r\n");
        }
        continuar();
        limparTela();

        if (venceuCap3 == true) {
            System.out.println("Para finalizar o muro será necessário a ajuda do cavalo Sleipnir. Responda o teste a seguir para completar o capítulo."
                    + "Os nórdicos consideravam esse deus como o Pai de Todos. Ele possuía apenas um olho, e seus dois corvos sobrevoavam o mundo para lhe contar todas as coisas que aconteciam. Esse deus era o dono do cavalo mais rápido do mundo, Sleipnir, o cavalo de oito patas. Estamos falando de:\r\n"
                    + "\r\n"
                    + "a) Thor\r\n"
                    + "\r\n"
                    + "b) Odin\r\n"
                    + "\r\n"
                    + "c) Loki\r\n"
                    + "\r\n"
                    + "d) Balder\r\n"
                    + "\r\n"
                    + "e) Heimdall");
            String resp = comando.next();
            resp.toUpperCase();
            if (resp.equalsIgnoreCase("B")) {
                System.out.println("\nResposta Correta! Parabéns você completou este desafio!\n"
                        + "Trabalhando em equipe e com a ajuda do martelo de Thor para quebrar as pedras no alto da montanha, a construção do muro finalmente terminou após semanas de trabalhado pesado. Odin parecia satisfeito, assim como os outros deuses, que celebraram com uma grande festa.\r\n"
                        + "");
                muroTerminado = true;
            } else {
                System.out.println("\nResposta Inorreta! Você não conseguiu finalizar o muro"
                        + "\nAo colocar algumas pedras no muro, Thor começa a se preparar para trazer mais das montanhas quando ouve um estremecer da fileira mais alta seguido de um enorme estrondo.\r\n"
                        + "- Pelo visto a inutilidade é uma característica comum dos deuses de Asgard - diz Freya ao observar parte do muro desabando.\r\n"
                        + "Irritado ao saber do acontecimento, Odin ordena que parem de construir o muro imediatamente\r\n"
                        + "");
                muroTerminado = false;
            }
        }
    }

    public static void cap4() throws IOException {

        System.out.println("------------------------------------\n" + " FREYA, A MAIS BELA DEUSA DOS FRANIR \n"
                + "-------------------------------------\n");
        System.out.println(
                "Algum tempo depois, Loki volta a Asgard com um sorriso irônico no rosto, dirigindo-se a Odin:\r\n"
                        + "Odin, trago ótimas notícias de Svartalfheim!\r\n"
                        + "Mais uma competição de presentes? - Pergunta Odin.\r\n"
                        + "Não, algo muito melhor! Desta vez são eles que estão recebendo um agrado dos deuses..\r\n"
                        + "Pare de enrolar e diga logo.\r\n"
                        + "Sua querida neta Freya está se engraçando com os anões para conseguir uma jóia. Ao que ouvi dizerem, os anões estão fazendo fila para passar uma noite com ela!\r\n"
                        + "Maldita seja! Jogador! Você e Loki irão até a terra dos anões acabar com essa orgia.- diz Odin enfurecido pelos atos de Freya\r\n"
                        + "----\r\n"
                        + "Ao se aproximar de Svartalfheim, Loki aponta para uma pequena construção em meio à floresta. No horizonte era possível observar pequenas construções humanas e ouvir a agitação da vida noturna. O local era calmo e trazia uma sensação de paz, não parecia que perto era a morada dos elfos negros, conhecidos por sua ganância e trapaças.\r\n"
                        + "Seguindo em direção à construção era possível sentir o cheiro metálico e empoeirado característico de minas. Na entrada havia uma longa escada que adentrava a terra e de onde era possível observar apenas a escuridão.\r\n"
                        + "Descendo essa escada chegaremos à terra dos anões. Fique atento se não quiser passar o resto da vida vagando por esse labirinto que eles construíram. - diz Loki\r\n"
                        + "E como vamos encontrar Freya?\r\n"
                        + "Não iremos encontrar Freya, ela irá nos encontrar. Roubaremos o colar que ela tanto deseja e voltamos para Asgard hahahah.\r\n"
                        + "");
        System.out.println("Para avançar na jornada Jogador, lançe os dados e tente a sorte! \n\n");


        turnoDoJogador();

        System.out.println(
                "Após pegar o colar, Loki se transforma em um animal com garras enormes e fortes o suficientes para quebrar as paredes dos corredores das minas.\r\n"
                        + "Abrirei caminho até a superfície, é melhor me acompanhar se não quiser morrer aqui.- diz Loki sorrindo como uma criança que acabara de receber o presente que tanto esperava.\r\n"
                        + "Chegando à superfície, vocês dois voltam a Asgard e comunicam a Odin o sucesso da missão.\r\n"
                        + "----\r\n"
                        + "Poucas horas depois, Freya aparece no salão esbravejando sua raiva para cima de você e de Loki. Odin interrompe e sentencia a punição de Freya:\r\n"
                        + "Freya, o que você fez é imperdoável. Sua ganância e luxúria serão a sua queda. Você descerá a Midgard e plantará a semente do caos no mundo dos humanos.\r\n"
                        + "Porque os humanos serão punidos? - você diz indignado com a decisão de Odin.\r\n"
                        + "Os Vanir cuidam e protegem os humanos. É graças a eles que a civilização humana conseguiu se desenvolver a tal ponto. A punição de Freya será destruir tudo o que protegeu.\r\n"
                        + "Midgard é seu mundo, seus pais humanos moravam lá. Não é possível que Odin queira destruí-lo. Desacreditado com o que acabara de ouvir, você tenta convencer Odin a mudar a punição.\r\n"
                        + "");
        continuar();


        System.out.println("Para mudar a ideia de Odin, resolva o desafio a seguir:\n"
                + "Em um sistema de codificação, AB representa os algarismos do dia do nascimento de uma pessoa e CD os algarismos de seu mês de nascimento. Nesse sistema, a data trinta de julho, por exemplo, corresponderia a:\r\n"
                + "\r\n"
                + "A igual a 3 espaço espaço espaço espaço espaço B igual a 0 espaço espaço espaço espaço espaço C igual a 0 espaço espaço espaço espaço espaço D igual a 7\r\n"
                + "\r\n"
                + "Admita uma pessoa cuja data de nascimento obedeça à seguinte condição:\r\n"
                + "\r\n"
                + "A mais B mais C mais D igual a 20\r\n"
                + "\r\n"
                + "O mês de nascimento dessa pessoa é:\r\n"
                + "\r\n"
                + "a) agosto\r\n"
                + "b) setembro\r\n"
                + "c) outubro\r\n"
                + "d) novembro");
        String resp = comando.next();
        resp.toUpperCase();
        if (resp.equalsIgnoreCase("B")) {
            System.out.println("\nResposta Correta! Parabéns você completou este desafio!");
            System.out.println("Odin pondera sobre os argumentos que você deu e decide mudar a punição. Freya é proibida de utilizar a ponte do arco-íris para viajar aos outros mundos e foi expulsa de volta a Vanaheim, a terra onde seu povo se instalou após a guerra com os Aesir.\r\n"
                    + "Loki, insatisfeito com a punição concedida apenas se retira do salão, ocupando seus pensamentos com a próxima atração que prepararia aos deuses de Asgard\r\n"
                    + "");
            pazHumanos = true;
        } else {
            System.out.println(" - Silêncio! A punição foi decidida, Freya vá agora mesmo! - grita Odin irritado com seu confrontamento.\r\n"
                    + "Freya desce ao mundo dos humanos e lança sua magia, enegrecendo a alma dos humanos. Pouco tempo depois, conflitos começaram a surgir. Guerras aconteciam por todos os lados, a fome e o sofrimento se alastravam pelas cidades.\r\n"
                    + "Em meio ao caos instaurado no mundo dos humanos, Loki e seus filhos se preparavam para uma grande batalha.\r\n"
                    + "");
			pazHumanos = false;
        }
        continuar();
        limparTela();
    }

    public static void cap5() throws IOException {
        System.out.println("------------------------------------\n" + "             A PROFECIA\n"
                + "------------------------------------\n");
        System.out.println("Enquanto os deuses dormiam, o caos se instalou no mundo\n\n"
                + "O inverno chegou e não mais cessou. Povos começaram a lutar entre si, a fome se espalhou por todos os cantos.\n"
                + "O Sol e a Lua foram devorados e a escuridão tomou conta dos céus. Era o sinal para o início da batalha.\n"
                + "O exército de Loki, juntamente com seus filhos marchavam em direção a Vigrid para a batalha final.\n"
                + "Por onde passavam, espalhavam destruição e deixavam tudo em chamas.\n\n"
                + "Ao ver os acontecimentos, Heimdall tocou sua corneta, convocando a todos para a batalha.\n"
                + "Prevendo os acontecimentos do Ragnarok, Odin esconde um casal de humanos na árvore do mundo\n"
                + "para salvar a humanidade da extinção. Todos os deuses então se dirigem para o campo de batalha.\n\n"
                + "Sua hora chegou + nomeJogador + ! Sua missão é ajudar a conter os planos de Loki e proteger o casal na YggDrasil.");
        if (fenrirPreso == true) {

            System.out.println("DESAFIO....\n");
            System.out.println("Acontece uma batalha em Asgard, o território dos deuses.\n\n"
                    + "De um lado estão bem, liderado por Odin, o rei do panteão e senhor da guerra.\n"
                    + "Do outro, o mal, representado por Loki, um gigante fanfarrão que vive entre as divindades.\n"
                    + "Balder, filho de Odin e Frigga, amado e admirado por ser belo, inteligente e justo.\n\n"
                    + "Jogador, sua missão é impedir que Balder seja morto por Loki, com uma flexa no coração.\n\n"
                    + "Vença Loki em uma batalha de PEDRA,PAPEL,TESOURA, impedindo a execução do seu plano. Armar um armadilha para Balder.\n");

            jogoPPT();
        } else if (fenrirPreso == false && pazHumanos == true) {
            System.out.print("Fenrir não quer se voltar contra os planos de seu pai, mas se lembra de como você o salvou quando os deuses pretendiam deixá-lo preso em correntes. Ao avistá-lo, o lobo vai para seu lado e o protege dos ataques do exército de Loki:\r\n"
                    + "	- Por que ainda luta por esses deuses? Se continuar contra meu pai, não poderei fazer nada para salvá-lo!\r\n"
                    + "	- Por que vocês querem destruir tudo? - você pergunta\r\n"
                    + "	- Após a destruição virá a salvação, você deveria vir conosco! - diz Fenrir impaciente.\r\n"
                    + "	Nesse momento, Odin ataca Fenrir, que se move para longe e começa a lutar contra os deuses. Você avista Loki planejando um ataque surpresa. Junto com Heimdall, você desfere um ataque pelas costas do sábio deus distraído com seus planos. Loki cai ao chão, amaldiçoando em meio ao seu último suspiro:\r\n"
                    + "	- Maldito humano!\r\n"
                    + "—-\r\n"
                    + "Fenrir nota o cheiro do sangue de seu pai. Ao perceber o que acabara de acontecer, o lobo se irrita e dispara contra você. \r\n"
                    + "	- " + nomeJogador + ", maldito! Eu não irei te perdoar por isso! - diz Fenrir raivoso\r\n");
            turnoDoJogador();
        } else if (fenrirPreso == false && pazHumanos == false) {
            System.out.print(" Fenrir não esperava a hora de poder mostrar todo o seu poder aos deuses de Asgard e rir ao vê-los temer mais uma vez sua existência. Primeiro foi atrás de Odin, nada melhor do que acabar com o líder de suas presas.\r\n"
                    + "O deus Aesir, minúsculo diante da grandeza do lobo, consegue mantê-lo ocupado, mas é visível a dificuldade de sair ileso de suas investidas. Enquanto isso, você avista Loki planejando um ataque surpresa. Junto com Heimdall, você desfere um ataque pelas costas do sábio deus distraído com seus planos. Loki cai ao chão sem vida, mas a tempo de testemunhar Odin sendo dilacerado pelas presas de Fenrir, dando seu último sorriso, orgulhoso da prole que criara e da herança que deixava aos deuses que ainda não haviam caído.\r\n"
                    + "\r\n"
                    + "—-\r\n"
                    + "Fenrir nota o cheiro do sangue de seu pai. Ao perceber o que acabara de acontecer, o lobo se irrita e dispara contra vocês. \r\n"
                    + "");
            turnoDoJogador();
        }
        continuar();
        limparTela();
    }

    public static boolean jogoPPT() throws IOException {
        int jogador, loki;
        boolean result = false;
        while (result == false) {
            System.out.println("DESAFIO - PEDRA,PAPEL,TESOURA\n");
            System.out.println("1 - PEDRA");
            System.out.println("2 - PAPEL");
            System.out.println("3 - TESOURA");
            System.out.println("\nDigite a opção desejada: ");
            jogador = comando.nextInt();
            // System.out.println("");
            switch (jogador) {
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
            loki = (int) (Math.random() * 3 + 1);
            comando.reset();
            switch (loki) {
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
            if (jogador == loki) {
                System.out.println(
                        "EMPATE! Por pouco o plano maligno de loki não foi executado. Se concentre e tente novamente.");
            } else {
                if ((jogador == 1 && loki == 3) || (jogador == 2 && loki == 1) || (jogador == 3 && loki == 2)) {
                    System.out.println(
                            "PARABÉNS, VOCÊ VENCEU! A sua garra impediu que as forças do mal, pairassem sob Asgard.");
                    result = true;
                } else {
                    System.out.println(
                            "LOKI VENCEU! Balder foi morto com uma flecha no coração, em uma armadilha tramada por Loki.\n\n");
                    System.out.println("Tente novamente");
                }
            }
            continuar();
            limparTela();
        }
        comando.reset();
        return result;
    }

    public static void turnoDoJogador() {
        int pontuacao = 0;
        int tentativaAtual = 0;
        int tentativaMaxima = 3;
		do {
			pontuacao += jogarDado();
			if(jogarNovamente()) {
				tentativaAtual++;
			} else {
				tentativaAtual = tentativaMaxima;
			}
		} while(tentativaAtual < tentativaMaxima);
		if (tentativaAtual == tentativaMaxima) {
			System.out.println("Jogadas esgotadas");
		}
        verificarPontuacao(pontuacao);
    }

    public static void verificarPontuacao(int pontuacao) {
		if (pontuacao >= 11) {
			System.out.println("GANHOU");
		} else {
			System.out.println("PERDEU. Você foi morto, tente novamente.");
		}
	}

	public static int jogarDado() {
		System.out.println("LANÇAMENTO DO DADO ....\n");
		int valorDado = (int) (Math.random() * 6 + 1);
		System.out.println("FACE:  " + valorDado);
		return valorDado;
	}

    public static boolean jogarNovamente() {
		boolean comandoValido = false;
		char jogarNovamente;
		String retorno = null;
    	do {
			System.out.println("\nDESEJA LANÇAR O DADO NOVAMENTE(s/n)?");
			jogarNovamente = comando.next().charAt(0);
			if (jogarNovamente != 'S' && jogarNovamente != 's' && jogarNovamente != 'N' && jogarNovamente != 'n') {
				System.out.println("\nCOMANDO INVALIDO!");
			} else {
				comandoValido = true;
				retorno = String.valueOf(jogarNovamente);
			}
		} while (comandoValido == false);
    	return retorno.equalsIgnoreCase("s") ? true : false;
	}

    public static void cap6() {
        System.out.println("Cap 6: Final ");
        if (fenrirPreso == true && muroTerminado == true) {
            System.out.print("Ao derrotar Loki, você olha ao seu redor e percebe os deuses mortos ao seu redor. O mundo estava em chamas, o exército de Loki continua destruindo e queimando tudo. Você se apressa para proteger a YggDrasil. Pelo caminho, você se depara com Surt, o gigante de fogo.\r\n"
                    + "Devido à luta contra Loki, seu corpo está muito ferido para enfrentá-lo e você acaba sendo engolido pelas chamas do gigante. Surt destrói tudo com suas chamas, até mesmo o exército de Loki remanescente.\r\n"
                    + "Felizmente o muro construído foi forte o suficiente para conter as chamas da destruição. A árvore resistiu, assim como os humanos escondidos nela. Após a destruição do mundo, o novo sol brilha e a natureza se reconstrói. \r\n"
                    + "O casal repovoará o mundo e, os filhos dos deuses, um a um, renascerão. O antigo mundo sucumbiu, mas deu lugar ao novo mundo, sem as guerras e maldades do anterior. É o começo de uma nova era.\r\n"
                    + "");
        } else if (fenrirPreso == false && pazHumanos == true) {
            System.out.print("Após matar Fenrir, você se junta a Odin e Heimdall para ajudar os outros deuses. O exército de Loki começa a perder força. Surt, o gigante de fogo responsável pelas chamas é massacrado por Odin e seus filhos.\r\n"
                    + "	Após a batalha, o mundo ainda permanecia na escuridão, mas os deuses se reuniram para reconstruir tudo. O casal escondido na YggDrasil é convocado para repovoar Midgard e ajudar os humanos que conseguiram sobreviver.\r\n"
                    + "	Após um tempo, o novo Sol, filho da estrela que morrera, surge no céu e a natureza começa a se regenerar. O mundo reconstruído não é mais o mesmo de antes: já não possui o ódio que Loki carregava.\r\n"
                    + "Os deuses que pereceram, aos poucos foram renascendo. É o renascimento da era de Odin.\r\n"
                    + "");
        } else if (fenrirPreso == false && pazHumanos == false) {
            System.out.print("A morte de Odin não foi em vão. Após destruir Loki e seus filhos, você e Heimdall vão atrás dos gigantes de fogo que ainda estão causando problemas. Um a um, os aliados de Loki perecem. O fogo que ameaçava a todos já não tem forças para continuar sua destruição.\r\n"
                    + "Os deuses que sobraram reconstruíram Asgard e recuperaram a ponte que ligava os nove mundos. Mas nem tudo aconteceu de acordo com o planejado: Midgard estava em caos, a punição de Freya amaldiçoava o mundo dos humanos.\r\n"
                    + "Indignados, os deuses Franir demandavam uma solução de Asgard. Infelizmente, Odin e Thor não mais estavam entre nós para conter a situação. Sem conseguir chegarem a um acordo, as guerras entre Aesir e Franir foram retomadas e milhões de anos se seguiram de sucessivas guerras entre deuses e mais guerras no mundo dos humanos.\r\n"
                    + "“Talvez o apocalipse tivesse evitado tudo isso” - pensou Heimdall enquanto observava o mundo sendo devorado pelo ódio.\r\n"
                    + "");
        } else if (fenrirPreso == true && muroTerminado == false) {
            System.out.print("Ao derrotar Loki, você olha ao seu redor e percebe os deuses mortos ao seu redor. O mundo estava em chamas, o exército de Loki continua destruindo e queimando tudo. Você se apressa para proteger a YggDrasil. Pelo caminho, você se depara com Surt, o gigante de fogo.\r\n"
                    + "Devido à luta contra Loki, seu corpo está muito ferido para enfrentá-lo e você acaba sendo engolido pelas chamas do gigante. Surt destrói tudo com suas chamas, até mesmo o exército de Loki remanescente.\r\n"
                    + "O muro interminado que protegia YggDrasil e Asgard é destruído, revelando o esconderijo dos humanos escolhidos por Odin para repovoar o mundo. Sem hesitar, Surt queima seus corpos, restando apenas suas cinzas.\r\n"
                    + "Após a destruição do mundo, a tímida filha do Sol sobe aos céus e a natureza começa a se curar. Alguns deuses que pereceram renascem aos poucos, dando início à era pós-Odin. Infelizmente, os deuses renascidos não possuíam o mesmo poder do seu antigo governador. Midgard estava vazia, os humanos haviam sido extintos no apocalipse.\r\n"
                    + "Odin falhara. O novo mundo possuía um ar de melancolia e um vazio que nenhum deus conseguiria preencher novamente. \r\n"
                    + "");
        }
    }


}



	
