package Models;

import java.util.ArrayList;

public class ArrayJogadores {

	private final ArrayList<Jogador> jogadores;
	
	public ArrayJogadores() {
		jogadores = new ArrayList<Jogador>();
	}
	
	public ArrayList<Jogador> getJogadores() {
		return this.jogadores;
	}

	public String getNomeJogadores() {
		StringBuilder sb = new StringBuilder();
		for (Jogador jogador :
				jogadores) {
			sb.append("\nNome: "+jogador.getNome());
		}
		return sb.toString();
	}

	public Jogador getJogador(int index) { return this.jogadores.get(index - 1); }
	
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
