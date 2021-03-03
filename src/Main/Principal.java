package Main;

import java.util.Scanner;
import Models.ArrayJogadores;
import Models.Jogador;
import Models.Mesa;
import Models.Mestre;

public class Principal {

	public static void main(String[] args) {
		ArrayJogadores jogadores = new ArrayJogadores();
		Scanner input2 = new Scanner(System.in);
		boolean temMestre = false;
		int nextInt;
		
		System.out.println("Você deseja selecionar 1-Mestre ou 2-Jogador:");

		nextInt = input2.nextInt();	
		while(nextInt != 1 || nextInt != 2) {
			if(nextInt == 1 && !temMestre) {
				Mestre m1 = new Mestre();
				temMestre = true;
			} else {
				Jogador novoJogador = new Jogador();
				novoJogador.CriarPersonagem();
				jogadores.addJogador(novoJogador);
			}
			nextInt = input2.nextInt();	
		}
	}
}
