package Models;

public class Mesa {
	
	private int 	idMesa;
	private String 	nomeMesa;
	private ArrayJogadores jogadores;
	
	public Mesa(String nomemesa,int idmesa, ArrayJogadores jogadores) {
		idMesa = idmesa;
		nomeMesa = nomemesa;
		this.jogadores = jogadores;
	}

	public ArrayJogadores getJogadores() {
		return this.jogadores;
	}

	public void getNomeJogadores() {
		for (Jogador jogador:
				jogadores.getJogadores()) {
			System.out.println(jogador.getNome());
		}
	}

	public int getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public String getNomeMesa() {
		return nomeMesa;
	}

	public void setNomeMesa(String nomeMesa) {
		this.nomeMesa = nomeMesa;
	}

	public void addJogadores(Jogador jogador) {
		this.jogadores.getJogadores().add(jogador);
	}

	public String toString() {
		return "Id da mesa: "+getIdMesa()+" Nome da mesa: "+getNomeMesa()+" \nJogadores: "+jogadores.getNomeJogadores();
	}
}
