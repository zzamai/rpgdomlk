package Models;

import java.util.Random;

public class Mesa {
	
	private int 	Idmesa;
	private int 	Tamanho;
	private String 	Nomemesa;
	private String  aramazenaNome[];
	
	public Mesa(String nomemesa,int idmesa, int tamanho ) {
		super();
		Nomemesa = nomemesa;
		Idmesa = idmesa;
		Tamanho = tamanho;
		
	}
	
	// um dado para gerar um numero aleatorio entre 1 e 6
	
	public int dado() {
		Random aleatorio = new Random();
		int d6 = aleatorio.nextInt(6)+1;
		return d6;
	}
	// mostra nome dos jogadores
	public void Jogadores() {
		for( int i = 0; i <= aramazenaNome.length; i++)
	        System.out.printf( "\n",aramazenaNome[i]);
		
	}
	
	public int getIdmesa() {
		return Idmesa;
	}

	public void setIdmesa(int idmesa) {
		Idmesa = idmesa;
	}

	public int getTamanho() {
		return Tamanho;
	}

	public void setTamanho(int tamanho) {
		Tamanho = tamanho;
	}

	public String getNomemesa() {
		return Nomemesa;
	}

	public void setNomemesa(String nomemesa) {
		Nomemesa = nomemesa;
	}

	public String[] getAramazenaNome() {
		return aramazenaNome;
	}

	public void setAramazenaNome(String[] aramazenaNome) {
		this.aramazenaNome = aramazenaNome;
	}
	
	


	
}
