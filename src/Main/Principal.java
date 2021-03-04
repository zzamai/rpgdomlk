package Main;

import java.util.Scanner;

import Models.*;

public class Principal {

	public static int idGen = 0;

	public static void main(String[] args) {
		TheGame game;
		Mestre mestre = new Mestre();
		Mesa mesa;
		String nomeMesa;
		ArrayJogadores jogadores = new ArrayJogadores();
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		boolean temMestre = false;
		int nextInt;

		System.out.println("Você deseja criar um 1-Mestre ou 2-Jogador:");
		System.out.println("Aperta 3 para finalizar a criação do personagem");
		nextInt = scanner1.nextInt();

		while(nextInt == 1 || nextInt == 2) {
			if(!temMestre && nextInt == 1 ) {
				System.out.println("Digite o nome do Mestre:");
				mestre = new Mestre(scanner2.nextLine());
				temMestre = true;
			} else if(nextInt == 2) {
				Jogador novoJogador = new Jogador();
				novoJogador.CriarPersonagem();
				jogadores.addJogador(novoJogador);
			} else {
				invalidOption();
			}
			System.out.println("Você deseja selecionar 1-Mestre ou 2-Jogador:");
			nextInt = scanner1.nextInt();
		}

		if(!temMestre) {
			System.out.println("A mesa não tem Mestre");
			System.out.println("Crie um para que o jogo possa iniciar");
			mestre = new Mestre(scanner2.nextLine());
			temMestre = true;
		}

		System.out.println("Lista de jogadores:");
		for (Jogador jogador:
				jogadores.getJogadores()) {
			System.out.println("Jogador: "+jogador.getNome());
		}

		System.out.println("O Mestre deverá criar a mesa");
		System.out.println("Informe o nome da mesa:");

		nomeMesa = scanner2.nextLine();
		mesa = new Mesa(nomeMesa, idGen++, jogadores);

		System.out.println(mesa.toString());

		mestre.gerenciarMesa(mesa);
		game = new TheGame(mestre);
		game.start();
	}

	private static void invalidOption() {
		System.out.println("Opção inválida no momento");
		System.out.println("obs: só é possível ter 1 Mestre por jogo");
	}
}
