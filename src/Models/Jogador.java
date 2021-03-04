package Models;

import java.util.Scanner;

public class Jogador {

	private static int idGen = 1;
	private int id;

	Ficha_Personagem personagem;
	private final Dado dado;

	public Jogador() {
		dado = new Dado();
		System.out.println("Criando personagem");
		id = idGen++;
	}

	public int jogaDado() {
		return dado.rodaDado();
	}
	
	public void CriarPersonagem() {
		Scanner input2 = new Scanner(System.in);
		System.out.println("Digite O Nome, A Classe e os Seguintes Atributos em Sequencia Força,Resistencia,Poder de Fogo,Habilidade e Armadura");	
		personagem = new Ficha_Personagem(input2.nextLine(),input2.nextLine(),input2.nextInt(),input2.nextInt(),input2.nextInt(),input2.nextInt(),input2.nextInt());
		System.out.println("Nome:"+personagem.getNome());
		System.out.println("Classe:"+personagem.getClasse());
		System.out.println("Força:"+personagem.getForca());
		System.out.println("Resistencia:"+personagem.getResistencia());
		System.out.println("Poder de Fogo:"+personagem.getPoderdefogo());
		System.out.println("Habilidade:"+personagem.getHabilidade());
		System.out.println("Armadura:"+personagem.getArmadura());
		System.out.println("Pontos de Vida:"+personagem.getHp());
		System.out.println("Pontos de Magia:"+personagem.getMp());
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return personagem.getNome();
	}

}
