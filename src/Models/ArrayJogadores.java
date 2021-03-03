package Models;

import java.util.ArrayList;

public class ArrayJogadores {

	private ArrayList<Jogador> jogadores;
	
	public ArrayJogadores() {
		jogadores = new ArrayList<Jogador>();
	}
	
	public ArrayList<Jogador> getJogadores() {
		return this.jogadores;
	}
	
	public void addJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
	
	public void removeJogador(Jogador jogador) {
		this.jogadores.remove(jogador);
	}
	
	public void apagaJogadores() {
		this.jogadores.clear();
	}
	
}
